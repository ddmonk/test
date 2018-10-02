package com.crazycute.www.pojo.excel;

import com.crazycute.www.pojo.EnumState;
import com.crazycute.www.pojo.RiverStandard;

import java.util.List;

public class RiverSubStatistics {
    private List<MonitorStatistics> monitors;

    private MonitorStatistics avgValues;

    private EnumState.WaterType type;

    private EnumState.WaterQualityEnum targetQuality;

    private EnumState.WaterQualityEnum nowQuality;

    private RiverSingleElement elementLevel;

    private boolean isOk;

    public List<MonitorStatistics> getMonitors() {
        return monitors;
    }

    public void setMonitors(List<MonitorStatistics> monitors) {
        this.monitors = monitors;
    }

    public MonitorStatistics getAvgValues() {
        return avgValues;
    }

    public void setAvgValues(MonitorStatistics avgValues) {
        this.avgValues = avgValues;
    }

    public EnumState.WaterType getType() {
        return type;
    }

    public void setType(EnumState.WaterType type) {
        this.type = type;
    }

    public EnumState.WaterQualityEnum getTargetQuality() {
        return targetQuality;
    }

    public void setTargetQuality(EnumState.WaterQualityEnum targetQuality) {
        this.targetQuality = targetQuality;
    }

    public EnumState.WaterQualityEnum getNowQuality() {
        return nowQuality;
    }

    public void setNowQuality(EnumState.WaterQualityEnum nowQuality) {
        this.nowQuality = nowQuality;
    }

    public RiverSingleElement getElementLevel() {
        return elementLevel;
    }

    public void setElementLevel(RiverSingleElement elementLevel) {
        this.elementLevel = elementLevel;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }
}
