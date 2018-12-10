package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.CheckPointMapper;
import com.crazyclub.www.waterlab.model.mybatis.CheckPoint;
import com.crazyclub.www.waterlab.service.CheckPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckPointServiceImpl implements CheckPointService {

    @Autowired
    private CheckPointMapper mapper;

    @Override
    public List<CheckPoint> listAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public CheckPoint getCheckPoint(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(CheckPoint checkPoint) {
        return mapper.insert(checkPoint);
    }

    @Override
    public int update(CheckPoint checkPoint) {
        return mapper.updateByPrimaryKey(checkPoint);
    }

    @Override
    public int delete(CheckPoint checkPoint) {
        return deleteById(checkPoint.getCheckpointId());
    }

    @Override
    public int deleteById(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

}
