package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.Water;

import java.util.List;

/**
 * 主要存放河湖的详细信息。
 */
public interface WaterService {

    List<Water> listAll();

    List<Water> findByType(int type);

    List<Water> findByCountryId(int country);

    int save(Water water);

    int delete(Water water);

    int deleteById (int id);

    int update(Water water);

}
