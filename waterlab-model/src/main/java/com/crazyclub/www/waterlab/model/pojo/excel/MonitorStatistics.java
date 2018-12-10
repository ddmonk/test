package com.crazyclub.www.waterlab.model.pojo.excel;

public class MonitorStatistics {

    //河流名称
    private String fixedName;

    //溶解氧
    private double dissolvedOxy;

    //高锰酸盐
    private double permanganate;

    //化学需氧量( chemical oxygen demand)
    private double cod;

    // 氨氮ammonia nitrogen
    private double nh3_n;

    //总磷
    private double total_phosphorus;

    private double total_N;

    public double getTotal_N() {
        return total_N;
    }

    public void setTotal_N(double total_N) {
        this.total_N = total_N;
    }

    public String getFixedName() {
        return fixedName;
    }

    public void setFixedName(String fixedName) {
        this.fixedName = fixedName;
    }

    public double getDissolvedOxy() {
        return dissolvedOxy;
    }

    public void setDissolvedOxy(double dissolvedOxy) {
        this.dissolvedOxy = dissolvedOxy;
    }

    public double getPermanganate() {
        return permanganate;
    }

    public void setPermanganate(double permanganate) {
        this.permanganate = permanganate;
    }

    public double getCod() {
        return cod;
    }

    public void setCod(double cod) {
        this.cod = cod;
    }

    public double getNh3_n() {
        return nh3_n;
    }

    public void setNh3_n(double nh3_n) {
        this.nh3_n = nh3_n;
    }

    public double getTotal_phosphorus() {
        return total_phosphorus;
    }

    public void setTotal_phosphorus(double total_phosphorus) {
        this.total_phosphorus = total_phosphorus;
    }
}
