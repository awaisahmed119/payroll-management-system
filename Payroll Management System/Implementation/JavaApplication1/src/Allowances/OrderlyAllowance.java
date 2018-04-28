package Allowances;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huzaifah
 */
public class OrderlyAllowance extends allowance{

    public OrderlyAllowance(String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
    }

    @Override
      public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
    
        // currently disbaled
        return 0;
    }    
    
    
}
