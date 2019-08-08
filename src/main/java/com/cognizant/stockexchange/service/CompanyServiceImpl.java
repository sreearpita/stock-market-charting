package com.cognizant.stockexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.stockexchange.dao.CompanyDao;
import com.cognizant.stockexchange.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;

	@Override
	public List<Company> getCompanyList() throws Exception {
		return companyDao.getCompanyList();
	}

	@Override
	public int insert(Company company) throws Exception{
		return companyDao.insert(company);
	}

	@Override
	public int update(Company company , int id) throws Exception{
		return companyDao.update(company, id);

	}

}
