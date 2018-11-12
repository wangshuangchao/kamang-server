package com.mugua.core.tipOffInfo.pojo;

import java.util.ArrayList;
import java.util.List;

public class TipOffInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TipOffInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlIsNull() {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlIsNotNull() {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL =", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL <>", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL >", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL >=", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL <", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL <=", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlLike(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL like", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL not like", value, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL in", values, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL not in", values, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL between", value1, value2, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoUrlNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_PHOTO_URL not between", value1, value2, "businessLicensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameIsNull() {
            addCriterion("LEGAL_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameIsNotNull() {
            addCriterion("LEGAL_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameEqualTo(String value) {
            addCriterion("LEGAL_PERSON_NAME =", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON_NAME <>", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameGreaterThan(String value) {
            addCriterion("LEGAL_PERSON_NAME >", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_NAME >=", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameLessThan(String value) {
            addCriterion("LEGAL_PERSON_NAME <", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_NAME <=", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameLike(String value) {
            addCriterion("LEGAL_PERSON_NAME like", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotLike(String value) {
            addCriterion("LEGAL_PERSON_NAME not like", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameIn(List<String> values) {
            addCriterion("LEGAL_PERSON_NAME in", values, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON_NAME not in", values, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_NAME between", value1, value2, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_NAME not between", value1, value2, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelIsNull() {
            addCriterion("LEGAL_PERSON_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelIsNotNull() {
            addCriterion("LEGAL_PERSON_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelEqualTo(String value) {
            addCriterion("LEGAL_PERSON_TEL =", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON_TEL <>", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelGreaterThan(String value) {
            addCriterion("LEGAL_PERSON_TEL >", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_TEL >=", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelLessThan(String value) {
            addCriterion("LEGAL_PERSON_TEL <", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_TEL <=", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelLike(String value) {
            addCriterion("LEGAL_PERSON_TEL like", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelNotLike(String value) {
            addCriterion("LEGAL_PERSON_TEL not like", value, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelIn(List<String> values) {
            addCriterion("LEGAL_PERSON_TEL in", values, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON_TEL not in", values, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_TEL between", value1, value2, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonTelNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_TEL not between", value1, value2, "legalPersonTel");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlIsNull() {
            addCriterion("LEGAL_PERSON_PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlIsNotNull() {
            addCriterion("LEGAL_PERSON_PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL =", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL <>", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlGreaterThan(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL >", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL >=", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlLessThan(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL <", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL <=", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlLike(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL like", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlNotLike(String value) {
            addCriterion("LEGAL_PERSON_PHOTO_URL not like", value, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlIn(List<String> values) {
            addCriterion("LEGAL_PERSON_PHOTO_URL in", values, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON_PHOTO_URL not in", values, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_PHOTO_URL between", value1, value2, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_PHOTO_URL not between", value1, value2, "legalPersonPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("ORGANIZATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("ORGANIZATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("ORGANIZATION_CODE >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("ORGANIZATION_CODE <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("ORGANIZATION_CODE like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("ORGANIZATION_CODE not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameIsNull() {
            addCriterion("CHARGE_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameIsNotNull() {
            addCriterion("CHARGE_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameEqualTo(String value) {
            addCriterion("CHARGE_PERSON_NAME =", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameNotEqualTo(String value) {
            addCriterion("CHARGE_PERSON_NAME <>", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameGreaterThan(String value) {
            addCriterion("CHARGE_PERSON_NAME >", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_PERSON_NAME >=", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameLessThan(String value) {
            addCriterion("CHARGE_PERSON_NAME <", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_PERSON_NAME <=", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameLike(String value) {
            addCriterion("CHARGE_PERSON_NAME like", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameNotLike(String value) {
            addCriterion("CHARGE_PERSON_NAME not like", value, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameIn(List<String> values) {
            addCriterion("CHARGE_PERSON_NAME in", values, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameNotIn(List<String> values) {
            addCriterion("CHARGE_PERSON_NAME not in", values, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameBetween(String value1, String value2) {
            addCriterion("CHARGE_PERSON_NAME between", value1, value2, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonNameNotBetween(String value1, String value2) {
            addCriterion("CHARGE_PERSON_NAME not between", value1, value2, "chargePersonName");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelIsNull() {
            addCriterion("CHARGE_PERSON_TEL is null");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelIsNotNull() {
            addCriterion("CHARGE_PERSON_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelEqualTo(String value) {
            addCriterion("CHARGE_PERSON_TEL =", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelNotEqualTo(String value) {
            addCriterion("CHARGE_PERSON_TEL <>", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelGreaterThan(String value) {
            addCriterion("CHARGE_PERSON_TEL >", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_PERSON_TEL >=", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelLessThan(String value) {
            addCriterion("CHARGE_PERSON_TEL <", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_PERSON_TEL <=", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelLike(String value) {
            addCriterion("CHARGE_PERSON_TEL like", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelNotLike(String value) {
            addCriterion("CHARGE_PERSON_TEL not like", value, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelIn(List<String> values) {
            addCriterion("CHARGE_PERSON_TEL in", values, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelNotIn(List<String> values) {
            addCriterion("CHARGE_PERSON_TEL not in", values, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelBetween(String value1, String value2) {
            addCriterion("CHARGE_PERSON_TEL between", value1, value2, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andChargePersonTelNotBetween(String value1, String value2) {
            addCriterion("CHARGE_PERSON_TEL not between", value1, value2, "chargePersonTel");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneIsNull() {
            addCriterion("REMARKS_COLUMN_ONE is null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneIsNotNull() {
            addCriterion("REMARKS_COLUMN_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_ONE =", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneNotEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_ONE <>", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneGreaterThan(String value) {
            addCriterion("REMARKS_COLUMN_ONE >", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_ONE >=", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneLessThan(String value) {
            addCriterion("REMARKS_COLUMN_ONE <", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneLessThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_ONE <=", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneLike(String value) {
            addCriterion("REMARKS_COLUMN_ONE like", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneNotLike(String value) {
            addCriterion("REMARKS_COLUMN_ONE not like", value, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_ONE in", values, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneNotIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_ONE not in", values, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_ONE between", value1, value2, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnOneNotBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_ONE not between", value1, value2, "remarksColumnOne");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoIsNull() {
            addCriterion("REMARKS_COLUMN_TWO is null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoIsNotNull() {
            addCriterion("REMARKS_COLUMN_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_TWO =", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoNotEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_TWO <>", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoGreaterThan(String value) {
            addCriterion("REMARKS_COLUMN_TWO >", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_TWO >=", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoLessThan(String value) {
            addCriterion("REMARKS_COLUMN_TWO <", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoLessThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_TWO <=", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoLike(String value) {
            addCriterion("REMARKS_COLUMN_TWO like", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoNotLike(String value) {
            addCriterion("REMARKS_COLUMN_TWO not like", value, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_TWO in", values, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoNotIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_TWO not in", values, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_TWO between", value1, value2, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnTwoNotBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_TWO not between", value1, value2, "remarksColumnTwo");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeIsNull() {
            addCriterion("REMARKS_COLUMN_THREE is null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeIsNotNull() {
            addCriterion("REMARKS_COLUMN_THREE is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_THREE =", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeNotEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_THREE <>", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeGreaterThan(String value) {
            addCriterion("REMARKS_COLUMN_THREE >", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_THREE >=", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeLessThan(String value) {
            addCriterion("REMARKS_COLUMN_THREE <", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeLessThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_THREE <=", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeLike(String value) {
            addCriterion("REMARKS_COLUMN_THREE like", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeNotLike(String value) {
            addCriterion("REMARKS_COLUMN_THREE not like", value, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_THREE in", values, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeNotIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_THREE not in", values, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_THREE between", value1, value2, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnThreeNotBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_THREE not between", value1, value2, "remarksColumnThree");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourIsNull() {
            addCriterion("REMARKS_COLUMN_FOUR is null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourIsNotNull() {
            addCriterion("REMARKS_COLUMN_FOUR is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_FOUR =", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourNotEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_FOUR <>", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourGreaterThan(String value) {
            addCriterion("REMARKS_COLUMN_FOUR >", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_FOUR >=", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourLessThan(String value) {
            addCriterion("REMARKS_COLUMN_FOUR <", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourLessThanOrEqualTo(String value) {
            addCriterion("REMARKS_COLUMN_FOUR <=", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourLike(String value) {
            addCriterion("REMARKS_COLUMN_FOUR like", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourNotLike(String value) {
            addCriterion("REMARKS_COLUMN_FOUR not like", value, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_FOUR in", values, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourNotIn(List<String> values) {
            addCriterion("REMARKS_COLUMN_FOUR not in", values, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_FOUR between", value1, value2, "remarksColumnFour");
            return (Criteria) this;
        }

        public Criteria andRemarksColumnFourNotBetween(String value1, String value2) {
            addCriterion("REMARKS_COLUMN_FOUR not between", value1, value2, "remarksColumnFour");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}