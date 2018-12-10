package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.CheckType;

import java.util.List;

/**
 * 检查指标
 */
public interface CheckTypeService {

    List<CheckType> listAll();

    CheckType findById(int id);

    void save(CheckType type);

    void update(CheckType type);

    void delete(CheckType type);

    void deleteById(int id);
}
