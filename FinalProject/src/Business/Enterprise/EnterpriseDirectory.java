/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.FDA){
            enterprise = new FDAEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.SupplyChain){
            enterprise = new SupplyChainEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
