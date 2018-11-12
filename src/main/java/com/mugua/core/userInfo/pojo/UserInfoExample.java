package com.mugua.core.userInfo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("USER_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("USER_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Byte value) {
            addCriterion("USER_GENDER =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Byte value) {
            addCriterion("USER_GENDER <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Byte value) {
            addCriterion("USER_GENDER >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("USER_GENDER >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Byte value) {
            addCriterion("USER_GENDER <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Byte value) {
            addCriterion("USER_GENDER <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Byte> values) {
            addCriterion("USER_GENDER in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Byte> values) {
            addCriterion("USER_GENDER not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Byte value1, Byte value2) {
            addCriterion("USER_GENDER between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("USER_GENDER not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("USER_AGE is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("USER_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("USER_AGE =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("USER_AGE <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("USER_AGE >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_AGE >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("USER_AGE <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_AGE <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("USER_AGE in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("USER_AGE not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("USER_AGE between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_AGE not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("USER_PHONE =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("USER_PHONE <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("USER_PHONE >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHONE >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("USER_PHONE <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("USER_PHONE <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("USER_PHONE like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("USER_PHONE not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("USER_PHONE in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("USER_PHONE not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("USER_PHONE between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("USER_PHONE not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("PHOTO_URL =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("PHOTO_URL <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("PHOTO_URL >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO_URL >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("PHOTO_URL <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("PHOTO_URL <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("PHOTO_URL like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("PHOTO_URL not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("PHOTO_URL in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("PHOTO_URL not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("PHOTO_URL between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("PHOTO_URL not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andIsCentificationIsNull() {
            addCriterion("IS_CENTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andIsCentificationIsNotNull() {
            addCriterion("IS_CENTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsCentificationEqualTo(Byte value) {
            addCriterion("IS_CENTIFICATION =", value, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationNotEqualTo(Byte value) {
            addCriterion("IS_CENTIFICATION <>", value, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationGreaterThan(Byte value) {
            addCriterion("IS_CENTIFICATION >", value, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_CENTIFICATION >=", value, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationLessThan(Byte value) {
            addCriterion("IS_CENTIFICATION <", value, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationLessThanOrEqualTo(Byte value) {
            addCriterion("IS_CENTIFICATION <=", value, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationIn(List<Byte> values) {
            addCriterion("IS_CENTIFICATION in", values, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationNotIn(List<Byte> values) {
            addCriterion("IS_CENTIFICATION not in", values, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationBetween(Byte value1, Byte value2) {
            addCriterion("IS_CENTIFICATION between", value1, value2, "isCentification");
            return (Criteria) this;
        }

        public Criteria andIsCentificationNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_CENTIFICATION not between", value1, value2, "isCentification");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WECHAT =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WECHAT <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WECHAT >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WECHAT <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WECHAT <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WECHAT like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WECHAT not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WECHAT in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WECHAT not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WECHAT between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WECHAT not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneIsNull() {
            addCriterion("PRODUCT_URL_ONE is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneIsNotNull() {
            addCriterion("PRODUCT_URL_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneEqualTo(String value) {
            addCriterion("PRODUCT_URL_ONE =", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneNotEqualTo(String value) {
            addCriterion("PRODUCT_URL_ONE <>", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneGreaterThan(String value) {
            addCriterion("PRODUCT_URL_ONE >", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_URL_ONE >=", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneLessThan(String value) {
            addCriterion("PRODUCT_URL_ONE <", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_URL_ONE <=", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneLike(String value) {
            addCriterion("PRODUCT_URL_ONE like", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneNotLike(String value) {
            addCriterion("PRODUCT_URL_ONE not like", value, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneIn(List<String> values) {
            addCriterion("PRODUCT_URL_ONE in", values, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneNotIn(List<String> values) {
            addCriterion("PRODUCT_URL_ONE not in", values, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneBetween(String value1, String value2) {
            addCriterion("PRODUCT_URL_ONE between", value1, value2, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andProductUrlOneNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_URL_ONE not between", value1, value2, "productUrlOne");
            return (Criteria) this;
        }

        public Criteria andMicroblogIsNull() {
            addCriterion("MICROBLOG is null");
            return (Criteria) this;
        }

        public Criteria andMicroblogIsNotNull() {
            addCriterion("MICROBLOG is not null");
            return (Criteria) this;
        }

        public Criteria andMicroblogEqualTo(String value) {
            addCriterion("MICROBLOG =", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogNotEqualTo(String value) {
            addCriterion("MICROBLOG <>", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogGreaterThan(String value) {
            addCriterion("MICROBLOG >", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogGreaterThanOrEqualTo(String value) {
            addCriterion("MICROBLOG >=", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogLessThan(String value) {
            addCriterion("MICROBLOG <", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogLessThanOrEqualTo(String value) {
            addCriterion("MICROBLOG <=", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogLike(String value) {
            addCriterion("MICROBLOG like", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogNotLike(String value) {
            addCriterion("MICROBLOG not like", value, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogIn(List<String> values) {
            addCriterion("MICROBLOG in", values, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogNotIn(List<String> values) {
            addCriterion("MICROBLOG not in", values, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogBetween(String value1, String value2) {
            addCriterion("MICROBLOG between", value1, value2, "microblog");
            return (Criteria) this;
        }

        public Criteria andMicroblogNotBetween(String value1, String value2) {
            addCriterion("MICROBLOG not between", value1, value2, "microblog");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoIsNull() {
            addCriterion("PRODUCT_URL_TWO is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoIsNotNull() {
            addCriterion("PRODUCT_URL_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoEqualTo(String value) {
            addCriterion("PRODUCT_URL_TWO =", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoNotEqualTo(String value) {
            addCriterion("PRODUCT_URL_TWO <>", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoGreaterThan(String value) {
            addCriterion("PRODUCT_URL_TWO >", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_URL_TWO >=", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoLessThan(String value) {
            addCriterion("PRODUCT_URL_TWO <", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_URL_TWO <=", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoLike(String value) {
            addCriterion("PRODUCT_URL_TWO like", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoNotLike(String value) {
            addCriterion("PRODUCT_URL_TWO not like", value, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoIn(List<String> values) {
            addCriterion("PRODUCT_URL_TWO in", values, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoNotIn(List<String> values) {
            addCriterion("PRODUCT_URL_TWO not in", values, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoBetween(String value1, String value2) {
            addCriterion("PRODUCT_URL_TWO between", value1, value2, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andProductUrlTwoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_URL_TWO not between", value1, value2, "productUrlTwo");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioIsNull() {
            addCriterion("COMPANY_VIDIO is null");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioIsNotNull() {
            addCriterion("COMPANY_VIDIO is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioEqualTo(String value) {
            addCriterion("COMPANY_VIDIO =", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioNotEqualTo(String value) {
            addCriterion("COMPANY_VIDIO <>", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioGreaterThan(String value) {
            addCriterion("COMPANY_VIDIO >", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_VIDIO >=", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioLessThan(String value) {
            addCriterion("COMPANY_VIDIO <", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_VIDIO <=", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioLike(String value) {
            addCriterion("COMPANY_VIDIO like", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioNotLike(String value) {
            addCriterion("COMPANY_VIDIO not like", value, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioIn(List<String> values) {
            addCriterion("COMPANY_VIDIO in", values, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioNotIn(List<String> values) {
            addCriterion("COMPANY_VIDIO not in", values, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioBetween(String value1, String value2) {
            addCriterion("COMPANY_VIDIO between", value1, value2, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andCompanyVidioNotBetween(String value1, String value2) {
            addCriterion("COMPANY_VIDIO not between", value1, value2, "companyVidio");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("EXT is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("EXT is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("EXT =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("EXT <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("EXT >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("EXT >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("EXT <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("EXT <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("EXT like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("EXT not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("EXT in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("EXT not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("EXT between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("EXT not between", value1, value2, "ext");
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

        public Criteria andRegisteredAssetsIsNull() {
            addCriterion("REGISTERED_ASSETS is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsIsNotNull() {
            addCriterion("REGISTERED_ASSETS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsEqualTo(String value) {
            addCriterion("REGISTERED_ASSETS =", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsNotEqualTo(String value) {
            addCriterion("REGISTERED_ASSETS <>", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsGreaterThan(String value) {
            addCriterion("REGISTERED_ASSETS >", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_ASSETS >=", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsLessThan(String value) {
            addCriterion("REGISTERED_ASSETS <", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_ASSETS <=", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsLike(String value) {
            addCriterion("REGISTERED_ASSETS like", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsNotLike(String value) {
            addCriterion("REGISTERED_ASSETS not like", value, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsIn(List<String> values) {
            addCriterion("REGISTERED_ASSETS in", values, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsNotIn(List<String> values) {
            addCriterion("REGISTERED_ASSETS not in", values, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsBetween(String value1, String value2) {
            addCriterion("REGISTERED_ASSETS between", value1, value2, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andRegisteredAssetsNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_ASSETS not between", value1, value2, "registeredAssets");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeIsNull() {
            addCriterion("CREATE_USER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeIsNotNull() {
            addCriterion("CREATE_USER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeEqualTo(Date value) {
            addCriterion("CREATE_USER_TIME =", value, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeNotEqualTo(Date value) {
            addCriterion("CREATE_USER_TIME <>", value, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeGreaterThan(Date value) {
            addCriterion("CREATE_USER_TIME >", value, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_USER_TIME >=", value, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeLessThan(Date value) {
            addCriterion("CREATE_USER_TIME <", value, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_USER_TIME <=", value, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeIn(List<Date> values) {
            addCriterion("CREATE_USER_TIME in", values, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeNotIn(List<Date> values) {
            addCriterion("CREATE_USER_TIME not in", values, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_USER_TIME between", value1, value2, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_USER_TIME not between", value1, value2, "createUserTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("COMPANY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("COMPANY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("COMPANY_TYPE =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("COMPANY_TYPE <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("COMPANY_TYPE >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("COMPANY_TYPE <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("COMPANY_TYPE like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("COMPANY_TYPE not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("COMPANY_TYPE in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("COMPANY_TYPE not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNull() {
            addCriterion("COMPANY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNotNull() {
            addCriterion("COMPANY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrEqualTo(String value) {
            addCriterion("COMPANY_ADDR =", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotEqualTo(String value) {
            addCriterion("COMPANY_ADDR <>", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThan(String value) {
            addCriterion("COMPANY_ADDR >", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDR >=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThan(String value) {
            addCriterion("COMPANY_ADDR <", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDR <=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLike(String value) {
            addCriterion("COMPANY_ADDR like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotLike(String value) {
            addCriterion("COMPANY_ADDR not like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIn(List<String> values) {
            addCriterion("COMPANY_ADDR in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotIn(List<String> values) {
            addCriterion("COMPANY_ADDR not in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDR between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDR not between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("TIME_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("TIME_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Date value) {
            addCriterion("TIME_LIMIT =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Date value) {
            addCriterion("TIME_LIMIT <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Date value) {
            addCriterion("TIME_LIMIT >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_LIMIT >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Date value) {
            addCriterion("TIME_LIMIT <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Date value) {
            addCriterion("TIME_LIMIT <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Date> values) {
            addCriterion("TIME_LIMIT in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Date> values) {
            addCriterion("TIME_LIMIT not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Date value1, Date value2) {
            addCriterion("TIME_LIMIT between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Date value1, Date value2) {
            addCriterion("TIME_LIMIT not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessIsNull() {
            addCriterion("SCOPE_OF_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessIsNotNull() {
            addCriterion("SCOPE_OF_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessEqualTo(String value) {
            addCriterion("SCOPE_OF_BUSINESS =", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessNotEqualTo(String value) {
            addCriterion("SCOPE_OF_BUSINESS <>", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessGreaterThan(String value) {
            addCriterion("SCOPE_OF_BUSINESS >", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("SCOPE_OF_BUSINESS >=", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessLessThan(String value) {
            addCriterion("SCOPE_OF_BUSINESS <", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessLessThanOrEqualTo(String value) {
            addCriterion("SCOPE_OF_BUSINESS <=", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessLike(String value) {
            addCriterion("SCOPE_OF_BUSINESS like", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessNotLike(String value) {
            addCriterion("SCOPE_OF_BUSINESS not like", value, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessIn(List<String> values) {
            addCriterion("SCOPE_OF_BUSINESS in", values, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessNotIn(List<String> values) {
            addCriterion("SCOPE_OF_BUSINESS not in", values, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessBetween(String value1, String value2) {
            addCriterion("SCOPE_OF_BUSINESS between", value1, value2, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andScopeOfBusinessNotBetween(String value1, String value2) {
            addCriterion("SCOPE_OF_BUSINESS not between", value1, value2, "scopeOfBusiness");
            return (Criteria) this;
        }

        public Criteria andBookingsIsNull() {
            addCriterion("BOOKINGS is null");
            return (Criteria) this;
        }

        public Criteria andBookingsIsNotNull() {
            addCriterion("BOOKINGS is not null");
            return (Criteria) this;
        }

        public Criteria andBookingsEqualTo(String value) {
            addCriterion("BOOKINGS =", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsNotEqualTo(String value) {
            addCriterion("BOOKINGS <>", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsGreaterThan(String value) {
            addCriterion("BOOKINGS >", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKINGS >=", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsLessThan(String value) {
            addCriterion("BOOKINGS <", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsLessThanOrEqualTo(String value) {
            addCriterion("BOOKINGS <=", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsLike(String value) {
            addCriterion("BOOKINGS like", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsNotLike(String value) {
            addCriterion("BOOKINGS not like", value, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsIn(List<String> values) {
            addCriterion("BOOKINGS in", values, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsNotIn(List<String> values) {
            addCriterion("BOOKINGS not in", values, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsBetween(String value1, String value2) {
            addCriterion("BOOKINGS between", value1, value2, "bookings");
            return (Criteria) this;
        }

        public Criteria andBookingsNotBetween(String value1, String value2) {
            addCriterion("BOOKINGS not between", value1, value2, "bookings");
            return (Criteria) this;
        }

        public Criteria andExtsIsNull() {
            addCriterion("EXTS is null");
            return (Criteria) this;
        }

        public Criteria andExtsIsNotNull() {
            addCriterion("EXTS is not null");
            return (Criteria) this;
        }

        public Criteria andExtsEqualTo(String value) {
            addCriterion("EXTS =", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsNotEqualTo(String value) {
            addCriterion("EXTS <>", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsGreaterThan(String value) {
            addCriterion("EXTS >", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsGreaterThanOrEqualTo(String value) {
            addCriterion("EXTS >=", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsLessThan(String value) {
            addCriterion("EXTS <", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsLessThanOrEqualTo(String value) {
            addCriterion("EXTS <=", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsLike(String value) {
            addCriterion("EXTS like", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsNotLike(String value) {
            addCriterion("EXTS not like", value, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsIn(List<String> values) {
            addCriterion("EXTS in", values, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsNotIn(List<String> values) {
            addCriterion("EXTS not in", values, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsBetween(String value1, String value2) {
            addCriterion("EXTS between", value1, value2, "exts");
            return (Criteria) this;
        }

        public Criteria andExtsNotBetween(String value1, String value2) {
            addCriterion("EXTS not between", value1, value2, "exts");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdIsNull() {
            addCriterion("LEGAL_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdIsNotNull() {
            addCriterion("LEGAL_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID =", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID <>", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdGreaterThan(String value) {
            addCriterion("LEGAL_PERSON_ID >", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID >=", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdLessThan(String value) {
            addCriterion("LEGAL_PERSON_ID <", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID <=", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdLike(String value) {
            addCriterion("LEGAL_PERSON_ID like", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotLike(String value) {
            addCriterion("LEGAL_PERSON_ID not like", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdIn(List<String> values) {
            addCriterion("LEGAL_PERSON_ID in", values, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON_ID not in", values, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_ID between", value1, value2, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_ID not between", value1, value2, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIsNull() {
            addCriterion("LEGAL_PERSON_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIsNotNull() {
            addCriterion("LEGAL_PERSON_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHONE =", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHONE <>", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneGreaterThan(String value) {
            addCriterion("LEGAL_PERSON_PHONE >", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHONE >=", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLessThan(String value) {
            addCriterion("LEGAL_PERSON_PHONE <", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_PHONE <=", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLike(String value) {
            addCriterion("LEGAL_PERSON_PHONE like", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotLike(String value) {
            addCriterion("LEGAL_PERSON_PHONE not like", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIn(List<String> values) {
            addCriterion("LEGAL_PERSON_PHONE in", values, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON_PHONE not in", values, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_PHONE between", value1, value2, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_PHONE not between", value1, value2, "legalPersonPhone");
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

        public Criteria andAttendingPersonnelIsNull() {
            addCriterion("ATTENDING_PERSONNEL is null");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelIsNotNull() {
            addCriterion("ATTENDING_PERSONNEL is not null");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelEqualTo(String value) {
            addCriterion("ATTENDING_PERSONNEL =", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelNotEqualTo(String value) {
            addCriterion("ATTENDING_PERSONNEL <>", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelGreaterThan(String value) {
            addCriterion("ATTENDING_PERSONNEL >", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDING_PERSONNEL >=", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelLessThan(String value) {
            addCriterion("ATTENDING_PERSONNEL <", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelLessThanOrEqualTo(String value) {
            addCriterion("ATTENDING_PERSONNEL <=", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelLike(String value) {
            addCriterion("ATTENDING_PERSONNEL like", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelNotLike(String value) {
            addCriterion("ATTENDING_PERSONNEL not like", value, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelIn(List<String> values) {
            addCriterion("ATTENDING_PERSONNEL in", values, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelNotIn(List<String> values) {
            addCriterion("ATTENDING_PERSONNEL not in", values, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelBetween(String value1, String value2) {
            addCriterion("ATTENDING_PERSONNEL between", value1, value2, "attendingPersonnel");
            return (Criteria) this;
        }

        public Criteria andAttendingPersonnelNotBetween(String value1, String value2) {
            addCriterion("ATTENDING_PERSONNEL not between", value1, value2, "attendingPersonnel");
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