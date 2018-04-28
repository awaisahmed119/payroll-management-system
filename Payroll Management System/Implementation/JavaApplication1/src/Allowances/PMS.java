/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Allowances;

import java.util.ArrayList;

/**
 * 
 * @author sheikh-hamza
 */
public class PMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<allowance> a = new ArrayList<>();
     
        a.add(new QualificationAllowance("a","aa","aa"));
        a.add(new SeniorPostAllowance("aa","aa"));
        
        for( allowance x: a )
        {
            System.out.println(x.calculateAllowance("",0, 0,""));
        }
        
        
        
    }
    
}
