/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Order.MasterOrderCatalog;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author user
 */
public class Network{
    private String name;
    private String date;
    private EnterpriseDirectory enterpriseDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }   

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
}
