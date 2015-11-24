/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Inventory.Inventory;
import Business.Person.Person;
import Business.Product.ProductCatalog;
import Business.Role.CustomerRole;
import Business.Role.DriverRole;
import Business.Role.FDARole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author user
 */
public class UserAccount {
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private ProductCatalog productCatalog;
    private Inventory inventory;

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
    }
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person Perosn) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }    
    
    @Override
    public String toString() {
        return username;
    }
    
    public void checkType(UserAccount userAccount){
        if(!(userAccount.getRole() instanceof CustomerRole) || 
            !(userAccount.getRole() instanceof FDARole) ||
            !(userAccount.getRole() instanceof DriverRole)){
            
            productCatalog = new ProductCatalog();
            inventory = new Inventory();
        }
        else{}
    }
}