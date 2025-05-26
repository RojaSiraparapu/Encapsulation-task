package com.company;

public class Company {
	private  String companyname;
	private String companyaddress;
	private String companyrules;

private Company(String companyname,String companyaddress,String companyrules) {
	this.companyname=companyname;
	this.companyaddress=companyaddress;
	this.companyrules=companyrules;
	
}

public String getCompanyname() {
	return companyname;
}

public void setCompanyname(String companyname) {
	this.companyname = companyname;
}

public String getCompanyaddress() {
	return companyaddress;
}

public void setCompanyaddress(String companyaddress) {
	this.companyaddress = companyaddress;
}



public String getCompanyrules() {
	return companyrules;
}

public void setCompanyrules(String companyrules) {
	this.companyrules = companyrules;
}

public String toString() {
	return "[Companyname=" + companyname + ", companyaddress=" + companyaddress + ", companyrules="
			+ companyrules + "]";
}	
public static Company getCompanyObject(String companyname, String companyaddress, String companyrules) {
    return new Company(companyname, companyaddress,companyrules);
}
}

