/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Keloc
 */
public class MyUtils {
    public static JDatePickerImpl setDateP(){
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        return new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }
    
    public static void initTable(List list, DefaultTableModel model, JTable table){
        try {
            List<TableSetters> ts = new ArrayList();
            ts.addAll(list);
            TableSetters.setTable(ts, model, table);
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
    
    public static void emptyTable(DefaultTableModel model, JTable table){
        try {
            List<TableSetters> ts = new ArrayList();
            TableSetters.setTable(ts, model, table);
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}
