package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.RiverOwnerMapper;
import com.crazyclub.www.waterlab.model.mybatis.RiverOwner;
import com.crazyclub.www.waterlab.model.mybatis.RiverOwnerExample;
import com.crazyclub.www.waterlab.service.RiverOwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RiverOwnerServiceImpl implements RiverOwnerService {

    @Autowired
    private RiverOwnerMapper mapper;

//    @Autowired
//    private River


    @Override
    public List<RiverOwner> listAll() {
        return mapper.selectByExample(null);
    }


    @Override
    public RiverOwner findByUserName(String userName) {
        RiverOwnerExample example = new RiverOwnerExample();
        example.createCriteria().andOwnerNameEqualTo(userName);
        List<RiverOwner> owners = mapper.selectByExample(example);
        if (owners.size() > 1){
            return owners.get(0);
        }
        return null;
    }

    @Override
    public RiverOwner findByRiverName(String riverName) {

        return null;
    }

    @Override
    public RiverOwner findByOwnerId(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(RiverOwner owner) {
        return mapper.insert(owner);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int delete(RiverOwner owner) {
        return deleteById(owner.getOwnerId());
    }
}
