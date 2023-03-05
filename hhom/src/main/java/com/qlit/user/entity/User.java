package com.qlit.user.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户表信息
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@ApiModel(value = "User对象", description = "用户表信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("身份证号")
    private String idCard;

    @ApiModelProperty("真实姓名")
    private String realName;

    @ApiModelProperty("性别")
    private String gender;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("角色")
    private String role;

    @ApiModelProperty("年龄")
    private String age;

    @ApiModelProperty("积分")
    private Long integral;

    @ApiModelProperty("状态")
    private String userStatus;

    @ApiModelProperty("头像")
    private String photo;

    @ApiModelProperty("简介")
    private String introduction;

    @ApiModelProperty("学院")
    private String college;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("是否删除(0-未删, 1-已删)")
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", idCard=" + idCard +
            ", realName=" + realName +
            ", gender=" + gender +
            ", address=" + address +
            ", phone=" + phone +
            ", role=" + role +
            ", age=" + age +
            ", integral=" + integral +
            ", userStatus=" + userStatus +
            ", photo=" + photo +
            ", introduction=" + introduction +
            ", college=" + college +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
            ", isDeleted=" + isDeleted +
        "}";
    }
}
