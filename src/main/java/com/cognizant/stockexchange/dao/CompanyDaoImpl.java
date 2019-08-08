package com.cognizant.stockexchange.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.stockexchange.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{
	public List<Company> getCompanyList() throws Exception {
		List <Company> companyList=new ArrayList<Company>();
		Class.forName("com.mysql.jdbc.Driver");  

		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","pass@word1");
			PreparedStatement ps=conn.prepareStatement("select * from company");
			ResultSet rs=	ps.executeQuery();
			Company company=null;
			while(rs.next()){
				company=new Company();
				company.setCompanyCode(rs.getInt("company_code"));
				company.setCompanyName(rs.getString("company_name"));
				company.setTurnover(rs.getFloat("turnover"));
				company.setCeo(rs.getString("ceo"));
				company.setBoardOfDirectors(rs.getString("board_of_directors"));
				company.setSectorId(rs.getInt("sector_id"));
				company.setBreifWriteup(rs.getString("brief_writeup"));
				company.setStockCode(rs.getInt("stock_code"));
				companyList.add(company);
			}
		}catch(SQLException e){
			e.printStackTrace();


		}
		return companyList;
	}
	public int insert(Company company) throws Exception{

		Class.forName("com.mysql.jdbc.Driver");  
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","pass@word1");
			PreparedStatement pstmt = conn.prepareStatement("insert into company values (?,?,?,?,?,?,?,?)");
			pstmt.setInt(1,company.getCompanyCode());
			pstmt.setString(2, company.getCompanyName());
			pstmt.setFloat(3, company.getTurnover());
			pstmt.setString(4, company.getCeo());
			pstmt.setString(5, company.getBoardOfDirectors());
			pstmt.setInt(6, company.getSectorId());
			pstmt.setString(7, company.getBreifWriteup());
			pstmt.setInt(8, company.getStockCode());
			int x = pstmt.executeUpdate();
			if(x == 0)
				return -1;
			else
				return 1;
		}
		catch(Exception e) {
			e.printStackTrace();	
			
		}
		return -1;
	}
	@Override
	public int update(Company company, int id) throws Exception {
		

		Class.forName("com.mysql.jdbc.Driver");  
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","pass@word1");
			PreparedStatement pstmt = conn.prepareStatement("update company set company_name  = ?, "
					+ "turnover  = ? ,"
					+ "ceo = ? , "
					+ "board_of_directors = ? ,"
					+ "sector_id = ? ,"
					+ "brief_writeup = ? ,"
					+ "stock_code = ? where company_code  = ?");
			pstmt.setInt(8,company.getCompanyCode());
			pstmt.setString(1, company.getCompanyName());
			pstmt.setFloat(2, company.getTurnover());
			pstmt.setString(3, company.getCeo());
			pstmt.setString(4, company.getBoardOfDirectors());
			pstmt.setInt(5, company.getSectorId());
			pstmt.setString(6, company.getBreifWriteup());
			pstmt.setInt(7, company.getStockCode());
			int x = pstmt.executeUpdate();
			if(x == 0)
				return -1;
			else
				return 1;
		}
		catch(Exception e) {
			e.printStackTrace();	
			
		}
		return -1;	}
}
