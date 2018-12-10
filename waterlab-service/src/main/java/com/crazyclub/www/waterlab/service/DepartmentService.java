package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> listAll();

    Department getDepartMentById(int id);

    int save(Department department);

    int update(Department department);

    int deleteById(int id);

}
