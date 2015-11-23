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
    private ProductCatalog productList;
    private Inventory inventory;
    
    public UserAccountPlus(){
        productList = new ProductCatalog();
        inventory = new Inventory();
    }

    public ProductCatalog getProductList() {
        return productList;
    }

    public void setProductList(ProductCatalog productList) {
        this.productList = productList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
}
