package com.crazyclub.www.waterlab.model.mybatis;

import java.io.Serializable;

public class RiverOwner implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_id
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private Integer ownerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_name
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String ownerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_position
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String ownerPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_description
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String ownerDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_type
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private Integer ownerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_level
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private Integer ownerLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_number
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private Integer ownerNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_owner.owner_phone
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String ownerPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wl_base_owner
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_id
     *
     * @return the value of wl_base_owner.owner_id
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_id
     *
     * @param ownerId the value for wl_base_owner.owner_id
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_name
     *
     * @return the value of wl_base_owner.owner_name
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_name
     *
     * @param ownerName the value for wl_base_owner.owner_name
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_position
     *
     * @return the value of wl_base_owner.owner_position
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getOwnerPosition() {
        return ownerPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_position
     *
     * @param ownerPosition the value for wl_base_owner.owner_position
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerPosition(String ownerPosition) {
        this.ownerPosition = ownerPosition == null ? null : ownerPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_description
     *
     * @return the value of wl_base_owner.owner_description
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getOwnerDescription() {
        return ownerDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_description
     *
     * @param ownerDescription the value for wl_base_owner.owner_description
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerDescription(String ownerDescription) {
        this.ownerDescription = ownerDescription == null ? null : ownerDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_type
     *
     * @return the value of wl_base_owner.owner_type
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_type
     *
     * @param ownerType the value for wl_base_owner.owner_type
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_level
     *
     * @return the value of wl_base_owner.owner_level
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public Integer getOwnerLevel() {
        return ownerLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_level
     *
     * @param ownerLevel the value for wl_base_owner.owner_level
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerLevel(Integer ownerLevel) {
        this.ownerLevel = ownerLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_number
     *
     * @return the value of wl_base_owner.owner_number
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public Integer getOwnerNumber() {
        return ownerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_number
     *
     * @param ownerNumber the value for wl_base_owner.owner_number
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerNumber(Integer ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_owner.owner_phone
     *
     * @return the value of wl_base_owner.owner_phone
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getOwnerPhone() {
        return ownerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_owner.owner_phone
     *
     * @param ownerPhone the value for wl_base_owner.owner_phone
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_owner
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
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
        RiverOwner other = (RiverOwner) that;
        return (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getOwnerName() == null ? other.getOwnerName() == null : this.getOwnerName().equals(other.getOwnerName()))
            && (this.getOwnerPosition() == null ? other.getOwnerPosition() == null : this.getOwnerPosition().equals(other.getOwnerPosition()))
            && (this.getOwnerDescription() == null ? other.getOwnerDescription() == null : this.getOwnerDescription().equals(other.getOwnerDescription()))
            && (this.getOwnerType() == null ? other.getOwnerType() == null : this.getOwnerType().equals(other.getOwnerType()))
            && (this.getOwnerLevel() == null ? other.getOwnerLevel() == null : this.getOwnerLevel().equals(other.getOwnerLevel()))
            && (this.getOwnerNumber() == null ? other.getOwnerNumber() == null : this.getOwnerNumber().equals(other.getOwnerNumber()))
            && (this.getOwnerPhone() == null ? other.getOwnerPhone() == null : this.getOwnerPhone().equals(other.getOwnerPhone()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_owner
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        result = prime * result + ((getOwnerPosition() == null) ? 0 : getOwnerPosition().hashCode());
        result = prime * result + ((getOwnerDescription() == null) ? 0 : getOwnerDescription().hashCode());
        result = prime * result + ((getOwnerType() == null) ? 0 : getOwnerType().hashCode());
        result = prime * result + ((getOwnerLevel() == null) ? 0 : getOwnerLevel().hashCode());
        result = prime * result + ((getOwnerNumber() == null) ? 0 : getOwnerNumber().hashCode());
        result = prime * result + ((getOwnerPhone() == null) ? 0 : getOwnerPhone().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_owner
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ownerId=").append(ownerId);
        sb.append(", ownerName=").append(ownerName);
        sb.append(", ownerPosition=").append(ownerPosition);
        sb.append(", ownerDescription=").append(ownerDescription);
        sb.append(", ownerType=").append(ownerType);
        sb.append(", ownerLevel=").append(ownerLevel);
        sb.append(", ownerNumber=").append(ownerNumber);
        sb.append(", ownerPhone=").append(ownerPhone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}