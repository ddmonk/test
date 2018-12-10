package com.crazyclub.www.waterlab.model.mybatis;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_id
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_no
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private Integer userNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_name
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_password
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_telephone
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userTelephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_position
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_salt
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userSalt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_create_time
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private Date userCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_update_time
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private Date userUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_description
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_user.user_account
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private String userAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wl_base_user
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_id
     *
     * @return the value of wl_base_user.user_id
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_id
     *
     * @param userId the value for wl_base_user.user_id
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_no
     *
     * @return the value of wl_base_user.user_no
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public Integer getUserNo() {
        return userNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_no
     *
     * @param userNo the value for wl_base_user.user_no
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_name
     *
     * @return the value of wl_base_user.user_name
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_name
     *
     * @param userName the value for wl_base_user.user_name
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_password
     *
     * @return the value of wl_base_user.user_password
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_password
     *
     * @param userPassword the value for wl_base_user.user_password
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_telephone
     *
     * @return the value of wl_base_user.user_telephone
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_telephone
     *
     * @param userTelephone the value for wl_base_user.user_telephone
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone == null ? null : userTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_position
     *
     * @return the value of wl_base_user.user_position
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserPosition() {
        return userPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_position
     *
     * @param userPosition the value for wl_base_user.user_position
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition == null ? null : userPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_salt
     *
     * @return the value of wl_base_user.user_salt
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserSalt() {
        return userSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_salt
     *
     * @param userSalt the value for wl_base_user.user_salt
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_create_time
     *
     * @return the value of wl_base_user.user_create_time
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_create_time
     *
     * @param userCreateTime the value for wl_base_user.user_create_time
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_update_time
     *
     * @return the value of wl_base_user.user_update_time
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_update_time
     *
     * @param userUpdateTime the value for wl_base_user.user_update_time
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_description
     *
     * @return the value of wl_base_user.user_description
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserDescription() {
        return userDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_description
     *
     * @param userDescription the value for wl_base_user.user_description
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_user.user_account
     *
     * @return the value of wl_base_user.user_account
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_user.user_account
     *
     * @param userAccount the value for wl_base_user.user_account
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_user
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserTelephone() == null ? other.getUserTelephone() == null : this.getUserTelephone().equals(other.getUserTelephone()))
            && (this.getUserPosition() == null ? other.getUserPosition() == null : this.getUserPosition().equals(other.getUserPosition()))
            && (this.getUserSalt() == null ? other.getUserSalt() == null : this.getUserSalt().equals(other.getUserSalt()))
            && (this.getUserCreateTime() == null ? other.getUserCreateTime() == null : this.getUserCreateTime().equals(other.getUserCreateTime()))
            && (this.getUserUpdateTime() == null ? other.getUserUpdateTime() == null : this.getUserUpdateTime().equals(other.getUserUpdateTime()))
            && (this.getUserDescription() == null ? other.getUserDescription() == null : this.getUserDescription().equals(other.getUserDescription()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_user
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserTelephone() == null) ? 0 : getUserTelephone().hashCode());
        result = prime * result + ((getUserPosition() == null) ? 0 : getUserPosition().hashCode());
        result = prime * result + ((getUserSalt() == null) ? 0 : getUserSalt().hashCode());
        result = prime * result + ((getUserCreateTime() == null) ? 0 : getUserCreateTime().hashCode());
        result = prime * result + ((getUserUpdateTime() == null) ? 0 : getUserUpdateTime().hashCode());
        result = prime * result + ((getUserDescription() == null) ? 0 : getUserDescription().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_user
     *
     * @mbg.generated Tue Nov 06 15:14:10 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userTelephone=").append(userTelephone);
        sb.append(", userPosition=").append(userPosition);
        sb.append(", userSalt=").append(userSalt);
        sb.append(", userCreateTime=").append(userCreateTime);
        sb.append(", userUpdateTime=").append(userUpdateTime);
        sb.append(", userDescription=").append(userDescription);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}