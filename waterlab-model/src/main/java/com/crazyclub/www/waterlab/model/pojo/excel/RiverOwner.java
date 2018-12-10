package com.crazyclub.www.waterlab.model.pojo.excel;

import java.util.List;


/**
 * position Detail
 */
public class RiverOwner {

    String userName;

    //职位
    String position;

    List<RiverStatistics> riverStatisticsList;

    public String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<RiverStatistics> getRiverStatisticsList() {
        return riverStatisticsList;
    }

    public void setRiverStatisticsList(List<RiverStatistics> riverStatisticsList) {
        this.riverStatisticsList = riverStatisticsList;
    }
}
