package com.crazycute.www.excel.pojo.excel;

import java.util.List;

public class RiverStatistics {

    private String riverName;

    public List<RiverSubStatistics> subStatistics;

    public List<RiverSubStatistics> getSubStatistics() {
        return subStatistics;
    }

    public void setSubStatistics(List<RiverSubStatistics> subStatistics) {
        this.subStatistics = subStatistics;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }
}
