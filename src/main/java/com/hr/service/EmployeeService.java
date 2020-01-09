package com.hr.service;


import com.hr.pojo.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeService {

    String TABLE_NAME = "tbl_emp";
    String INSERT_FIELDS = "emp_name, emp_email, gender, department_id";
    String SELECT_FIELDS = "emp_id, " + INSERT_FIELDS;

    public Employee selectOneById(@Param("emp_id") int empId);

    public Employee selectOneByName(@Param("emp_name") String emp_name);

}
