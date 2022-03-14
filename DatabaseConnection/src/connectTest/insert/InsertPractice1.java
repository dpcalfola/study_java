package connectTest.insert;

import java.sql.*;

public class InsertPractice1 {
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



            //catch Primary Key
            String ideptno = "0";
            String sqlCatchKey = "SELECT MAX(DEPTNO) FROM DEPT";
            ResultSet catchKeyResultSet = stmt.executeQuery(sqlCatchKey);
            while (catchKeyResultSet.next()) {
                ideptno = catchKeyResultSet.getString("MAX(DEPTNO)");
            }
            System.out.println("ideptno now : " + ideptno + "\n");
            int newIdeptnoInt = Integer.parseInt(ideptno) + 10;
            ideptno = String.valueOf(newIdeptnoInt);


            // Insert SQL
            String sdname = "IT", sloc = "SEOUL";
            String sql = "INSERT INTO DEPT VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
            boolean b = stmt.execute(sql);


            if (!b) {
                System.out.println("Insert success.\n");

            } else {
                System.out.println("Insert fail.\n");
            }


            String sql2 = "SELECT * FROM DEPT";


            ResultSet rs = stmt.executeQuery(sql2);
            while (rs.next()) {
                System.out.print(rs.getString("DEPTNO") + " \t");
                System.out.print(rs.getString("DNAME") + " \t\t");
                System.out.println(rs.getString("LOC") + " ");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver loading fail.");
        } catch (SQLException e) {
            System.out.println("MySQL connection fail");
        } catch (Exception e) {
            System.out.println("Unexpected exception");
        }

    }
}
