package com.prueba2.prueba2.dto;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "supplier", schema = "public", catalog = "spring")
public class Supplier implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "supplier_id")
    private int supplierId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "insurance")
    private String insurance;
    @Basic
    @Column(name = "ein")
    private String ein;
    @Basic
    @Column(name = "w9")
    private byte[] w9;
    @Basic
    @Column(name = "profession")
    private String profession;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "audit_user_update")
    private String auditUserUpdate;
    @Basic
    @Column(name = "audit_date_update")
    private Date auditDateUpdate;
    @Basic
    @Column(name = "audit_user_create")
    private String auditUserCreate;
    @Basic
    @Column(name = "audit_date_create")
    private Date auditDateCreate;
    @Basic
    @Column(name = "routing_number")
    private String routingNumber;
    @Basic
    @Column(name = "account_number")
    private String accountNumber;
    @Basic
    @Column(name = "bank")
    private String bank;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "mobile_phone")
    private String mobilePhone;

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public byte[] getW9() {
        return w9;
    }

    public void setW9(byte[] w9) {
        this.w9 = w9;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAuditUserUpdate() {
        return auditUserUpdate;
    }

    public void setAuditUserUpdate(String auditUserUpdate) {
        this.auditUserUpdate = auditUserUpdate;
    }

    public Date getAuditDateUpdate() {
        return auditDateUpdate;
    }

    public void setAuditDateUpdate(Date auditDateUpdate) {
        this.auditDateUpdate = auditDateUpdate;
    }

    public String getAuditUserCreate() {
        return auditUserCreate;
    }

    public void setAuditUserCreate(String auditUserCreate) {
        this.auditUserCreate = auditUserCreate;
    }

    public Date getAuditDateCreate() {
        return auditDateCreate;
    }

    public void setAuditDateCreate(Date auditDateCreate) {
        this.auditDateCreate = auditDateCreate;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier that = (Supplier) o;

        if (supplierId != that.supplierId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (insurance != null ? !insurance.equals(that.insurance) : that.insurance != null) return false;
        if (ein != null ? !ein.equals(that.ein) : that.ein != null) return false;
        if (!Arrays.equals(w9, that.w9)) return false;
        if (profession != null ? !profession.equals(that.profession) : that.profession != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (auditUserUpdate != null ? !auditUserUpdate.equals(that.auditUserUpdate) : that.auditUserUpdate != null)
            return false;
        if (auditDateUpdate != null ? !auditDateUpdate.equals(that.auditDateUpdate) : that.auditDateUpdate != null)
            return false;
        if (auditUserCreate != null ? !auditUserCreate.equals(that.auditUserCreate) : that.auditUserCreate != null)
            return false;
        if (auditDateCreate != null ? !auditDateCreate.equals(that.auditDateCreate) : that.auditDateCreate != null)
            return false;
        if (routingNumber != null ? !routingNumber.equals(that.routingNumber) : that.routingNumber != null)
            return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;
        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(that.mobilePhone) : that.mobilePhone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplierId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (insurance != null ? insurance.hashCode() : 0);
        result = 31 * result + (ein != null ? ein.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(w9);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (auditUserUpdate != null ? auditUserUpdate.hashCode() : 0);
        result = 31 * result + (auditDateUpdate != null ? auditDateUpdate.hashCode() : 0);
        result = 31 * result + (auditUserCreate != null ? auditUserCreate.hashCode() : 0);
        result = 31 * result + (auditDateCreate != null ? auditDateCreate.hashCode() : 0);
        result = 31 * result + (routingNumber != null ? routingNumber.hashCode() : 0);
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        return result;
    }
}
