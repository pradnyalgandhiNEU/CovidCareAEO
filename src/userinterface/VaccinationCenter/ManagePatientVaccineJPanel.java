/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccinationCenter;

//import Business.Enterprise.Enterprise;
import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.VaccinatePatient;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreya.ghate
 */
public class ManagePatientVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientVaccineJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    //Enterprise enterprise;
    public ManagePatientVaccineJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        //this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageInventory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccine = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        lblBatch = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageInventory.setForeground(new java.awt.Color(0, 0, 0));
        lblManageInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageInventory.setText("PATIENT VACCINATION DETAILS");
        add(lblManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 510, -1));

        tblVaccine.setBackground(new java.awt.Color(214, 229, 244));
        tblVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Staff ID"
            }
        ));
        jScrollPane1.setViewportView(tblVaccine);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 692, 181));

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Create");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, -1, -1));

        lblBatch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBatch.setForeground(new java.awt.Color(0, 0, 0));
        lblBatch.setText("Staff ID:");
        add(lblBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));

        txtStaffID.setBackground(new java.awt.Color(214, 229, 244));
        add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       try{
        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList())  {
            VaccinatePatient vp = (VaccinatePatient)wr;
            vp.setStaff(userAccount);
           for(Patient p: vp.getNonVaccPatientList()){
               if(p.getVaccinationStatus().equals("Partially Vaccinated")){
                   p.setVaccinationStatus("Fully Vaccinated");
               }
                   else{
                           p.setVaccinationStatus("Partially Vaccinated");
                           }
               }
           }
        txtStaffID.setText(String.valueOf(userAccount.getEmployee().getId()));
        
        populateTable();
        JOptionPane.showMessageDialog(this, "All patients vaccinated");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "No Work request");
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblManageInventory;
    private javax.swing.JTable tblVaccine;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblVaccine.getModel();
        dtm.setRowCount(0);

            
                for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList())  {
            VaccinatePatient vp = (VaccinatePatient)wr;
            vp.setStaff(userAccount);
           for(Patient p: vp.getNonVaccPatientList()){
                    
                    Object[] row = new Object[3];
                    row[0] = p.getPatientID();
                    row[1] = p.getName();
                    row[2] = vp.getStaff().getEmployee().getId();
                    
                    dtm.addRow(row);
                
                }//To change body of generated methods, choose Tools | Templates.
                }
    }
}
