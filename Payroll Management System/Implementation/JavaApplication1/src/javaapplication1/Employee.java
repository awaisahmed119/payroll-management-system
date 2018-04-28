 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import Allowances.AdhocAllowance;
import Allowances.AdhocAllowance;
import Allowances.ConveyanceAllowance;
import Allowances.ConveyanceAllowance;
import Allowances.DeputationAllowance;
import Allowances.DeputationAllowance;
import Allowances.EntertainmentAllowance;
import Allowances.HouseRentAllowance;
import Allowances.IncentiveAllowance;
import Allowances.MedicalAllowance;
import Allowances.OrderlyAllowance;
import Allowances.Others;
import Allowances.QualificationAllowance;
import Allowances.SeniorPostAllowance;
import Allowances.allowance;
import javaapplication1.Employee;
import Allowances.EntertainmentAllowance;
import Allowances.HouseRentAllowance;
import Allowances.IncentiveAllowance;
import Allowances.MedicalAllowance;
import Allowances.OrderlyAllowance;
import Allowances.Others;
import Allowances.QualificationAllowance;
import Allowances.SeniorPostAllowance;
import Allowances.allowance;
import deduction.BF;
import deduction.Driver;
import deduction.GI;
import deduction.GPfund;
import deduction.HBA;
import deduction.HRD;
import deduction.IncomeTax;
import deduction.deduction;
import java.util.ArrayList;

/**
 *
 * @author Awais
 */
public class Employee {
    int id;
    String name;
    int scale;
    int pay;
    String joiningDate;
    String qualification;
    String Designation;
    boolean monetization;
    boolean accomodation;
    int reaminingHBA;  // remaining house building advance;
    int incrementCount;
    int totalincrement;
    ArrayList<allowance> allowanceList;
    ArrayList<deduction> deductionList;

    public Employee() {
        
        
         allowanceList = new ArrayList<>();
          allowanceList.add(new QualificationAllowance(qualification,"Qualification Allowance","A01105"));
          allowanceList.add(new Others("Others","A01150"));
          allowanceList.add(new SeniorPostAllowance("Senior Post Allowance","A01201"));
          allowanceList.add(new HouseRentAllowance("House Rent Allowance","A01202"));
          allowanceList.add(new ConveyanceAllowance("Conveyance Allowance","A01203"));
          allowanceList.add(new MedicalAllowance("Medical Allowance","A01217"));
          allowanceList.add(new EntertainmentAllowance("Entertainment Allowance","A01224"));
          allowanceList.add(new OrderlyAllowance("ordelry Allowance","A01228"));
          allowanceList.add(new DeputationAllowance("Deputation Allowance","A01236"));
          allowanceList.add(new IncentiveAllowance("Incentive Allowance","A01250"));
          allowanceList.add(new AdhocAllowance("Adhoc Allowance 2010","A120X"));
          
          deductionList= new ArrayList<>();
          deductionList.add(new GPfund("GP Fund"));
          deductionList.add(new BF("Bfund"));
          deductionList.add(new GI("Group Insurance"));
          deductionList.add(new HRD("House rent Ded"));
          deductionList.add(new HBA("House Building Advance"));
          deductionList.add(new Driver("Driver"));
          deductionList.add(new IncomeTax("Income Tax"));
    
    }
    
  
    public Employee(int id, String name, int scale, String joiningDate, String qualification, String Designation, boolean monetization, boolean accomodation, int reaminingHBA) {
        this.id = id;
        this.name = name;
        this.scale = scale;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.Designation = Designation;
        this.monetization = monetization;
        this.accomodation = accomodation;
        this.reaminingHBA = reaminingHBA;
        
          allowanceList = new ArrayList<>();
          allowanceList.add(new QualificationAllowance(qualification,"Qualification Allowance","A01105"));
          allowanceList.add(new Others("Others","A01150"));
          allowanceList.add(new SeniorPostAllowance("Senior Post Allowance","A01201"));
          allowanceList.add(new HouseRentAllowance("House Rent Allowance","A01202"));
          allowanceList.add(new ConveyanceAllowance("Conveyance Allowance","A01203"));
          allowanceList.add(new MedicalAllowance("Medical Allowance","A01217"));
          allowanceList.add(new EntertainmentAllowance("Entertainment Allowance","A01224"));
          allowanceList.add(new OrderlyAllowance("ordelry Allowance","A01228"));
          allowanceList.add(new DeputationAllowance("Deputation Allowance","A01236"));
          allowanceList.add(new IncentiveAllowance("Incentive Allowance","A01250"));
          allowanceList.add(new AdhocAllowance("Adhoc Allowance","A120X"));
          
          
          deductionList= new ArrayList<>();
          deductionList.add(new GPfund("GP Fund"));
          deductionList.add(new BF("Bfund"));
          deductionList.add(new GI("Group Insurance"));
          deductionList.add(new HRD("House rent Ded"));
          deductionList.add(new HBA("House Building Advance"));
          deductionList.add(new Driver("Driver"));
          deductionList.add(new IncomeTax("Income Tax"));
          
          
          
    }

    public Employee(int id, String name, int scale, int pay, String joiningDate, String qualification, String Designation, boolean monetization, boolean accomodation, int reaminingHBA, int incrementCount, int totalincrement) {
        this.id = id;
        this.name = name;
        this.scale = scale;
        this.pay = pay;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.Designation = Designation;
        this.monetization = monetization;
        this.accomodation = accomodation;
        this.reaminingHBA = reaminingHBA;
        this.incrementCount = incrementCount;
        this.totalincrement = totalincrement;
        
        allowanceList = new ArrayList<>();
          allowanceList.add(new QualificationAllowance(qualification,"Qualification Allowance","A01105"));
          allowanceList.add(new Others("Others","A01150"));
          allowanceList.add(new SeniorPostAllowance("Senior Post Allowance","A01201"));
          allowanceList.add(new HouseRentAllowance("House Rent Allowance","A01202"));
          allowanceList.add(new ConveyanceAllowance("Conveyance Allowance","A01203"));
          allowanceList.add(new MedicalAllowance("Medical Allowance","A01217"));
          allowanceList.add(new EntertainmentAllowance("Entertainment Allowance","A01224"));
          allowanceList.add(new OrderlyAllowance("ordelry Allowance","A01228"));
          allowanceList.add(new DeputationAllowance("Deputation Allowance","A01236"));
          allowanceList.add(new IncentiveAllowance("Incentive Allowance","A01250"));
          allowanceList.add(new AdhocAllowance("Adhoc Allowance","A120X"));
          
          deductionList= new ArrayList<>();
          deductionList.add(new GPfund("GP Fund"));
          deductionList.add(new BF("Bfund"));
          deductionList.add(new GI("Group Insurance"));
          deductionList.add(new HRD("House rent Ded"));
          deductionList.add(new HBA("House Building Advance"));
          deductionList.add(new Driver("Driver"));
          deductionList.add(new IncomeTax("Income Tax"));
          
    }
    
    public void calculate(String id,int bpay,int scale,String qual){
        
        for(int i=0;i<allowanceList.size();i++){
            
              allowanceList.get(i).calculateAllowance(id,scale,bpay,qual);
        }
          for(int i=0;i<deductionList.size();i++){
        deductionList.get(i).calculateDeduction(scale,bpay,id);
          }
    }
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScale() {
        return scale;
    }

    public int getPay() {
        return pay;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDesignation() {
        return Designation;
    }

    public boolean isMonetization() {
        return monetization;
    }

    public boolean isAccomodation() {
        return accomodation;
    }

    public int getReaminingHBA() {
        return reaminingHBA;
    }

    public int getIncrementCount() {
        return incrementCount;
    }

    public int getTotalincrement() {
        return totalincrement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public void setMonetization(boolean monetization) {
        this.monetization = monetization;
    }

    public void setAccomodation(boolean accomodation) {
        this.accomodation = accomodation;
    }

    public void setReaminingHBA(int reaminingHBA) {
        this.reaminingHBA = reaminingHBA;
    }

    public void setIncrementCount(int incrementCount) {
        this.incrementCount = incrementCount;
    }

    public void setTotalincrement(int totalincrement) {
        this.totalincrement = totalincrement;
    }
    
    
}
