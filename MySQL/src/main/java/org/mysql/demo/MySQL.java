
package org.mysql.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        MySqlConnection con = new MySqlConnection();
        Connection conn = con.getConnection();
       

        try {
            String query = "update employee set empdept = 'Analysis' where empname = 'Mahesh'";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.executeUpdate(); 

            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            String query = "insert into employee values(762,'Manohar',20,'Account')";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            String query = "select * from employee";
            PreparedStatement psmt = conn.prepareStatement(query);

            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                int empId = rs.getInt("empid");
                String empName = rs.getString("empname");
                int age = rs.getInt("empage");
                String empDept = rs.getString("empDept");
                System.out.println("EmpId: " + empId + " EmpName: " + empName + " Age: " + age + " EmpDept: " + empDept);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
