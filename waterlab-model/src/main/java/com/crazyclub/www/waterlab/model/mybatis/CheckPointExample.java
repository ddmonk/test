package com.crazyclub.www.waterlab.model.mybatis;

import java.util.ArrayList;
import java.util.List;

public class CheckPointExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public CheckPointExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
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
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
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

        public Criteria andCheckpointIdIsNull() {
            addCriterion("checkpoint_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIsNotNull() {
            addCriterion("checkpoint_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdEqualTo(String value) {
            addCriterion("checkpoint_id =", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotEqualTo(String value) {
            addCriterion("checkpoint_id <>", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdGreaterThan(String value) {
            addCriterion("checkpoint_id >", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdGreaterThanOrEqualTo(String value) {
            addCriterion("checkpoint_id >=", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLessThan(String value) {
            addCriterion("checkpoint_id <", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLessThanOrEqualTo(String value) {
            addCriterion("checkpoint_id <=", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLike(String value) {
            addCriterion("checkpoint_id like", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotLike(String value) {
            addCriterion("checkpoint_id not like", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIn(List<String> values) {
            addCriterion("checkpoint_id in", values, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotIn(List<String> values) {
            addCriterion("checkpoint_id not in", values, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdBetween(String value1, String value2) {
            addCriterion("checkpoint_id between", value1, value2, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotBetween(String value1, String value2) {
            addCriterion("checkpoint_id not between", value1, value2, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameIsNull() {
            addCriterion("checkpoint_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameIsNotNull() {
            addCriterion("checkpoint_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameEqualTo(String value) {
            addCriterion("checkpoint_name =", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameNotEqualTo(String value) {
            addCriterion("checkpoint_name <>", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameGreaterThan(String value) {
            addCriterion("checkpoint_name >", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameGreaterThanOrEqualTo(String value) {
            addCriterion("checkpoint_name >=", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameLessThan(String value) {
            addCriterion("checkpoint_name <", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameLessThanOrEqualTo(String value) {
            addCriterion("checkpoint_name <=", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameLike(String value) {
            addCriterion("checkpoint_name like", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameNotLike(String value) {
            addCriterion("checkpoint_name not like", value, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameIn(List<String> values) {
            addCriterion("checkpoint_name in", values, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameNotIn(List<String> values) {
            addCriterion("checkpoint_name not in", values, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameBetween(String value1, String value2) {
            addCriterion("checkpoint_name between", value1, value2, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameNotBetween(String value1, String value2) {
            addCriterion("checkpoint_name not between", value1, value2, "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelIsNull() {
            addCriterion("checkpoint_label is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelIsNotNull() {
            addCriterion("checkpoint_label is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelEqualTo(String value) {
            addCriterion("checkpoint_label =", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelNotEqualTo(String value) {
            addCriterion("checkpoint_label <>", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelGreaterThan(String value) {
            addCriterion("checkpoint_label >", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelGreaterThanOrEqualTo(String value) {
            addCriterion("checkpoint_label >=", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelLessThan(String value) {
            addCriterion("checkpoint_label <", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelLessThanOrEqualTo(String value) {
            addCriterion("checkpoint_label <=", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelLike(String value) {
            addCriterion("checkpoint_label like", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelNotLike(String value) {
            addCriterion("checkpoint_label not like", value, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelIn(List<String> values) {
            addCriterion("checkpoint_label in", values, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelNotIn(List<String> values) {
            addCriterion("checkpoint_label not in", values, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelBetween(String value1, String value2) {
            addCriterion("checkpoint_label between", value1, value2, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelNotBetween(String value1, String value2) {
            addCriterion("checkpoint_label not between", value1, value2, "checkpointLabel");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeIsNull() {
            addCriterion("checkpoint_longitude is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeIsNotNull() {
            addCriterion("checkpoint_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeEqualTo(Double value) {
            addCriterion("checkpoint_longitude =", value, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeNotEqualTo(Double value) {
            addCriterion("checkpoint_longitude <>", value, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeGreaterThan(Double value) {
            addCriterion("checkpoint_longitude >", value, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("checkpoint_longitude >=", value, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeLessThan(Double value) {
            addCriterion("checkpoint_longitude <", value, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("checkpoint_longitude <=", value, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeIn(List<Double> values) {
            addCriterion("checkpoint_longitude in", values, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeNotIn(List<Double> values) {
            addCriterion("checkpoint_longitude not in", values, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeBetween(Double value1, Double value2) {
            addCriterion("checkpoint_longitude between", value1, value2, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("checkpoint_longitude not between", value1, value2, "checkpointLongitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdIsNull() {
            addCriterion("checkpoint_water_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdIsNotNull() {
            addCriterion("checkpoint_water_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdEqualTo(Integer value) {
            addCriterion("checkpoint_water_id =", value, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdNotEqualTo(Integer value) {
            addCriterion("checkpoint_water_id <>", value, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdGreaterThan(Integer value) {
            addCriterion("checkpoint_water_id >", value, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkpoint_water_id >=", value, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdLessThan(Integer value) {
            addCriterion("checkpoint_water_id <", value, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("checkpoint_water_id <=", value, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdIn(List<Integer> values) {
            addCriterion("checkpoint_water_id in", values, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdNotIn(List<Integer> values) {
            addCriterion("checkpoint_water_id not in", values, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdBetween(Integer value1, Integer value2) {
            addCriterion("checkpoint_water_id between", value1, value2, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointWaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("checkpoint_water_id not between", value1, value2, "checkpointWaterId");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeIsNull() {
            addCriterion("checkpoint_latitude is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeIsNotNull() {
            addCriterion("checkpoint_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeEqualTo(Double value) {
            addCriterion("checkpoint_latitude =", value, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeNotEqualTo(Double value) {
            addCriterion("checkpoint_latitude <>", value, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeGreaterThan(Double value) {
            addCriterion("checkpoint_latitude >", value, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("checkpoint_latitude >=", value, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeLessThan(Double value) {
            addCriterion("checkpoint_latitude <", value, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("checkpoint_latitude <=", value, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeIn(List<Double> values) {
            addCriterion("checkpoint_latitude in", values, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeNotIn(List<Double> values) {
            addCriterion("checkpoint_latitude not in", values, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeBetween(Double value1, Double value2) {
            addCriterion("checkpoint_latitude between", value1, value2, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("checkpoint_latitude not between", value1, value2, "checkpointLatitude");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLikeInsensitive(String value) {
            addCriterion("upper(checkpoint_id) like", value.toUpperCase(), "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointNameLikeInsensitive(String value) {
            addCriterion("upper(checkpoint_name) like", value.toUpperCase(), "checkpointName");
            return (Criteria) this;
        }

        public Criteria andCheckpointLabelLikeInsensitive(String value) {
            addCriterion("upper(checkpoint_label) like", value.toUpperCase(), "checkpointLabel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated do_not_delete_during_merge Tue Nov 27 18:07:00 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wl_base_checkpoint
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
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