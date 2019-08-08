package com.cognizant.stockexchange;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.stockexchange.controller.CompanyController;
import com.cognizant.stockexchange.model.Company;

@SpringBootApplication
public class StockExchangeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		CompanyController companyController = (CompanyController)applicationContext.getBean("companyControllerImpl");
		Company company = new Company();
		company.setCompanyCode(102);
		company.setCompanyName("Cognizant");
		company.setTurnover(18.12f);
		company.setCeo("Brian Humphries");
		company.setBoardOfDirectors("ABC");
		company.setSectorId(3);
		company.setBreifWriteup("Best Company");
		company.setStockCode(2);
		
		try {
			System.out.println(companyController.getCompanyList());
		//	int result = companyController.insert(company);
		 int result = companyController.update(company,company.getCompanyCode());
			if(result == 1)
				System.out.println("Updated Successfully");
			else
				System.out.println("Not updated ");
				
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}

}
