package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.CheckPoint;

import java.util.List;

/**
 * 检验点的位置
 */
public interface CheckPointService {

    List<CheckPoint> listAll();

    CheckPoint getCheckPoint(String id);

    int save(CheckPoint checkPoint);

    int update (CheckPoint checkPoint);

    int delete(CheckPoint checkPoint);

    int deleteById(String id);
}
