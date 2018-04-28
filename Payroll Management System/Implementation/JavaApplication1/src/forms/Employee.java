 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Awais
 */
@Entity
@Table(name = "employee", catalog = "payroll", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id"),
    @NamedQuery(name = "Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name"),
    @NamedQuery(name = "Employee.findByScale", query = "SELECT e FROM Employee e WHERE e.scale = :scale"),
    @NamedQuery(name = "Employee.findByPay", query = "SELECT e FROM Employee e WHERE e.pay = :pay"),
    @NamedQuery(name = "Employee.findByJdate", query = "SELECT e FROM Employee e WHERE e.jdate = :jdate"),
    @NamedQuery(name = "Employee.findByQualification", query = "SELECT e FROM Employee e WHERE e.qualification = :qualification"),
    @NamedQuery(name = "Employee.findByDesignation", query = "SELECT e FROM Employee e WHERE e.designation = :designation"),
    @NamedQuery(name = "Employee.findByMonetization", query = "SELECT e FROM Employee e WHERE e.monetization = :monetization"),
    @NamedQuery(name = "Employee.findByAccomodation", query = "SELECT e FROM Employee e WHERE e.accomodation = :accomodation"),
    @NamedQuery(name = "Employee.findByRemaininghba", query = "SELECT e FROM Employee e WHERE e.remaininghba = :remaininghba"),
    @NamedQuery(name = "Employee.findByIncrementcount", query = "SELECT e FROM Employee e WHERE e.incrementcount = :incrementcount"),
    @NamedQuery(name = "Employee.findByTotalincrement", query = "SELECT e FROM Employee e WHERE e.totalincrement = :totalincrement")})
public class Employee implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "scale")
    private Integer scale;
    @Column(name = "pay")
    private Integer pay;
    @Column(name = "jdate")
    private String jdate;
    @Column(name = "qualification")
    private String qualification;
    @Column(name = "designation")
    private String designation;
    @Column(name = "monetization")
    private Boolean monetization;
    @Column(name = "accomodation")
    private Boolean accomodation;
    @Column(name = "remaininghba")
    private Integer remaininghba;
    @Column(name = "incrementcount")
    private Integer incrementcount;
    @Column(name = "totalincrement")
    private Integer totalincrement;

    public Employee() {
    }

    public Employee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        Integer oldScale = this.scale;
        this.scale = scale;
        changeSupport.firePropertyChange("scale", oldScale, scale);
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        Integer oldPay = this.pay;
        this.pay = pay;
        changeSupport.firePropertyChange("pay", oldPay, pay);
    }

    public String getJdate() {
        return jdate;
    }

    public void setJdate(String jdate) {
        String oldJdate = this.jdate;
        this.jdate = jdate;
        changeSupport.firePropertyChange("jdate", oldJdate, jdate);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        String oldQualification = this.qualification;
        this.qualification = qualification;
        changeSupport.firePropertyChange("qualification", oldQualification, qualification);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        String oldDesignation = this.designation;
        this.designation = designation;
        changeSupport.firePropertyChange("designation", oldDesignation, designation);
    }

    public Boolean getMonetization() {
        return monetization;
    }

    public void setMonetization(Boolean monetization) {
        Boolean oldMonetization = this.monetization;
        this.monetization = monetization;
        changeSupport.firePropertyChange("monetization", oldMonetization, monetization);
    }

    public Boolean getAccomodation() {
        return accomodation;
    }

    public void setAccomodation(Boolean accomodation) {
        Boolean oldAccomodation = this.accomodation;
        this.accomodation = accomodation;
        changeSupport.firePropertyChange("accomodation", oldAccomodation, accomodation);
    }

    public Integer getRemaininghba() {
        return remaininghba;
    }

    public void setRemaininghba(Integer remaininghba) {
        Integer oldRemaininghba = this.remaininghba;
        this.remaininghba = remaininghba;
        changeSupport.firePropertyChange("remaininghba", oldRemaininghba, remaininghba);
    }

    public Integer getIncrementcount() {
        return incrementcount;
    }

    public void setIncrementcount(Integer incrementcount) {
        Integer oldIncrementcount = this.incrementcount;
        this.incrementcount = incrementcount;
        changeSupport.firePropertyChange("incrementcount", oldIncrementcount, incrementcount);
    }

    public Integer getTotalincrement() {
        return totalincrement;
    }

    public void setTotalincrement(Integer totalincrement) {
        Integer oldTotalincrement = this.totalincrement;
        this.totalincrement = totalincrement;
        changeSupport.firePropertyChange("totalincrement", oldTotalincrement, totalincrement);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forms.Employee[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
