package com.mugua.core.pay.mggoods.pojo;

import java.util.ArrayList;
import java.util.List;

public class MgGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer startRow;
    private Integer pageSize;
    
    public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
    public MgGoodsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNull() {
            addCriterion("PHOTO1 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNotNull() {
            addCriterion("PHOTO1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto1EqualTo(String value) {
            addCriterion("PHOTO1 =", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotEqualTo(String value) {
            addCriterion("PHOTO1 <>", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThan(String value) {
            addCriterion("PHOTO1 >", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO1 >=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThan(String value) {
            addCriterion("PHOTO1 <", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThanOrEqualTo(String value) {
            addCriterion("PHOTO1 <=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Like(String value) {
            addCriterion("PHOTO1 like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotLike(String value) {
            addCriterion("PHOTO1 not like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1In(List<String> values) {
            addCriterion("PHOTO1 in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotIn(List<String> values) {
            addCriterion("PHOTO1 not in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Between(String value1, String value2) {
            addCriterion("PHOTO1 between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotBetween(String value1, String value2) {
            addCriterion("PHOTO1 not between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNull() {
            addCriterion("PHOTO2 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNotNull() {
            addCriterion("PHOTO2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto2EqualTo(String value) {
            addCriterion("PHOTO2 =", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotEqualTo(String value) {
            addCriterion("PHOTO2 <>", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThan(String value) {
            addCriterion("PHOTO2 >", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO2 >=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThan(String value) {
            addCriterion("PHOTO2 <", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThanOrEqualTo(String value) {
            addCriterion("PHOTO2 <=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Like(String value) {
            addCriterion("PHOTO2 like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotLike(String value) {
            addCriterion("PHOTO2 not like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2In(List<String> values) {
            addCriterion("PHOTO2 in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotIn(List<String> values) {
            addCriterion("PHOTO2 not in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Between(String value1, String value2) {
            addCriterion("PHOTO2 between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotBetween(String value1, String value2) {
            addCriterion("PHOTO2 not between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNull() {
            addCriterion("PHOTO3 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNotNull() {
            addCriterion("PHOTO3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto3EqualTo(String value) {
            addCriterion("PHOTO3 =", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotEqualTo(String value) {
            addCriterion("PHOTO3 <>", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThan(String value) {
            addCriterion("PHOTO3 >", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO3 >=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThan(String value) {
            addCriterion("PHOTO3 <", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThanOrEqualTo(String value) {
            addCriterion("PHOTO3 <=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Like(String value) {
            addCriterion("PHOTO3 like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotLike(String value) {
            addCriterion("PHOTO3 not like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3In(List<String> values) {
            addCriterion("PHOTO3 in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotIn(List<String> values) {
            addCriterion("PHOTO3 not in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Between(String value1, String value2) {
            addCriterion("PHOTO3 between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotBetween(String value1, String value2) {
            addCriterion("PHOTO3 not between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto4IsNull() {
            addCriterion("PHOTO4 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto4IsNotNull() {
            addCriterion("PHOTO4 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto4EqualTo(String value) {
            addCriterion("PHOTO4 =", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotEqualTo(String value) {
            addCriterion("PHOTO4 <>", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4GreaterThan(String value) {
            addCriterion("PHOTO4 >", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO4 >=", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4LessThan(String value) {
            addCriterion("PHOTO4 <", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4LessThanOrEqualTo(String value) {
            addCriterion("PHOTO4 <=", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4Like(String value) {
            addCriterion("PHOTO4 like", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotLike(String value) {
            addCriterion("PHOTO4 not like", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4In(List<String> values) {
            addCriterion("PHOTO4 in", values, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotIn(List<String> values) {
            addCriterion("PHOTO4 not in", values, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4Between(String value1, String value2) {
            addCriterion("PHOTO4 between", value1, value2, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotBetween(String value1, String value2) {
            addCriterion("PHOTO4 not between", value1, value2, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto5IsNull() {
            addCriterion("PHOTO5 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto5IsNotNull() {
            addCriterion("PHOTO5 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto5EqualTo(String value) {
            addCriterion("PHOTO5 =", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotEqualTo(String value) {
            addCriterion("PHOTO5 <>", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5GreaterThan(String value) {
            addCriterion("PHOTO5 >", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO5 >=", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5LessThan(String value) {
            addCriterion("PHOTO5 <", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5LessThanOrEqualTo(String value) {
            addCriterion("PHOTO5 <=", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5Like(String value) {
            addCriterion("PHOTO5 like", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotLike(String value) {
            addCriterion("PHOTO5 not like", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5In(List<String> values) {
            addCriterion("PHOTO5 in", values, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotIn(List<String> values) {
            addCriterion("PHOTO5 not in", values, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5Between(String value1, String value2) {
            addCriterion("PHOTO5 between", value1, value2, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotBetween(String value1, String value2) {
            addCriterion("PHOTO5 not between", value1, value2, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto6IsNull() {
            addCriterion("PHOTO6 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto6IsNotNull() {
            addCriterion("PHOTO6 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto6EqualTo(String value) {
            addCriterion("PHOTO6 =", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotEqualTo(String value) {
            addCriterion("PHOTO6 <>", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6GreaterThan(String value) {
            addCriterion("PHOTO6 >", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO6 >=", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6LessThan(String value) {
            addCriterion("PHOTO6 <", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6LessThanOrEqualTo(String value) {
            addCriterion("PHOTO6 <=", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6Like(String value) {
            addCriterion("PHOTO6 like", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotLike(String value) {
            addCriterion("PHOTO6 not like", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6In(List<String> values) {
            addCriterion("PHOTO6 in", values, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotIn(List<String> values) {
            addCriterion("PHOTO6 not in", values, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6Between(String value1, String value2) {
            addCriterion("PHOTO6 between", value1, value2, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotBetween(String value1, String value2) {
            addCriterion("PHOTO6 not between", value1, value2, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto7IsNull() {
            addCriterion("PHOTO7 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto7IsNotNull() {
            addCriterion("PHOTO7 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto7EqualTo(String value) {
            addCriterion("PHOTO7 =", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotEqualTo(String value) {
            addCriterion("PHOTO7 <>", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7GreaterThan(String value) {
            addCriterion("PHOTO7 >", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO7 >=", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7LessThan(String value) {
            addCriterion("PHOTO7 <", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7LessThanOrEqualTo(String value) {
            addCriterion("PHOTO7 <=", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7Like(String value) {
            addCriterion("PHOTO7 like", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotLike(String value) {
            addCriterion("PHOTO7 not like", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7In(List<String> values) {
            addCriterion("PHOTO7 in", values, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotIn(List<String> values) {
            addCriterion("PHOTO7 not in", values, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7Between(String value1, String value2) {
            addCriterion("PHOTO7 between", value1, value2, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotBetween(String value1, String value2) {
            addCriterion("PHOTO7 not between", value1, value2, "photo7");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andIsShotIsNull() {
            addCriterion("IS_SHOT is null");
            return (Criteria) this;
        }

        public Criteria andIsShotIsNotNull() {
            addCriterion("IS_SHOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsShotEqualTo(Integer value) {
            addCriterion("IS_SHOT =", value, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotNotEqualTo(Integer value) {
            addCriterion("IS_SHOT <>", value, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotGreaterThan(Integer value) {
            addCriterion("IS_SHOT >", value, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SHOT >=", value, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotLessThan(Integer value) {
            addCriterion("IS_SHOT <", value, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SHOT <=", value, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotIn(List<Integer> values) {
            addCriterion("IS_SHOT in", values, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotNotIn(List<Integer> values) {
            addCriterion("IS_SHOT not in", values, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SHOT between", value1, value2, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsShotNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SHOT not between", value1, value2, "isShot");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("IS_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("IS_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Integer value) {
            addCriterion("IS_RECOMMEND =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Integer value) {
            addCriterion("IS_RECOMMEND <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Integer value) {
            addCriterion("IS_RECOMMEND >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_RECOMMEND >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Integer value) {
            addCriterion("IS_RECOMMEND <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("IS_RECOMMEND <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Integer> values) {
            addCriterion("IS_RECOMMEND in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Integer> values) {
            addCriterion("IS_RECOMMEND not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Integer value1, Integer value2) {
            addCriterion("IS_RECOMMEND between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_RECOMMEND not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andMerchantIsNull() {
            addCriterion("MERCHANT is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIsNotNull() {
            addCriterion("MERCHANT is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantEqualTo(String value) {
            addCriterion("MERCHANT =", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotEqualTo(String value) {
            addCriterion("MERCHANT <>", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantGreaterThan(String value) {
            addCriterion("MERCHANT >", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT >=", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLessThan(String value) {
            addCriterion("MERCHANT <", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT <=", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLike(String value) {
            addCriterion("MERCHANT like", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotLike(String value) {
            addCriterion("MERCHANT not like", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantIn(List<String> values) {
            addCriterion("MERCHANT in", values, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotIn(List<String> values) {
            addCriterion("MERCHANT not in", values, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantBetween(String value1, String value2) {
            addCriterion("MERCHANT between", value1, value2, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotBetween(String value1, String value2) {
            addCriterion("MERCHANT not between", value1, value2, "merchant");
            return (Criteria) this;
        }

        public Criteria andIsCertificationIsNull() {
            addCriterion("IS_CERTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andIsCertificationIsNotNull() {
            addCriterion("IS_CERTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsCertificationEqualTo(String value) {
            addCriterion("IS_CERTIFICATION =", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotEqualTo(String value) {
            addCriterion("IS_CERTIFICATION <>", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationGreaterThan(String value) {
            addCriterion("IS_CERTIFICATION >", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CERTIFICATION >=", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationLessThan(String value) {
            addCriterion("IS_CERTIFICATION <", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationLessThanOrEqualTo(String value) {
            addCriterion("IS_CERTIFICATION <=", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationLike(String value) {
            addCriterion("IS_CERTIFICATION like", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotLike(String value) {
            addCriterion("IS_CERTIFICATION not like", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationIn(List<String> values) {
            addCriterion("IS_CERTIFICATION in", values, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotIn(List<String> values) {
            addCriterion("IS_CERTIFICATION not in", values, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationBetween(String value1, String value2) {
            addCriterion("IS_CERTIFICATION between", value1, value2, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotBetween(String value1, String value2) {
            addCriterion("IS_CERTIFICATION not between", value1, value2, "isCertification");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIsLimitidIsNull() {
            addCriterion("IS_LIMITID is null");
            return (Criteria) this;
        }

        public Criteria andIsLimitidIsNotNull() {
            addCriterion("IS_LIMITID is not null");
            return (Criteria) this;
        }

        public Criteria andIsLimitidEqualTo(Integer value) {
            addCriterion("IS_LIMITID =", value, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidNotEqualTo(Integer value) {
            addCriterion("IS_LIMITID <>", value, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidGreaterThan(Integer value) {
            addCriterion("IS_LIMITID >", value, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_LIMITID >=", value, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidLessThan(Integer value) {
            addCriterion("IS_LIMITID <", value, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidLessThanOrEqualTo(Integer value) {
            addCriterion("IS_LIMITID <=", value, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidIn(List<Integer> values) {
            addCriterion("IS_LIMITID in", values, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidNotIn(List<Integer> values) {
            addCriterion("IS_LIMITID not in", values, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidBetween(Integer value1, Integer value2) {
            addCriterion("IS_LIMITID between", value1, value2, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andIsLimitidNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_LIMITID not between", value1, value2, "isLimitid");
            return (Criteria) this;
        }

        public Criteria andLimitidIsNull() {
            addCriterion("LIMITID is null");
            return (Criteria) this;
        }

        public Criteria andLimitidIsNotNull() {
            addCriterion("LIMITID is not null");
            return (Criteria) this;
        }

        public Criteria andLimitidEqualTo(Integer value) {
            addCriterion("LIMITID =", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidNotEqualTo(Integer value) {
            addCriterion("LIMITID <>", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidGreaterThan(Integer value) {
            addCriterion("LIMITID >", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMITID >=", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidLessThan(Integer value) {
            addCriterion("LIMITID <", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidLessThanOrEqualTo(Integer value) {
            addCriterion("LIMITID <=", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidIn(List<Integer> values) {
            addCriterion("LIMITID in", values, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidNotIn(List<Integer> values) {
            addCriterion("LIMITID not in", values, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidBetween(Integer value1, Integer value2) {
            addCriterion("LIMITID between", value1, value2, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMITID not between", value1, value2, "limitid");
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