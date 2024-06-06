/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baseActions;

import java.util.Date;

/**
 *
 * @author JD Morales
 */
public class EmpDetails {

    private int id;
    private String lastName;
    private String firstName;
    private Date birthday;
    private String email;
    private String password;
    private String designation;
    private String address;
    private String phoneNumber;
    
    private String SSS;
    private String philHealth;
    private String tin;
    private String pagIbig;
    private String status;
    private String position;
    private String immediateSupervisor;
    
    private String basicSalary;
    private String riceSubsidy;
    private String phoneAllowance;
    private String clothingAllowance;
    private String grossSemiMonthlyRate;
    private String hourlyRate;
  
    private int firstLogin;
    
    // Overload the constructor with different parameter combinations
  
    public EmpDetails(int id, int FirstLogin, String designation) {
        //this.id = Integer.parseInt(id);
        this.id = id;
        this.firstLogin = FirstLogin;
        this.designation = designation;
        
    }

    
    public EmpDetails(int id, String lastName, String firstName, Date birthday, String email, String designation) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.email = email;
        this.designation = designation;
    }
    
    
    public EmpDetails(int id, String lastName, String firstName, Date birthday, String email, String password, String designation) {
        
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
        this.designation = designation;
        
    }

    public EmpDetails(int id, String lastName, String firstName, String SSS, String philHealth, String tin, String pagIbig) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.SSS = SSS;
        this.philHealth = philHealth;
        this.tin = tin;
        this.pagIbig = pagIbig;
    }    

    public EmpDetails(int id, int FirstLogin, String designation, String firstName, String lastName,  Date birthday, String email, String position) {
        this.id = id;
        this.firstLogin = FirstLogin;
        this.designation = designation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.position = position;
    }

    public EmpDetails(int id, String designation, String firstName, String lastName, String basicSalary, String riceSubsidy, String phoneAllowance,
            String clothingAllowance, String grossSemiMonthlyRate, String hourlyRate) {
        this.id = id;
        this.designation = designation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
                
    }

    public EmpDetails(int id,
            String lastName,
            String firstName,
            Date birthday,
            String email,
            String designation,
            String address,
            String phoneNumber,
            String SSS,
            String philHealth,
            String tin,
            String pagIbig,
            String status,
            String position,
            String immediateSupervisor) {
                this.id = id;
                this.lastName = lastName;
                this.firstName = firstName;
                this.birthday = birthday;
                this.email = email;
                this.designation = designation;
                
                this.address = address;
                this.phoneNumber = phoneNumber;
                this.SSS = SSS;
                this.philHealth = philHealth;
                this.tin = tin;
                
                this.pagIbig = pagIbig;
                this.status = status;
                this.position = position;
                this.immediateSupervisor = immediateSupervisor;
    }     
    
    
    public EmpDetails(int id,
            String lastName,
            String firstName,
            Date birthday,
            String email,
            String password,
            String designation,
            String address,
            String phoneNumber,
            String SSS,
            String philHealth,
            String tin,
            String pagIbig,
            String status,
            String position,
            String immediateSupervisor,
            int firstLogin) {
                this.id = id;
                this.lastName = lastName;
                this.firstName = firstName;
                this.birthday = birthday;
                this.email = email;
                this.password = password;
                this.designation = designation;
                this.address = address;
                this.phoneNumber = phoneNumber;

                this.SSS = SSS;
                this.philHealth = philHealth;
                this.tin = tin;
                this.pagIbig = pagIbig;

                this.status = status;
                this.position = position;
                this.immediateSupervisor = immediateSupervisor;

                this.firstLogin = firstLogin;
    }     
    
    public EmpDetails(String designation,
            String firstName,
            String lastName,
            Date birthday,
            String email,
            String position,
            String basicSalary,
            String riceSubsidy,
            String phoneAllowance,
            String clothingAllowance,
            String grossSemiMonthlyRate,
            String hourlyRate,
            int id) {
            this.designation = designation;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
            this.email = email;
            this.position = position;
            this.basicSalary = basicSalary;
            this.riceSubsidy = riceSubsidy;
            this.phoneAllowance = phoneAllowance;
            this.clothingAllowance = clothingAllowance;
            this.grossSemiMonthlyRate = grossSemiMonthlyRate;
            this.hourlyRate = hourlyRate;
            this.id = id;

    }       

    EmpDetails(int aInt, String string, String string0, java.sql.Date date, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, int aInt0, String string13, String string14, String string15, String string16, String string17, String string18) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    EmpDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


//------------   #### SET PROPERTIES HERE ------############//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //this.id = Integer.parseInt(id);
        this.id = id;
    }

    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }   

// Employee Benefits
    public String getSSS() {
        return SSS;
    }

    public void setSSS(String sss) {
        this.SSS = sss;
    }   
    
    public String getPhilHealth() {
        return philHealth;
    }

    public void setPhilHealth(String philhealth) {
        this.philHealth = philhealth;
    }      
    
    public String getTIN() {
        return tin;
    }

    public void setTIN(String TIN) {
        this.tin = TIN;
    }       

    public String getPagIbig() {
        return pagIbig;
    }

    public void setPagIbig(String pagibig) {
        this.pagIbig = pagibig;
    }        
    
// Other Employment Details 
    public String getSatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }    

    public String getImmediateSupervisor() {
        return immediateSupervisor;
    }

    public void setImmediateSupervisor(String immediatesupervisor) {
        this.immediateSupervisor = immediatesupervisor;
    }     
    
    public int getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(int firstLogin) {
        this.firstLogin = firstLogin;
    }    

    public String getTin() {
        return tin;
    }

    public String getStatus() {
        return status;
    }

    public String getBasicSalary() {
        return basicSalary;
    }

    public String getRiceSubsidy() {
        return riceSubsidy;
    }

    public String getPhoneAllowance() {
        return phoneAllowance;
    }

    public String getClothingAllowance() {
        return clothingAllowance;
    }

    public String getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setRiceSubsidy(String riceSubsidy) {
        this.riceSubsidy = riceSubsidy;
    }

    public void setPhoneAllowance(String phoneAllowance) {
        this.phoneAllowance = phoneAllowance;
    }

    public void setClothingAllowance(String clothingAllowance) {
        this.clothingAllowance = clothingAllowance;
    }

    public void setGrossSemiMonthlyRate(String grossSemiMonthlyRate) {
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    Object getDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getlastName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getfirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
        
}
