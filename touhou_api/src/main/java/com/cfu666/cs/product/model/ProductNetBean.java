package com.cfu666.cs.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductNetBean {
	/**
	 * order by 排序语句 对应数据库表字段 product_net
	 */
	private String orderBy;

	/**
	 * 分页开始记录 对应数据库表字段 product_net
	 */
	private Integer start;

	/**
	 * 分页大小 对应数据库表字段 product_net
	 */
	private int pageSize = 10;

	/**
	 * 是否指定 distinct 去除重复 对应数据库表字段 product_net
	 */
	private boolean distinct;

	/**
	 * 逻辑or语句 对应数据库表字段 product_net
	 */
	private List<Criteria> oredCriteria;

	/**
     */
	public ProductNetBean() {
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
	 * 该类对应数据库表 product_net
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

		public Criteria andDateIsNull() {
			addCriterion("date is null");
			return (Criteria) this;
		}

		public Criteria andDateIsNotNull() {
			addCriterion("date is not null");
			return (Criteria) this;
		}

		public Criteria andDateEqualTo(Date value) {
			addCriterion("date =", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotEqualTo(Date value) {
			addCriterion("date <>", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThan(Date value) {
			addCriterion("date >", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThanOrEqualTo(Date value) {
			addCriterion("date >=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThan(Date value) {
			addCriterion("date <", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThanOrEqualTo(Date value) {
			addCriterion("date <=", value, "date");
			return (Criteria) this;
		}

		public Criteria orDateIsNull() {
			orCriterion("date is null");
			return (Criteria) this;
		}

		public Criteria orDateIsNotNull() {
			orCriterion("date is not null");
			return (Criteria) this;
		}

		public Criteria orDateEqualTo(Date value) {
			orCriterion("date =", value, "date");
			return (Criteria) this;
		}

		public Criteria orDateNotEqualTo(Date value) {
			orCriterion("date <>", value, "date");
			return (Criteria) this;
		}

		public Criteria orDateGreaterThan(Date value) {
			orCriterion("date >", value, "date");
			return (Criteria) this;
		}

		public Criteria orDateGreaterThanOrEqualTo(Date value) {
			orCriterion("date >=", value, "date");
			return (Criteria) this;
		}

		public Criteria orDateLessThan(Date value) {
			orCriterion("date <", value, "date");
			return (Criteria) this;
		}

		public Criteria orDateLessThanOrEqualTo(Date value) {
			orCriterion("date <=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateIn(List<Date> values) {
			addCriterion("date in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotIn(List<Date> values) {
			addCriterion("date not in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateBetween(Date value1, Date value2) {
			addCriterion("date between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotBetween(Date value1, Date value2) {
			addCriterion("date not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria orDateIn(List<Date> values) {
			orCriterion("date in", values, "date");
			return (Criteria) this;
		}

		public Criteria orDateNotIn(List<Date> values) {
			orCriterion("date not in", values, "date");
			return (Criteria) this;
		}

		public Criteria orDateBetween(Date value1, Date value2) {
			orCriterion("date between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria orDateNotBetween(Date value1, Date value2) {
			orCriterion("date not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetIsNull() {
			addCriterion("cumulative_net is null");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetIsNotNull() {
			addCriterion("cumulative_net is not null");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetEqualTo(Double value) {
			addCriterion("cumulative_net =", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetNotEqualTo(Double value) {
			addCriterion("cumulative_net <>", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetGreaterThan(Double value) {
			addCriterion("cumulative_net >", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetGreaterThanOrEqualTo(Double value) {
			addCriterion("cumulative_net >=", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetLessThan(Double value) {
			addCriterion("cumulative_net <", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetLessThanOrEqualTo(Double value) {
			addCriterion("cumulative_net <=", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetIsNull() {
			orCriterion("cumulative_net is null");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetIsNotNull() {
			orCriterion("cumulative_net is not null");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetEqualTo(Double value) {
			orCriterion("cumulative_net =", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetNotEqualTo(Double value) {
			orCriterion("cumulative_net <>", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetGreaterThan(Double value) {
			orCriterion("cumulative_net >", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetGreaterThanOrEqualTo(Double value) {
			orCriterion("cumulative_net >=", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetLessThan(Double value) {
			orCriterion("cumulative_net <", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetLessThanOrEqualTo(Double value) {
			orCriterion("cumulative_net <=", value, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetIn(List<Double> values) {
			addCriterion("cumulative_net in", values, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetNotIn(List<Double> values) {
			addCriterion("cumulative_net not in", values, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetBetween(Double value1, Double value2) {
			addCriterion("cumulative_net between", value1, value2, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andCumulativeNetNotBetween(Double value1, Double value2) {
			addCriterion("cumulative_net not between", value1, value2, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetIn(List<Double> values) {
			orCriterion("cumulative_net in", values, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetNotIn(List<Double> values) {
			orCriterion("cumulative_net not in", values, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetBetween(Double value1, Double value2) {
			orCriterion("cumulative_net between", value1, value2, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria orCumulativeNetNotBetween(Double value1, Double value2) {
			orCriterion("cumulative_net not between", value1, value2, "cumulativeNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetIsNull() {
			addCriterion("unit_net is null");
			return (Criteria) this;
		}

		public Criteria andUnitNetIsNotNull() {
			addCriterion("unit_net is not null");
			return (Criteria) this;
		}

		public Criteria andUnitNetEqualTo(Double value) {
			addCriterion("unit_net =", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetNotEqualTo(Double value) {
			addCriterion("unit_net <>", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetGreaterThan(Double value) {
			addCriterion("unit_net >", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetGreaterThanOrEqualTo(Double value) {
			addCriterion("unit_net >=", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetLessThan(Double value) {
			addCriterion("unit_net <", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetLessThanOrEqualTo(Double value) {
			addCriterion("unit_net <=", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetIsNull() {
			orCriterion("unit_net is null");
			return (Criteria) this;
		}

		public Criteria orUnitNetIsNotNull() {
			orCriterion("unit_net is not null");
			return (Criteria) this;
		}

		public Criteria orUnitNetEqualTo(Double value) {
			orCriterion("unit_net =", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetNotEqualTo(Double value) {
			orCriterion("unit_net <>", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetGreaterThan(Double value) {
			orCriterion("unit_net >", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetGreaterThanOrEqualTo(Double value) {
			orCriterion("unit_net >=", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetLessThan(Double value) {
			orCriterion("unit_net <", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetLessThanOrEqualTo(Double value) {
			orCriterion("unit_net <=", value, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetIn(List<Double> values) {
			addCriterion("unit_net in", values, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetNotIn(List<Double> values) {
			addCriterion("unit_net not in", values, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetBetween(Double value1, Double value2) {
			addCriterion("unit_net between", value1, value2, "unitNet");
			return (Criteria) this;
		}

		public Criteria andUnitNetNotBetween(Double value1, Double value2) {
			addCriterion("unit_net not between", value1, value2, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetIn(List<Double> values) {
			orCriterion("unit_net in", values, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetNotIn(List<Double> values) {
			orCriterion("unit_net not in", values, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetBetween(Double value1, Double value2) {
			orCriterion("unit_net between", value1, value2, "unitNet");
			return (Criteria) this;
		}

		public Criteria orUnitNetNotBetween(Double value1, Double value2) {
			orCriterion("unit_net not between", value1, value2, "unitNet");
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
	 * 该类对应数据库表 product_net
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
	 * 该类对应数据库表 product_net
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