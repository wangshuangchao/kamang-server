package com.mugua.core.brokenlist.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrokenlistInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrokenlistInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBrokenIdIsNull() {
            addCriterion("BROKEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrokenIdIsNotNull() {
            addCriterion("BROKEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrokenIdEqualTo(Integer value) {
            addCriterion("BROKEN_ID =", value, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdNotEqualTo(Integer value) {
            addCriterion("BROKEN_ID <>", value, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdGreaterThan(Integer value) {
            addCriterion("BROKEN_ID >", value, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BROKEN_ID >=", value, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdLessThan(Integer value) {
            addCriterion("BROKEN_ID <", value, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdLessThanOrEqualTo(Integer value) {
            addCriterion("BROKEN_ID <=", value, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdIn(List<Integer> values) {
            addCriterion("BROKEN_ID in", values, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdNotIn(List<Integer> values) {
            addCriterion("BROKEN_ID not in", values, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdBetween(Integer value1, Integer value2) {
            addCriterion("BROKEN_ID between", value1, value2, "brokenId");
            return (Criteria) this;
        }

        public Criteria andBrokenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BROKEN_ID not between", value1, value2, "brokenId");
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

        public Criteria andRecordTypeIsNull() {
            addCriterion("RECORD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("RECORD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(String value) {
            addCriterion("RECORD_TYPE =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(String value) {
            addCriterion("RECORD_TYPE <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(String value) {
            addCriterion("RECORD_TYPE >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_TYPE >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(String value) {
            addCriterion("RECORD_TYPE <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("RECORD_TYPE <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLike(String value) {
            addCriterion("RECORD_TYPE like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotLike(String value) {
            addCriterion("RECORD_TYPE not like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<String> values) {
            addCriterion("RECORD_TYPE in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<String> values) {
            addCriterion("RECORD_TYPE not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(String value1, String value2) {
            addCriterion("RECORD_TYPE between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(String value1, String value2) {
            addCriterion("RECORD_TYPE not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeIsNull() {
            addCriterion("ORIGANIZATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeIsNotNull() {
            addCriterion("ORIGANIZATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeEqualTo(String value) {
            addCriterion("ORIGANIZATION_CODE =", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeNotEqualTo(String value) {
            addCriterion("ORIGANIZATION_CODE <>", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeGreaterThan(String value) {
            addCriterion("ORIGANIZATION_CODE >", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGANIZATION_CODE >=", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeLessThan(String value) {
            addCriterion("ORIGANIZATION_CODE <", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("ORIGANIZATION_CODE <=", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeLike(String value) {
            addCriterion("ORIGANIZATION_CODE like", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeNotLike(String value) {
            addCriterion("ORIGANIZATION_CODE not like", value, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeIn(List<String> values) {
            addCriterion("ORIGANIZATION_CODE in", values, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeNotIn(List<String> values) {
            addCriterion("ORIGANIZATION_CODE not in", values, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeBetween(String value1, String value2) {
            addCriterion("ORIGANIZATION_CODE between", value1, value2, "origanizationCode");
            return (Criteria) this;
        }

        public Criteria andOriganizationCodeNotBetween(String value1, String value2) {
            addCriterion("ORIGANIZATION_CODE not between", value1, value2, "origanizationCode");
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

        public Criteria andOpernameIsNull() {
            addCriterion("OPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpernameIsNotNull() {
            addCriterion("OPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpernameEqualTo(String value) {
            addCriterion("OPERNAME =", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotEqualTo(String value) {
            addCriterion("OPERNAME <>", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameGreaterThan(String value) {
            addCriterion("OPERNAME >", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERNAME >=", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLessThan(String value) {
            addCriterion("OPERNAME <", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLessThanOrEqualTo(String value) {
            addCriterion("OPERNAME <=", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLike(String value) {
            addCriterion("OPERNAME like", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotLike(String value) {
            addCriterion("OPERNAME not like", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameIn(List<String> values) {
            addCriterion("OPERNAME in", values, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotIn(List<String> values) {
            addCriterion("OPERNAME not in", values, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameBetween(String value1, String value2) {
            addCriterion("OPERNAME between", value1, value2, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotBetween(String value1, String value2) {
            addCriterion("OPERNAME not between", value1, value2, "opername");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNull() {
            addCriterion("CREDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNotNull() {
            addCriterion("CREDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeEqualTo(String value) {
            addCriterion("CREDITCODE =", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotEqualTo(String value) {
            addCriterion("CREDITCODE <>", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThan(String value) {
            addCriterion("CREDITCODE >", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITCODE >=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThan(String value) {
            addCriterion("CREDITCODE <", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThanOrEqualTo(String value) {
            addCriterion("CREDITCODE <=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLike(String value) {
            addCriterion("CREDITCODE like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotLike(String value) {
            addCriterion("CREDITCODE not like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIn(List<String> values) {
            addCriterion("CREDITCODE in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotIn(List<String> values) {
            addCriterion("CREDITCODE not in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeBetween(String value1, String value2) {
            addCriterion("CREDITCODE between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotBetween(String value1, String value2) {
            addCriterion("CREDITCODE not between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andLineHourIsNull() {
            addCriterion("LINE_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andLineHourIsNotNull() {
            addCriterion("LINE_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andLineHourEqualTo(Date value) {
            addCriterionForJDBCDate("LINE_HOUR =", value, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourNotEqualTo(Date value) {
            addCriterionForJDBCDate("LINE_HOUR <>", value, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourGreaterThan(Date value) {
            addCriterionForJDBCDate("LINE_HOUR >", value, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LINE_HOUR >=", value, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourLessThan(Date value) {
            addCriterionForJDBCDate("LINE_HOUR <", value, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LINE_HOUR <=", value, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourIn(List<Date> values) {
            addCriterionForJDBCDate("LINE_HOUR in", values, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourNotIn(List<Date> values) {
            addCriterionForJDBCDate("LINE_HOUR not in", values, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LINE_HOUR between", value1, value2, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineHourNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LINE_HOUR not between", value1, value2, "lineHour");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNull() {
            addCriterion("LINE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNotNull() {
            addCriterion("LINE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLineNumberEqualTo(String value) {
            addCriterion("LINE_NUMBER =", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotEqualTo(String value) {
            addCriterion("LINE_NUMBER <>", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThan(String value) {
            addCriterion("LINE_NUMBER >", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_NUMBER >=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThan(String value) {
            addCriterion("LINE_NUMBER <", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThanOrEqualTo(String value) {
            addCriterion("LINE_NUMBER <=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLike(String value) {
            addCriterion("LINE_NUMBER like", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotLike(String value) {
            addCriterion("LINE_NUMBER not like", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberIn(List<String> values) {
            addCriterion("LINE_NUMBER in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotIn(List<String> values) {
            addCriterion("LINE_NUMBER not in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberBetween(String value1, String value2) {
            addCriterion("LINE_NUMBER between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotBetween(String value1, String value2) {
            addCriterion("LINE_NUMBER not between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberIsNull() {
            addCriterion("TABLE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTableNumberIsNotNull() {
            addCriterion("TABLE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTableNumberEqualTo(String value) {
            addCriterion("TABLE_NUMBER =", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotEqualTo(String value) {
            addCriterion("TABLE_NUMBER <>", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberGreaterThan(String value) {
            addCriterion("TABLE_NUMBER >", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NUMBER >=", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberLessThan(String value) {
            addCriterion("TABLE_NUMBER <", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NUMBER <=", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberLike(String value) {
            addCriterion("TABLE_NUMBER like", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotLike(String value) {
            addCriterion("TABLE_NUMBER not like", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberIn(List<String> values) {
            addCriterion("TABLE_NUMBER in", values, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotIn(List<String> values) {
            addCriterion("TABLE_NUMBER not in", values, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberBetween(String value1, String value2) {
            addCriterion("TABLE_NUMBER between", value1, value2, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotBetween(String value1, String value2) {
            addCriterion("TABLE_NUMBER not between", value1, value2, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andLineCourtIsNull() {
            addCriterion("LINE_COURT is null");
            return (Criteria) this;
        }

        public Criteria andLineCourtIsNotNull() {
            addCriterion("LINE_COURT is not null");
            return (Criteria) this;
        }

        public Criteria andLineCourtEqualTo(String value) {
            addCriterion("LINE_COURT =", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtNotEqualTo(String value) {
            addCriterion("LINE_COURT <>", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtGreaterThan(String value) {
            addCriterion("LINE_COURT >", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_COURT >=", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtLessThan(String value) {
            addCriterion("LINE_COURT <", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtLessThanOrEqualTo(String value) {
            addCriterion("LINE_COURT <=", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtLike(String value) {
            addCriterion("LINE_COURT like", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtNotLike(String value) {
            addCriterion("LINE_COURT not like", value, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtIn(List<String> values) {
            addCriterion("LINE_COURT in", values, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtNotIn(List<String> values) {
            addCriterion("LINE_COURT not in", values, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtBetween(String value1, String value2) {
            addCriterion("LINE_COURT between", value1, value2, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andLineCourtNotBetween(String value1, String value2) {
            addCriterion("LINE_COURT not between", value1, value2, "lineCourt");
            return (Criteria) this;
        }

        public Criteria andExtOneIsNull() {
            addCriterion("EXT_ONE is null");
            return (Criteria) this;
        }

        public Criteria andExtOneIsNotNull() {
            addCriterion("EXT_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andExtOneEqualTo(String value) {
            addCriterion("EXT_ONE =", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneNotEqualTo(String value) {
            addCriterion("EXT_ONE <>", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneGreaterThan(String value) {
            addCriterion("EXT_ONE >", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_ONE >=", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneLessThan(String value) {
            addCriterion("EXT_ONE <", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneLessThanOrEqualTo(String value) {
            addCriterion("EXT_ONE <=", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneLike(String value) {
            addCriterion("EXT_ONE like", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneNotLike(String value) {
            addCriterion("EXT_ONE not like", value, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneIn(List<String> values) {
            addCriterion("EXT_ONE in", values, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneNotIn(List<String> values) {
            addCriterion("EXT_ONE not in", values, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneBetween(String value1, String value2) {
            addCriterion("EXT_ONE between", value1, value2, "extOne");
            return (Criteria) this;
        }

        public Criteria andExtOneNotBetween(String value1, String value2) {
            addCriterion("EXT_ONE not between", value1, value2, "extOne");
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