/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AirlinerDirectory;
import Business.FlightDirectory;
import UserInterface.ManageAirlinerTA.ManageTAJPanel;
import UserInterface.RegisterAirliner.RegisterAirlinerJPanel;
//import UserInterface.SearchFlights.SearchJPanel;
import java.awt.CardLayout;

/**
 *
 * @author jshar
 */
public class TravelAgencyMain extends javax.swing.JFrame {
    
    
    private AirlinerDirectory airlinerDirectory;
    private FlightDirectory flightDirectory;

    /**
     * Creates new form TravelAgencyMain
     */
    public TravelAgencyMain() {
        initComponents();
        airlinerDirectory = new AirlinerDirectory();
        flightDirectory = new FlightDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnManage = new javax.swing.JButton();
        btnRegisterAirline = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        CardSequenceJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setBackground(new java.awt.Color(51, 255, 204));
        SplitPane.setDividerLocation(200);
        SplitPane.setDividerSize(10);
        SplitPane.setEnabled(false);

        controlJPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManage.setText("Manage");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        controlJPanel.add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 164, 186, -1));

        btnRegisterAirline.setText("Register Airliners ");
        btnRegisterAirline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterAirlineActionPerformed(evt);
            }
        });
        controlJPanel.add(btnRegisterAirline, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 227, 186, -1));

        btnSearch.setText("Search / Book");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        controlJPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 286, 186, -1));

        SplitPane.setLeftComponent(controlJPanel);

        CardSequenceJPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(CardSequenceJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        ManageTAJPanel managePanel = new ManageTAJPanel(CardSequenceJPanel, airlinerDirectory);
        CardSequenceJPanel.add("RegisterAirlinerJPanel", managePanel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
        
        
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnRegisterAirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterAirlineActionPerformed
        // TODO add your handling code here:
        RegisterAirlinerJPanel registerPanel = new RegisterAirlinerJPanel(CardSequenceJPanel, airlinerDirectory);
        CardSequenceJPanel.add("RegisterAirlinerJPanel", registerPanel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnRegisterAirlineActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    //    SearchJPanel managePanel = new SearchJPanel(CardSequenceJPanel, flightDirectory);
    //    CardSequenceJPanel.add("SearchJPanel", managePanel);
    //    CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
    //    layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnRegisterAirline;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel controlJPanel;
    // End of variables declaration//GEN-END:variables
}