package com.alpha.mall.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallValueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public TMallValueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
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
     * This method corresponds to the database table t_mall_value
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
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
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
     * This class corresponds to the database table t_mall_value
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

        public Criteria andShxzhIsNull() {
            addCriterion("shxzh is null");
            return (Criteria) this;
        }

        public Criteria andShxzhIsNotNull() {
            addCriterion("shxzh is not null");
            return (Criteria) this;
        }

        public Criteria andShxzhEqualTo(String value) {
            addCriterion("shxzh =", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotEqualTo(String value) {
            addCriterion("shxzh <>", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhGreaterThan(String value) {
            addCriterion("shxzh >", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhGreaterThanOrEqualTo(String value) {
            addCriterion("shxzh >=", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhLessThan(String value) {
            addCriterion("shxzh <", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhLessThanOrEqualTo(String value) {
            addCriterion("shxzh <=", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhLike(String value) {
            addCriterion("shxzh like", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotLike(String value) {
            addCriterion("shxzh not like", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhIn(List<String> values) {
            addCriterion("shxzh in", values, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotIn(List<String> values) {
            addCriterion("shxzh not in", values, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhBetween(String value1, String value2) {
            addCriterion("shxzh between", value1, value2, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotBetween(String value1, String value2) {
            addCriterion("shxzh not between", value1, value2, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShfqyIsNull() {
            addCriterion("shfqy is null");
            return (Criteria) this;
        }

        public Criteria andShfqyIsNotNull() {
            addCriterion("shfqy is not null");
            return (Criteria) this;
        }

        public Criteria andShfqyEqualTo(String value) {
            addCriterion("shfqy =", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotEqualTo(String value) {
            addCriterion("shfqy <>", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyGreaterThan(String value) {
            addCriterion("shfqy >", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyGreaterThanOrEqualTo(String value) {
            addCriterion("shfqy >=", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLessThan(String value) {
            addCriterion("shfqy <", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLessThanOrEqualTo(String value) {
            addCriterion("shfqy <=", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLike(String value) {
            addCriterion("shfqy like", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotLike(String value) {
            addCriterion("shfqy not like", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyIn(List<String> values) {
            addCriterion("shfqy in", values, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotIn(List<String> values) {
            addCriterion("shfqy not in", values, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyBetween(String value1, String value2) {
            addCriterion("shfqy between", value1, value2, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotBetween(String value1, String value2) {
            addCriterion("shfqy not between", value1, value2, "shfqy");
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

        public Criteria andShxzhNameIsNull() {
            addCriterion("shxzh_name is null");
            return (Criteria) this;
        }

        public Criteria andShxzhNameIsNotNull() {
            addCriterion("shxzh_name is not null");
            return (Criteria) this;
        }

        public Criteria andShxzhNameEqualTo(String value) {
            addCriterion("shxzh_name =", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameNotEqualTo(String value) {
            addCriterion("shxzh_name <>", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameGreaterThan(String value) {
            addCriterion("shxzh_name >", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameGreaterThanOrEqualTo(String value) {
            addCriterion("shxzh_name >=", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameLessThan(String value) {
            addCriterion("shxzh_name <", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameLessThanOrEqualTo(String value) {
            addCriterion("shxzh_name <=", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameLike(String value) {
            addCriterion("shxzh_name like", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameNotLike(String value) {
            addCriterion("shxzh_name not like", value, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameIn(List<String> values) {
            addCriterion("shxzh_name in", values, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameNotIn(List<String> values) {
            addCriterion("shxzh_name not in", values, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameBetween(String value1, String value2) {
            addCriterion("shxzh_name between", value1, value2, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andShxzhNameNotBetween(String value1, String value2) {
            addCriterion("shxzh_name not between", value1, value2, "shxzhName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_value
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
     * This class corresponds to the database table t_mall_value
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