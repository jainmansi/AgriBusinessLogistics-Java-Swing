/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ProductCatalog {
    private ArrayList<Product> productList;
    
    public ProductCatalog(){
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }     
    
    public Product addProduct(){
        Product p = new Product();
        productList.add(p);
        return p;        
    }
    
    public void removeProduct(Product product){
        productList.remove(product);
    }
}
