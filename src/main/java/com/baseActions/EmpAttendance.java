/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baseActions;

import DBConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author JD Morales
 */
public class EmpAttendance {
    EmpAttendance empAttendanceList = new EmpAttendance();
    MotorPH_String QueryString = new MotorPH_String();
    
    // Retrieve user info
    public static int UserID = 0;
    public static String UserFirstName = "";
    public static String UserLastName = "";
    public static Date UserBirthday;
    public static String UserEmail = "";
    public static String UserDesignation = "";
    public static int UserFirstLogin = 0;
    public static String UserPosition = "";
    public static int AttId = 0;
    public static int ID = 0;
    public static int LogDate;
    public static Time LogTime;
    public static String Status;

    public static int getAttId() {
        return AttId;
    }

    public static void setAttId(int AttId) {
        EmpAttendance.AttId = AttId;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        EmpAttendance.ID = ID;
    }

    public static java.util.Date getLogDate() {
        return LogDate;
    }

    public static void setLogDate(java.util.Date LogDate) {
        EmpAttendance.LogDate = LogDate;
    }

    public static Time getLogTime() {
        return LogTime;
    }

    public static void setLogTime(Time LogTime) {
        EmpAttendance.LogTime = LogTime;
    }

    public static String getStatus() {
        return Status;
    }

    public static void setStatus(String Status) {
        EmpAttendance.Status = Status;
    }

    private EmpAttendance(int aInt, java.util.Date date, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private EmpAttendance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public EmpDetails retrieveUserInfo(int id) {
        EmpDetails empDetails = null;
        try (PreparedStatement ps = DBConnection.con.prepareStatement(QueryString.userSearchById)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    empDetails = new EmpDetails(
                            rs.getInt(Integer.parseInt(QueryString.id)),
                            rs.getString(QueryString.lastName),
                            rs.getString(QueryString.firstName),
                            rs.getDate(QueryString.birthDay),
                            rs.getString(QueryString.email),
                            rs.getString(QueryString.position),
                            rs.getString(QueryString.designation)
                    );
                }
                
                UserID = empDetails.getId();
                UserFirstName = empDetails.getFirstName();
                UserLastName = empDetails.getLastName();
                UserBirthday = empDetails.getBirthday();
                UserEmail = empDetails.getEmail();
                UserDesignation = empDetails.getDesignation();
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in retrieving info: " + e.getMessage());
        }
        return empDetails;
    }
    
    
        public EmpAttendance retrieveUserAtt(int id) {
       
        try {
            PreparedStatement ps = DBConnection.con.prepareStatement(QueryString.searchByID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    empAttendanceList.setAttId(rs.getInt(QueryString.attId));
                    empAttendanceList.setID(rs.getInt(QueryString.id));
                    empAttendanceList.setLogDate(rs.getDate(QueryString.logDate));
                    empAttendanceList.setLogTime(rs.getTime(QueryString.logTime));
                    empAttendanceList.setStatus(rs.getString(QueryString.status));
                    
            }else {
            JOptionPane.showMessageDialog(null, "No record selected");
            }
       } catch (SQLException e) {
            // handle the exception
       }
         return empAttendanceList;
    }
    
    
    public List<EmpAttendance> loadAtt() {
        List<EmpAttendance> list = new ArrayList<>();
        try {
            PreparedStatement ps = DBConnection.con.prepareStatement(QueryString.displayEmployeeAtt);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new EmpAttendance(
                        //rs.getInt(Integer.parseInt(searchQuery.id)),
                        rs.getInt(QueryString.attId),
                        rs.getInt(QueryString.id),
                        rs.getDate(QueryString.logDate),
                        rs.getTime(QueryString.logTime),
                        rs.getString(QueryString.status)
                ));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
        return list;
    }

    public static void saveTimeInToDatabase(Date dateString, Time time) {
        
        try {
        //loadConnection();
        int id = EmpAttendance.UserID;
        String query = "INSERT INTO attendance (AttID, ID, LogDate, LogTime, Status) VALUES (NULL, ?, ?, ?, ?)";
        PreparedStatement ps = DBConnection.con.prepareStatement(query);
        ps.setInt(1, id); // Assuming ID is an integer
         ps.setDate(2, new java.sql.Date(dateString.getTime()));
        ps.setTime(3, time);// Assuming LogDate is a string
        ps.setString(4, "Logged in"); // Assuming Status is a string
        ps.executeUpdate();
        ps.close();
        JOptionPane.showMessageDialog(null, "TIME-IN time saved successfully!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error in saving TIME-IN time: " + e.getMessage());
    }
        
    }
    public static void saveTimeOutToDatabase(Date dateString, Time time) {
        
        try {
        //loadConnection();
        int id = EmpAttendance.UserID;
        String query = "INSERT INTO attendance (AttID, ID, LogDate, LogTime, Status) VALUES (NULL, ?, ?, ?, ?)";
        PreparedStatement ps = DBConnection.con.prepareStatement(query);
        ps.setInt(1, id); // Assuming ID is an integer
         ps.setDate(2, new java.sql.Date(dateString.getTime()));
        ps.setTime(3, time);// Assuming LogDate is a string
        ps.setString(4, "Logged out"); // Assuming Status is a string
        ps.executeUpdate();
        ps.close();
        JOptionPane.showMessageDialog(null, "TIME-OUT time saved successfully!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error in saving Check-OUT time: " + e.getMessage());
    }
}

    public static boolean hasCheckedIn(int value, Date dateString, Time timeString) {
        try {
        //loadConnection();
        String query = "SELECT COUNT(*) FROM attendance WHERE ID = ? AND LogDate = ? AND LogTime = ?";
        PreparedStatement ps = DBConnection.con.prepareStatement(query);
        ps.setInt(1, EmpAttendance.UserID);
         ps.setDate(2, new java.sql.Date(dateString.getTime()));
         ps.setTime(3, timeString);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error in checking TIME-IN status: " + e.getMessage());
    }
    return false;
    }
public static boolean hasCheckedOut(int value, Date dateString, Time timeString) {
        try {
        //loadConnection();
        String query = "SELECT COUNT(*) FROM attendance WHERE ID = ? AND LogDate = ? AND LogTime = ?";
        PreparedStatement ps = DBConnection.con.prepareStatement(query);
        ps.setInt(1, EmpAttendance.UserID);
        ps.setDate(2, new java.sql.Date(dateString.getTime()));
        ps.setTime(3, timeString);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error in checking TIME-OUT status: " + e.getMessage());
    }
    return false;
    }
}
    

