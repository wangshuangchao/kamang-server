package com.mugua.core.sayInfo.pojo;

import java.util.ArrayList;
import java.util.List;

public class SayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SayInfoExample() {
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

        public Criteria andSayIdIsNull() {
            addCriterion("SAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSayIdIsNotNull() {
            addCriterion("SAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSayIdEqualTo(Integer value) {
            addCriterion("SAY_ID =", value, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdNotEqualTo(Integer value) {
            addCriterion("SAY_ID <>", value, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdGreaterThan(Integer value) {
            addCriterion("SAY_ID >", value, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAY_ID >=", value, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdLessThan(Integer value) {
            addCriterion("SAY_ID <", value, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAY_ID <=", value, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdIn(List<Integer> values) {
            addCriterion("SAY_ID in", values, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdNotIn(List<Integer> values) {
            addCriterion("SAY_ID not in", values, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdBetween(Integer value1, Integer value2) {
            addCriterion("SAY_ID between", value1, value2, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAY_ID not between", value1, value2, "sayId");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlIsNull() {
            addCriterion("SAY_PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlIsNotNull() {
            addCriterion("SAY_PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlEqualTo(String value) {
            addCriterion("SAY_PHOTO_URL =", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlNotEqualTo(String value) {
            addCriterion("SAY_PHOTO_URL <>", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlGreaterThan(String value) {
            addCriterion("SAY_PHOTO_URL >", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SAY_PHOTO_URL >=", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlLessThan(String value) {
            addCriterion("SAY_PHOTO_URL <", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("SAY_PHOTO_URL <=", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlLike(String value) {
            addCriterion("SAY_PHOTO_URL like", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlNotLike(String value) {
            addCriterion("SAY_PHOTO_URL not like", value, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlIn(List<String> values) {
            addCriterion("SAY_PHOTO_URL in", values, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlNotIn(List<String> values) {
            addCriterion("SAY_PHOTO_URL not in", values, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlBetween(String value1, String value2) {
            addCriterion("SAY_PHOTO_URL between", value1, value2, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("SAY_PHOTO_URL not between", value1, value2, "sayPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSayProductIdIsNull() {
            addCriterion("SAY_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSayProductIdIsNotNull() {
            addCriterion("SAY_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSayProductIdEqualTo(String value) {
            addCriterion("SAY_PRODUCT_ID =", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdNotEqualTo(String value) {
            addCriterion("SAY_PRODUCT_ID <>", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdGreaterThan(String value) {
            addCriterion("SAY_PRODUCT_ID >", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAY_PRODUCT_ID >=", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdLessThan(String value) {
            addCriterion("SAY_PRODUCT_ID <", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdLessThanOrEqualTo(String value) {
            addCriterion("SAY_PRODUCT_ID <=", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdLike(String value) {
            addCriterion("SAY_PRODUCT_ID like", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdNotLike(String value) {
            addCriterion("SAY_PRODUCT_ID not like", value, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdIn(List<String> values) {
            addCriterion("SAY_PRODUCT_ID in", values, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdNotIn(List<String> values) {
            addCriterion("SAY_PRODUCT_ID not in", values, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdBetween(String value1, String value2) {
            addCriterion("SAY_PRODUCT_ID between", value1, value2, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andSayProductIdNotBetween(String value1, String value2) {
            addCriterion("SAY_PRODUCT_ID not between", value1, value2, "sayProductId");
            return (Criteria) this;
        }

        public Criteria andVisitorNumIsNull() {
            addCriterion("VISITOR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVisitorNumIsNotNull() {
            addCriterion("VISITOR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorNumEqualTo(Integer value) {
            addCriterion("VISITOR_NUM =", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotEqualTo(Integer value) {
            addCriterion("VISITOR_NUM <>", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumGreaterThan(Integer value) {
            addCriterion("VISITOR_NUM >", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_NUM >=", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumLessThan(Integer value) {
            addCriterion("VISITOR_NUM <", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumLessThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_NUM <=", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumIn(List<Integer> values) {
            addCriterion("VISITOR_NUM in", values, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotIn(List<Integer> values) {
            addCriterion("VISITOR_NUM not in", values, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_NUM between", value1, value2, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_NUM not between", value1, value2, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andSayTypeIsNull() {
            addCriterion("SAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSayTypeIsNotNull() {
            addCriterion("SAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSayTypeEqualTo(String value) {
            addCriterion("SAY_TYPE =", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeNotEqualTo(String value) {
            addCriterion("SAY_TYPE <>", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeGreaterThan(String value) {
            addCriterion("SAY_TYPE >", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SAY_TYPE >=", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeLessThan(String value) {
            addCriterion("SAY_TYPE <", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeLessThanOrEqualTo(String value) {
            addCriterion("SAY_TYPE <=", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeLike(String value) {
            addCriterion("SAY_TYPE like", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeNotLike(String value) {
            addCriterion("SAY_TYPE not like", value, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeIn(List<String> values) {
            addCriterion("SAY_TYPE in", values, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeNotIn(List<String> values) {
            addCriterion("SAY_TYPE not in", values, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeBetween(String value1, String value2) {
            addCriterion("SAY_TYPE between", value1, value2, "sayType");
            return (Criteria) this;
        }

        public Criteria andSayTypeNotBetween(String value1, String value2) {
            addCriterion("SAY_TYPE not between", value1, value2, "sayType");
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