package classParctice1;

import java.sql.*;

public class DatabaseConnect {

    void connectMySQL(){

        String driver = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/EZEN";
        String user = "fola";
        String password = "123456789";

        try {
            Class.forName(driver);
            System.out.println("MySQL driver loading success.");

            Connection conn = DriverManager.getConnection(URL, user, password);
            System.out.println("MySQL connection success");
            System.out.println();

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM DEPT";
            ResultSet rs = stmt.executeQuery(sql);



            while (rs.next()) {
                System.out.print(rs.getString("DEPTNO") + " ");
                System.out.print(rs.getString("DNAME") + " ");
                System.out.println(rs.getString("LOC") + " ");
            }
        }catch (ClassNotFoundException e){
            System.out.println("MySQL driver loading fail.");
        }catch (SQLException e){
            System.out.println("MySQL connection fail");
        }catch(Exception e) {
            System.out.println("Unexpected exception");
        }

    }




}
