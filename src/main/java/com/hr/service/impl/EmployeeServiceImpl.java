package com.hr.service.impl;

import com.hr.mapper.EmployeeMapper;
import com.hr.pojo.Employee;
import com.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee selectOneById(int empId) {
        return employeeMapper.selectOneById(empId);
    }

    @Override
    public Employee selectOneByName(String emp_name) {
        return employeeMapper.selectOneByName(emp_name);
    }
}
