package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.DepartmentMapper;
import com.crazyclub.www.waterlab.model.mybatis.Department;
import com.crazyclub.www.waterlab.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper mapper;


    @Override
    public List<Department> listAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public Department getDepartMentById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Department department) {
        return mapper.insert(department);
    }

    @Override
    public int update(Department department) {
        return mapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
