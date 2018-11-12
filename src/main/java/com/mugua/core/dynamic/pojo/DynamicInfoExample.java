package com.mugua.core.dynamic.pojo;

import java.util.ArrayList;
import java.util.List;

public class DynamicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicInfoExample() {
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

        public Criteria andDynamicIdIsNull() {
            addCriterion("DYNAMIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNotNull() {
            addCriterion("DYNAMIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdEqualTo(String value) {
            addCriterion("DYNAMIC_ID =", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotEqualTo(String value) {
            addCriterion("DYNAMIC_ID <>", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThan(String value) {
            addCriterion("DYNAMIC_ID >", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_ID >=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThan(String value) {
            addCriterion("DYNAMIC_ID <", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_ID <=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLike(String value) {
            addCriterion("DYNAMIC_ID like", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotLike(String value) {
            addCriterion("DYNAMIC_ID not like", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIn(List<String> values) {
            addCriterion("DYNAMIC_ID in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotIn(List<String> values) {
            addCriterion("DYNAMIC_ID not in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdBetween(String value1, String value2) {
            addCriterion("DYNAMIC_ID between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotBetween(String value1, String value2) {
            addCriterion("DYNAMIC_ID not between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleIsNull() {
            addCriterion("DYNAMIC_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleIsNotNull() {
            addCriterion("DYNAMIC_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleEqualTo(String value) {
            addCriterion("DYNAMIC_TITLE =", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleNotEqualTo(String value) {
            addCriterion("DYNAMIC_TITLE <>", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleGreaterThan(String value) {
            addCriterion("DYNAMIC_TITLE >", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_TITLE >=", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleLessThan(String value) {
            addCriterion("DYNAMIC_TITLE <", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleLessThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_TITLE <=", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleLike(String value) {
            addCriterion("DYNAMIC_TITLE like", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleNotLike(String value) {
            addCriterion("DYNAMIC_TITLE not like", value, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleIn(List<String> values) {
            addCriterion("DYNAMIC_TITLE in", values, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleNotIn(List<String> values) {
            addCriterion("DYNAMIC_TITLE not in", values, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleBetween(String value1, String value2) {
            addCriterion("DYNAMIC_TITLE between", value1, value2, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicTitleNotBetween(String value1, String value2) {
            addCriterion("DYNAMIC_TITLE not between", value1, value2, "dynamicTitle");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIsNull() {
            addCriterion("DYNAMIC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIsNotNull() {
            addCriterion("DYNAMIC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicContentEqualTo(String value) {
            addCriterion("DYNAMIC_CONTENT =", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotEqualTo(String value) {
            addCriterion("DYNAMIC_CONTENT <>", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentGreaterThan(String value) {
            addCriterion("DYNAMIC_CONTENT >", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentGreaterThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_CONTENT >=", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLessThan(String value) {
            addCriterion("DYNAMIC_CONTENT <", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLessThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_CONTENT <=", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLike(String value) {
            addCriterion("DYNAMIC_CONTENT like", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotLike(String value) {
            addCriterion("DYNAMIC_CONTENT not like", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIn(List<String> values) {
            addCriterion("DYNAMIC_CONTENT in", values, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotIn(List<String> values) {
            addCriterion("DYNAMIC_CONTENT not in", values, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentBetween(String value1, String value2) {
            addCriterion("DYNAMIC_CONTENT between", value1, value2, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotBetween(String value1, String value2) {
            addCriterion("DYNAMIC_CONTENT not between", value1, value2, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNull() {
            addCriterion("TITLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNotNull() {
            addCriterion("TITLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeEqualTo(String value) {
            addCriterion("TITLE_TYPE =", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotEqualTo(String value) {
            addCriterion("TITLE_TYPE <>", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThan(String value) {
            addCriterion("TITLE_TYPE >", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_TYPE >=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThan(String value) {
            addCriterion("TITLE_TYPE <", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThanOrEqualTo(String value) {
            addCriterion("TITLE_TYPE <=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLike(String value) {
            addCriterion("TITLE_TYPE like", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotLike(String value) {
            addCriterion("TITLE_TYPE not like", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIn(List<String> values) {
            addCriterion("TITLE_TYPE in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotIn(List<String> values) {
            addCriterion("TITLE_TYPE not in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeBetween(String value1, String value2) {
            addCriterion("TITLE_TYPE between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotBetween(String value1, String value2) {
            addCriterion("TITLE_TYPE not between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
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

        public Criteria andExtTwoIsNull() {
            addCriterion("EXT_TWO is null");
            return (Criteria) this;
        }

        public Criteria andExtTwoIsNotNull() {
            addCriterion("EXT_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andExtTwoEqualTo(String value) {
            addCriterion("EXT_TWO =", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoNotEqualTo(String value) {
            addCriterion("EXT_TWO <>", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoGreaterThan(String value) {
            addCriterion("EXT_TWO >", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_TWO >=", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoLessThan(String value) {
            addCriterion("EXT_TWO <", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoLessThanOrEqualTo(String value) {
            addCriterion("EXT_TWO <=", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoLike(String value) {
            addCriterion("EXT_TWO like", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoNotLike(String value) {
            addCriterion("EXT_TWO not like", value, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoIn(List<String> values) {
            addCriterion("EXT_TWO in", values, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoNotIn(List<String> values) {
            addCriterion("EXT_TWO not in", values, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoBetween(String value1, String value2) {
            addCriterion("EXT_TWO between", value1, value2, "extTwo");
            return (Criteria) this;
        }

        public Criteria andExtTwoNotBetween(String value1, String value2) {
            addCriterion("EXT_TWO not between", value1, value2, "extTwo");
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