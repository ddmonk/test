package com.crazyclub.www.waterlab.model.mybatis;

import java.io.Serializable;

public class CompanyInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_company.company_id
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_company.company_name
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_company.company_label
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String companyLabel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_company.company_type
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String companyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wl_base_company.company_description
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private String companyDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wl_base_company
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_company.company_id
     *
     * @return the value of wl_base_company.company_id
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_company.company_id
     *
     * @param companyId the value for wl_base_company.company_id
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_company.company_name
     *
     * @return the value of wl_base_company.company_name
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_company.company_name
     *
     * @param companyName the value for wl_base_company.company_name
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_company.company_label
     *
     * @return the value of wl_base_company.company_label
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getCompanyLabel() {
        return companyLabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_company.company_label
     *
     * @param companyLabel the value for wl_base_company.company_label
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setCompanyLabel(String companyLabel) {
        this.companyLabel = companyLabel == null ? null : companyLabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_company.company_type
     *
     * @return the value of wl_base_company.company_type
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_company.company_type
     *
     * @param companyType the value for wl_base_company.company_type
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wl_base_company.company_description
     *
     * @return the value of wl_base_company.company_description
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wl_base_company.company_description
     *
     * @param companyDescription the value for wl_base_company.company_description
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription == null ? null : companyDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_company
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
        CompanyInfo other = (CompanyInfo) that;
        return (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyLabel() == null ? other.getCompanyLabel() == null : this.getCompanyLabel().equals(other.getCompanyLabel()))
            && (this.getCompanyType() == null ? other.getCompanyType() == null : this.getCompanyType().equals(other.getCompanyType()))
            && (this.getCompanyDescription() == null ? other.getCompanyDescription() == null : this.getCompanyDescription().equals(other.getCompanyDescription()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_company
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyLabel() == null) ? 0 : getCompanyLabel().hashCode());
        result = prime * result + ((getCompanyType() == null) ? 0 : getCompanyType().hashCode());
        result = prime * result + ((getCompanyDescription() == null) ? 0 : getCompanyDescription().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wl_base_company
     *
     * @mbg.generated Tue Nov 27 18:07:00 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyId=").append(companyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyLabel=").append(companyLabel);
        sb.append(", companyType=").append(companyType);
        sb.append(", companyDescription=").append(companyDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}