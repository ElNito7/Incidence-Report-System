/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.persistencia;
import com.mycompany.sistemaoficios.clases.Incidencia;
import com.mycompany.sistemaoficios.clases.ReportTable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Keloc
 */
public class ReportsConfig {
    public static void compile(String jrxmlPath, String jasperPath) {
        try {
            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
    
    public static void makeOficio(String[] arr, List<ReportTable> rt){
        try {
           // Ruta del archivo .jasper
            InputStream reportPath = getRep("oficio");
            
            // Convertir los datos en JRDataSource
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rt);
            
            // Parámetros del reporte
            Map<String, Object> parameters = paramsOficio(arr, dataSource);
            
            // Llenar el reporte
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parameters, new JREmptyDataSource());
            
            // Visualizar el reporte
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e){
            Logger.getLogger(ReportsConfig.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Creación del reporte fallida");
        } finally {
            
        }
    }
    
    public static void makeNoData(String noData, String[] arr){
        try {
            InputStream path = getRep("incidencias");
            Map<String, Object> params = paramsIncidencia(arr, null);
            params.put("noDataM", noData);
            JasperPrint jasperPrint = JasperFillManager.fillReport(path, params, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void makeIncidencias(String[] arr, List<Incidencia> incs){
        try {
            InputStream path = getRep("incidencias");
            List<Map<String, Object>> l = setIncsTable(incs);
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(l);
            Map<String, Object> params = paramsIncidencia(arr, ds);
            JasperPrint jasperPrint = JasperFillManager.fillReport(path, params, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static Map paramsOficio(String[] arr, JRBeanCollectionDataSource dataSource){
        Map<String, Object> params = new HashMap<>();
        try {
             // Cargar logos
            InputStream imageStream = getImg("logo1");
            InputStream imageStream2 = getImg("logo2");
            
            params.put("setTable", dataSource);
            params.put("setDef", arr[0]);
            params.put("setFecha", arr[1]);  
            params.put("setLeyenda", arr[2]);
            params.put("setSem", arr[3]);
            params.put("setDelegado", arr[4]);
            params.put("setPuesto", arr[5]);
            params.put("setOficial", arr[6]);
            params.put("setJfa", arr[7]);
            params.put("setRevisor", arr[8]);
            params.put("setOficio", arr[9]);
            params.put("dele", arr[10]);
            params.put("repo", arr[11]);
            params.put("asJud", arr[12]);
            params.put("suplencia", arr[13]);
            params.put("logo1", imageStream);
            params.put("logo2", imageStream2);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return params;
    }
    
    
    public static List<ReportTable> extractData(List<Incidencia> incs) {
        List<ReportTable> data = new ArrayList<>();
        for (Incidencia i: incs) {
            String exp = i.getExp().getnControl();
            String def = i.getExp().getDefendido();
            String doc = i.getDoc().getDoc();
            String fecha = i.getExp().getRecepcion().toString();
            String inc = i.getIncidencia().getIncidencia();
            if (i.isMuestraInci() == false){
                inc = i.getObservaciones();
            }
            ReportTable rt = new ReportTable(exp, def, doc, fecha, inc);
            data.add(rt);
        }
        return data;
    }
    
    public static Map paramsIncidencia(String[] arr, JRBeanCollectionDataSource dataSource){
        Map<String, Object> params = new HashMap<>();
        try {
            params.put("setTabla", dataSource);
            params.put("setDef", arr[0]);
            params.put("setSupl", arr[1]);  
            params.put("setClave", arr[2]);
            params.put("setSem", arr[3]);
            params.put("setDel", arr[4]);
            params.put("setRev", arr[5]);
            params.put("setJfa", arr[6]);
            params.put("dele", arr[7]);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return params;
    }
    
    public static List<Map<String, Object>> setIncsTable(List<Incidencia> incs){
        List<Map<String, Object>> li = new ArrayList();
        try {
            for (Incidencia i:incs){
                Map<String,Object> row = new HashMap();
                String fdoc = "NO ELABORÓ";
                String frecep = "NO REMITIÓ";
                if (i.getElab() != null){
                    fdoc = i.getElab().toString();;
                }
                if(i.getFecha() != null){
                    frecep = i.getFecha().toString();
                }
                row.put("nControl", i.getExp().getExpJud());
                row.put("nExp", i.getExp().getnControl());
                row.put("defendido", i.getExp().getDefendido());
                row.put("doc", i.getDoc().getDoc());
                row.put("f_elab", fdoc);
                row.put("f_recep", frecep);
                row.put("inc", i.getIncidencia().getIncidencia());
                row.put("obs", i.getObservaciones());
                li.add(row);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return li;
    }
    
    private static InputStream getImg(String n){
        try {
            InputStream is = ReportsConfig.class.getClassLoader().getResourceAsStream(n+".png");
            if (is != null) {
                return is;
            } else {
                System.err.println("No se pudo encontrar el icono");
                return new FileInputStream("src/main/resources/"+n+".png");
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    private static InputStream getRep(String n){
        try {
            InputStream is = ReportsConfig.class.getClassLoader().getResourceAsStream(n+".jasper");
            if (is != null) {
                return is;
            } else {
                System.err.println("No se pudo encontrar el icono");
                return new FileInputStream("src/main/resources/reports"+n+".jasper");
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
}
