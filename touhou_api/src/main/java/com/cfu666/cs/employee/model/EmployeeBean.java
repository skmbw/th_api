package com.cfu666.cs.employee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 employee
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 employee
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 employee
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 employee
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 employee
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public EmployeeBean() {
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
     * 该类对应数据库表 employee
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountIsNull() {
            orCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria orAccountIsNotNull() {
            orCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria orAccountEqualTo(String value) {
            orCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountNotEqualTo(String value) {
            orCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountGreaterThan(String value) {
            orCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountGreaterThanOrEqualTo(String value) {
            orCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountLessThan(String value) {
            orCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountLessThanOrEqualTo(String value) {
            orCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountLike(String value) {
            orCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria orAccountNotLike(String value) {
            orCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria orAccountIn(List<String> values) {
            orCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria orAccountNotIn(List<String> values) {
            orCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria orAccountBetween(String value1, String value2) {
            orCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria orAccountNotBetween(String value1, String value2) {
            orCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameIsNull() {
            orCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria orNameIsNotNull() {
            orCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria orNameEqualTo(String value) {
            orCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotEqualTo(String value) {
            orCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameGreaterThan(String value) {
            orCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameGreaterThanOrEqualTo(String value) {
            orCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameLessThan(String value) {
            orCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameLessThanOrEqualTo(String value) {
            orCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameLike(String value) {
            orCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotLike(String value) {
            orCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria orNameIn(List<String> values) {
            orCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotIn(List<String> values) {
            orCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria orNameBetween(String value1, String value2) {
            orCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotBetween(String value1, String value2) {
            orCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileIsNull() {
            orCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria orMobileIsNotNull() {
            orCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria orMobileEqualTo(String value) {
            orCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotEqualTo(String value) {
            orCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileGreaterThan(String value) {
            orCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileGreaterThanOrEqualTo(String value) {
            orCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileLessThan(String value) {
            orCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileLessThanOrEqualTo(String value) {
            orCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileLike(String value) {
            orCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotLike(String value) {
            orCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileIn(List<String> values) {
            orCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotIn(List<String> values) {
            orCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileBetween(String value1, String value2) {
            orCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotBetween(String value1, String value2) {
            orCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailIsNull() {
            orCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria orEmailIsNotNull() {
            orCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria orEmailEqualTo(String value) {
            orCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotEqualTo(String value) {
            orCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailGreaterThan(String value) {
            orCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailGreaterThanOrEqualTo(String value) {
            orCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLessThan(String value) {
            orCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLessThanOrEqualTo(String value) {
            orCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLike(String value) {
            orCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotLike(String value) {
            orCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria orEmailIn(List<String> values) {
            orCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotIn(List<String> values) {
            orCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria orEmailBetween(String value1, String value2) {
            orCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotBetween(String value1, String value2) {
            orCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderIsNull() {
            orCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria orGenderIsNotNull() {
            orCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria orGenderEqualTo(Integer value) {
            orCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderNotEqualTo(Integer value) {
            orCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderGreaterThan(Integer value) {
            orCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderGreaterThanOrEqualTo(Integer value) {
            orCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderLessThan(Integer value) {
            orCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderLessThanOrEqualTo(Integer value) {
            orCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderIn(List<Integer> values) {
            orCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderNotIn(List<Integer> values) {
            orCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderBetween(Integer value1, Integer value2) {
            orCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderNotBetween(Integer value1, Integer value2) {
            orCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentIsNull() {
            orCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria orDepartmentIsNotNull() {
            orCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria orDepartmentEqualTo(String value) {
            orCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentNotEqualTo(String value) {
            orCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentGreaterThan(String value) {
            orCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentGreaterThanOrEqualTo(String value) {
            orCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentLessThan(String value) {
            orCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentLessThanOrEqualTo(String value) {
            orCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentLike(String value) {
            orCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentNotLike(String value) {
            orCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentIn(List<String> values) {
            orCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentNotIn(List<String> values) {
            orCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentBetween(String value1, String value2) {
            orCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria orDepartmentNotBetween(String value1, String value2) {
            orCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionIsNull() {
            orCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria orPositionIsNotNull() {
            orCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria orPositionEqualTo(String value) {
            orCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionNotEqualTo(String value) {
            orCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionGreaterThan(String value) {
            orCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionGreaterThanOrEqualTo(String value) {
            orCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionLessThan(String value) {
            orCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionLessThanOrEqualTo(String value) {
            orCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionLike(String value) {
            orCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria orPositionNotLike(String value) {
            orCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria orPositionIn(List<String> values) {
            orCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria orPositionNotIn(List<String> values) {
            orCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria orPositionBetween(String value1, String value2) {
            orCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria orPositionNotBetween(String value1, String value2) {
            orCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("login_pwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdIsNull() {
            orCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria orLoginPwdIsNotNull() {
            orCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria orLoginPwdEqualTo(String value) {
            orCriterion("login_pwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdNotEqualTo(String value) {
            orCriterion("login_pwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdGreaterThan(String value) {
            orCriterion("login_pwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdGreaterThanOrEqualTo(String value) {
            orCriterion("login_pwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdLessThan(String value) {
            orCriterion("login_pwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdLessThanOrEqualTo(String value) {
            orCriterion("login_pwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("login_pwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdLike(String value) {
            orCriterion("login_pwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdNotLike(String value) {
            orCriterion("login_pwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdIn(List<String> values) {
            orCriterion("login_pwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdNotIn(List<String> values) {
            orCriterion("login_pwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdBetween(String value1, String value2) {
            orCriterion("login_pwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria orLoginPwdNotBetween(String value1, String value2) {
            orCriterion("login_pwd not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdIsNull() {
            addCriterion("work_pwd is null");
            return (Criteria) this;
        }

        public Criteria andWorkPwdIsNotNull() {
            addCriterion("work_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPwdEqualTo(String value) {
            addCriterion("work_pwd =", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotEqualTo(String value) {
            addCriterion("work_pwd <>", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdGreaterThan(String value) {
            addCriterion("work_pwd >", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdGreaterThanOrEqualTo(String value) {
            addCriterion("work_pwd >=", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdLessThan(String value) {
            addCriterion("work_pwd <", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdLessThanOrEqualTo(String value) {
            addCriterion("work_pwd <=", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdIsNull() {
            orCriterion("work_pwd is null");
            return (Criteria) this;
        }

        public Criteria orWorkPwdIsNotNull() {
            orCriterion("work_pwd is not null");
            return (Criteria) this;
        }

        public Criteria orWorkPwdEqualTo(String value) {
            orCriterion("work_pwd =", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdNotEqualTo(String value) {
            orCriterion("work_pwd <>", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdGreaterThan(String value) {
            orCriterion("work_pwd >", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdGreaterThanOrEqualTo(String value) {
            orCriterion("work_pwd >=", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdLessThan(String value) {
            orCriterion("work_pwd <", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdLessThanOrEqualTo(String value) {
            orCriterion("work_pwd <=", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdLike(String value) {
            addCriterion("work_pwd like", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotLike(String value) {
            addCriterion("work_pwd not like", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdLike(String value) {
            orCriterion("work_pwd like", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdNotLike(String value) {
            orCriterion("work_pwd not like", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdIn(List<String> values) {
            addCriterion("work_pwd in", values, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotIn(List<String> values) {
            addCriterion("work_pwd not in", values, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdBetween(String value1, String value2) {
            addCriterion("work_pwd between", value1, value2, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotBetween(String value1, String value2) {
            addCriterion("work_pwd not between", value1, value2, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdIn(List<String> values) {
            orCriterion("work_pwd in", values, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdNotIn(List<String> values) {
            orCriterion("work_pwd not in", values, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdBetween(String value1, String value2) {
            orCriterion("work_pwd between", value1, value2, "workPwd");
            return (Criteria) this;
        }

        public Criteria orWorkPwdNotBetween(String value1, String value2) {
            orCriterion("work_pwd not between", value1, value2, "workPwd");
            return (Criteria) this;
        }

        public Criteria andPosPadIdIsNull() {
            addCriterion("pos_pad_id is null");
            return (Criteria) this;
        }

        public Criteria andPosPadIdIsNotNull() {
            addCriterion("pos_pad_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosPadIdEqualTo(String value) {
            addCriterion("pos_pad_id =", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdNotEqualTo(String value) {
            addCriterion("pos_pad_id <>", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdGreaterThan(String value) {
            addCriterion("pos_pad_id >", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdGreaterThanOrEqualTo(String value) {
            addCriterion("pos_pad_id >=", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdLessThan(String value) {
            addCriterion("pos_pad_id <", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdLessThanOrEqualTo(String value) {
            addCriterion("pos_pad_id <=", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdIsNull() {
            orCriterion("pos_pad_id is null");
            return (Criteria) this;
        }

        public Criteria orPosPadIdIsNotNull() {
            orCriterion("pos_pad_id is not null");
            return (Criteria) this;
        }

        public Criteria orPosPadIdEqualTo(String value) {
            orCriterion("pos_pad_id =", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdNotEqualTo(String value) {
            orCriterion("pos_pad_id <>", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdGreaterThan(String value) {
            orCriterion("pos_pad_id >", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdGreaterThanOrEqualTo(String value) {
            orCriterion("pos_pad_id >=", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdLessThan(String value) {
            orCriterion("pos_pad_id <", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdLessThanOrEqualTo(String value) {
            orCriterion("pos_pad_id <=", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdLike(String value) {
            addCriterion("pos_pad_id like", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdNotLike(String value) {
            addCriterion("pos_pad_id not like", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdLike(String value) {
            orCriterion("pos_pad_id like", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdNotLike(String value) {
            orCriterion("pos_pad_id not like", value, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdIn(List<String> values) {
            addCriterion("pos_pad_id in", values, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdNotIn(List<String> values) {
            addCriterion("pos_pad_id not in", values, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdBetween(String value1, String value2) {
            addCriterion("pos_pad_id between", value1, value2, "posPadId");
            return (Criteria) this;
        }

        public Criteria andPosPadIdNotBetween(String value1, String value2) {
            addCriterion("pos_pad_id not between", value1, value2, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdIn(List<String> values) {
            orCriterion("pos_pad_id in", values, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdNotIn(List<String> values) {
            orCriterion("pos_pad_id not in", values, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdBetween(String value1, String value2) {
            orCriterion("pos_pad_id between", value1, value2, "posPadId");
            return (Criteria) this;
        }

        public Criteria orPosPadIdNotBetween(String value1, String value2) {
            orCriterion("pos_pad_id not between", value1, value2, "posPadId");
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

        public Criteria andPlannerIsNull() {
            addCriterion("planner is null");
            return (Criteria) this;
        }

        public Criteria andPlannerIsNotNull() {
            addCriterion("planner is not null");
            return (Criteria) this;
        }

        public Criteria andPlannerEqualTo(Boolean value) {
            addCriterion("planner =", value, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerNotEqualTo(Boolean value) {
            addCriterion("planner <>", value, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerGreaterThan(Boolean value) {
            addCriterion("planner >", value, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("planner >=", value, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerLessThan(Boolean value) {
            addCriterion("planner <", value, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerLessThanOrEqualTo(Boolean value) {
            addCriterion("planner <=", value, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerIsNull() {
            orCriterion("planner is null");
            return (Criteria) this;
        }

        public Criteria orPlannerIsNotNull() {
            orCriterion("planner is not null");
            return (Criteria) this;
        }

        public Criteria orPlannerEqualTo(Boolean value) {
            orCriterion("planner =", value, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerNotEqualTo(Boolean value) {
            orCriterion("planner <>", value, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerGreaterThan(Boolean value) {
            orCriterion("planner >", value, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerGreaterThanOrEqualTo(Boolean value) {
            orCriterion("planner >=", value, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerLessThan(Boolean value) {
            orCriterion("planner <", value, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerLessThanOrEqualTo(Boolean value) {
            orCriterion("planner <=", value, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerIn(List<Boolean> values) {
            addCriterion("planner in", values, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerNotIn(List<Boolean> values) {
            addCriterion("planner not in", values, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerBetween(Boolean value1, Boolean value2) {
            addCriterion("planner between", value1, value2, "planner");
            return (Criteria) this;
        }

        public Criteria andPlannerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("planner not between", value1, value2, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerIn(List<Boolean> values) {
            orCriterion("planner in", values, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerNotIn(List<Boolean> values) {
            orCriterion("planner not in", values, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerBetween(Boolean value1, Boolean value2) {
            orCriterion("planner between", value1, value2, "planner");
            return (Criteria) this;
        }

        public Criteria orPlannerNotBetween(Boolean value1, Boolean value2) {
            orCriterion("planner not between", value1, value2, "planner");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarIsNull() {
            orCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria orAvatarIsNotNull() {
            orCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria orAvatarEqualTo(String value) {
            orCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotEqualTo(String value) {
            orCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarGreaterThan(String value) {
            orCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarGreaterThanOrEqualTo(String value) {
            orCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarLessThan(String value) {
            orCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarLessThanOrEqualTo(String value) {
            orCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarLike(String value) {
            orCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotLike(String value) {
            orCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarIn(List<String> values) {
            orCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotIn(List<String> values) {
            orCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarBetween(String value1, String value2) {
            orCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotBetween(String value1, String value2) {
            orCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(Integer value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(Integer value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(Integer value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(Integer value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(Integer value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminIsNull() {
            orCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria orAdminIsNotNull() {
            orCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria orAdminEqualTo(Integer value) {
            orCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminNotEqualTo(Integer value) {
            orCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminGreaterThan(Integer value) {
            orCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminGreaterThanOrEqualTo(Integer value) {
            orCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminLessThan(Integer value) {
            orCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminLessThanOrEqualTo(Integer value) {
            orCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<Integer> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<Integer> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(Integer value1, Integer value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminIn(List<Integer> values) {
            orCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminNotIn(List<Integer> values) {
            orCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminBetween(Integer value1, Integer value2) {
            orCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria orAdminNotBetween(Integer value1, Integer value2) {
            orCriterion("admin not between", value1, value2, "admin");
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

        public Criteria andEmployeeNoIsNull() {
            addCriterion("employee_no is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("employee_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(String value) {
            addCriterion("employee_no =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(String value) {
            addCriterion("employee_no <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(String value) {
            addCriterion("employee_no >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_no >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(String value) {
            addCriterion("employee_no <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
            addCriterion("employee_no <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoIsNull() {
            orCriterion("employee_no is null");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoIsNotNull() {
            orCriterion("employee_no is not null");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoEqualTo(String value) {
            orCriterion("employee_no =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoNotEqualTo(String value) {
            orCriterion("employee_no <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoGreaterThan(String value) {
            orCriterion("employee_no >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoGreaterThanOrEqualTo(String value) {
            orCriterion("employee_no >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoLessThan(String value) {
            orCriterion("employee_no <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoLessThanOrEqualTo(String value) {
            orCriterion("employee_no <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLike(String value) {
            addCriterion("employee_no like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotLike(String value) {
            addCriterion("employee_no not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoLike(String value) {
            orCriterion("employee_no like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoNotLike(String value) {
            orCriterion("employee_no not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<String> values) {
            addCriterion("employee_no in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<String> values) {
            addCriterion("employee_no not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(String value1, String value2) {
            addCriterion("employee_no between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(String value1, String value2) {
            addCriterion("employee_no not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoIn(List<String> values) {
            orCriterion("employee_no in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoNotIn(List<String> values) {
            orCriterion("employee_no not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoBetween(String value1, String value2) {
            orCriterion("employee_no between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria orEmployeeNoNotBetween(String value1, String value2) {
            orCriterion("employee_no not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeIsNull() {
            orCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria orEntryTimeIsNotNull() {
            orCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria orEntryTimeEqualTo(Date value) {
            orCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeNotEqualTo(Date value) {
            orCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeGreaterThan(Date value) {
            orCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeLessThan(Date value) {
            orCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeLessThanOrEqualTo(Date value) {
            orCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeIn(List<Date> values) {
            orCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeNotIn(List<Date> values) {
            orCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeBetween(Date value1, Date value2) {
            orCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria orEntryTimeNotBetween(Date value1, Date value2) {
            orCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayIsNull() {
            orCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria orBirthdayIsNotNull() {
            orCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria orBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressIsNull() {
            orCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria orAddressIsNotNull() {
            orCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria orAddressEqualTo(String value) {
            orCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotEqualTo(String value) {
            orCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressGreaterThan(String value) {
            orCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressGreaterThanOrEqualTo(String value) {
            orCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLessThan(String value) {
            orCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLessThanOrEqualTo(String value) {
            orCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLike(String value) {
            orCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotLike(String value) {
            orCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria orAddressIn(List<String> values) {
            orCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotIn(List<String> values) {
            orCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria orAddressBetween(String value1, String value2) {
            orCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotBetween(String value1, String value2) {
            orCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardIsNull() {
            orCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria orIdcardIsNotNull() {
            orCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria orIdcardEqualTo(String value) {
            orCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotEqualTo(String value) {
            orCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardGreaterThan(String value) {
            orCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardGreaterThanOrEqualTo(String value) {
            orCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardLessThan(String value) {
            orCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardLessThanOrEqualTo(String value) {
            orCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardLike(String value) {
            orCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotLike(String value) {
            orCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardIn(List<String> values) {
            orCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotIn(List<String> values) {
            orCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardBetween(String value1, String value2) {
            orCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotBetween(String value1, String value2) {
            orCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeIsNull() {
            orCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria orOrgCodeIsNotNull() {
            orCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria orOrgCodeEqualTo(String value) {
            orCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotEqualTo(String value) {
            orCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeGreaterThan(String value) {
            orCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeGreaterThanOrEqualTo(String value) {
            orCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeLessThan(String value) {
            orCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeLessThanOrEqualTo(String value) {
            orCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeLike(String value) {
            orCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotLike(String value) {
            orCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeIn(List<String> values) {
            orCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotIn(List<String> values) {
            orCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeBetween(String value1, String value2) {
            orCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotBetween(String value1, String value2) {
            orCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdIsNull() {
            orCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria orDeptIdIsNotNull() {
            orCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria orDeptIdEqualTo(String value) {
            orCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdNotEqualTo(String value) {
            orCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdGreaterThan(String value) {
            orCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdGreaterThanOrEqualTo(String value) {
            orCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdLessThan(String value) {
            orCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdLessThanOrEqualTo(String value) {
            orCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdLike(String value) {
            orCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdNotLike(String value) {
            orCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdIn(List<String> values) {
            orCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdNotIn(List<String> values) {
            orCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdBetween(String value1, String value2) {
            orCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria orDeptIdNotBetween(String value1, String value2) {
            orCriterion("dept_id not between", value1, value2, "deptId");
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
    }

    /**
     * 该类对应数据库表 employee
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
     * 该类对应数据库表 employee
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