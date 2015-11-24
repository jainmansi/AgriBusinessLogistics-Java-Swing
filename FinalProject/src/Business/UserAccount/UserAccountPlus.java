/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Inventory.Inventory;
import Business.Product.ProductCatalog;

/**
 *
 * @author user
 */
public class UserAccountPlus extends UserAccount{
    private ProductCatalog productCatalog;
    private Inventory inventory;
    
    public UserAccountPlus(){
        productCatalog = new ProductCatalog();
        inventory = new Inventory();
    }

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
    
}
