/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingCenter;

import Business.EcoSystem;
import Business.Person.Person;
import Business.TestReport.TestReport;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreya.ghate
 */
public class NewReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewReportJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public NewReportJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        lblCreateTestReport = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        comboReport = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(167, 199, 231));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        lblCreateTestReport.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblCreateTestReport.setForeground(new java.awt.Color(0, 0, 0));
        lblCreateTestReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTestReport.setText("NEW TEST REPORT");
        add(lblCreateTestReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 62, 740, -1));

        lblReport.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblReport.setForeground(new java.awt.Color(0, 0, 0));
        lblReport.setText("Report:");
        add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setEnabled(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 450, 212, -1));

        lblID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("ID:");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 412, -1, -1));

        personTable.setBackground(new java.awt.Color(214, 229, 244));
        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Email", "Age", "Phone No", "Community"
            }
        ));
        jScrollPane1.setViewportView(personTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 166, 720, 183));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 453, -1, -1));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 125, -1, -1));

        txtID.setBackground(new java.awt.Color(214, 229, 244));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setEnabled(false);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 409, 212, -1));

        txtSearch.setBackground(new java.awt.Color(214, 229, 244));
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 125, 220, -1));

        lblSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(0, 0, 0));
        lblSearch.setText("Person Name:");
        add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 128, -1, -1));

        comboReport.setBackground(new java.awt.Color(214, 229, 244));
        comboReport.setForeground(new java.awt.Color(0, 0, 0));
        comboReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detected", "Non-detected" }));
        add(comboReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 210, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();
        
        DefaultTableModel dtm = (DefaultTableModel) personTable.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[7];
        boolean flag = false;
        for(Person person: system.getPersonDirectory().getPersonList()){
//            System.out.println(person);
            if((search).equals(person.getName())){
                row[0] = person;
                row[1] = person.getPersonID();
                row[2] = person.getAge();
                row[3] = person.getStreet();
                row[4] = person.getZipcode();
                row[5] = person.getPhoneNo();
                row[6] = person.getCommunity();
                dtm.addRow(row);
                flag = true;
                
                txtID.setText(String.valueOf(person.getPersonID()));
                txtName.setText(person.getName());
            
            
        }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null, "Person  not Found", "Warning", JOptionPane.WARNING_MESSAGE);
            txtID.setText("");
            txtName.setText("");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //String personID = txtID.getText();
        //String personName = txtName.getText();
//        String date = txtDate.getText();
//        System.out.println(date);
        Boolean result = false;
        if(comboReport.getSelectedItem().toString().equals("Detected")){
            result = true;
        }
        else{
             result = false;
        }
        for(Person person: system.getPersonDirectory().getPersonList()){
            if(txtSearch.getText().equals(person.getName())){
                person.getTestHistory().newTestReport(result);
                JOptionPane.showMessageDialog(this, "Report Created");
                
//                System.out.println(date);
                
//                System.out.println( person.getTestHistory().getTestReportList().get(0));
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TestingLabAdminJPanel sysAdminwjp = (TestingLabAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateTestReport;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
