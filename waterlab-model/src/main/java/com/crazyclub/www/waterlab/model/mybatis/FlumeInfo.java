package com.crazyclub.www.waterlab.model.mybatis;

import java.io.Serializable;

public class FlumeInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flume_info.id
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flume_info.uuid
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flume_info.hostname
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    private String hostname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flume_info.pid
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flume_info.province_code
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    private String provinceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table flume_info
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flume_info.id
     *
     * @return the value of flume_info.id
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flume_info.id
     *
     * @param id the value for flume_info.id
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flume_info.uuid
     *
     * @return the value of flume_info.uuid
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flume_info.uuid
     *
     * @param uuid the value for flume_info.uuid
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flume_info.hostname
     *
     * @return the value of flume_info.hostname
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flume_info.hostname
     *
     * @param hostname the value for flume_info.hostname
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flume_info.pid
     *
     * @return the value of flume_info.pid
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flume_info.pid
     *
     * @param pid the value for flume_info.pid
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flume_info.province_code
     *
     * @return the value of flume_info.province_code
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flume_info.province_code
     *
     * @param provinceCode the value for flume_info.province_code
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flume_info
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
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
        FlumeInfo other = (FlumeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getHostname() == null ? other.getHostname() == null : this.getHostname().equals(other.getHostname()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getProvinceCode() == null ? other.getProvinceCode() == null : this.getProvinceCode().equals(other.getProvinceCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flume_info
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getHostname() == null) ? 0 : getHostname().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getProvinceCode() == null) ? 0 : getProvinceCode().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flume_info
     *
     * @mbg.generated Sun Dec 09 15:35:57 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uuid=").append(uuid);
        sb.append(", hostname=").append(hostname);
        sb.append(", pid=").append(pid);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}