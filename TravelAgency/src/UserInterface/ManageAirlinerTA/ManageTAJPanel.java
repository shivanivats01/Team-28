/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlinerTA;

import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class ManageTAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTAJPanel
     */
    
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerDirectory;
    public ManageTAJPanel(JPanel CardSequenceJPanel ,AirlinerDirectory ad  ) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        airlinerDirectory = ad;
        
        AirlinerComboBox.removeAllItems();
        for (Airliner airliner :  airlinerDirectory.getAirlineList() ){
            AirlinerComboBox.addItem(airliner);
            //supplierComboBox.addItem(supplier);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AirlinerComboBox = new javax.swing.JComboBox<>();
        btnFind = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Airliner Name:");

        AirlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new Object[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnFind.setText("FIND >>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AirlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnFind)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AirlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        Airliner airliner = (Airliner) AirlinerComboBox.getSelectedItem();
        AirLinerWorkAreaJPanel awajp = new AirLinerWorkAreaJPanel(CardSequenceJPanel, airliner);
        CardSequenceJPanel.add("AirlinerWorkAreaJPanel", awajp);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnFindActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> AirlinerComboBox;
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
