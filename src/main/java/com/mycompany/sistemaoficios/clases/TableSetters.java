/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keloc
 */
public abstract class TableSetters {
    public abstract Object[] toRow();
    public abstract DefaultTableModel getModel();
    public static void setTable(List<TableSetters> rows, DefaultTableModel model, JTable table){
        for (TableSetters r:rows){
            Object[] row = r.toRow();
            model.addRow(row);
        }
        table.setModel(model);
        table.setDefaultEditor(Object.class, null);
    }
}
