package com.cfu666.cs.appointment.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 appointment
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 appointment
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 appointment
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 appointment
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 appointment
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public AppointmentBean() {
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
     * 该类对应数据库表 appointment
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

        public Criteria andInvestorIdIsNull() {
            addCriterion("investor_id is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIsNotNull() {
            addCriterion("investor_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorIdEqualTo(String value) {
            addCriterion("investor_id =", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotEqualTo(String value) {
            addCriterion("investor_id <>", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdGreaterThan(String value) {
            addCriterion("investor_id >", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdGreaterThanOrEqualTo(String value) {
            addCriterion("investor_id >=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLessThan(String value) {
            addCriterion("investor_id <", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLessThanOrEqualTo(String value) {
            addCriterion("investor_id <=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdIsNull() {
            orCriterion("investor_id is null");
            return (Criteria) this;
        }

        public Criteria orInvestorIdIsNotNull() {
            orCriterion("investor_id is not null");
            return (Criteria) this;
        }

        public Criteria orInvestorIdEqualTo(String value) {
            orCriterion("investor_id =", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotEqualTo(String value) {
            orCriterion("investor_id <>", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdGreaterThan(String value) {
            orCriterion("investor_id >", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdGreaterThanOrEqualTo(String value) {
            orCriterion("investor_id >=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdLessThan(String value) {
            orCriterion("investor_id <", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdLessThanOrEqualTo(String value) {
            orCriterion("investor_id <=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLike(String value) {
            addCriterion("investor_id like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotLike(String value) {
            addCriterion("investor_id not like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdLike(String value) {
            orCriterion("investor_id like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotLike(String value) {
            orCriterion("investor_id not like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIn(List<String> values) {
            addCriterion("investor_id in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotIn(List<String> values) {
            addCriterion("investor_id not in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdBetween(String value1, String value2) {
            addCriterion("investor_id between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotBetween(String value1, String value2) {
            addCriterion("investor_id not between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdIn(List<String> values) {
            orCriterion("investor_id in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotIn(List<String> values) {
            orCriterion("investor_id not in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdBetween(String value1, String value2) {
            orCriterion("investor_id between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotBetween(String value1, String value2) {
            orCriterion("investor_id not between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdIsNull() {
            orCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria orProductIdIsNotNull() {
            orCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria orProductIdEqualTo(String value) {
            orCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotEqualTo(String value) {
            orCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdGreaterThan(String value) {
            orCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdGreaterThanOrEqualTo(String value) {
            orCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdLessThan(String value) {
            orCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdLessThanOrEqualTo(String value) {
            orCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdLike(String value) {
            orCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotLike(String value) {
            orCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdIn(List<String> values) {
            orCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotIn(List<String> values) {
            orCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdBetween(String value1, String value2) {
            orCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotBetween(String value1, String value2) {
            orCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria orProductNameIsNull() {
            orCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria orProductNameIsNotNull() {
            orCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria orProductNameEqualTo(String value) {
            orCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotEqualTo(String value) {
            orCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameGreaterThan(String value) {
            orCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameGreaterThanOrEqualTo(String value) {
            orCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameLessThan(String value) {
            orCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameLessThanOrEqualTo(String value) {
            orCriterion("product_name <=", value, "productName");
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

        public Criteria orProductNameLike(String value) {
            orCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotLike(String value) {
            orCriterion("product_name not like", value, "productName");
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

        public Criteria orProductNameIn(List<String> values) {
            orCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotIn(List<String> values) {
            orCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameBetween(String value1, String value2) {
            orCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotBetween(String value1, String value2) {
            orCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameIsNull() {
            addCriterion("product_brief_name is null");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameIsNotNull() {
            addCriterion("product_brief_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameEqualTo(String value) {
            addCriterion("product_brief_name =", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotEqualTo(String value) {
            addCriterion("product_brief_name <>", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameGreaterThan(String value) {
            addCriterion("product_brief_name >", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_brief_name >=", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameLessThan(String value) {
            addCriterion("product_brief_name <", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameLessThanOrEqualTo(String value) {
            addCriterion("product_brief_name <=", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameIsNull() {
            orCriterion("product_brief_name is null");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameIsNotNull() {
            orCriterion("product_brief_name is not null");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameEqualTo(String value) {
            orCriterion("product_brief_name =", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameNotEqualTo(String value) {
            orCriterion("product_brief_name <>", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameGreaterThan(String value) {
            orCriterion("product_brief_name >", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameGreaterThanOrEqualTo(String value) {
            orCriterion("product_brief_name >=", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameLessThan(String value) {
            orCriterion("product_brief_name <", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameLessThanOrEqualTo(String value) {
            orCriterion("product_brief_name <=", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameLike(String value) {
            addCriterion("product_brief_name like", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotLike(String value) {
            addCriterion("product_brief_name not like", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameLike(String value) {
            orCriterion("product_brief_name like", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameNotLike(String value) {
            orCriterion("product_brief_name not like", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameIn(List<String> values) {
            addCriterion("product_brief_name in", values, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotIn(List<String> values) {
            addCriterion("product_brief_name not in", values, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameBetween(String value1, String value2) {
            addCriterion("product_brief_name between", value1, value2, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotBetween(String value1, String value2) {
            addCriterion("product_brief_name not between", value1, value2, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameIn(List<String> values) {
            orCriterion("product_brief_name in", values, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameNotIn(List<String> values) {
            orCriterion("product_brief_name not in", values, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameBetween(String value1, String value2) {
            orCriterion("product_brief_name between", value1, value2, "productBriefName");
            return (Criteria) this;
        }

        public Criteria orProductBriefNameNotBetween(String value1, String value2) {
            orCriterion("product_brief_name not between", value1, value2, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountIsNull() {
            orCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria orOrderAmountIsNotNull() {
            orCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria orOrderAmountEqualTo(BigDecimal value) {
            orCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountNotEqualTo(BigDecimal value) {
            orCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountGreaterThan(BigDecimal value) {
            orCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            orCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountLessThan(BigDecimal value) {
            orCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountLessThanOrEqualTo(BigDecimal value) {
            orCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountIn(List<BigDecimal> values) {
            orCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountNotIn(List<BigDecimal> values) {
            orCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria orOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("order_amount not between", value1, value2, "orderAmount");
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameIsNull() {
            orCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameIsNotNull() {
            orCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameEqualTo(String value) {
            orCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotEqualTo(String value) {
            orCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameGreaterThan(String value) {
            orCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameGreaterThanOrEqualTo(String value) {
            orCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameLessThan(String value) {
            orCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameLessThanOrEqualTo(String value) {
            orCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameLike(String value) {
            orCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotLike(String value) {
            orCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameIn(List<String> values) {
            orCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotIn(List<String> values) {
            orCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameBetween(String value1, String value2) {
            orCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotBetween(String value1, String value2) {
            orCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNull() {
            addCriterion("appoint_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNotNull() {
            addCriterion("appoint_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeEqualTo(Date value) {
            addCriterion("appoint_time =", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotEqualTo(Date value) {
            addCriterion("appoint_time <>", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThan(Date value) {
            addCriterion("appoint_time >", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appoint_time >=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThan(Date value) {
            addCriterion("appoint_time <", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThanOrEqualTo(Date value) {
            addCriterion("appoint_time <=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeIsNull() {
            orCriterion("appoint_time is null");
            return (Criteria) this;
        }

        public Criteria orAppointTimeIsNotNull() {
            orCriterion("appoint_time is not null");
            return (Criteria) this;
        }

        public Criteria orAppointTimeEqualTo(Date value) {
            orCriterion("appoint_time =", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeNotEqualTo(Date value) {
            orCriterion("appoint_time <>", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeGreaterThan(Date value) {
            orCriterion("appoint_time >", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("appoint_time >=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeLessThan(Date value) {
            orCriterion("appoint_time <", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeLessThanOrEqualTo(Date value) {
            orCriterion("appoint_time <=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIn(List<Date> values) {
            addCriterion("appoint_time in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotIn(List<Date> values) {
            addCriterion("appoint_time not in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeBetween(Date value1, Date value2) {
            addCriterion("appoint_time between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotBetween(Date value1, Date value2) {
            addCriterion("appoint_time not between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeIn(List<Date> values) {
            orCriterion("appoint_time in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeNotIn(List<Date> values) {
            orCriterion("appoint_time not in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeBetween(Date value1, Date value2) {
            orCriterion("appoint_time between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria orAppointTimeNotBetween(Date value1, Date value2) {
            orCriterion("appoint_time not between", value1, value2, "appointTime");
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

        public Criteria andLatestHandleTimeIsNull() {
            addCriterion("latest_handle_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeIsNotNull() {
            addCriterion("latest_handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeEqualTo(Date value) {
            addCriterion("latest_handle_time =", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeNotEqualTo(Date value) {
            addCriterion("latest_handle_time <>", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeGreaterThan(Date value) {
            addCriterion("latest_handle_time >", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("latest_handle_time >=", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeLessThan(Date value) {
            addCriterion("latest_handle_time <", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("latest_handle_time <=", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeIsNull() {
            orCriterion("latest_handle_time is null");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeIsNotNull() {
            orCriterion("latest_handle_time is not null");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeEqualTo(Date value) {
            orCriterion("latest_handle_time =", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeNotEqualTo(Date value) {
            orCriterion("latest_handle_time <>", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeGreaterThan(Date value) {
            orCriterion("latest_handle_time >", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("latest_handle_time >=", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeLessThan(Date value) {
            orCriterion("latest_handle_time <", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeLessThanOrEqualTo(Date value) {
            orCriterion("latest_handle_time <=", value, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeIn(List<Date> values) {
            addCriterion("latest_handle_time in", values, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeNotIn(List<Date> values) {
            addCriterion("latest_handle_time not in", values, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeBetween(Date value1, Date value2) {
            addCriterion("latest_handle_time between", value1, value2, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andLatestHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("latest_handle_time not between", value1, value2, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeIn(List<Date> values) {
            orCriterion("latest_handle_time in", values, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeNotIn(List<Date> values) {
            orCriterion("latest_handle_time not in", values, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeBetween(Date value1, Date value2) {
            orCriterion("latest_handle_time between", value1, value2, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria orLatestHandleTimeNotBetween(Date value1, Date value2) {
            orCriterion("latest_handle_time not between", value1, value2, "latestHandleTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeIsNull() {
            orCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeIsNotNull() {
            orCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeEqualTo(Date value) {
            orCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeNotEqualTo(Date value) {
            orCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeGreaterThan(Date value) {
            orCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeLessThan(Date value) {
            orCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeLessThanOrEqualTo(Date value) {
            orCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeIn(List<Date> values) {
            orCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeNotIn(List<Date> values) {
            orCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeBetween(Date value1, Date value2) {
            orCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria orCompleteTimeNotBetween(Date value1, Date value2) {
            orCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedIsNull() {
            addCriterion("allocated is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedIsNotNull() {
            addCriterion("allocated is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedEqualTo(Boolean value) {
            addCriterion("allocated =", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotEqualTo(Boolean value) {
            addCriterion("allocated <>", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThan(Boolean value) {
            addCriterion("allocated >", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allocated >=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThan(Boolean value) {
            addCriterion("allocated <", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThanOrEqualTo(Boolean value) {
            addCriterion("allocated <=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedIsNull() {
            orCriterion("allocated is null");
            return (Criteria) this;
        }

        public Criteria orAllocatedIsNotNull() {
            orCriterion("allocated is not null");
            return (Criteria) this;
        }

        public Criteria orAllocatedEqualTo(Boolean value) {
            orCriterion("allocated =", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedNotEqualTo(Boolean value) {
            orCriterion("allocated <>", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedGreaterThan(Boolean value) {
            orCriterion("allocated >", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedGreaterThanOrEqualTo(Boolean value) {
            orCriterion("allocated >=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedLessThan(Boolean value) {
            orCriterion("allocated <", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedLessThanOrEqualTo(Boolean value) {
            orCriterion("allocated <=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedIn(List<Boolean> values) {
            addCriterion("allocated in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotIn(List<Boolean> values) {
            addCriterion("allocated not in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedBetween(Boolean value1, Boolean value2) {
            addCriterion("allocated between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allocated not between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedIn(List<Boolean> values) {
            orCriterion("allocated in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedNotIn(List<Boolean> values) {
            orCriterion("allocated not in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedBetween(Boolean value1, Boolean value2) {
            orCriterion("allocated between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedNotBetween(Boolean value1, Boolean value2) {
            orCriterion("allocated not between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andReservedIsNull() {
            addCriterion("reserved is null");
            return (Criteria) this;
        }

        public Criteria andReservedIsNotNull() {
            addCriterion("reserved is not null");
            return (Criteria) this;
        }

        public Criteria andReservedEqualTo(Boolean value) {
            addCriterion("reserved =", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotEqualTo(Boolean value) {
            addCriterion("reserved <>", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedGreaterThan(Boolean value) {
            addCriterion("reserved >", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reserved >=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedLessThan(Boolean value) {
            addCriterion("reserved <", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedLessThanOrEqualTo(Boolean value) {
            addCriterion("reserved <=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedIsNull() {
            orCriterion("reserved is null");
            return (Criteria) this;
        }

        public Criteria orReservedIsNotNull() {
            orCriterion("reserved is not null");
            return (Criteria) this;
        }

        public Criteria orReservedEqualTo(Boolean value) {
            orCriterion("reserved =", value, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedNotEqualTo(Boolean value) {
            orCriterion("reserved <>", value, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedGreaterThan(Boolean value) {
            orCriterion("reserved >", value, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedGreaterThanOrEqualTo(Boolean value) {
            orCriterion("reserved >=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedLessThan(Boolean value) {
            orCriterion("reserved <", value, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedLessThanOrEqualTo(Boolean value) {
            orCriterion("reserved <=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedIn(List<Boolean> values) {
            addCriterion("reserved in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotIn(List<Boolean> values) {
            addCriterion("reserved not in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedBetween(Boolean value1, Boolean value2) {
            addCriterion("reserved between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reserved not between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedIn(List<Boolean> values) {
            orCriterion("reserved in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedNotIn(List<Boolean> values) {
            orCriterion("reserved not in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedBetween(Boolean value1, Boolean value2) {
            orCriterion("reserved between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria orReservedNotBetween(Boolean value1, Boolean value2) {
            orCriterion("reserved not between", value1, value2, "reserved");
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

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionIsNull() {
            orCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria orOpinionIsNotNull() {
            orCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria orOpinionEqualTo(String value) {
            orCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionNotEqualTo(String value) {
            orCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionGreaterThan(String value) {
            orCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionGreaterThanOrEqualTo(String value) {
            orCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionLessThan(String value) {
            orCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionLessThanOrEqualTo(String value) {
            orCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionLike(String value) {
            orCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionNotLike(String value) {
            orCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionIn(List<String> values) {
            orCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionNotIn(List<String> values) {
            orCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionBetween(String value1, String value2) {
            orCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria orOpinionNotBetween(String value1, String value2) {
            orCriterion("opinion not between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andRemindIsNull() {
            addCriterion("remind is null");
            return (Criteria) this;
        }

        public Criteria andRemindIsNotNull() {
            addCriterion("remind is not null");
            return (Criteria) this;
        }

        public Criteria andRemindEqualTo(Byte value) {
            addCriterion("remind =", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotEqualTo(Byte value) {
            addCriterion("remind <>", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindGreaterThan(Byte value) {
            addCriterion("remind >", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindGreaterThanOrEqualTo(Byte value) {
            addCriterion("remind >=", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLessThan(Byte value) {
            addCriterion("remind <", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLessThanOrEqualTo(Byte value) {
            addCriterion("remind <=", value, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindIsNull() {
            orCriterion("remind is null");
            return (Criteria) this;
        }

        public Criteria orRemindIsNotNull() {
            orCriterion("remind is not null");
            return (Criteria) this;
        }

        public Criteria orRemindEqualTo(Byte value) {
            orCriterion("remind =", value, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindNotEqualTo(Byte value) {
            orCriterion("remind <>", value, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindGreaterThan(Byte value) {
            orCriterion("remind >", value, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindGreaterThanOrEqualTo(Byte value) {
            orCriterion("remind >=", value, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindLessThan(Byte value) {
            orCriterion("remind <", value, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindLessThanOrEqualTo(Byte value) {
            orCriterion("remind <=", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindIn(List<Byte> values) {
            addCriterion("remind in", values, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotIn(List<Byte> values) {
            addCriterion("remind not in", values, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindBetween(Byte value1, Byte value2) {
            addCriterion("remind between", value1, value2, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotBetween(Byte value1, Byte value2) {
            addCriterion("remind not between", value1, value2, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindIn(List<Byte> values) {
            orCriterion("remind in", values, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindNotIn(List<Byte> values) {
            orCriterion("remind not in", values, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindBetween(Byte value1, Byte value2) {
            orCriterion("remind between", value1, value2, "remind");
            return (Criteria) this;
        }

        public Criteria orRemindNotBetween(Byte value1, Byte value2) {
            orCriterion("remind not between", value1, value2, "remind");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 appointment
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
     * 该类对应数据库表 appointment
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