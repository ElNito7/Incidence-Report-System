/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Keloc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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
        optionMenuP = new javax.swing.JPanel();
        menubox = new javax.swing.JPanel();
        catalogoBtn = new javax.swing.JButton();
        supervisionBtn = new javax.swing.JButton();
        reportesBtn = new javax.swing.JButton();
        herramientasBtn = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setMinimumSize(new java.awt.Dimension(874, 461));
        bg.setPreferredSize(new java.awt.Dimension(874, 461));

        optionMenuP.setBackground(new java.awt.Color(204, 204, 204));

        menubox.setLayout(new javax.swing.BoxLayout(menubox, javax.swing.BoxLayout.PAGE_AXIS));

        catalogoBtn.setText("Catalogo");
        catalogoBtn.setBorder(null);
        catalogoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catalogoBtn.setMaximumSize(new java.awt.Dimension(138, 70));
        catalogoBtn.setMinimumSize(new java.awt.Dimension(138, 70));
        catalogoBtn.setPreferredSize(new java.awt.Dimension(128, 65));
        catalogoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoBtnActionPerformed(evt);
            }
        });
        menubox.add(catalogoBtn);

        supervisionBtn.setText("Supervisión");
        supervisionBtn.setBorder(null);
        supervisionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supervisionBtn.setMaximumSize(new java.awt.Dimension(138, 70));
        supervisionBtn.setMinimumSize(new java.awt.Dimension(138, 70));
        supervisionBtn.setPreferredSize(new java.awt.Dimension(128, 65));
        supervisionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisionBtnActionPerformed(evt);
            }
        });
        menubox.add(supervisionBtn);

        reportesBtn.setText("Reportes");
        reportesBtn.setBorder(null);
        reportesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportesBtn.setMaximumSize(new java.awt.Dimension(138, 70));
        reportesBtn.setMinimumSize(new java.awt.Dimension(138, 70));
        reportesBtn.setPreferredSize(new java.awt.Dimension(128, 65));
        reportesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesBtnActionPerformed(evt);
            }
        });
        menubox.add(reportesBtn);

        herramientasBtn.setText("Herramientas");
        herramientasBtn.setBorder(null);
        herramientasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientasBtn.setMaximumSize(new java.awt.Dimension(138, 70));
        herramientasBtn.setMinimumSize(new java.awt.Dimension(138, 70));
        herramientasBtn.setPreferredSize(new java.awt.Dimension(128, 65));
        herramientasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herramientasBtnActionPerformed(evt);
            }
        });
        menubox.add(herramientasBtn);

        javax.swing.GroupLayout optionMenuPLayout = new javax.swing.GroupLayout(optionMenuP);
        optionMenuP.setLayout(optionMenuPLayout);
        optionMenuPLayout.setHorizontalGroup(
            optionMenuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionMenuPLayout.createSequentialGroup()
                .addComponent(menubox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        optionMenuPLayout.setVerticalGroup(
            optionMenuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionMenuPLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(menubox, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        header.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(optionMenuP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(optionMenuP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void supervisionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisionBtnActionPerformed
        changeContent(new Supervision());
    }//GEN-LAST:event_supervisionBtnActionPerformed

    private void catalogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoBtnActionPerformed
        changeContent(new Catalogo());
    }//GEN-LAST:event_catalogoBtnActionPerformed

    private void reportesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesBtnActionPerformed
        changeContent(new Reportes());
    }//GEN-LAST:event_reportesBtnActionPerformed

    private void herramientasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herramientasBtnActionPerformed
        changeContent(new Herramientas());
    }//GEN-LAST:event_herramientasBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    private void changeContent(JPanel p){
        p.setSize(content.getWidth(), content.getHeight());
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton catalogoBtn;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JButton herramientasBtn;
    private javax.swing.JPanel menubox;
    private javax.swing.JPanel optionMenuP;
    private javax.swing.JButton reportesBtn;
    private javax.swing.JButton supervisionBtn;
    // End of variables declaration//GEN-END:variables
}
