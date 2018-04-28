package Allowances;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author sheikh-hamza
 */
public class QualificationAllowance extends allowance {

    String maxQualification;

    public QualificationAllowance(String maxQualification, String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
        this.maxQualification = maxQualification;
    }
  
    public String getMaxQualification() {
        return maxQualification;
    }

    public void setMaxQualification(String maxQualification) {
        this.maxQualification = maxQualification;
    }
    
    @Override
     public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
          //return corresponding allowance to "maxQualifiaction" from Qualification table
        //need to implement.
       return 0;
    }
    
    
}
