package com.mugua.core.sayone.pojo;

import java.util.ArrayList;
import java.util.List;

public class SayOneInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SayOneInfoExample() {
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

        public Criteria andTitleOneIsNull() {
            addCriterion("TITLE_ONE is null");
            return (Criteria) this;
        }

        public Criteria andTitleOneIsNotNull() {
            addCriterion("TITLE_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleOneEqualTo(String value) {
            addCriterion("TITLE_ONE =", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneNotEqualTo(String value) {
            addCriterion("TITLE_ONE <>", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneGreaterThan(String value) {
            addCriterion("TITLE_ONE >", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_ONE >=", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneLessThan(String value) {
            addCriterion("TITLE_ONE <", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneLessThanOrEqualTo(String value) {
            addCriterion("TITLE_ONE <=", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneLike(String value) {
            addCriterion("TITLE_ONE like", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneNotLike(String value) {
            addCriterion("TITLE_ONE not like", value, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneIn(List<String> values) {
            addCriterion("TITLE_ONE in", values, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneNotIn(List<String> values) {
            addCriterion("TITLE_ONE not in", values, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneBetween(String value1, String value2) {
            addCriterion("TITLE_ONE between", value1, value2, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleOneNotBetween(String value1, String value2) {
            addCriterion("TITLE_ONE not between", value1, value2, "titleOne");
            return (Criteria) this;
        }

        public Criteria andTitleTwoIsNull() {
            addCriterion("TITLE_TWO is null");
            return (Criteria) this;
        }

        public Criteria andTitleTwoIsNotNull() {
            addCriterion("TITLE_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTwoEqualTo(String value) {
            addCriterion("TITLE_TWO =", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoNotEqualTo(String value) {
            addCriterion("TITLE_TWO <>", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoGreaterThan(String value) {
            addCriterion("TITLE_TWO >", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_TWO >=", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoLessThan(String value) {
            addCriterion("TITLE_TWO <", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoLessThanOrEqualTo(String value) {
            addCriterion("TITLE_TWO <=", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoLike(String value) {
            addCriterion("TITLE_TWO like", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoNotLike(String value) {
            addCriterion("TITLE_TWO not like", value, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoIn(List<String> values) {
            addCriterion("TITLE_TWO in", values, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoNotIn(List<String> values) {
            addCriterion("TITLE_TWO not in", values, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoBetween(String value1, String value2) {
            addCriterion("TITLE_TWO between", value1, value2, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andTitleTwoNotBetween(String value1, String value2) {
            addCriterion("TITLE_TWO not between", value1, value2, "titleTwo");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlIsNull() {
            addCriterion("COVER_PHOTO_ONE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlIsNotNull() {
            addCriterion("COVER_PHOTO_ONE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlEqualTo(String value) {
            addCriterion("COVER_PHOTO_ONE_URL =", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlNotEqualTo(String value) {
            addCriterion("COVER_PHOTO_ONE_URL <>", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlGreaterThan(String value) {
            addCriterion("COVER_PHOTO_ONE_URL >", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlGreaterThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_ONE_URL >=", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlLessThan(String value) {
            addCriterion("COVER_PHOTO_ONE_URL <", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlLessThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_ONE_URL <=", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlLike(String value) {
            addCriterion("COVER_PHOTO_ONE_URL like", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlNotLike(String value) {
            addCriterion("COVER_PHOTO_ONE_URL not like", value, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlIn(List<String> values) {
            addCriterion("COVER_PHOTO_ONE_URL in", values, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlNotIn(List<String> values) {
            addCriterion("COVER_PHOTO_ONE_URL not in", values, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_ONE_URL between", value1, value2, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoOneUrlNotBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_ONE_URL not between", value1, value2, "coverPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlIsNull() {
            addCriterion("COVER_PHOTO_TWO_URL is null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlIsNotNull() {
            addCriterion("COVER_PHOTO_TWO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlEqualTo(String value) {
            addCriterion("COVER_PHOTO_TWO_URL =", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlNotEqualTo(String value) {
            addCriterion("COVER_PHOTO_TWO_URL <>", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlGreaterThan(String value) {
            addCriterion("COVER_PHOTO_TWO_URL >", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_TWO_URL >=", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlLessThan(String value) {
            addCriterion("COVER_PHOTO_TWO_URL <", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlLessThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_TWO_URL <=", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlLike(String value) {
            addCriterion("COVER_PHOTO_TWO_URL like", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlNotLike(String value) {
            addCriterion("COVER_PHOTO_TWO_URL not like", value, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlIn(List<String> values) {
            addCriterion("COVER_PHOTO_TWO_URL in", values, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlNotIn(List<String> values) {
            addCriterion("COVER_PHOTO_TWO_URL not in", values, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_TWO_URL between", value1, value2, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoTwoUrlNotBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_TWO_URL not between", value1, value2, "coverPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlIsNull() {
            addCriterion("COVER_PHOTO_THR_URL is null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlIsNotNull() {
            addCriterion("COVER_PHOTO_THR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlEqualTo(String value) {
            addCriterion("COVER_PHOTO_THR_URL =", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlNotEqualTo(String value) {
            addCriterion("COVER_PHOTO_THR_URL <>", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlGreaterThan(String value) {
            addCriterion("COVER_PHOTO_THR_URL >", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_THR_URL >=", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlLessThan(String value) {
            addCriterion("COVER_PHOTO_THR_URL <", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlLessThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_THR_URL <=", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlLike(String value) {
            addCriterion("COVER_PHOTO_THR_URL like", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlNotLike(String value) {
            addCriterion("COVER_PHOTO_THR_URL not like", value, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlIn(List<String> values) {
            addCriterion("COVER_PHOTO_THR_URL in", values, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlNotIn(List<String> values) {
            addCriterion("COVER_PHOTO_THR_URL not in", values, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_THR_URL between", value1, value2, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoThrUrlNotBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_THR_URL not between", value1, value2, "coverPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlIsNull() {
            addCriterion("COVER_PHOTO_FOR_URL is null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlIsNotNull() {
            addCriterion("COVER_PHOTO_FOR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlEqualTo(String value) {
            addCriterion("COVER_PHOTO_FOR_URL =", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlNotEqualTo(String value) {
            addCriterion("COVER_PHOTO_FOR_URL <>", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlGreaterThan(String value) {
            addCriterion("COVER_PHOTO_FOR_URL >", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlGreaterThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_FOR_URL >=", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlLessThan(String value) {
            addCriterion("COVER_PHOTO_FOR_URL <", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlLessThanOrEqualTo(String value) {
            addCriterion("COVER_PHOTO_FOR_URL <=", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlLike(String value) {
            addCriterion("COVER_PHOTO_FOR_URL like", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlNotLike(String value) {
            addCriterion("COVER_PHOTO_FOR_URL not like", value, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlIn(List<String> values) {
            addCriterion("COVER_PHOTO_FOR_URL in", values, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlNotIn(List<String> values) {
            addCriterion("COVER_PHOTO_FOR_URL not in", values, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_FOR_URL between", value1, value2, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoForUrlNotBetween(String value1, String value2) {
            addCriterion("COVER_PHOTO_FOR_URL not between", value1, value2, "coverPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeIsNull() {
            addCriterion("PHOTO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeIsNotNull() {
            addCriterion("PHOTO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeEqualTo(String value) {
            addCriterion("PHOTO_TYPE =", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotEqualTo(String value) {
            addCriterion("PHOTO_TYPE <>", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeGreaterThan(String value) {
            addCriterion("PHOTO_TYPE >", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO_TYPE >=", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeLessThan(String value) {
            addCriterion("PHOTO_TYPE <", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeLessThanOrEqualTo(String value) {
            addCriterion("PHOTO_TYPE <=", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeLike(String value) {
            addCriterion("PHOTO_TYPE like", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotLike(String value) {
            addCriterion("PHOTO_TYPE not like", value, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeIn(List<String> values) {
            addCriterion("PHOTO_TYPE in", values, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotIn(List<String> values) {
            addCriterion("PHOTO_TYPE not in", values, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeBetween(String value1, String value2) {
            addCriterion("PHOTO_TYPE between", value1, value2, "photoType");
            return (Criteria) this;
        }

        public Criteria andPhotoTypeNotBetween(String value1, String value2) {
            addCriterion("PHOTO_TYPE not between", value1, value2, "photoType");
            return (Criteria) this;
        }

        public Criteria andNewTypeIsNull() {
            addCriterion("NEW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNewTypeIsNotNull() {
            addCriterion("NEW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNewTypeEqualTo(String value) {
            addCriterion("NEW_TYPE =", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotEqualTo(String value) {
            addCriterion("NEW_TYPE <>", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeGreaterThan(String value) {
            addCriterion("NEW_TYPE >", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_TYPE >=", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeLessThan(String value) {
            addCriterion("NEW_TYPE <", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeLessThanOrEqualTo(String value) {
            addCriterion("NEW_TYPE <=", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeLike(String value) {
            addCriterion("NEW_TYPE like", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotLike(String value) {
            addCriterion("NEW_TYPE not like", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeIn(List<String> values) {
            addCriterion("NEW_TYPE in", values, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotIn(List<String> values) {
            addCriterion("NEW_TYPE not in", values, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeBetween(String value1, String value2) {
            addCriterion("NEW_TYPE between", value1, value2, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotBetween(String value1, String value2) {
            addCriterion("NEW_TYPE not between", value1, value2, "newType");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIsNull() {
            addCriterion("BROWSE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIsNotNull() {
            addCriterion("BROWSE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberEqualTo(Integer value) {
            addCriterion("BROWSE_NUMBER =", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotEqualTo(Integer value) {
            addCriterion("BROWSE_NUMBER <>", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberGreaterThan(Integer value) {
            addCriterion("BROWSE_NUMBER >", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("BROWSE_NUMBER >=", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberLessThan(Integer value) {
            addCriterion("BROWSE_NUMBER <", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("BROWSE_NUMBER <=", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIn(List<Integer> values) {
            addCriterion("BROWSE_NUMBER in", values, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotIn(List<Integer> values) {
            addCriterion("BROWSE_NUMBER not in", values, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberBetween(Integer value1, Integer value2) {
            addCriterion("BROWSE_NUMBER between", value1, value2, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("BROWSE_NUMBER not between", value1, value2, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlIsNull() {
            addCriterion("CONT_PHOTO_ONE_URL is null");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlIsNotNull() {
            addCriterion("CONT_PHOTO_ONE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlEqualTo(String value) {
            addCriterion("CONT_PHOTO_ONE_URL =", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlNotEqualTo(String value) {
            addCriterion("CONT_PHOTO_ONE_URL <>", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlGreaterThan(String value) {
            addCriterion("CONT_PHOTO_ONE_URL >", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_ONE_URL >=", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlLessThan(String value) {
            addCriterion("CONT_PHOTO_ONE_URL <", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlLessThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_ONE_URL <=", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlLike(String value) {
            addCriterion("CONT_PHOTO_ONE_URL like", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlNotLike(String value) {
            addCriterion("CONT_PHOTO_ONE_URL not like", value, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlIn(List<String> values) {
            addCriterion("CONT_PHOTO_ONE_URL in", values, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlNotIn(List<String> values) {
            addCriterion("CONT_PHOTO_ONE_URL not in", values, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_ONE_URL between", value1, value2, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoOneUrlNotBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_ONE_URL not between", value1, value2, "contPhotoOneUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlIsNull() {
            addCriterion("CONT_PHOTO_TWO_URL is null");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlIsNotNull() {
            addCriterion("CONT_PHOTO_TWO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlEqualTo(String value) {
            addCriterion("CONT_PHOTO_TWO_URL =", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlNotEqualTo(String value) {
            addCriterion("CONT_PHOTO_TWO_URL <>", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlGreaterThan(String value) {
            addCriterion("CONT_PHOTO_TWO_URL >", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_TWO_URL >=", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlLessThan(String value) {
            addCriterion("CONT_PHOTO_TWO_URL <", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlLessThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_TWO_URL <=", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlLike(String value) {
            addCriterion("CONT_PHOTO_TWO_URL like", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlNotLike(String value) {
            addCriterion("CONT_PHOTO_TWO_URL not like", value, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlIn(List<String> values) {
            addCriterion("CONT_PHOTO_TWO_URL in", values, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlNotIn(List<String> values) {
            addCriterion("CONT_PHOTO_TWO_URL not in", values, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_TWO_URL between", value1, value2, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoTwoUrlNotBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_TWO_URL not between", value1, value2, "contPhotoTwoUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlIsNull() {
            addCriterion("CONT_PHOTO_THR_URL is null");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlIsNotNull() {
            addCriterion("CONT_PHOTO_THR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlEqualTo(String value) {
            addCriterion("CONT_PHOTO_THR_URL =", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlNotEqualTo(String value) {
            addCriterion("CONT_PHOTO_THR_URL <>", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlGreaterThan(String value) {
            addCriterion("CONT_PHOTO_THR_URL >", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_THR_URL >=", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlLessThan(String value) {
            addCriterion("CONT_PHOTO_THR_URL <", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlLessThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_THR_URL <=", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlLike(String value) {
            addCriterion("CONT_PHOTO_THR_URL like", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlNotLike(String value) {
            addCriterion("CONT_PHOTO_THR_URL not like", value, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlIn(List<String> values) {
            addCriterion("CONT_PHOTO_THR_URL in", values, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlNotIn(List<String> values) {
            addCriterion("CONT_PHOTO_THR_URL not in", values, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_THR_URL between", value1, value2, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoThrUrlNotBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_THR_URL not between", value1, value2, "contPhotoThrUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlIsNull() {
            addCriterion("CONT_PHOTO_FOR_URL is null");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlIsNotNull() {
            addCriterion("CONT_PHOTO_FOR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlEqualTo(String value) {
            addCriterion("CONT_PHOTO_FOR_URL =", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlNotEqualTo(String value) {
            addCriterion("CONT_PHOTO_FOR_URL <>", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlGreaterThan(String value) {
            addCriterion("CONT_PHOTO_FOR_URL >", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_FOR_URL >=", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlLessThan(String value) {
            addCriterion("CONT_PHOTO_FOR_URL <", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlLessThanOrEqualTo(String value) {
            addCriterion("CONT_PHOTO_FOR_URL <=", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlLike(String value) {
            addCriterion("CONT_PHOTO_FOR_URL like", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlNotLike(String value) {
            addCriterion("CONT_PHOTO_FOR_URL not like", value, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlIn(List<String> values) {
            addCriterion("CONT_PHOTO_FOR_URL in", values, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlNotIn(List<String> values) {
            addCriterion("CONT_PHOTO_FOR_URL not in", values, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_FOR_URL between", value1, value2, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContPhotoForUrlNotBetween(String value1, String value2) {
            addCriterion("CONT_PHOTO_FOR_URL not between", value1, value2, "contPhotoForUrl");
            return (Criteria) this;
        }

        public Criteria andContTextOneIsNull() {
            addCriterion("CONT_TEXT_ONE is null");
            return (Criteria) this;
        }

        public Criteria andContTextOneIsNotNull() {
            addCriterion("CONT_TEXT_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andContTextOneEqualTo(String value) {
            addCriterion("CONT_TEXT_ONE =", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneNotEqualTo(String value) {
            addCriterion("CONT_TEXT_ONE <>", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneGreaterThan(String value) {
            addCriterion("CONT_TEXT_ONE >", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_ONE >=", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneLessThan(String value) {
            addCriterion("CONT_TEXT_ONE <", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneLessThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_ONE <=", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneLike(String value) {
            addCriterion("CONT_TEXT_ONE like", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneNotLike(String value) {
            addCriterion("CONT_TEXT_ONE not like", value, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneIn(List<String> values) {
            addCriterion("CONT_TEXT_ONE in", values, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneNotIn(List<String> values) {
            addCriterion("CONT_TEXT_ONE not in", values, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_ONE between", value1, value2, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextOneNotBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_ONE not between", value1, value2, "contTextOne");
            return (Criteria) this;
        }

        public Criteria andContTextTwoIsNull() {
            addCriterion("CONT_TEXT_TWO is null");
            return (Criteria) this;
        }

        public Criteria andContTextTwoIsNotNull() {
            addCriterion("CONT_TEXT_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andContTextTwoEqualTo(String value) {
            addCriterion("CONT_TEXT_TWO =", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoNotEqualTo(String value) {
            addCriterion("CONT_TEXT_TWO <>", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoGreaterThan(String value) {
            addCriterion("CONT_TEXT_TWO >", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_TWO >=", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoLessThan(String value) {
            addCriterion("CONT_TEXT_TWO <", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoLessThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_TWO <=", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoLike(String value) {
            addCriterion("CONT_TEXT_TWO like", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoNotLike(String value) {
            addCriterion("CONT_TEXT_TWO not like", value, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoIn(List<String> values) {
            addCriterion("CONT_TEXT_TWO in", values, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoNotIn(List<String> values) {
            addCriterion("CONT_TEXT_TWO not in", values, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_TWO between", value1, value2, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextTwoNotBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_TWO not between", value1, value2, "contTextTwo");
            return (Criteria) this;
        }

        public Criteria andContTextThrIsNull() {
            addCriterion("CONT_TEXT_THR is null");
            return (Criteria) this;
        }

        public Criteria andContTextThrIsNotNull() {
            addCriterion("CONT_TEXT_THR is not null");
            return (Criteria) this;
        }

        public Criteria andContTextThrEqualTo(String value) {
            addCriterion("CONT_TEXT_THR =", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrNotEqualTo(String value) {
            addCriterion("CONT_TEXT_THR <>", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrGreaterThan(String value) {
            addCriterion("CONT_TEXT_THR >", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_THR >=", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrLessThan(String value) {
            addCriterion("CONT_TEXT_THR <", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrLessThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_THR <=", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrLike(String value) {
            addCriterion("CONT_TEXT_THR like", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrNotLike(String value) {
            addCriterion("CONT_TEXT_THR not like", value, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrIn(List<String> values) {
            addCriterion("CONT_TEXT_THR in", values, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrNotIn(List<String> values) {
            addCriterion("CONT_TEXT_THR not in", values, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_THR between", value1, value2, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextThrNotBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_THR not between", value1, value2, "contTextThr");
            return (Criteria) this;
        }

        public Criteria andContTextForIsNull() {
            addCriterion("CONT_TEXT_FOR is null");
            return (Criteria) this;
        }

        public Criteria andContTextForIsNotNull() {
            addCriterion("CONT_TEXT_FOR is not null");
            return (Criteria) this;
        }

        public Criteria andContTextForEqualTo(String value) {
            addCriterion("CONT_TEXT_FOR =", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForNotEqualTo(String value) {
            addCriterion("CONT_TEXT_FOR <>", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForGreaterThan(String value) {
            addCriterion("CONT_TEXT_FOR >", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_FOR >=", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForLessThan(String value) {
            addCriterion("CONT_TEXT_FOR <", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForLessThanOrEqualTo(String value) {
            addCriterion("CONT_TEXT_FOR <=", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForLike(String value) {
            addCriterion("CONT_TEXT_FOR like", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForNotLike(String value) {
            addCriterion("CONT_TEXT_FOR not like", value, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForIn(List<String> values) {
            addCriterion("CONT_TEXT_FOR in", values, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForNotIn(List<String> values) {
            addCriterion("CONT_TEXT_FOR not in", values, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_FOR between", value1, value2, "contTextFor");
            return (Criteria) this;
        }

        public Criteria andContTextForNotBetween(String value1, String value2) {
            addCriterion("CONT_TEXT_FOR not between", value1, value2, "contTextFor");
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