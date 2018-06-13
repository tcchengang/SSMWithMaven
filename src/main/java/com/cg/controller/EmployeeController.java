package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.bean.Employee;
import com.cg.bean.Message;
import com.cg.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getEmpsWithJson")
	@ResponseBody
	public Message getEmpsWithJson(@RequestParam(value="pageNum",defaultValue="1") Integer pageNum){
		PageHelper.startPage(pageNum, 5);
		List<Employee> emps=employeeService.getEmps();
		PageInfo info=new PageInfo(emps,5);
		return Message.success().add("pageInfo", info);
	}
	
	@RequestMapping("/getemps")
	public String getAllEmps(@RequestParam(value="pageNum",defaultValue="1") Integer pageNum ,Model model){
		PageHelper.startPage(pageNum, 5);
		List<Employee> emps=employeeService.getEmps();
		PageInfo info=new PageInfo(emps,5);
		model.addAttribute("pageInfo", info);
		return "list";
	}
}
