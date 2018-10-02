package com.crazycute.www.excel;

import com.crazycute.www.pojo.EnumState;
import com.crazycute.www.pojo.excel.MonitorStatistics;
import com.crazycute.www.pojo.excel.RiverOwner;
import com.crazycute.www.pojo.excel.RiverStatistics;
import com.crazycute.www.pojo.excel.RiverSubStatistics;
import com.crazycute.www.pojo.statics.*;

public class BuildEMS {

    public static String buildMsg (RiverOwner owner){
        StringBuffer result = new StringBuffer();
        result.append(Template.MSG_HAED);
        for (RiverStatistics riverStatistics :owner.getRiverStatisticsList()) {
            result.append(riverStatistics.getRiverName()).append("：");
            if (riverStatistics.getSubStatistics().size() == 1) {
                RiverSubStatistics subStatistics = riverStatistics.getSubStatistics().get(0);
                result.append(handlerSubStatistics(subStatistics,false,false));
            }else if (riverStatistics.getSubStatistics().size() == 2){
                result.append(handlerSubStatistics(riverStatistics.getSubStatistics().get(0),true,false));
                result.append("，");
                result.append(handlerSubStatistics(riverStatistics.getSubStatistics().get(1),false,true));
            }
            result.append("；");
        }
        if (result.lastIndexOf("；") == (result.length() - 1)){
            result.deleteCharAt(result.length() - 1);
        }
        result.append("。");
        result.append(Template.MSG_END);
        return result.toString();
    }

    private static Level getLevel(EnumState.WaterQualityEnum waterQualityEnum, EnumState.WaterType type){
        if (waterQualityEnum.getState() == 2){
            return new Level2Monitor();
        }else if (waterQualityEnum.getState() == 3){
            if (type == EnumState.WaterType.LAKE){
                return new Level3MonitorLake();
            }
            return new Level3MonitorRiver();
        }else if (waterQualityEnum.getState() == 4){
            if (type == EnumState.WaterType.LAKE){
                return new Level4MonitorLake();
            }
            return new Level4MonitorRiver();
        }
        return null;
    }


    private static StringBuilder handlerSubStatistics(RiverSubStatistics subStatistics,boolean isFirst,boolean isLast){
        StringBuilder result = new StringBuilder();
        EnumState.WaterQualityEnum nowQuality = subStatistics.getNowQuality();
        EnumState.WaterQualityEnum target = subStatistics.getTargetQuality();
        if (isFirst == false && isLast == false) {
            result.append(String.format(Template.MSG_WATER_LEVEL, target.getName(), subStatistics.getNowQuality().getName()));
        }else if (isFirst){
            result.append(subStatistics.getMonitors().get(0).getFixedName()).append("断面");
            result.append(String.format(Template.MSG_WATER_LEVEL, target.getName(), subStatistics.getNowQuality().getName()));

        } else if (isLast){
            result.append("其他断面");
            result.append(String.format(Template.MSG_WATER_LEVEL, target.getName(), subStatistics.getNowQuality().getName()));
        }
        Level level = getLevel(target, subStatistics.getType());
        MonitorStatistics now;
        if (subStatistics.getMonitors().size() == 1) {
            now = subStatistics.getMonitors().get(0);
        } else {
            now = subStatistics.getAvgValues();
        }
        if (subStatistics.getTargetQuality().getState() < nowQuality.getState()) {
            result.append("，");
            result.append(Template.MSG_DETAIL_ELEMENT);
            //溶解氧
            if (subStatistics.getElementLevel().getDissolvedOxyStandard().getState() >  target.getState()) {
                result.append(addComma(result));
                result.append(String.format(Template.MSG_DOX, subStatistics.getTargetQuality().getName(), level.DOX, String.format("%.2f", now.getDissolvedOxy()), subStatistics.getElementLevel().getDissolvedOxyStandard().getName()));
            }
            //高猛酸
            if (subStatistics.getElementLevel().getPermanganateStandard().getState() >  target.getState()) {
                result.append(addComma(result));
                result.append(String.format(Template.MSG_KM, subStatistics.getTargetQuality().getName(), level.KM, String.format("%.2f", now.getPermanganate()), subStatistics.getElementLevel().getPermanganateStandard().getName()));
            }
            //化学含氧量
            if (subStatistics.getElementLevel().getCodStandard().getState() > target.getState()) {
                result.append(addComma(result));
                result.append(String.format(Template.MSG_OX, subStatistics.getTargetQuality().getName(), level.OX, String.format("%.2f", now.getCod()), subStatistics.getElementLevel().getCodStandard().getName()));
            }
            //氨氮量
            if (subStatistics.getElementLevel().getNh3_nStandard().getState() >  target.getState()) {
                result.append(addComma(result));
                result.append(String.format(Template.MSG_NH, subStatistics.getTargetQuality().getName(), level.NH3, String.format("%.2f", now.getNh3_n()), subStatistics.getElementLevel().getNh3_nStandard().getName()));
            }

            //总磷
            if (subStatistics.getElementLevel().getPhosphorusStandard().getState() >  target.getState()) {
                result.append(addComma(result));
                result.append(String.format(Template.MSG_P, subStatistics.getTargetQuality().getName(), level.P,String.format("%.2f", now.getTotal_phosphorus()), subStatistics.getElementLevel().getPhosphorusStandard().getName()));
            }
        } else {

        }
        //总氮量
        if (subStatistics.getElementLevel().getTotalN() != null  && subStatistics.getType() == EnumState.WaterType.LAKE) {
            result.append(addComma(result));
            result.append(String.format(Template.MSG_N, subStatistics.getTargetQuality().getName(), level.N, String.format("%.2f", now.getTotal_N()), subStatistics.getElementLevel().getTotalN().getName()));
        }
        return result;
    }


    private static String addComma(StringBuilder builder){
        if (builder.lastIndexOf("，") != (builder.length()-1) && builder.lastIndexOf("：") != (builder.length()-1)){
            return "，";
        }
        return "";
    }


}
