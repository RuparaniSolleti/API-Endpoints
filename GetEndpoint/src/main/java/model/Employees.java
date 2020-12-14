package model;

public class Employees {
 private int employeeId;
 private String name;
 private String dateOfBirth;
 private String providentFundNumber;
 private String dateOfJoining;
 private String email;
 
public Employees() {
	super();
}
public Employees(int employeeId, String name, String dateOfBirth, String providentFundNumber, String dateOfJoining,
		String email) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.providentFundNumber = providentFundNumber;
	this.dateOfJoining = dateOfJoining;
	this.email = email;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getProvidentFundNumber() {
	return providentFundNumber;
}
public void setProvidentFundNumber(String providentFundNumber) {
	this.providentFundNumber = providentFundNumber;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
 
}
