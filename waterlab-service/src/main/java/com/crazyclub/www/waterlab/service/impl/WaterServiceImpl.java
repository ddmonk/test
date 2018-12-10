package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.WaterMapper;
import com.crazyclub.www.waterlab.model.mybatis.Water;
import com.crazyclub.www.waterlab.model.mybatis.WaterExample;
import com.crazyclub.www.waterlab.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WaterServiceImpl implements WaterService {

    @Autowired
    private WaterMapper mapper;

    @Override
    public List<Water> listAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public List<Water> findByType(int type) {
        WaterExample example = new WaterExample();
        example.createCriteria().andWaterTypeEqualTo(type);
        return mapper.selectByExample(example);
    }

    @Override
    public List<Water> findByCountryId(int countryId) {
        WaterExample example = new WaterExample();
        example.createCriteria().andWaterCountryIdEqualTo(countryId);
        return mapper.selectByExample(example);
    }

    @Override
    public int save(Water water) {
        return mapper.insert(water);
    }

    @Override
    public int delete(Water water) {
        return deleteById(water.getWaterId());
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Water water) {
        return mapper.updateByPrimaryKey(water);
    }
}
