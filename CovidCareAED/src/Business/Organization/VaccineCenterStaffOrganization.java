/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VaccinationCenterStaffRole;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class VaccineCenterStaffOrganization extends Organization{
     public VaccineCenterStaffOrganization(String name) {
        super(Organization.Type.VaccinationCenterStaff.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccinationCenterStaffRole());
        return roles;
    }
}
