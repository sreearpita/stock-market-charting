package com.cognizant.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import com.cognizant.stockexchange.model.Company;

public interface CompanyService {
	public List<Company> getCompanyList() throws Exception;

	public int insert(Company company) throws Exception;

	public int update(Company company,int id) throws Exception;

}
