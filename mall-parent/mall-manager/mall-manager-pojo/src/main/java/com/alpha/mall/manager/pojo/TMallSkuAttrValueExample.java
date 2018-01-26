package com.alpha.mall.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallSkuAttrValueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public TMallSkuAttrValueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
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
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShxmIdIsNull() {
            addCriterion("shxm_id is null");
            return (Criteria) this;
        }

        public Criteria andShxmIdIsNotNull() {
            addCriterion("shxm_id is not null");
            return (Criteria) this;
        }

        public Criteria andShxmIdEqualTo(Integer value) {
            addCriterion("shxm_id =", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdNotEqualTo(Integer value) {
            addCriterion("shxm_id <>", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdGreaterThan(Integer value) {
            addCriterion("shxm_id >", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shxm_id >=", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdLessThan(Integer value) {
            addCriterion("shxm_id <", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdLessThanOrEqualTo(Integer value) {
            addCriterion("shxm_id <=", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdIn(List<Integer> values) {
            addCriterion("shxm_id in", values, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdNotIn(List<Integer> values) {
            addCriterion("shxm_id not in", values, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdBetween(Integer value1, Integer value2) {
            addCriterion("shxm_id between", value1, value2, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shxm_id not between", value1, value2, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdIsNull() {
            addCriterion("shxzh_id is null");
            return (Criteria) this;
        }

        public Criteria andShxzhIdIsNotNull() {
            addCriterion("shxzh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShxzhIdEqualTo(Integer value) {
            addCriterion("shxzh_id =", value, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdNotEqualTo(Integer value) {
            addCriterion("shxzh_id <>", value, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdGreaterThan(Integer value) {
            addCriterion("shxzh_id >", value, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shxzh_id >=", value, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdLessThan(Integer value) {
            addCriterion("shxzh_id <", value, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdLessThanOrEqualTo(Integer value) {
            addCriterion("shxzh_id <=", value, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdIn(List<Integer> values) {
            addCriterion("shxzh_id in", values, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdNotIn(List<Integer> values) {
            addCriterion("shxzh_id not in", values, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdBetween(Integer value1, Integer value2) {
            addCriterion("shxzh_id between", value1, value2, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShxzhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shxzh_id not between", value1, value2, "shxzhId");
            return (Criteria) this;
        }

        public Criteria andShpIdIsNull() {
            addCriterion("shp_id is null");
            return (Criteria) this;
        }

        public Criteria andShpIdIsNotNull() {
            addCriterion("shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andShpIdEqualTo(Integer value) {
            addCriterion("shp_id =", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotEqualTo(Integer value) {
            addCriterion("shp_id <>", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThan(Integer value) {
            addCriterion("shp_id >", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shp_id >=", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdLessThan(Integer value) {
            addCriterion("shp_id <", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdLessThanOrEqualTo(Integer value) {
            addCriterion("shp_id <=", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdIn(List<Integer> values) {
            addCriterion("shp_id in", values, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotIn(List<Integer> values) {
            addCriterion("shp_id not in", values, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdBetween(Integer value1, Integer value2) {
            addCriterion("shp_id between", value1, value2, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shp_id not between", value1, value2, "shpId");
            return (Criteria) this;
        }

        public Criteria andIsSkuIsNull() {
            addCriterion("is_sku is null");
            return (Criteria) this;
        }

        public Criteria andIsSkuIsNotNull() {
            addCriterion("is_sku is not null");
            return (Criteria) this;
        }

        public Criteria andIsSkuEqualTo(String value) {
            addCriterion("is_sku =", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuNotEqualTo(String value) {
            addCriterion("is_sku <>", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuGreaterThan(String value) {
            addCriterion("is_sku >", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuGreaterThanOrEqualTo(String value) {
            addCriterion("is_sku >=", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuLessThan(String value) {
            addCriterion("is_sku <", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuLessThanOrEqualTo(String value) {
            addCriterion("is_sku <=", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuLike(String value) {
            addCriterion("is_sku like", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuNotLike(String value) {
            addCriterion("is_sku not like", value, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuIn(List<String> values) {
            addCriterion("is_sku in", values, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuNotIn(List<String> values) {
            addCriterion("is_sku not in", values, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuBetween(String value1, String value2) {
            addCriterion("is_sku between", value1, value2, "isSku");
            return (Criteria) this;
        }

        public Criteria andIsSkuNotBetween(String value1, String value2) {
            addCriterion("is_sku not between", value1, value2, "isSku");
            return (Criteria) this;
        }

        public Criteria andChjshjIsNull() {
            addCriterion("chjshj is null");
            return (Criteria) this;
        }

        public Criteria andChjshjIsNotNull() {
            addCriterion("chjshj is not null");
            return (Criteria) this;
        }

        public Criteria andChjshjEqualTo(Date value) {
            addCriterion("chjshj =", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotEqualTo(Date value) {
            addCriterion("chjshj <>", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjGreaterThan(Date value) {
            addCriterion("chjshj >", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjGreaterThanOrEqualTo(Date value) {
            addCriterion("chjshj >=", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjLessThan(Date value) {
            addCriterion("chjshj <", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjLessThanOrEqualTo(Date value) {
            addCriterion("chjshj <=", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjIn(List<Date> values) {
            addCriterion("chjshj in", values, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotIn(List<Date> values) {
            addCriterion("chjshj not in", values, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjBetween(Date value1, Date value2) {
            addCriterion("chjshj between", value1, value2, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotBetween(Date value1, Date value2) {
            addCriterion("chjshj not between", value1, value2, "chjshj");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 25 17:08:31 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_sku_attr_value
     *
     * @mbggenerated Thu Jan 25 17:08:31 CST 2018
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