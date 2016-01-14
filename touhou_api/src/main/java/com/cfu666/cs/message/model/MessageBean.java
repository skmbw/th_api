package com.cfu666.cs.message.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 message
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 message
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 message
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 message
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 message
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public MessageBean() {
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
     * 该类对应数据库表 message
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

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverIsNull() {
            orCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria orReceiverIsNotNull() {
            orCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria orReceiverEqualTo(String value) {
            orCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverNotEqualTo(String value) {
            orCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverGreaterThan(String value) {
            orCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverGreaterThanOrEqualTo(String value) {
            orCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverLessThan(String value) {
            orCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverLessThanOrEqualTo(String value) {
            orCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverLike(String value) {
            orCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverNotLike(String value) {
            orCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverIn(List<String> values) {
            orCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverNotIn(List<String> values) {
            orCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverBetween(String value1, String value2) {
            orCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria orReceiverNotBetween(String value1, String value2) {
            orCriterion("receiver not between", value1, value2, "receiver");
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
    }

    /**
     * 该类对应数据库表 message
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
     * 该类对应数据库表 message
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