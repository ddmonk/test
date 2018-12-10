package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.CompanyInfoMapper;
import com.crazyclub.www.waterlab.model.mybatis.CompanyInfo;
import com.crazyclub.www.waterlab.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyInfoMapper mapper;

    @Override
    public List<CompanyInfo> listAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public CompanyInfo findById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(CompanyInfo companyInfo) {
        return mapper.insert(companyInfo);
    }

    @Override
    public int update(CompanyInfo companyInfo) {
        return mapper.updateByPrimaryKeySelective(companyInfo);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
