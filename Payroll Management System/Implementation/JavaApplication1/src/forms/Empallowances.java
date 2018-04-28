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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "empallowances", catalog = "payroll", schema = "")
@NamedQueries({
    @NamedQuery(name = "Empallowances.findAll", query = "SELECT e FROM Empallowances e"),
    @NamedQuery(name = "Empallowances.findBySrNo", query = "SELECT e FROM Empallowances e WHERE e.srNo = :srNo"),
    @NamedQuery(name = "Empallowances.findByEmpid", query = "SELECT e FROM Empallowances e WHERE e.empid = :empid"),
    @NamedQuery(name = "Empallowances.findByDate", query = "SELECT e FROM Empallowances e WHERE e.date = :date"),
    @NamedQuery(name = "Empallowances.findByA01105Qaul", query = "SELECT e FROM Empallowances e WHERE e.a01105Qaul = :a01105Qaul"),
    @NamedQuery(name = "Empallowances.findByA01150Others", query = "SELECT e FROM Empallowances e WHERE e.a01150Others = :a01150Others"),
    @NamedQuery(name = "Empallowances.findByA01201SPost", query = "SELECT e FROM Empallowances e WHERE e.a01201SPost = :a01201SPost"),
    @NamedQuery(name = "Empallowances.findByA01202HouseRent", query = "SELECT e FROM Empallowances e WHERE e.a01202HouseRent = :a01202HouseRent"),
    @NamedQuery(name = "Empallowances.findByA01203Conv", query = "SELECT e FROM Empallowances e WHERE e.a01203Conv = :a01203Conv"),
    @NamedQuery(name = "Empallowances.findByA01217Med", query = "SELECT e FROM Empallowances e WHERE e.a01217Med = :a01217Med"),
    @NamedQuery(name = "Empallowances.findByA01224Ent", query = "SELECT e FROM Empallowances e WHERE e.a01224Ent = :a01224Ent"),
    @NamedQuery(name = "Empallowances.findByA01228Orderly", query = "SELECT e FROM Empallowances e WHERE e.a01228Orderly = :a01228Orderly"),
    @NamedQuery(name = "Empallowances.findByA01236Dep", query = "SELECT e FROM Empallowances e WHERE e.a01236Dep = :a01236Dep"),
    @NamedQuery(name = "Empallowances.findByA01250Incentive", query = "SELECT e FROM Empallowances e WHERE e.a01250Incentive = :a01250Incentive"),
    @NamedQuery(name = "Empallowances.findByA01270others", query = "SELECT e FROM Empallowances e WHERE e.a01270others = :a01270others"),
    @NamedQuery(name = "Empallowances.findByA120XAdhoc2010", query = "SELECT e FROM Empallowances e WHERE e.a120XAdhoc2010 = :a120XAdhoc2010"),
    @NamedQuery(name = "Empallowances.findByTotal", query = "SELECT e FROM Empallowances e WHERE e.total = :total")})
public class Empallowances implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SrNo")
    private Integer srNo;
    @Column(name = "empid")
    private String empid;
    @Column(name = "Date")
    private String date;
    @Column(name = "A01105_Qaul")
    private Integer a01105Qaul;
    @Column(name = "A01150_Others")
    private Integer a01150Others;
    @Column(name = "A01201_SPost")
    private Integer a01201SPost;
    @Column(name = "A01202_HouseRent")
    private Integer a01202HouseRent;
    @Column(name = "A01203_Conv")
    private Integer a01203Conv;
    @Column(name = "A01217_Med")
    private Integer a01217Med;
    @Column(name = "A01224_Ent")
    private Integer a01224Ent;
    @Column(name = "A01228_Orderly")
    private Integer a01228Orderly;
    @Column(name = "A01236_Dep")
    private Integer a01236Dep;
    @Column(name = "A01250_Incentive")
    private Integer a01250Incentive;
    @Column(name = "A01270_others")
    private Integer a01270others;
    @Column(name = "A120X_Adhoc2010")
    private Integer a120XAdhoc2010;
    @Column(name = "total")
    private Integer total;

    public Empallowances() {
    }

    public Empallowances(Integer srNo) {
        this.srNo = srNo;
    }

    public Integer getSrNo() {
        return srNo;
    }

    public void setSrNo(Integer srNo) {
        Integer oldSrNo = this.srNo;
        this.srNo = srNo;
        changeSupport.firePropertyChange("srNo", oldSrNo, srNo);
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        String oldEmpid = this.empid;
        this.empid = empid;
        changeSupport.firePropertyChange("empid", oldEmpid, empid);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Integer getA01105Qaul() {
        return a01105Qaul;
    }

    public void setA01105Qaul(Integer a01105Qaul) {
        Integer oldA01105Qaul = this.a01105Qaul;
        this.a01105Qaul = a01105Qaul;
        changeSupport.firePropertyChange("A01105Qaul", oldA01105Qaul, a01105Qaul);
    }

    public Integer getA01150Others() {
        return a01150Others;
    }

    public void setA01150Others(Integer a01150Others) {
        Integer oldA01150Others = this.a01150Others;
        this.a01150Others = a01150Others;
        changeSupport.firePropertyChange("A01150Others", oldA01150Others, a01150Others);
    }

    public Integer getA01201SPost() {
        return a01201SPost;
    }

    public void setA01201SPost(Integer a01201SPost) {
        Integer oldA01201SPost = this.a01201SPost;
        this.a01201SPost = a01201SPost;
        changeSupport.firePropertyChange("A01201SPost", oldA01201SPost, a01201SPost);
    }

    public Integer getA01202HouseRent() {
        return a01202HouseRent;
    }

    public void setA01202HouseRent(Integer a01202HouseRent) {
        Integer oldA01202HouseRent = this.a01202HouseRent;
        this.a01202HouseRent = a01202HouseRent;
        changeSupport.firePropertyChange("A01202HouseRent", oldA01202HouseRent, a01202HouseRent);
    }

    public Integer getA01203Conv() {
        return a01203Conv;
    }

    public void setA01203Conv(Integer a01203Conv) {
        Integer oldA01203Conv = this.a01203Conv;
        this.a01203Conv = a01203Conv;
        changeSupport.firePropertyChange("A01203Conv", oldA01203Conv, a01203Conv);
    }

    public Integer getA01217Med() {
        return a01217Med;
    }

    public void setA01217Med(Integer a01217Med) {
        Integer oldA01217Med = this.a01217Med;
        this.a01217Med = a01217Med;
        changeSupport.firePropertyChange("A01217Med", oldA01217Med, a01217Med);
    }

    public Integer getA01224Ent() {
        return a01224Ent;
    }

    public void setA01224Ent(Integer a01224Ent) {
        Integer oldA01224Ent = this.a01224Ent;
        this.a01224Ent = a01224Ent;
        changeSupport.firePropertyChange("A01224Ent", oldA01224Ent, a01224Ent);
    }

    public Integer getA01228Orderly() {
        return a01228Orderly;
    }

    public void setA01228Orderly(Integer a01228Orderly) {
        Integer oldA01228Orderly = this.a01228Orderly;
        this.a01228Orderly = a01228Orderly;
        changeSupport.firePropertyChange("A01228Orderly", oldA01228Orderly, a01228Orderly);
    }

    public Integer getA01236Dep() {
        return a01236Dep;
    }

    public void setA01236Dep(Integer a01236Dep) {
        Integer oldA01236Dep = this.a01236Dep;
        this.a01236Dep = a01236Dep;
        changeSupport.firePropertyChange("A01236Dep", oldA01236Dep, a01236Dep);
    }

    public Integer getA01250Incentive() {
        return a01250Incentive;
    }

    public void setA01250Incentive(Integer a01250Incentive) {
        Integer oldA01250Incentive = this.a01250Incentive;
        this.a01250Incentive = a01250Incentive;
        changeSupport.firePropertyChange("A01250Incentive", oldA01250Incentive, a01250Incentive);
    }

    public Integer getA01270others() {
        return a01270others;
    }

    public void setA01270others(Integer a01270others) {
        Integer oldA01270others = this.a01270others;
        this.a01270others = a01270others;
        changeSupport.firePropertyChange("A01270others", oldA01270others, a01270others);
    }

    public Integer getA120XAdhoc2010() {
        return a120XAdhoc2010;
    }

    public void setA120XAdhoc2010(Integer a120XAdhoc2010) {
        Integer oldA120XAdhoc2010 = this.a120XAdhoc2010;
        this.a120XAdhoc2010 = a120XAdhoc2010;
        changeSupport.firePropertyChange("A120XAdhoc2010", oldA120XAdhoc2010, a120XAdhoc2010);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        Integer oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srNo != null ? srNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empallowances)) {
            return false;
        }
        Empallowances other = (Empallowances) object;
        if ((this.srNo == null && other.srNo != null) || (this.srNo != null && !this.srNo.equals(other.srNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forms.Empallowances[ srNo=" + srNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
