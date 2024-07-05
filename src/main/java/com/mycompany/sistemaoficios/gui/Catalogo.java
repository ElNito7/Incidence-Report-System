/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.sistemaoficios.gui;

/**
 *
 * @author Keloc
 */
public class Catalogo extends javax.swing.JPanel {

    /**
     * Creates new form Catalogo
     */
    public Catalogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        catalogoTabbedP = new javax.swing.JTabbedPane();
        adscripcionesP = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        adscripcionL = new javax.swing.JLabel();
        defensorL = new javax.swing.JLabel();
        oficiall = new javax.swing.JLabel();
        revisorL = new javax.swing.JLabel();
        adscribcionesTextoL = new javax.swing.JLabel();
        claveAdscTF = new javax.swing.JTextField();
        adscripcionTF = new javax.swing.JTextField();
        defensorTF = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        oficialTA = new javax.swing.JTextArea();
        revisorTF = new javax.swing.JTextField();
        datosP = new javax.swing.JPanel();
        datosMostrarP = new javax.swing.JPanel();
        delegadoL = new javax.swing.JLabel();
        jefeDptoL = new javax.swing.JLabel();
        leyendaL = new javax.swing.JLabel();
        fundamentoSuplenciaL = new javax.swing.JLabel();
        delegadoTF = new javax.swing.JTextField();
        jefeDptoTF = new javax.swing.JTextField();
        leyendaTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fundamentoSuplenciaTA = new javax.swing.JTextArea();
        incidenciasSemanaP = new javax.swing.JPanel();
        mostrarIncSemP = new javax.swing.JPanel();
        semanasL = new javax.swing.JLabel();
        searchSemanasL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSemanasIncidencias = new javax.swing.JTable();
        incidenciasTiposP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        numIncL = new javax.swing.JLabel();
        incidenciaL = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tiposL = new javax.swing.JLabel();
        docsTiposP = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        claveL = new javax.swing.JLabel();
        documentoL = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        docsL = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(734, 369));
        setPreferredSize(new java.awt.Dimension(734, 369));

        bg.setMinimumSize(new java.awt.Dimension(734, 369));
        bg.setPreferredSize(new java.awt.Dimension(734, 369));

        catalogoTabbedP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catalogoTabbedP.setMinimumSize(new java.awt.Dimension(734, 369));
        catalogoTabbedP.setPreferredSize(new java.awt.Dimension(734, 369));

        adscripcionesP.setMinimumSize(new java.awt.Dimension(734, 369));
        adscripcionesP.setPreferredSize(new java.awt.Dimension(734, 369));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(60, 50));
        jTable1.setPreferredSize(new java.awt.Dimension(300, 50));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setText("Clave de Adscripcion:");

        adscripcionL.setText("Adscripcion:");

        defensorL.setText("Defensor:");

        oficiall.setText("Oficial (c.c.p):");

        revisorL.setText("Oficial Revisor:");

        adscribcionesTextoL.setText("Adscripciones:");

        oficialTA.setColumns(20);
        oficialTA.setRows(5);
        jScrollPane4.setViewportView(oficialTA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(adscripcionL)
                        .addComponent(defensorL)
                        .addComponent(oficiall)
                        .addComponent(revisorL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adscribcionesTextoL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(claveAdscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4)
                    .addComponent(defensorTF)
                    .addComponent(adscripcionTF)
                    .addComponent(revisorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(claveAdscTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adscripcionL)
                    .addComponent(adscripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defensorL)
                    .addComponent(defensorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oficiall)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revisorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revisorL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adscribcionesTextoL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout adscripcionesPLayout = new javax.swing.GroupLayout(adscripcionesP);
        adscripcionesP.setLayout(adscripcionesPLayout);
        adscripcionesPLayout.setHorizontalGroup(
            adscripcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adscripcionesPLayout.setVerticalGroup(
            adscripcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        catalogoTabbedP.addTab("Adscripciones", adscripcionesP);

        datosP.setMinimumSize(new java.awt.Dimension(734, 369));
        datosP.setPreferredSize(new java.awt.Dimension(734, 369));

        delegadoL.setText("Delegado:");

        jefeDptoL.setText("Jefe de Departamento:");

        leyendaL.setText("Leyenda:");

        fundamentoSuplenciaL.setText("Fundamento Suplencia:");

        fundamentoSuplenciaTA.setColumns(20);
        fundamentoSuplenciaTA.setLineWrap(true);
        fundamentoSuplenciaTA.setRows(5);
        fundamentoSuplenciaTA.setText("\n");
        fundamentoSuplenciaTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(fundamentoSuplenciaTA);

        javax.swing.GroupLayout datosMostrarPLayout = new javax.swing.GroupLayout(datosMostrarP);
        datosMostrarP.setLayout(datosMostrarPLayout);
        datosMostrarPLayout.setHorizontalGroup(
            datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosMostrarPLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delegadoL)
                    .addComponent(jefeDptoL)
                    .addComponent(leyendaL)
                    .addComponent(fundamentoSuplenciaL))
                .addGap(18, 18, 18)
                .addGroup(datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delegadoTF)
                    .addComponent(jefeDptoTF)
                    .addComponent(leyendaTF)
                    .addComponent(jScrollPane1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        datosMostrarPLayout.setVerticalGroup(
            datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosMostrarPLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delegadoL)
                    .addComponent(delegadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jefeDptoL)
                    .addComponent(jefeDptoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leyendaL)
                    .addComponent(leyendaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosMostrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundamentoSuplenciaL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout datosPLayout = new javax.swing.GroupLayout(datosP);
        datosP.setLayout(datosPLayout);
        datosPLayout.setHorizontalGroup(
            datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosMostrarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        datosPLayout.setVerticalGroup(
            datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(datosMostrarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        catalogoTabbedP.addTab("Delegado y Jefe Dpto.", datosP);

        semanasL.setText("Semana:");

        tablaSemanasIncidencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Semana"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaSemanasIncidencias);

        javax.swing.GroupLayout mostrarIncSemPLayout = new javax.swing.GroupLayout(mostrarIncSemP);
        mostrarIncSemP.setLayout(mostrarIncSemPLayout);
        mostrarIncSemPLayout.setHorizontalGroup(
            mostrarIncSemPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarIncSemPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mostrarIncSemPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrarIncSemPLayout.createSequentialGroup()
                        .addComponent(semanasL, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchSemanasL))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
                .addContainerGap())
        );
        mostrarIncSemPLayout.setVerticalGroup(
            mostrarIncSemPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarIncSemPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(mostrarIncSemPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semanasL)
                    .addComponent(searchSemanasL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout incidenciasSemanaPLayout = new javax.swing.GroupLayout(incidenciasSemanaP);
        incidenciasSemanaP.setLayout(incidenciasSemanaPLayout);
        incidenciasSemanaPLayout.setHorizontalGroup(
            incidenciasSemanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incidenciasSemanaPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarIncSemP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        incidenciasSemanaPLayout.setVerticalGroup(
            incidenciasSemanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incidenciasSemanaPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarIncSemP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        catalogoTabbedP.addTab("Incidencias Semanales", incidenciasSemanaP);

        numIncL.setText("Número:");

        incidenciaL.setText("Incidencia:");

        jScrollPane5.setViewportView(jTextPane1);

        jScrollPane6.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numIncL)
                    .addComponent(incidenciaL))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numIncL)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incidenciaL)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        tiposL.setText("Tipos de Incidencia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiposL))
                        .addGap(0, 221, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiposL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout incidenciasTiposPLayout = new javax.swing.GroupLayout(incidenciasTiposP);
        incidenciasTiposP.setLayout(incidenciasTiposPLayout);
        incidenciasTiposPLayout.setHorizontalGroup(
            incidenciasTiposPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        incidenciasTiposPLayout.setVerticalGroup(
            incidenciasTiposPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        catalogoTabbedP.addTab("Incidencias", incidenciasTiposP);

        claveL.setText("Clave:");

        documentoL.setText("Documento:");

        jScrollPane8.setViewportView(jTextPane3);

        jScrollPane9.setViewportView(jTextPane4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(claveL)
                    .addComponent(documentoL))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(claveL)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(documentoL)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable3);

        docsL.setText("Tipos de Documento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(docsL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docsL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout docsTiposPLayout = new javax.swing.GroupLayout(docsTiposP);
        docsTiposP.setLayout(docsTiposPLayout);
        docsTiposPLayout.setHorizontalGroup(
            docsTiposPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        docsTiposPLayout.setVerticalGroup(
            docsTiposPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docsTiposPLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        catalogoTabbedP.addTab("Documentos", docsTiposP);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catalogoTabbedP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catalogoTabbedP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initData(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adscribcionesTextoL;
    private javax.swing.JLabel adscripcionL;
    private javax.swing.JTextField adscripcionTF;
    private javax.swing.JPanel adscripcionesP;
    private javax.swing.JPanel bg;
    private javax.swing.JTabbedPane catalogoTabbedP;
    private javax.swing.JTextField claveAdscTF;
    private javax.swing.JLabel claveL;
    private javax.swing.JPanel datosMostrarP;
    private javax.swing.JPanel datosP;
    private javax.swing.JLabel defensorL;
    private javax.swing.JTextField defensorTF;
    private javax.swing.JLabel delegadoL;
    private javax.swing.JTextField delegadoTF;
    private javax.swing.JLabel docsL;
    private javax.swing.JPanel docsTiposP;
    private javax.swing.JLabel documentoL;
    private javax.swing.JLabel fundamentoSuplenciaL;
    private javax.swing.JTextArea fundamentoSuplenciaTA;
    private javax.swing.JLabel incidenciaL;
    private javax.swing.JPanel incidenciasSemanaP;
    private javax.swing.JPanel incidenciasTiposP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JLabel jefeDptoL;
    private javax.swing.JTextField jefeDptoTF;
    private javax.swing.JLabel leyendaL;
    private javax.swing.JTextField leyendaTF;
    private javax.swing.JPanel mostrarIncSemP;
    private javax.swing.JLabel numIncL;
    private javax.swing.JTextArea oficialTA;
    private javax.swing.JLabel oficiall;
    private javax.swing.JLabel revisorL;
    private javax.swing.JTextField revisorTF;
    private javax.swing.JTextField searchSemanasL;
    private javax.swing.JLabel semanasL;
    private javax.swing.JTable tablaSemanasIncidencias;
    private javax.swing.JLabel tiposL;
    // End of variables declaration//GEN-END:variables
}
