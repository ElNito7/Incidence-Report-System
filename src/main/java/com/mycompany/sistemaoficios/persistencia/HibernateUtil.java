/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.persistencia;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author Keloc
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static final String path = "C://reportes-hibernate//hibernate.cfg.xml";


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
    
    public static String generateConfigContent(String url, String username, String password) {
        return "<?xml version='1.0' encoding='utf-8'?>\n" +
                "<!DOCTYPE hibernate-configuration PUBLIC\n" +
                "        \"-//Hibernate/Hibernate Configuration DTD 3.0//EN\"\n" +
                "        \"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd\">\n" +
                "<hibernate-configuration>\n" +
                "    <session-factory>\n" +
                "        <property name=\"hibernate.connection.driver_class\">com.mysql.jdbc.Driver</property>\n" +
                "        <property name=\"hibernate.connection.url\">" + url + "</property>\n" +
                "        <property name=\"hibernate.connection.username\">" + username + "</property>\n" +
                "        <property name=\"hibernate.connection.password\">" + password + "</property>\n" +
                "        <property name=\"hibernate.dialect\">org.hibernate.dialect.MySQLDialect</property>\n" +
                "        <property name=\"hibernate.hbm2ddl.auto\">update</property>\n" +
                "        <property name=\"hibernate.format_sql\">true</property>" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Adscripcion\"/>\n" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Incidencia\"/>\n" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Trabajador\"/>" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Documento\"/>" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Expediente\"/>" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Semana\"/>" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.Config\"/>" +
                "        <mapping class=\"com.mycompany.sistemaoficios.clases.TipoIncidencia\"/>" +
                "    </session-factory>\n" +
                "</hibernate-configuration>";
    }
    
    public static void writeFile(String content) throws IOException {
        try (FileWriter writer = new FileWriter(new File(path))) {
            writer.write(content);
        }
    }
    
    public static void newConnection(){
        File props = new File(path);
        sessionFactory = new Configuration().configure(props).buildSessionFactory();
    }
    
    public static void verify(){
        try {
            File props = new File(path);
            File dir = new File("C://reportes-hibernate");
            if (!dir.exists()){
                try {
                    dir.mkdirs();
                    props.createNewFile();
                    JOptionPane.showMessageDialog(null, "Creando archivo"+props.exists());
                } catch (IOException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (!props.exists()){
                try {
                    props.createNewFile();
                    JOptionPane.showMessageDialog(null, "Creando archivo"+props.exists());
                } catch (IOException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        } catch (Throwable ex) {
            // Manejar la excepción inicial
            System.err.println("La creación de la SessionFactory falló." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static boolean testConnection(String url, String username, String password){
        if (!url.isBlank() && !username.isBlank() && !password.isBlank()){
            try {
                Configuration config = new Configuration();
                config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
                config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
                config.setProperty("hibernate.connection.url", url);
                config.setProperty("hibernate.connection.username", username);
                config.setProperty("hibernate.connection.password", password);
                config.setProperty("hibernate.hbm2ddl.auto", "validate");
                // Crear un ServiceRegistry
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(config.getProperties()).build();

                // Crear Metadata
                Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

                // Crear SessionFactory
                SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                // Si llegamos aquí, la conexión fue exitosa
                return true;
            } catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return false;
    }
}
