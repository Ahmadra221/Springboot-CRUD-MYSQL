package com.ahmad.spring.springbootcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "cloud_vendor")
public class CloudVendor {

    @Id
    private String venodrId;
    private String venodrName;
    private String venodrAdress;
    private String venodrPhoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String venodrId, String venodrName, String venodrAdress, String venodrPhoneNumber) {
        this.venodrId = venodrId;
        this.venodrName = venodrName;
        this.venodrAdress = venodrAdress;
        this.venodrPhoneNumber = venodrPhoneNumber;
    }

    public String getVenodrId() {
        return venodrId;
    }

    public void setVenodrId(String venodrId) {
        this.venodrId = venodrId;
    }

    public String getVenodrName() {
        return venodrName;
    }

    public void setVenodrName(String venodrName) {
        this.venodrName = venodrName;
    }

    public String getVenodrAdress() {
        return venodrAdress;
    }

    public void setVenodrAdress(String venodrAdress) {
        this.venodrAdress = venodrAdress;
    }

    public String getVenodrPhoneNumber() {
        return venodrPhoneNumber;
    }

    public void setVenodrPhoneNumber(String venodrPhoneNumber) {
        this.venodrPhoneNumber = venodrPhoneNumber;
    }
}
