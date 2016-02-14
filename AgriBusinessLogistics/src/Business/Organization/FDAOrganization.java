/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FDARole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FDAOrganization extends Organization{

    public FDAOrganization() {
        super(Organization.Type.FDA.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FDARole());
        return roles;    
    }
    
}
