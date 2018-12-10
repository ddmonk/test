package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.CheckPointMapper;
import com.crazyclub.www.waterlab.dao.mybatis.generated.CheckTypeMapper;
import com.crazyclub.www.waterlab.model.mybatis.CheckType;
import com.crazyclub.www.waterlab.service.CheckTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckTypeServiceImpl implements CheckTypeService {

    @Autowired
    CheckTypeMapper mapper;


    @Override
    public List<CheckType> listAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public CheckType findById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(CheckType type) {
        mapper.insert(type);
    }

    @Override
    public void update(CheckType type) {
        mapper.updateByPrimaryKeySelective(type);
    }

    @Override
    public void delete(CheckType type) {
        deleteById(type.getCheckTypeId());
    }

    @Override
    public void deleteById(int id) {
        mapper.deleteByPrimaryKey(id);
    }
}
