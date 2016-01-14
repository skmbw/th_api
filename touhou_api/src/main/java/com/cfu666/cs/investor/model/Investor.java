package com.cfu666.cs.investor.model;

import java.util.Date;

public class Investor {
    /**
     * order by 排序语句
     * 对应数据库表字段 investor
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 investor
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 investor
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 investor
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 investor.id
     */
    private String id;

    /**
     * 对应数据库表字段 investor.name
     */
    private String name;

    /**
     * 对应数据库表字段 investor.mobile
     */
    private String mobile;

    /**
     * 对应数据库表字段 investor.register_time
     */
    private Date registerTime;

    /**
     * 对应数据库表字段 investor.avatar
     */
    private String avatar;

    /**
     * 对应数据库表字段 investor.birthday
     */
    private Date birthday;

    /**
     * 对应数据库表字段 investor.email
     */
    private String email;

    /**
     * 对应数据库表字段 investor.gender
     */
    private Integer gender;

    /**
     * 对应数据库表字段 investor.idcard
     */
    private String idcard;

    /**
     * 对应数据库表字段 investor.id_type
     */
    private String idType;

    /**
     * 对应数据库表字段 investor.company
     */
    private String company;

    /**
     * 对应数据库表字段 investor.address
     */
    private String address;

    /**
     * 对应数据库表字段 investor.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 investor.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 investor.deleted
     */
    private Boolean deleted;

    /**
     * 对应数据库表字段 investor.nick_name
     */
    private String nickName;

    /**
     * 对应数据库表字段 investor.telephone
     */
    private String telephone;

    /**
     * 对应数据库表字段 investor.remark
     */
    private String remark;

    /**
     * 对应数据库表字段 investor.province
     */
    private String province;

    /**
     * 对应数据库表字段 investor.city
     */
    private String city;

    /**
     * 对应数据库表字段 investor.district
     */
    private String district;

    /**
     * 对应数据库表字段 investor.risk_pass
     */
    private Boolean riskPass;

    /**
     * 对应数据库表字段 investor.score
     */
    private Integer score;

    /**
     * 对应数据库表字段 investor.evaluation_time
     */
    private Date evaluationTime;

    /**
     * 对应数据库表字段 investor.invitation_code
     */
    private String invitationCode;

    /**
     * 对应数据库表字段 investor.verify
     */
    private Boolean verify;

    /**
     * 对应数据库表字段 investor.sign_image
     */
    private String signImage;

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
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 investor.id 的值
     *
     * @return the value of investor.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 investor.id 的值
     *
     * @param id the value for investor.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 investor.name 的值
     *
     * @return the value of investor.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 investor.name 的值
     *
     * @param name the value for investor.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 investor.mobile 的值
     *
     * @return the value of investor.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置字段 investor.mobile 的值
     *
     * @param mobile the value for investor.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获得字段 investor.register_time 的值
     *
     * @return the value of investor.register_time
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置字段 investor.register_time 的值
     *
     * @param registerTime the value for investor.register_time
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获得字段 investor.avatar 的值
     *
     * @return the value of investor.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置字段 investor.avatar 的值
     *
     * @param avatar the value for investor.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获得字段 investor.birthday 的值
     *
     * @return the value of investor.birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置字段 investor.birthday 的值
     *
     * @param birthday the value for investor.birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获得字段 investor.email 的值
     *
     * @return the value of investor.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置字段 investor.email 的值
     *
     * @param email the value for investor.email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获得字段 investor.gender 的值
     *
     * @return the value of investor.gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置字段 investor.gender 的值
     *
     * @param gender the value for investor.gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获得字段 investor.idcard 的值
     *
     * @return the value of investor.idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置字段 investor.idcard 的值
     *
     * @param idcard the value for investor.idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获得字段 investor.id_type 的值
     *
     * @return the value of investor.id_type
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置字段 investor.id_type 的值
     *
     * @param idType the value for investor.id_type
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * 获得字段 investor.company 的值
     *
     * @return the value of investor.company
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置字段 investor.company 的值
     *
     * @param company the value for investor.company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获得字段 investor.address 的值
     *
     * @return the value of investor.address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置字段 investor.address 的值
     *
     * @param address the value for investor.address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获得字段 investor.employee_id 的值
     *
     * @return the value of investor.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 investor.employee_id 的值
     *
     * @param employeeId the value for investor.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 investor.org_id 的值
     *
     * @return the value of investor.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 investor.org_id 的值
     *
     * @param orgId the value for investor.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 investor.deleted 的值
     *
     * @return the value of investor.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置字段 investor.deleted 的值
     *
     * @param deleted the value for investor.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获得字段 investor.nick_name 的值
     *
     * @return the value of investor.nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置字段 investor.nick_name 的值
     *
     * @param nickName the value for investor.nick_name
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获得字段 investor.telephone 的值
     *
     * @return the value of investor.telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置字段 investor.telephone 的值
     *
     * @param telephone the value for investor.telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获得字段 investor.remark 的值
     *
     * @return the value of investor.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 investor.remark 的值
     *
     * @param remark the value for investor.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获得字段 investor.province 的值
     *
     * @return the value of investor.province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置字段 investor.province 的值
     *
     * @param province the value for investor.province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获得字段 investor.city 的值
     *
     * @return the value of investor.city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置字段 investor.city 的值
     *
     * @param city the value for investor.city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获得字段 investor.district 的值
     *
     * @return the value of investor.district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置字段 investor.district 的值
     *
     * @param district the value for investor.district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获得字段 investor.risk_pass 的值
     *
     * @return the value of investor.risk_pass
     */
    public Boolean getRiskPass() {
        return riskPass;
    }

    /**
     * 设置字段 investor.risk_pass 的值
     *
     * @param riskPass the value for investor.risk_pass
     */
    public void setRiskPass(Boolean riskPass) {
        this.riskPass = riskPass;
    }

    /**
     * 获得字段 investor.score 的值
     *
     * @return the value of investor.score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置字段 investor.score 的值
     *
     * @param score the value for investor.score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获得字段 investor.evaluation_time 的值
     *
     * @return the value of investor.evaluation_time
     */
    public Date getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * 设置字段 investor.evaluation_time 的值
     *
     * @param evaluationTime the value for investor.evaluation_time
     */
    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    /**
     * 获得字段 investor.invitation_code 的值
     *
     * @return the value of investor.invitation_code
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * 设置字段 investor.invitation_code 的值
     *
     * @param invitationCode the value for investor.invitation_code
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    /**
     * 获得字段 investor.verify 的值
     *
     * @return the value of investor.verify
     */
    public Boolean getVerify() {
        return verify;
    }

    /**
     * 设置字段 investor.verify 的值
     *
     * @param verify the value for investor.verify
     */
    public void setVerify(Boolean verify) {
        this.verify = verify;
    }

    /**
     * 获得字段 investor.sign_image 的值
     *
     * @return the value of investor.sign_image
     */
    public String getSignImage() {
        return signImage;
    }

    /**
     * 设置字段 investor.sign_image 的值
     *
     * @param signImage the value for investor.sign_image
     */
    public void setSignImage(String signImage) {
        this.signImage = signImage;
    }
}