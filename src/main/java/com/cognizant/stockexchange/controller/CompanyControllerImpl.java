package com.cognizant.stockexchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cognizant.stockexchange.model.Company;
import com.cognizant.stockexchange.service.CompanyService;

@Controller
public class CompanyControllerImpl implements CompanyController {


	@Autowired
	private CompanyService companyService;

	@Override
	public List<Company> getCompanyList() throws Exception {
		return companyService.getCompanyList();
	}

	@Override
	public int insert(Company company) throws Exception{
		return companyService.insert(company);
	}

	@Override
	public int update(Company company, int id) throws Exception {
		// TODO Auto-generated method stub
		return companyService.update(company,id);
	}
}
