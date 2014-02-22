/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gacode;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class GAConstructorGUI extends javax.swing.JFrame {
    
    CellPopulation cellPop; 
    TableDataHandler tblHandler;
    
    
    public GAConstructorGUI() {
        initComponents();
        createRandomCoordinates();
        tblHandler = new TableDataHandler(tblData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTlbrBasics = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnGeneratePopulation = new javax.swing.JButton();
        txtStartingPopulation = new javax.swing.JTextField();
        btnRun = new javax.swing.JButton();
        txtNumberOfRuns = new javax.swing.JTextField();
        btnCullPopulation = new javax.swing.JButton();
        sprMenu = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        sprControlPanel = new javax.swing.JSeparator();
        pnlControl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPaneCoordinates = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        chkMutations = new javax.swing.JCheckBox();
        chkFixedLength = new javax.swing.JCheckBox();
        chkShowInTable = new javax.swing.JCheckBox();
        btnClearTextPane = new javax.swing.JButton();
        btnCreateCoordinates = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        editorPaneStatus = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jCheckBox1.setText("jCheckBox1");

        jCheckBox6.setBackground(new java.awt.Color(0, 153, 153));
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 680));
        getContentPane().setLayout(null);

        jTlbrBasics.setBackground(new java.awt.Color(255, 255, 255));
        jTlbrBasics.setFloatable(false);
        jTlbrBasics.setRollover(true);
        jTlbrBasics.setPreferredSize(new java.awt.Dimension(479, 36));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gacode/folder/saveset.jpg"))); // NOI18N
        btnSave.setToolTipText("Save Formulas");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setFocusPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jTlbrBasics.add(btnSave);

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gacode/folder/settings.jpg"))); // NOI18N
        btnSettings.setToolTipText("Settings");
        btnSettings.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSettings.setFocusPainted(false);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        jTlbrBasics.add(btnSettings);

        btnGeneratePopulation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gacode/folder/initializeset.jpg"))); // NOI18N
        btnGeneratePopulation.setToolTipText("Generate Population");
        btnGeneratePopulation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGeneratePopulation.setFocusPainted(false);
        btnGeneratePopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePopulationActionPerformed(evt);
            }
        });
        jTlbrBasics.add(btnGeneratePopulation);

        txtStartingPopulation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartingPopulation.setText("20");
        txtStartingPopulation.setMaximumSize(new java.awt.Dimension(50, 35));
        txtStartingPopulation.setMinimumSize(new java.awt.Dimension(50, 32));
        jTlbrBasics.add(txtStartingPopulation);

        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gacode/folder/runset.jpg"))); // NOI18N
        btnRun.setToolTipText("Run");
        btnRun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRun.setFocusPainted(false);
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        jTlbrBasics.add(btnRun);

        txtNumberOfRuns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumberOfRuns.setText("1");
        txtNumberOfRuns.setAlignmentX(2.5F);
        txtNumberOfRuns.setMargin(null);
        txtNumberOfRuns.setMaximumSize(new java.awt.Dimension(50, 35));
        txtNumberOfRuns.setMinimumSize(new java.awt.Dimension(50, 35));
        txtNumberOfRuns.setName(""); // NOI18N
        jTlbrBasics.add(txtNumberOfRuns);

        btnCullPopulation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gacode/folder/cullpopulation.jpg"))); // NOI18N
        btnCullPopulation.setToolTipText("Cull Population");
        btnCullPopulation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCullPopulation.setFocusPainted(false);
        btnCullPopulation.setPreferredSize(new java.awt.Dimension(32, 32));
        btnCullPopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCullPopulationActionPerformed(evt);
            }
        });
        jTlbrBasics.add(btnCullPopulation);

        getContentPane().add(jTlbrBasics);
        jTlbrBasics.setBounds(0, 0, 740, 36);

        sprMenu.setBackground(new java.awt.Color(153, 255, 153));
        sprMenu.setForeground(new java.awt.Color(153, 255, 153));
        sprMenu.setMaximumSize(new java.awt.Dimension(12131, 5));
        getContentPane().add(sprMenu);
        sprMenu.setBounds(0, 40, 720, 10);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expression", "Fitness"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.setMinimumSize(new java.awt.Dimension(500, 300));
        jScrollPane2.setViewportView(tblData);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 40, 480, 450);

        sprControlPanel.setBackground(new java.awt.Color(153, 255, 153));
        sprControlPanel.setForeground(new java.awt.Color(153, 255, 153));
        sprControlPanel.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(sprControlPanel);
        sprControlPanel.setBounds(480, 40, 2, 450);

        pnlControl.setBackground(new java.awt.Color(204, 255, 204));
        pnlControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(txtPaneCoordinates);

        pnlControl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 220));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Enter Coordinates");
        jLabel1.setOpaque(true);
        pnlControl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, -1));

        chkMutations.setBackground(new java.awt.Color(0, 153, 153));
        chkMutations.setForeground(new java.awt.Color(255, 255, 255));
        chkMutations.setSelected(true);
        chkMutations.setText("Mutations");
        chkMutations.setToolTipText("Apply mutation rate set under settings");
        pnlControl.add(chkMutations, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 30));

        chkFixedLength.setBackground(new java.awt.Color(0, 153, 153));
        chkFixedLength.setForeground(new java.awt.Color(255, 255, 255));
        chkFixedLength.setText("Fixed Length");
        chkFixedLength.setToolTipText("Allow the strands to grow and shrink based on crossover and mutations.");
        pnlControl.add(chkFixedLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 30));

        chkShowInTable.setBackground(new java.awt.Color(0, 153, 153));
        chkShowInTable.setForeground(new java.awt.Color(255, 255, 255));
        chkShowInTable.setSelected(true);
        chkShowInTable.setText("Show in table");
        chkShowInTable.setToolTipText("Show each running of the data in the table.");
        pnlControl.add(chkShowInTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 30));

        btnClearTextPane.setText("Clear");
        btnClearTextPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTextPaneActionPerformed(evt);
            }
        });
        pnlControl.add(btnClearTextPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 80, -1));

        btnCreateCoordinates.setText("Random");
        btnCreateCoordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCoordinatesActionPerformed(evt);
            }
        });
        pnlControl.add(btnCreateCoordinates, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        getContentPane().add(pnlControl);
        pnlControl.setBounds(480, 40, 200, 450);

        editorPaneStatus.setEditable(false);
        editorPaneStatus.setBackground(new java.awt.Color(0, 0, 0));
        editorPaneStatus.setForeground(new java.awt.Color(204, 255, 255));
        editorPaneStatus.setText("Status");
        jScrollPane4.setViewportView(editorPaneStatus);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 490, 680, 140);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Run");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCullPopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCullPopulationActionPerformed
        int culled = cellPop.cullPopulation();
        setStatus("\nCulled cells: " + culled + "\n");
        tblHandler.clearTable();
        cellPop.calculateFitness(getCoordinates());
        ArrayList<FormulaCell> cellList = cellPop.getCells();
        for (FormulaCell cell : cellList) {
            tblHandler.add(cellPop.convertSequenceToExpression(cell.getSequence()), cell.getFitness());
        }     
    }//GEN-LAST:event_btnCullPopulationActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        setStatus("Recombining cells..." + "\n");
        if(getCoordinates() != null) {
            tblHandler.clearTable();
            cellPop.cullPopulation();
            cellPop.recombineCells();
            cellPop.calculateFitness(getCoordinates());
            cellPop.cullPopulation();
            ArrayList<FormulaCell> cellList = cellPop.getCells();
            for(FormulaCell cell : cellList) {
                tblHandler.add(cellPop.convertSequenceToExpression(cell.getSequence()), cell.getFitness());
            }        
            setStatus("Finished" + "\n\n");
        }
        else {
            setStatus("\nNo coordinates have been specified.\n");
        }
    }//GEN-LAST:event_btnRunActionPerformed

    private ArrayList<Point2D.Double> getCoordinates() {
        
        ArrayList<Point2D.Double> coordinateList = new ArrayList<Point2D.Double>(); 
        Pattern p = Pattern.compile("\\(\\s*([-]?\\d+\\.?\\d*)\\s*,\\s*([-]?\\d+\\.?\\d*)\\s*\\)");
        Matcher m = p.matcher(txtPaneCoordinates.getText());
        
        while (m.find()) {
            coordinateList.add(new Point2D.Double(Double.parseDouble(m.group(1)), 
                                                  Double.parseDouble(m.group(2))));
        }
        return coordinateList;
    }
    
    private void createRandomCoordinates() { 
        txtPaneCoordinates.setText("");
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);            
        nf.setGroupingUsed(false);
        Random rnd = new Random(); 
        int goUntil = rnd.nextInt(10) + 1;
        for(int i = 0; i < goUntil; i++) {
            txtPaneCoordinates.setText(txtPaneCoordinates.getText() + 
                                       "(" + nf.format(rnd.nextDouble() * 100) + 
                                        "," + nf.format(rnd.nextDouble() * 100) + ")\n");
        }
    }
    
    private void btnGeneratePopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePopulationActionPerformed
        setStatus("\nGenerating population new population...\n");
        setStatus("Initial Population: 200\n");
        setStatus("Initial size: 6\n");
        setStatus("Using types.txt\n");
        
        cellPop = new CellPopulation(200, 6, "types.txt");
        tblHandler.clearTable();
        cellPop.calculateFitness(getCoordinates());
        cellPop.cullPopulation();
        ArrayList<FormulaCell> cellList = cellPop.getCells();
        for(FormulaCell cell : cellList) {
            tblHandler.add(cellPop.convertSequenceToExpression(cell.getSequence()), cell.getFitness());
        }    
        setStatus("Culled and completed\n");
    }//GEN-LAST:event_btnGeneratePopulationActionPerformed

    private void btnClearTextPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTextPaneActionPerformed
        txtPaneCoordinates.setText("");
    }//GEN-LAST:event_btnClearTextPaneActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        setStatus("\n" + "Sorry, but no settings at the moment..." + "\n");
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        setStatus("\n" + "Sorry, but no save at the moment..." + "\n");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCreateCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCoordinatesActionPerformed
        createRandomCoordinates();
    }//GEN-LAST:event_btnCreateCoordinatesActionPerformed

    private void setStatus(String str) {
        editorPaneStatus.setText(editorPaneStatus.getText() + str);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GAConstructorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAConstructorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAConstructorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAConstructorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAConstructorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTextPane;
    private javax.swing.JButton btnCreateCoordinates;
    private javax.swing.JButton btnCullPopulation;
    private javax.swing.JButton btnGeneratePopulation;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSettings;
    private javax.swing.JCheckBox chkFixedLength;
    private javax.swing.JCheckBox chkMutations;
    private javax.swing.JCheckBox chkShowInTable;
    private javax.swing.JEditorPane editorPaneStatus;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar jTlbrBasics;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JSeparator sprControlPanel;
    private javax.swing.JSeparator sprMenu;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtNumberOfRuns;
    private javax.swing.JTextPane txtPaneCoordinates;
    private javax.swing.JTextField txtStartingPopulation;
    // End of variables declaration//GEN-END:variables
}
