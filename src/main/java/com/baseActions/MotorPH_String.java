/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baseActions;

/**
 *
 * @author CHAS
 */
public class MotorPH_String {
    //Queries
    // ADD new records
    String insertDataAddEmp = "INSERT INTO motorphdb (`Last Name`, `First Name`, Birthday, Email, Password, Designation, address, phoneNumber, SSS, philHealth, tin, pagIbig, status, position, immediateSupervisor, 1	) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    // READ-only or Retrieve records
    String loadData = "select * from motorphdb";
    String searchEmployee = "SELECT * FROM motorphdb WHERE ID = ? OR `Last Name` LIKE ? OR `First Name` LIKE ?";
    String displayEmployeeInfo = "SELECT `SSS #`, `Philhealth #`, `Pag-ibig #`, `TIN #` FROM motorphdb WHERE ID = ?";
    String displayEmployeeSalary = "SELECT `Basic Salary`, `Rice Subsidy`, `Phone Allowance`, `Clothing Allowance`, `Gross Semi-Monthly Rate`, `Hourly Rate` FROM motorphdb WHERE ID = ?";
    //String userLoginSearch = "SELECT ID, `Last Name`, `First Name`, Birthday, Email, Designation, Position, FirstLogin FROM motorphdb WHERE Email = ? AND Password = ?";
    String userLoginSearch = "SELECT * FROM motorphdb WHERE Email = ? AND Password = ?";    
    String userSearchById = "SELECT ID, `Last Name`, `First Name`, Birthday, Email, Designation, Position, FirstLogin FROM motorphdb WHERE ID = ? ORDER BY ID ASC LIMIT 1";
    String searchByEmail = "SELECT * FROM motorphdb WHERE Email = ?";
    String searchByID = "SELECT * FROM motorphdb WHERE ID = ?";    
    
    // UPDATE records
    String updateEmpDetails = "update motorphdb set `Last Name` = ?, `First Name` = ?, Birthday = ?, Email = ?, Designation = ?, Address = ?, `Phone Number` = ?, `SSS #` = ?, `Philhealth #` = ?, `TIN #` = ?, `Pag-ibig #` = ?, Status = ?, Position = ?, `Immediate Supervisor` = ? WHERE ID = ?";
    String updateDefaultPassword = "UPDATE motorphdb SET `Security Question` = ?, `Security Answer` = ?, Password = ?, FirstLogin = 0 WHERE ID = ?";      
    String updatePassword = "UPDATE motorphdb SET Password = ? WHERE Email = ? AND Password = ?";    
    String returnAllDataToTextField = "update motorphdb set `Last Name` = ?, `First Name` = ?, Birthday = ?, Email = ?, Password = ?, Designation = ? WHERE ID = ?";    
    
    // DELETE records

    
  
    
    //Variables used to indicate the Index or Query result's column names when assigning values to the EmpDetails list.
    String id = "ID";
    String lastName = "Last Name";
    String firstName = "First Name";
    String birthDay  = "Birthday";
    String email = "Email";
    String password = "Password";
    String designation = "Designation";
    String address = "Address";
    String phoneNumber = "Phone Number";

    String SSS = "SSS #";
    String philHealth = "Philhealth #";
    String tin = "TIN #";
    String pagIbig = "Pag-ibig #";
    String status = "Status";
    String position = "Position";
    String immediateSupervisor = "Immediate Supervisor";
    
    
    String logDate = "LogDate";
    String logTime = "LogTime";

    
    String FirstLogin = "FirstLogin";    
    
    String basicSalary = "basicSalary";
    String riceSubsidy = "riceSubsidy";
    String phoneAllowance = "phoneAllowance";
    String clothingAllowance = "clothingAllowance";
    String grossSemiMonthlyRate = "grossSemiMonthlyRate";
    String hourlyRate = "hourlyRate";
    
}