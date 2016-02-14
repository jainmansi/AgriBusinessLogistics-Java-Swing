/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Retailer.getValue())){
            organization = new RetailerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Farmer.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FDA.getValue())){
            organization = new FDAOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Driver.getValue())){
            organization = new DriverOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Driver.getValue())){
            organization = new DriverOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
