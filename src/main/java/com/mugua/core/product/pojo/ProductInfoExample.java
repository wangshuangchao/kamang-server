package com.mugua.core.product.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNull() {
            addCriterion("PRODUCT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNotNull() {
            addCriterion("PRODUCT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andProductSizeEqualTo(String value) {
            addCriterion("PRODUCT_SIZE =", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotEqualTo(String value) {
            addCriterion("PRODUCT_SIZE <>", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThan(String value) {
            addCriterion("PRODUCT_SIZE >", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SIZE >=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThan(String value) {
            addCriterion("PRODUCT_SIZE <", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SIZE <=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLike(String value) {
            addCriterion("PRODUCT_SIZE like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotLike(String value) {
            addCriterion("PRODUCT_SIZE not like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeIn(List<String> values) {
            addCriterion("PRODUCT_SIZE in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotIn(List<String> values) {
            addCriterion("PRODUCT_SIZE not in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeBetween(String value1, String value2) {
            addCriterion("PRODUCT_SIZE between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SIZE not between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNull() {
            addCriterion("PRODUCT_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNotNull() {
            addCriterion("PRODUCT_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockEqualTo(Integer value) {
            addCriterion("PRODUCT_STOCK =", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotEqualTo(Integer value) {
            addCriterion("PRODUCT_STOCK <>", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThan(Integer value) {
            addCriterion("PRODUCT_STOCK >", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_STOCK >=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThan(Integer value) {
            addCriterion("PRODUCT_STOCK <", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_STOCK <=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockIn(List<Integer> values) {
            addCriterion("PRODUCT_STOCK in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotIn(List<Integer> values) {
            addCriterion("PRODUCT_STOCK not in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_STOCK between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_STOCK not between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNull() {
            addCriterion("CRATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNotNull() {
            addCriterion("CRATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeEqualTo(Date value) {
            addCriterion("CRATE_TIME =", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotEqualTo(Date value) {
            addCriterion("CRATE_TIME <>", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThan(Date value) {
            addCriterion("CRATE_TIME >", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRATE_TIME >=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThan(Date value) {
            addCriterion("CRATE_TIME <", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRATE_TIME <=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIn(List<Date> values) {
            addCriterion("CRATE_TIME in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotIn(List<Date> values) {
            addCriterion("CRATE_TIME not in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeBetween(Date value1, Date value2) {
            addCriterion("CRATE_TIME between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRATE_TIME not between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("EXP is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("EXP is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Date value) {
            addCriterion("EXP =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Date value) {
            addCriterion("EXP <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Date value) {
            addCriterion("EXP >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Date value) {
            addCriterion("EXP >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Date value) {
            addCriterion("EXP <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Date value) {
            addCriterion("EXP <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Date> values) {
            addCriterion("EXP in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Date> values) {
            addCriterion("EXP not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Date value1, Date value2) {
            addCriterion("EXP between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Date value1, Date value2) {
            addCriterion("EXP not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("DEADLINE =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("DEADLINE <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("DEADLINE >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("DEADLINE >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("DEADLINE <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("DEADLINE <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("DEADLINE in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("DEADLINE not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("DEADLINE between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("DEADLINE not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNull() {
            addCriterion("PRODUCT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("PRODUCT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("PRODUCT_TITLE =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("PRODUCT_TITLE <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("PRODUCT_TITLE >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TITLE >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("PRODUCT_TITLE <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TITLE <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("PRODUCT_TITLE like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("PRODUCT_TITLE not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("PRODUCT_TITLE in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("PRODUCT_TITLE not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("PRODUCT_TITLE between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TITLE not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("PRODUCT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("PRODUCT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("PRODUCT_DESCRIPTION >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("PRODUCT_DESCRIPTION <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("PRODUCT_DESCRIPTION like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("PRODUCT_DESCRIPTION not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("PRODUCT_DESCRIPTION in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("PRODUCT_DESCRIPTION not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESCRIPTION between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESCRIPTION not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlIsNull() {
            addCriterion("PRODUCT_PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlIsNotNull() {
            addCriterion("PRODUCT_PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlEqualTo(String value) {
            addCriterion("PRODUCT_PHOTO_URL =", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlNotEqualTo(String value) {
            addCriterion("PRODUCT_PHOTO_URL <>", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlGreaterThan(String value) {
            addCriterion("PRODUCT_PHOTO_URL >", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PHOTO_URL >=", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlLessThan(String value) {
            addCriterion("PRODUCT_PHOTO_URL <", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PHOTO_URL <=", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlLike(String value) {
            addCriterion("PRODUCT_PHOTO_URL like", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlNotLike(String value) {
            addCriterion("PRODUCT_PHOTO_URL not like", value, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlIn(List<String> values) {
            addCriterion("PRODUCT_PHOTO_URL in", values, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlNotIn(List<String> values) {
            addCriterion("PRODUCT_PHOTO_URL not in", values, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlBetween(String value1, String value2) {
            addCriterion("PRODUCT_PHOTO_URL between", value1, value2, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PHOTO_URL not between", value1, value2, "productPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlIsNull() {
            addCriterion("PRODUCT_VIDEO_URL is null");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlIsNotNull() {
            addCriterion("PRODUCT_VIDEO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlEqualTo(String value) {
            addCriterion("PRODUCT_VIDEO_URL =", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlNotEqualTo(String value) {
            addCriterion("PRODUCT_VIDEO_URL <>", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlGreaterThan(String value) {
            addCriterion("PRODUCT_VIDEO_URL >", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_VIDEO_URL >=", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlLessThan(String value) {
            addCriterion("PRODUCT_VIDEO_URL <", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_VIDEO_URL <=", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlLike(String value) {
            addCriterion("PRODUCT_VIDEO_URL like", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlNotLike(String value) {
            addCriterion("PRODUCT_VIDEO_URL not like", value, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlIn(List<String> values) {
            addCriterion("PRODUCT_VIDEO_URL in", values, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlNotIn(List<String> values) {
            addCriterion("PRODUCT_VIDEO_URL not in", values, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlBetween(String value1, String value2) {
            addCriterion("PRODUCT_VIDEO_URL between", value1, value2, "productVideoUrl");
            return (Criteria) this;
        }

        public Criteria andProductVideoUrlNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_VIDEO_URL not between", value1, value2, "productVideoUrl");
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

        public Criteria andAffiliatedCompanyIsNull() {
            addCriterion("AFFILIATED_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyIsNotNull() {
            addCriterion("AFFILIATED_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyEqualTo(String value) {
            addCriterion("AFFILIATED_COMPANY =", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyNotEqualTo(String value) {
            addCriterion("AFFILIATED_COMPANY <>", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyGreaterThan(String value) {
            addCriterion("AFFILIATED_COMPANY >", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("AFFILIATED_COMPANY >=", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyLessThan(String value) {
            addCriterion("AFFILIATED_COMPANY <", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyLessThanOrEqualTo(String value) {
            addCriterion("AFFILIATED_COMPANY <=", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyLike(String value) {
            addCriterion("AFFILIATED_COMPANY like", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyNotLike(String value) {
            addCriterion("AFFILIATED_COMPANY not like", value, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyIn(List<String> values) {
            addCriterion("AFFILIATED_COMPANY in", values, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyNotIn(List<String> values) {
            addCriterion("AFFILIATED_COMPANY not in", values, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyBetween(String value1, String value2) {
            addCriterion("AFFILIATED_COMPANY between", value1, value2, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andAffiliatedCompanyNotBetween(String value1, String value2) {
            addCriterion("AFFILIATED_COMPANY not between", value1, value2, "affiliatedCompany");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
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