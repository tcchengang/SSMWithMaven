package com.cg.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebParam.Mode;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.Employee;
import com.cg.bean.EmployeeExample;
import com.cg.bean.EmployeeExample.Criteria;
import com.cg.dao.EmployeeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;
	public List<Employee> getEmps(){
		return employeeMapper.selectByExample(null);
		}
}
