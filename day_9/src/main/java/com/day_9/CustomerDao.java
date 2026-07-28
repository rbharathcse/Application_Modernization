package com.day_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDao {
	    private String driver;
	    private String url;
	    private String userName;
	    private String password;

	    // Setter methods for dependency injection
	    public void setDriver(String driver) {
	        this.driver = driver;
	    }
	    public void setUrl(String url) {
	        this.url = url;
	    }
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void selectAllRows() throws ClassNotFoundException, SQLException {
	        System.out.println("Retrieving customer data..");

	        // driver is loading
	        Class.forName(driver);

	        // connection establishment is done here
	        Connection con = DriverManager.getConnection(url, userName, password);

	        // Executing our query
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM customerdb.customerInfo");

	        while (rs.next()) {
	            int customerId = rs.getInt(1);
	            String customerName = rs.getString(2);
	            String customerPhone = rs.getString(3);
	        

	            System.out.println(customerId + " " + customerName + " " + customerPhone );
	        }

	        // Close connection
	        con.close();
	    }

}
