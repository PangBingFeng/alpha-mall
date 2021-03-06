package com.alpha.mall.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallProductExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public TMallProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andShpPicIsNull() {
            addCriterion("shp_pic is null");
            return (Criteria) this;
        }

        public Criteria andShpPicIsNotNull() {
            addCriterion("shp_pic is not null");
            return (Criteria) this;
        }

        public Criteria andShpPicEqualTo(String value) {
            addCriterion("shp_pic =", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicNotEqualTo(String value) {
            addCriterion("shp_pic <>", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicGreaterThan(String value) {
            addCriterion("shp_pic >", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicGreaterThanOrEqualTo(String value) {
            addCriterion("shp_pic >=", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicLessThan(String value) {
            addCriterion("shp_pic <", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicLessThanOrEqualTo(String value) {
            addCriterion("shp_pic <=", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicLike(String value) {
            addCriterion("shp_pic like", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicNotLike(String value) {
            addCriterion("shp_pic not like", value, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicIn(List<String> values) {
            addCriterion("shp_pic in", values, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicNotIn(List<String> values) {
            addCriterion("shp_pic not in", values, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicBetween(String value1, String value2) {
            addCriterion("shp_pic between", value1, value2, "shpPic");
            return (Criteria) this;
        }

        public Criteria andShpPicNotBetween(String value1, String value2) {
            addCriterion("shp_pic not between", value1, value2, "shpPic");
            return (Criteria) this;
        }

        public Criteria andClass1IsNull() {
            addCriterion("class1 is null");
            return (Criteria) this;
        }

        public Criteria andClass1IsNotNull() {
            addCriterion("class1 is not null");
            return (Criteria) this;
        }

        public Criteria andClass1EqualTo(Integer value) {
            addCriterion("class1 =", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotEqualTo(Integer value) {
            addCriterion("class1 <>", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThan(Integer value) {
            addCriterion("class1 >", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThanOrEqualTo(Integer value) {
            addCriterion("class1 >=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThan(Integer value) {
            addCriterion("class1 <", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThanOrEqualTo(Integer value) {
            addCriterion("class1 <=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1In(List<Integer> values) {
            addCriterion("class1 in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotIn(List<Integer> values) {
            addCriterion("class1 not in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Between(Integer value1, Integer value2) {
            addCriterion("class1 between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotBetween(Integer value1, Integer value2) {
            addCriterion("class1 not between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass2IsNull() {
            addCriterion("class2 is null");
            return (Criteria) this;
        }

        public Criteria andClass2IsNotNull() {
            addCriterion("class2 is not null");
            return (Criteria) this;
        }

        public Criteria andClass2EqualTo(Integer value) {
            addCriterion("class2 =", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotEqualTo(Integer value) {
            addCriterion("class2 <>", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThan(Integer value) {
            addCriterion("class2 >", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThanOrEqualTo(Integer value) {
            addCriterion("class2 >=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThan(Integer value) {
            addCriterion("class2 <", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThanOrEqualTo(Integer value) {
            addCriterion("class2 <=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2In(List<Integer> values) {
            addCriterion("class2 in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotIn(List<Integer> values) {
            addCriterion("class2 not in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2Between(Integer value1, Integer value2) {
            addCriterion("class2 between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotBetween(Integer value1, Integer value2) {
            addCriterion("class2 not between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(Integer value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(Integer value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(Integer value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(Integer value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<Integer> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<Integer> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andChjTimeIsNull() {
            addCriterion("chj_time is null");
            return (Criteria) this;
        }

        public Criteria andChjTimeIsNotNull() {
            addCriterion("chj_time is not null");
            return (Criteria) this;
        }

        public Criteria andChjTimeEqualTo(Date value) {
            addCriterion("chj_time =", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeNotEqualTo(Date value) {
            addCriterion("chj_time <>", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeGreaterThan(Date value) {
            addCriterion("chj_time >", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chj_time >=", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeLessThan(Date value) {
            addCriterion("chj_time <", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeLessThanOrEqualTo(Date value) {
            addCriterion("chj_time <=", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeIn(List<Date> values) {
            addCriterion("chj_time in", values, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeNotIn(List<Date> values) {
            addCriterion("chj_time not in", values, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeBetween(Date value1, Date value2) {
            addCriterion("chj_time between", value1, value2, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeNotBetween(Date value1, Date value2) {
            addCriterion("chj_time not between", value1, value2, "chjTime");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionIsNull() {
            addCriterion("shp_descriprion is null");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionIsNotNull() {
            addCriterion("shp_descriprion is not null");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionEqualTo(String value) {
            addCriterion("shp_descriprion =", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionNotEqualTo(String value) {
            addCriterion("shp_descriprion <>", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionGreaterThan(String value) {
            addCriterion("shp_descriprion >", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionGreaterThanOrEqualTo(String value) {
            addCriterion("shp_descriprion >=", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionLessThan(String value) {
            addCriterion("shp_descriprion <", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionLessThanOrEqualTo(String value) {
            addCriterion("shp_descriprion <=", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionLike(String value) {
            addCriterion("shp_descriprion like", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionNotLike(String value) {
            addCriterion("shp_descriprion not like", value, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionIn(List<String> values) {
            addCriterion("shp_descriprion in", values, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionNotIn(List<String> values) {
            addCriterion("shp_descriprion not in", values, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionBetween(String value1, String value2) {
            addCriterion("shp_descriprion between", value1, value2, "shpDescriprion");
            return (Criteria) this;
        }

        public Criteria andShpDescriprionNotBetween(String value1, String value2) {
            addCriterion("shp_descriprion not between", value1, value2, "shpDescriprion");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_product
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 29 10:55:34 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_product
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}