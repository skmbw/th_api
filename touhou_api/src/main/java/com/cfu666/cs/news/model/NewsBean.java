package com.cfu666.cs.news.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 news
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 news
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 news
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 news
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 news
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public NewsBean() {
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
     * 该类对应数据库表 news
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleIsNull() {
            orCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria orTitleIsNotNull() {
            orCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria orTitleEqualTo(String value) {
            orCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotEqualTo(String value) {
            orCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleGreaterThan(String value) {
            orCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleGreaterThanOrEqualTo(String value) {
            orCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleLessThan(String value) {
            orCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleLessThanOrEqualTo(String value) {
            orCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleLike(String value) {
            orCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotLike(String value) {
            orCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria orTitleIn(List<String> values) {
            orCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotIn(List<String> values) {
            orCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria orTitleBetween(String value1, String value2) {
            orCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotBetween(String value1, String value2) {
            orCriterion("title not between", value1, value2, "title");
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

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailIsNull() {
            orCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria orThumbnailIsNotNull() {
            orCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria orThumbnailEqualTo(String value) {
            orCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotEqualTo(String value) {
            orCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailGreaterThan(String value) {
            orCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailGreaterThanOrEqualTo(String value) {
            orCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailLessThan(String value) {
            orCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailLessThanOrEqualTo(String value) {
            orCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailLike(String value) {
            orCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotLike(String value) {
            orCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailIn(List<String> values) {
            orCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotIn(List<String> values) {
            orCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailBetween(String value1, String value2) {
            orCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotBetween(String value1, String value2) {
            orCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoIsNull() {
            orCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria orInfoIsNotNull() {
            orCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria orInfoEqualTo(String value) {
            orCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoNotEqualTo(String value) {
            orCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoGreaterThan(String value) {
            orCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoGreaterThanOrEqualTo(String value) {
            orCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoLessThan(String value) {
            orCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoLessThanOrEqualTo(String value) {
            orCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoLike(String value) {
            orCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria orInfoNotLike(String value) {
            orCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria orInfoIn(List<String> values) {
            orCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria orInfoNotIn(List<String> values) {
            orCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria orInfoBetween(String value1, String value2) {
            orCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria orInfoNotBetween(String value1, String value2) {
            orCriterion("info not between", value1, value2, "info");
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

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledIsNull() {
            orCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria orEnabledIsNotNull() {
            orCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria orEnabledEqualTo(Boolean value) {
            orCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledNotEqualTo(Boolean value) {
            orCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledGreaterThan(Boolean value) {
            orCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledGreaterThanOrEqualTo(Boolean value) {
            orCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledLessThan(Boolean value) {
            orCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledLessThanOrEqualTo(Boolean value) {
            orCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledIn(List<Boolean> values) {
            orCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledNotIn(List<Boolean> values) {
            orCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledBetween(Boolean value1, Boolean value2) {
            orCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria orEnabledNotBetween(Boolean value1, Boolean value2) {
            orCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersIsNull() {
            orCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria orOrdersIsNotNull() {
            orCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria orOrdersEqualTo(Integer value) {
            orCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersNotEqualTo(Integer value) {
            orCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersGreaterThan(Integer value) {
            orCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersGreaterThanOrEqualTo(Integer value) {
            orCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersLessThan(Integer value) {
            orCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersLessThanOrEqualTo(Integer value) {
            orCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersIn(List<Integer> values) {
            orCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersNotIn(List<Integer> values) {
            orCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersBetween(Integer value1, Integer value2) {
            orCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersNotBetween(Integer value1, Integer value2) {
            orCriterion("orders not between", value1, value2, "orders");
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlIsNull() {
            orCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria orUrlIsNotNull() {
            orCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria orUrlEqualTo(String value) {
            orCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotEqualTo(String value) {
            orCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlGreaterThan(String value) {
            orCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlGreaterThanOrEqualTo(String value) {
            orCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlLessThan(String value) {
            orCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlLessThanOrEqualTo(String value) {
            orCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlLike(String value) {
            orCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotLike(String value) {
            orCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria orUrlIn(List<String> values) {
            orCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotIn(List<String> values) {
            orCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria orUrlBetween(String value1, String value2) {
            orCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotBetween(String value1, String value2) {
            orCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformIsNull() {
            orCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria orPlatformIsNotNull() {
            orCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria orPlatformEqualTo(Integer value) {
            orCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotEqualTo(Integer value) {
            orCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformGreaterThan(Integer value) {
            orCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformGreaterThanOrEqualTo(Integer value) {
            orCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformLessThan(Integer value) {
            orCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformLessThanOrEqualTo(Integer value) {
            orCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformIn(List<Integer> values) {
            orCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotIn(List<Integer> values) {
            orCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformBetween(Integer value1, Integer value2) {
            orCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotBetween(Integer value1, Integer value2) {
            orCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andTypeAppIsNull() {
            addCriterion("type_app is null");
            return (Criteria) this;
        }

        public Criteria andTypeAppIsNotNull() {
            addCriterion("type_app is not null");
            return (Criteria) this;
        }

        public Criteria andTypeAppEqualTo(Integer value) {
            addCriterion("type_app =", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppNotEqualTo(Integer value) {
            addCriterion("type_app <>", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppGreaterThan(Integer value) {
            addCriterion("type_app >", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_app >=", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppLessThan(Integer value) {
            addCriterion("type_app <", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppLessThanOrEqualTo(Integer value) {
            addCriterion("type_app <=", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppIsNull() {
            orCriterion("type_app is null");
            return (Criteria) this;
        }

        public Criteria orTypeAppIsNotNull() {
            orCriterion("type_app is not null");
            return (Criteria) this;
        }

        public Criteria orTypeAppEqualTo(Integer value) {
            orCriterion("type_app =", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppNotEqualTo(Integer value) {
            orCriterion("type_app <>", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppGreaterThan(Integer value) {
            orCriterion("type_app >", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppGreaterThanOrEqualTo(Integer value) {
            orCriterion("type_app >=", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppLessThan(Integer value) {
            orCriterion("type_app <", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppLessThanOrEqualTo(Integer value) {
            orCriterion("type_app <=", value, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppIn(List<Integer> values) {
            addCriterion("type_app in", values, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppNotIn(List<Integer> values) {
            addCriterion("type_app not in", values, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppBetween(Integer value1, Integer value2) {
            addCriterion("type_app between", value1, value2, "typeApp");
            return (Criteria) this;
        }

        public Criteria andTypeAppNotBetween(Integer value1, Integer value2) {
            addCriterion("type_app not between", value1, value2, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppIn(List<Integer> values) {
            orCriterion("type_app in", values, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppNotIn(List<Integer> values) {
            orCriterion("type_app not in", values, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppBetween(Integer value1, Integer value2) {
            orCriterion("type_app between", value1, value2, "typeApp");
            return (Criteria) this;
        }

        public Criteria orTypeAppNotBetween(Integer value1, Integer value2) {
            orCriterion("type_app not between", value1, value2, "typeApp");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 news
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
     * 该类对应数据库表 news
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