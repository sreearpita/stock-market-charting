package com.cognizant.stockexchange.model;

public class Company {
	private int companyCode;
	private String companyName;
	private float turnover;
	private String ceo;
	private String boardOfDirectors;
	private int sectorId;
	private String breifWriteup;
	private int stockCode;
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBreifWriteup() {
		return breifWriteup;
	}
	public void setBreifWriteup(String breifWriteup) {
		this.breifWriteup = breifWriteup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public String toString() {
		return "|| id : " + this.companyCode + "  || company Name : " + this.companyName + "  || Turnover :  " + this.turnover + "  || CEO : " + this.ceo + "  ||  Board Of Directors : " + this.boardOfDirectors + "  || Sector id : " + this.sectorId + "  || Brief writeup : " + this.breifWriteup + "  || Stock code : " + this.stockCode;
		
	}

}
