package com.wisdontech.wisdondemo.model;

import java.util.ArrayList;
import java.util.List;

public class SysMeterDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMeterDefExample() {
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

        public Criteria andInnerIdIsNull() {
            addCriterion("INNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNotNull() {
            addCriterion("INNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInnerIdEqualTo(Integer value) {
            addCriterion("INNER_ID =", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotEqualTo(Integer value) {
            addCriterion("INNER_ID <>", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThan(Integer value) {
            addCriterion("INNER_ID >", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("INNER_ID >=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThan(Integer value) {
            addCriterion("INNER_ID <", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("INNER_ID <=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdIn(List<Integer> values) {
            addCriterion("INNER_ID in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotIn(List<Integer> values) {
            addCriterion("INNER_ID not in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdBetween(Integer value1, Integer value2) {
            addCriterion("INNER_ID between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("INNER_ID not between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Long value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Long value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Long value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Long value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Long value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Long> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Long> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Long value1, Long value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Long value1, Long value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andMeterTypeIsNull() {
            addCriterion("METER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMeterTypeIsNotNull() {
            addCriterion("METER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMeterTypeEqualTo(String value) {
            addCriterion("METER_TYPE =", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotEqualTo(String value) {
            addCriterion("METER_TYPE <>", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeGreaterThan(String value) {
            addCriterion("METER_TYPE >", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("METER_TYPE >=", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeLessThan(String value) {
            addCriterion("METER_TYPE <", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeLessThanOrEqualTo(String value) {
            addCriterion("METER_TYPE <=", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeLike(String value) {
            addCriterion("METER_TYPE like", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotLike(String value) {
            addCriterion("METER_TYPE not like", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeIn(List<String> values) {
            addCriterion("METER_TYPE in", values, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotIn(List<String> values) {
            addCriterion("METER_TYPE not in", values, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeBetween(String value1, String value2) {
            addCriterion("METER_TYPE between", value1, value2, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotBetween(String value1, String value2) {
            addCriterion("METER_TYPE not between", value1, value2, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterBandIsNull() {
            addCriterion("METER_BAND is null");
            return (Criteria) this;
        }

        public Criteria andMeterBandIsNotNull() {
            addCriterion("METER_BAND is not null");
            return (Criteria) this;
        }

        public Criteria andMeterBandEqualTo(String value) {
            addCriterion("METER_BAND =", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandNotEqualTo(String value) {
            addCriterion("METER_BAND <>", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandGreaterThan(String value) {
            addCriterion("METER_BAND >", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandGreaterThanOrEqualTo(String value) {
            addCriterion("METER_BAND >=", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandLessThan(String value) {
            addCriterion("METER_BAND <", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandLessThanOrEqualTo(String value) {
            addCriterion("METER_BAND <=", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandLike(String value) {
            addCriterion("METER_BAND like", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandNotLike(String value) {
            addCriterion("METER_BAND not like", value, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandIn(List<String> values) {
            addCriterion("METER_BAND in", values, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandNotIn(List<String> values) {
            addCriterion("METER_BAND not in", values, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandBetween(String value1, String value2) {
            addCriterion("METER_BAND between", value1, value2, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterBandNotBetween(String value1, String value2) {
            addCriterion("METER_BAND not between", value1, value2, "meterBand");
            return (Criteria) this;
        }

        public Criteria andMeterFlagIsNull() {
            addCriterion("METER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMeterFlagIsNotNull() {
            addCriterion("METER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMeterFlagEqualTo(Short value) {
            addCriterion("METER_FLAG =", value, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagNotEqualTo(Short value) {
            addCriterion("METER_FLAG <>", value, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagGreaterThan(Short value) {
            addCriterion("METER_FLAG >", value, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("METER_FLAG >=", value, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagLessThan(Short value) {
            addCriterion("METER_FLAG <", value, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagLessThanOrEqualTo(Short value) {
            addCriterion("METER_FLAG <=", value, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagIn(List<Short> values) {
            addCriterion("METER_FLAG in", values, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagNotIn(List<Short> values) {
            addCriterion("METER_FLAG not in", values, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagBetween(Short value1, Short value2) {
            addCriterion("METER_FLAG between", value1, value2, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andMeterFlagNotBetween(Short value1, Short value2) {
            addCriterion("METER_FLAG not between", value1, value2, "meterFlag");
            return (Criteria) this;
        }

        public Criteria andScreenCountIsNull() {
            addCriterion("SCREEN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andScreenCountIsNotNull() {
            addCriterion("SCREEN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andScreenCountEqualTo(Integer value) {
            addCriterion("SCREEN_COUNT =", value, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountNotEqualTo(Integer value) {
            addCriterion("SCREEN_COUNT <>", value, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountGreaterThan(Integer value) {
            addCriterion("SCREEN_COUNT >", value, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCREEN_COUNT >=", value, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountLessThan(Integer value) {
            addCriterion("SCREEN_COUNT <", value, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountLessThanOrEqualTo(Integer value) {
            addCriterion("SCREEN_COUNT <=", value, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountIn(List<Integer> values) {
            addCriterion("SCREEN_COUNT in", values, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountNotIn(List<Integer> values) {
            addCriterion("SCREEN_COUNT not in", values, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountBetween(Integer value1, Integer value2) {
            addCriterion("SCREEN_COUNT between", value1, value2, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SCREEN_COUNT not between", value1, value2, "screenCount");
            return (Criteria) this;
        }

        public Criteria andScreenGapIsNull() {
            addCriterion("SCREEN_GAP is null");
            return (Criteria) this;
        }

        public Criteria andScreenGapIsNotNull() {
            addCriterion("SCREEN_GAP is not null");
            return (Criteria) this;
        }

        public Criteria andScreenGapEqualTo(Integer value) {
            addCriterion("SCREEN_GAP =", value, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapNotEqualTo(Integer value) {
            addCriterion("SCREEN_GAP <>", value, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapGreaterThan(Integer value) {
            addCriterion("SCREEN_GAP >", value, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCREEN_GAP >=", value, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapLessThan(Integer value) {
            addCriterion("SCREEN_GAP <", value, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapLessThanOrEqualTo(Integer value) {
            addCriterion("SCREEN_GAP <=", value, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapIn(List<Integer> values) {
            addCriterion("SCREEN_GAP in", values, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapNotIn(List<Integer> values) {
            addCriterion("SCREEN_GAP not in", values, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapBetween(Integer value1, Integer value2) {
            addCriterion("SCREEN_GAP between", value1, value2, "screenGap");
            return (Criteria) this;
        }

        public Criteria andScreenGapNotBetween(Integer value1, Integer value2) {
            addCriterion("SCREEN_GAP not between", value1, value2, "screenGap");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(Long value) {
            addCriterion("MAX_VALUE =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(Long value) {
            addCriterion("MAX_VALUE <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(Long value) {
            addCriterion("MAX_VALUE >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_VALUE >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(Long value) {
            addCriterion("MAX_VALUE <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(Long value) {
            addCriterion("MAX_VALUE <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<Long> values) {
            addCriterion("MAX_VALUE in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<Long> values) {
            addCriterion("MAX_VALUE not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(Long value1, Long value2) {
            addCriterion("MAX_VALUE between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(Long value1, Long value2) {
            addCriterion("MAX_VALUE not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMeasureIdIsNull() {
            addCriterion("MEASURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeasureIdIsNotNull() {
            addCriterion("MEASURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureIdEqualTo(Integer value) {
            addCriterion("MEASURE_ID =", value, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdNotEqualTo(Integer value) {
            addCriterion("MEASURE_ID <>", value, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdGreaterThan(Integer value) {
            addCriterion("MEASURE_ID >", value, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEASURE_ID >=", value, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdLessThan(Integer value) {
            addCriterion("MEASURE_ID <", value, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEASURE_ID <=", value, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdIn(List<Integer> values) {
            addCriterion("MEASURE_ID in", values, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdNotIn(List<Integer> values) {
            addCriterion("MEASURE_ID not in", values, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdBetween(Integer value1, Integer value2) {
            addCriterion("MEASURE_ID between", value1, value2, "measureId");
            return (Criteria) this;
        }

        public Criteria andMeasureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEASURE_ID not between", value1, value2, "measureId");
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