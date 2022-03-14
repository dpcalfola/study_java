package connectTest;

import java.sql.*;

public class MySQLConnectionTest3 {
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

            String sql = "SELECT * FROM EMP";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.print(rs.getString("ENAME") + " ");
                System.out.print(rs.getInt("SAL") + " ");
                System.out.println();

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
