package com.crazyclub.www.waterlab.model.pojo.excel;

import com.crazyclub.www.waterlab.model.pojo.EnumState;

public class RiverSingleElement {

    //溶解氧
    private EnumState.WaterQualityEnum dissolvedOxyStandard;

    //高锰酸盐
    private EnumState.WaterQualityEnum permanganateStandard;

    //化学需氧量( chemical oxygen demand)
    private EnumState.WaterQualityEnum codStandard;

    // 氨氮ammonia nitrogen
    private EnumState.WaterQualityEnum nh3_nStandard;

    //总磷
    private EnumState.WaterQualityEnum phosphorusStandard;

    private EnumState.WaterQualityEnum totalN;

    public EnumState.WaterQualityEnum getTotalN() {
        return totalN;
    }

    public void setTotalN(EnumState.WaterQualityEnum totalN) {
        this.totalN = totalN;
    }

    public EnumState.WaterQualityEnum getDissolvedOxyStandard() {
        return dissolvedOxyStandard;
    }

    public void setDissolvedOxyStandard(EnumState.WaterQualityEnum dissolvedOxyStandard) {
        this.dissolvedOxyStandard = dissolvedOxyStandard;
    }

    public EnumState.WaterQualityEnum getPermanganateStandard() {
        return permanganateStandard;
    }

    public void setPermanganateStandard(EnumState.WaterQualityEnum permanganateStandard) {
        this.permanganateStandard = permanganateStandard;
    }

    public EnumState.WaterQualityEnum getCodStandard() {
        return codStandard;
    }

    public void setCodStandard(EnumState.WaterQualityEnum codStandard) {
        this.codStandard = codStandard;
    }

    public EnumState.WaterQualityEnum getNh3_nStandard() {
        return nh3_nStandard;
    }

    public void setNh3_nStandard(EnumState.WaterQualityEnum nh3_nStandard) {
        this.nh3_nStandard = nh3_nStandard;
    }

    public EnumState.WaterQualityEnum getPhosphorusStandard() {
        return phosphorusStandard;
    }

    public void setPhosphorusStandard(EnumState.WaterQualityEnum phosphorusStandard) {
        this.phosphorusStandard = phosphorusStandard;
    }
}
