package com.mugua.core.tipOffInfo.pojo;

public class TipOffInfo {
    private String id;

    private String businessLicensePhotoUrl;

    private String legalPersonName;

    private String legalPersonTel;

    private String legalPersonPhotoUrl;

    private String organizationCode;

    private String chargePersonName;

    private String chargePersonTel;

    private String remarksColumnOne;

    private String remarksColumnTwo;

    private String remarksColumnThree;

    private String remarksColumnFour;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessLicensePhotoUrl() {
        return businessLicensePhotoUrl;
    }

    public void setBusinessLicensePhotoUrl(String businessLicensePhotoUrl) {
        this.businessLicensePhotoUrl = businessLicensePhotoUrl == null ? null : businessLicensePhotoUrl.trim();
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    public String getLegalPersonTel() {
        return legalPersonTel;
    }

    public void setLegalPersonTel(String legalPersonTel) {
        this.legalPersonTel = legalPersonTel == null ? null : legalPersonTel.trim();
    }

    public String getLegalPersonPhotoUrl() {
        return legalPersonPhotoUrl;
    }

    public void setLegalPersonPhotoUrl(String legalPersonPhotoUrl) {
        this.legalPersonPhotoUrl = legalPersonPhotoUrl == null ? null : legalPersonPhotoUrl.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getChargePersonName() {
        return chargePersonName;
    }

    public void setChargePersonName(String chargePersonName) {
        this.chargePersonName = chargePersonName == null ? null : chargePersonName.trim();
    }

    public String getChargePersonTel() {
        return chargePersonTel;
    }

    public void setChargePersonTel(String chargePersonTel) {
        this.chargePersonTel = chargePersonTel == null ? null : chargePersonTel.trim();
    }

    public String getRemarksColumnOne() {
        return remarksColumnOne;
    }

    public void setRemarksColumnOne(String remarksColumnOne) {
        this.remarksColumnOne = remarksColumnOne == null ? null : remarksColumnOne.trim();
    }

    public String getRemarksColumnTwo() {
        return remarksColumnTwo;
    }

    public void setRemarksColumnTwo(String remarksColumnTwo) {
        this.remarksColumnTwo = remarksColumnTwo == null ? null : remarksColumnTwo.trim();
    }

    public String getRemarksColumnThree() {
        return remarksColumnThree;
    }

    public void setRemarksColumnThree(String remarksColumnThree) {
        this.remarksColumnThree = remarksColumnThree == null ? null : remarksColumnThree.trim();
    }

    public String getRemarksColumnFour() {
        return remarksColumnFour;
    }

    public void setRemarksColumnFour(String remarksColumnFour) {
        this.remarksColumnFour = remarksColumnFour == null ? null : remarksColumnFour.trim();
    }
}