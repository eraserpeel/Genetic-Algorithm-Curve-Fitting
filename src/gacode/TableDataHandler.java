/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gacode;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class TableDataHandler {
    JTable table; 
    DefaultTableModel tableModel;
    int currentRow;
    int rowMax = 2000; 
    
    TableDataHandler(JTable table) {
        this.table = table; 
        tableModel = (DefaultTableModel)table.getModel();
        currentRow = table.getRowCount(); 
        table.getColumnModel().getColumn(0).setPreferredWidth(350);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
    }
   
    void add(String value, double fitness) {
        currentRow++; 
        tableModel.addRow(new Object[]{value, fitness});
    }
  
    void clearTable() {
        tableModel.setRowCount(0);
    }
 
}
