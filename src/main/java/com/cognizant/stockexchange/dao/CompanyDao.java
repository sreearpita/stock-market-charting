package com.cognizant.stockexchange.dao;

import java.sql.SQLException;
import java.util.List;

import com.cognizant.stockexchange.model.Company;

public interface CompanyDao {
	public List<Company> getCompanyList() throws Exception;
	public int insert(Company company) throws Exception;
	public int update(Company company,int id) throws Exception;

}
