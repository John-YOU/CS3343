/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import Part2.*;
import Part3.*;
import java.util.*;
/**
 *
 * @author youhan
 */
public class Budget {
    //it refers to different budget types and their respective value
    HashMap budgetTypes = new HashMap();
    
    public Budget(){
        
        budgetTypes.put("Clothing",0);
        budgetTypes.put("Education",0);
        budgetTypes.put("Food and Drink",0);
        budgetTypes.put("Healthcare",0);
        
        budgetTypes.put("Home",0);
        budgetTypes.put("Rent",0);
        budgetTypes.put("Shopping",0);
        budgetTypes.put("Transportation",0);
        
    }    
 
    public void change(String typeName,float amount){
        float newValue = (float)budgetTypes.get(typeName);
        
    }
}
