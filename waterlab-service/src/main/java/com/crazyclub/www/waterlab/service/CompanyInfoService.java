package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.CompanyInfo;

import java.util.List;

/**
 * 检查公司
 */
public interface CompanyInfoService {

    List<CompanyInfo> listAll();

    CompanyInfo findById(int id);

    int save(CompanyInfo companyInfo);

    int update(CompanyInfo companyInfo);

    int deleteById(int id);

}
