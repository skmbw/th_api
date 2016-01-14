package com.cfu666.cs.message.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageLogBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 message_log
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 message_log
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 message_log
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 message_log
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 message_log
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public MessageLogBean() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置是否指定 distinct 去除重复
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否设置了distinct语句，true是，false否。
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得逻辑or语句
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 添加逻辑or语句
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 添加逻辑and语句
     */
    public void and(Criteria criteria) {
        criteria.setAndRelation(true);
        oredCriteria.add(criteria);
    }

    /**
     * 新建逻辑或or语句
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 新建逻辑and语句
     */
    public Criteria and() {
        Criteria criteria = createCriteriaInternal();
        criteria.setAndRelation(true);
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建查询条件，如果逻辑或为空，同时将查询条件放入。
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 创建新查询条件。
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除逻辑或or语句，并且distinct为false，不去重。
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * 该类对应数据库表 message_log
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

        protected void orCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition, true));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void orCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, true));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void orCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, true));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdIsNull() {
            orCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria orIdIsNotNull() {
            orCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria orIdEqualTo(String value) {
            orCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotEqualTo(String value) {
            orCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThan(String value) {
            orCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThanOrEqualTo(String value) {
            orCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLessThan(String value) {
            orCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLessThanOrEqualTo(String value) {
            orCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLike(String value) {
            orCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotLike(String value) {
            orCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria orIdIn(List<String> values) {
            orCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotIn(List<String> values) {
            orCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria orIdBetween(String value1, String value2) {
            orCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotBetween(String value1, String value2) {
            orCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageIsNull() {
            orCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria orMessageIsNotNull() {
            orCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria orMessageEqualTo(String value) {
            orCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageNotEqualTo(String value) {
            orCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageGreaterThan(String value) {
            orCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageGreaterThanOrEqualTo(String value) {
            orCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageLessThan(String value) {
            orCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageLessThanOrEqualTo(String value) {
            orCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageLike(String value) {
            orCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria orMessageNotLike(String value) {
            orCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria orMessageIn(List<String> values) {
            orCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria orMessageNotIn(List<String> values) {
            orCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria orMessageBetween(String value1, String value2) {
            orCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria orMessageNotBetween(String value1, String value2) {
            orCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderIsNull() {
            orCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria orSenderIsNotNull() {
            orCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria orSenderEqualTo(String value) {
            orCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderNotEqualTo(String value) {
            orCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderGreaterThan(String value) {
            orCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderGreaterThanOrEqualTo(String value) {
            orCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderLessThan(String value) {
            orCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderLessThanOrEqualTo(String value) {
            orCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderLike(String value) {
            orCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderNotLike(String value) {
            orCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderIn(List<String> values) {
            orCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderNotIn(List<String> values) {
            orCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderBetween(String value1, String value2) {
            orCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria orSenderNotBetween(String value1, String value2) {
            orCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdIsNull() {
            orCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdIsNotNull() {
            orCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdEqualTo(String value) {
            orCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotEqualTo(String value) {
            orCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdGreaterThan(String value) {
            orCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdGreaterThanOrEqualTo(String value) {
            orCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdLessThan(String value) {
            orCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdLessThanOrEqualTo(String value) {
            orCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdLike(String value) {
            orCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotLike(String value) {
            orCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdIn(List<String> values) {
            orCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotIn(List<String> values) {
            orCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdBetween(String value1, String value2) {
            orCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotBetween(String value1, String value2) {
            orCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateIsNull() {
            orCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria orStateIsNotNull() {
            orCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria orStateEqualTo(Integer value) {
            orCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotEqualTo(Integer value) {
            orCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThan(Integer value) {
            orCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThanOrEqualTo(Integer value) {
            orCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThan(Integer value) {
            orCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThanOrEqualTo(Integer value) {
            orCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateIn(List<Integer> values) {
            orCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotIn(List<Integer> values) {
            orCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateBetween(Integer value1, Integer value2) {
            orCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotBetween(Integer value1, Integer value2) {
            orCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeIsNull() {
            orCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria orTypeIsNotNull() {
            orCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria orTypeEqualTo(Integer value) {
            orCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotEqualTo(Integer value) {
            orCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeGreaterThan(Integer value) {
            orCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeGreaterThanOrEqualTo(Integer value) {
            orCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeLessThan(Integer value) {
            orCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeLessThanOrEqualTo(Integer value) {
            orCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria orTypeIn(List<Integer> values) {
            orCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotIn(List<Integer> values) {
            orCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria orTypeBetween(Integer value1, Integer value2) {
            orCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotBetween(Integer value1, Integer value2) {
            orCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceIsNull() {
            orCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria orSourceIsNotNull() {
            orCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria orSourceEqualTo(String value) {
            orCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotEqualTo(String value) {
            orCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceGreaterThan(String value) {
            orCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceGreaterThanOrEqualTo(String value) {
            orCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceLessThan(String value) {
            orCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceLessThanOrEqualTo(String value) {
            orCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceLike(String value) {
            orCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotLike(String value) {
            orCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria orSourceIn(List<String> values) {
            orCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotIn(List<String> values) {
            orCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria orSourceBetween(String value1, String value2) {
            orCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotBetween(String value1, String value2) {
            orCriterion("source not between", value1, value2, "source");
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

        public Criteria orCreateTimeIsNull() {
            orCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria orCreateTimeIsNotNull() {
            orCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria orCreateTimeEqualTo(Date value) {
            orCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotEqualTo(Date value) {
            orCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeGreaterThan(Date value) {
            orCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeLessThan(Date value) {
            orCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeLessThanOrEqualTo(Date value) {
            orCriterion("create_time <=", value, "createTime");
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

        public Criteria orCreateTimeIn(List<Date> values) {
            orCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotIn(List<Date> values) {
            orCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeBetween(Date value1, Date value2) {
            orCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotBetween(Date value1, Date value2) {
            orCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeIsNull() {
            orCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria orSendTimeIsNotNull() {
            orCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria orSendTimeEqualTo(Date value) {
            orCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeNotEqualTo(Date value) {
            orCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeGreaterThan(Date value) {
            orCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeLessThan(Date value) {
            orCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeLessThanOrEqualTo(Date value) {
            orCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeIn(List<Date> values) {
            orCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeNotIn(List<Date> values) {
            orCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeBetween(Date value1, Date value2) {
            orCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria orSendTimeNotBetween(Date value1, Date value2) {
            orCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdIsNull() {
            orCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria orOrgIdIsNotNull() {
            orCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria orOrgIdEqualTo(String value) {
            orCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotEqualTo(String value) {
            orCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdGreaterThan(String value) {
            orCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdGreaterThanOrEqualTo(String value) {
            orCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdLessThan(String value) {
            orCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdLessThanOrEqualTo(String value) {
            orCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdLike(String value) {
            orCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotLike(String value) {
            orCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdIn(List<String> values) {
            orCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotIn(List<String> values) {
            orCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdBetween(String value1, String value2) {
            orCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotBetween(String value1, String value2) {
            orCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andSkipTypeIsNull() {
            addCriterion("skip_type is null");
            return (Criteria) this;
        }

        public Criteria andSkipTypeIsNotNull() {
            addCriterion("skip_type is not null");
            return (Criteria) this;
        }

        public Criteria andSkipTypeEqualTo(Integer value) {
            addCriterion("skip_type =", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotEqualTo(Integer value) {
            addCriterion("skip_type <>", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeGreaterThan(Integer value) {
            addCriterion("skip_type >", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("skip_type >=", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeLessThan(Integer value) {
            addCriterion("skip_type <", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("skip_type <=", value, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeIsNull() {
            orCriterion("skip_type is null");
            return (Criteria) this;
        }

        public Criteria orSkipTypeIsNotNull() {
            orCriterion("skip_type is not null");
            return (Criteria) this;
        }

        public Criteria orSkipTypeEqualTo(Integer value) {
            orCriterion("skip_type =", value, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeNotEqualTo(Integer value) {
            orCriterion("skip_type <>", value, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeGreaterThan(Integer value) {
            orCriterion("skip_type >", value, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeGreaterThanOrEqualTo(Integer value) {
            orCriterion("skip_type >=", value, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeLessThan(Integer value) {
            orCriterion("skip_type <", value, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeLessThanOrEqualTo(Integer value) {
            orCriterion("skip_type <=", value, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeIn(List<Integer> values) {
            addCriterion("skip_type in", values, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotIn(List<Integer> values) {
            addCriterion("skip_type not in", values, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeBetween(Integer value1, Integer value2) {
            addCriterion("skip_type between", value1, value2, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("skip_type not between", value1, value2, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeIn(List<Integer> values) {
            orCriterion("skip_type in", values, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeNotIn(List<Integer> values) {
            orCriterion("skip_type not in", values, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeBetween(Integer value1, Integer value2) {
            orCriterion("skip_type between", value1, value2, "skipType");
            return (Criteria) this;
        }

        public Criteria orSkipTypeNotBetween(Integer value1, Integer value2) {
            orCriterion("skip_type not between", value1, value2, "skipType");
            return (Criteria) this;
        }

        public Criteria andSkipKeyIsNull() {
            addCriterion("skip_key is null");
            return (Criteria) this;
        }

        public Criteria andSkipKeyIsNotNull() {
            addCriterion("skip_key is not null");
            return (Criteria) this;
        }

        public Criteria andSkipKeyEqualTo(String value) {
            addCriterion("skip_key =", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyNotEqualTo(String value) {
            addCriterion("skip_key <>", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyGreaterThan(String value) {
            addCriterion("skip_key >", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyGreaterThanOrEqualTo(String value) {
            addCriterion("skip_key >=", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyLessThan(String value) {
            addCriterion("skip_key <", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyLessThanOrEqualTo(String value) {
            addCriterion("skip_key <=", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyIsNull() {
            orCriterion("skip_key is null");
            return (Criteria) this;
        }

        public Criteria orSkipKeyIsNotNull() {
            orCriterion("skip_key is not null");
            return (Criteria) this;
        }

        public Criteria orSkipKeyEqualTo(String value) {
            orCriterion("skip_key =", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyNotEqualTo(String value) {
            orCriterion("skip_key <>", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyGreaterThan(String value) {
            orCriterion("skip_key >", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyGreaterThanOrEqualTo(String value) {
            orCriterion("skip_key >=", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyLessThan(String value) {
            orCriterion("skip_key <", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyLessThanOrEqualTo(String value) {
            orCriterion("skip_key <=", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyLike(String value) {
            addCriterion("skip_key like", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyNotLike(String value) {
            addCriterion("skip_key not like", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyLike(String value) {
            orCriterion("skip_key like", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyNotLike(String value) {
            orCriterion("skip_key not like", value, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyIn(List<String> values) {
            addCriterion("skip_key in", values, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyNotIn(List<String> values) {
            addCriterion("skip_key not in", values, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyBetween(String value1, String value2) {
            addCriterion("skip_key between", value1, value2, "skipKey");
            return (Criteria) this;
        }

        public Criteria andSkipKeyNotBetween(String value1, String value2) {
            addCriterion("skip_key not between", value1, value2, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyIn(List<String> values) {
            orCriterion("skip_key in", values, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyNotIn(List<String> values) {
            orCriterion("skip_key not in", values, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyBetween(String value1, String value2) {
            orCriterion("skip_key between", value1, value2, "skipKey");
            return (Criteria) this;
        }

        public Criteria orSkipKeyNotBetween(String value1, String value2) {
            orCriterion("skip_key not between", value1, value2, "skipKey");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeIsNull() {
            orCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeIsNotNull() {
            orCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeEqualTo(Integer value) {
            orCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeNotEqualTo(Integer value) {
            orCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeGreaterThan(Integer value) {
            orCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeGreaterThanOrEqualTo(Integer value) {
            orCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeLessThan(Integer value) {
            orCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeLessThanOrEqualTo(Integer value) {
            orCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeIn(List<Integer> values) {
            orCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeNotIn(List<Integer> values) {
            orCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeBetween(Integer value1, Integer value2) {
            orCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria orBusinessTypeNotBetween(Integer value1, Integer value2) {
            orCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdIsNull() {
            orCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria orCustomerIdIsNotNull() {
            orCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria orCustomerIdEqualTo(String value) {
            orCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdNotEqualTo(String value) {
            orCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdGreaterThan(String value) {
            orCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdGreaterThanOrEqualTo(String value) {
            orCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdLessThan(String value) {
            orCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdLessThanOrEqualTo(String value) {
            orCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdLike(String value) {
            orCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdNotLike(String value) {
            orCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdIn(List<String> values) {
            orCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdNotIn(List<String> values) {
            orCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdBetween(String value1, String value2) {
            orCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria orCustomerIdNotBetween(String value1, String value2) {
            orCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 message_log
     */
    public static class Criteria extends GeneratedCriteria {
        protected boolean andRelation;

        public boolean isAndRelation() {
            return andRelation;
        }

        protected Criteria() {
            super();
        }

        public void setAndRelation(boolean andRelation) {
            this.andRelation = andRelation;
        }
    }

    /**
     * 该类对应数据库表 message_log
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean orValue;

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

        public boolean isOrValue() {
            return orValue;
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

        protected Criterion(String condition, boolean orValue) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.orValue = true;
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

        protected Criterion(String condition, Object value, boolean orValue) {
            this(condition, value, null);
            this.orValue = true;
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

        protected Criterion(String condition, Object value, Object secondValue, boolean orValue) {
            this(condition, value, secondValue, null);
            this.orValue = true;
        }
    }
}