package connectTest;

import java.sql.*;

public class MySQLConnectionTest2 {
    public static void main(String[] args) {

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

            String sql = "SELECT * FROM takes";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.print(rs.getString("stu_id") + " ");
                System.out.print(rs.getString("class_id") + " ");
                System.out.println(rs.getString("grade") + " ");
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
