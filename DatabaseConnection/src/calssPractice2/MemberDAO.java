package calssPractice2;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
    String URL = "jdbc:mysql://localhost:3306/EZEN";
    String user = "fola";
    String password = "123456789";

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public ArrayList<MemberVO> list(String name) {
        ArrayList<MemberVO> list = new ArrayList<>();

        try {
            connDB();

            String query = "SELECT * FROM emp";

            if (name != null) {
                query += " Where ename= '" + name.toUpperCase() + "'";
            }
            System.out.println("SQL: " + query);

            rs = stmt.executeQuery(query);
            rs.last();
            System.out.println("sr.getRow(): " + rs.getRow());

            if(rs.getRow() == 0){
                System.out.println("0 row selected - " );
            }else{
                System.out.println(rs.getRow() + " rows selected - ");
                rs.previous();
                while (rs.next()){
                    String empno = rs.getString("empno");
                    String ename = rs.getString("ename");
                    int sal = rs.getInt("sal");

                    MemberVO data = new MemberVO(empno, ename, sal);
                    list.add(data);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    public void connDB() {
        try {
            con = DriverManager.getConnection(URL, user, password);
            System.out.println("MySQL connection success.");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("statement create success.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
