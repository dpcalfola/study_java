package classPractice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

    String URL = "jdbc:mysql://localhost:3306/EZEN";
    String user = "fola";
    String password = "123456789";

    private Connection con;
    private Statement stmt;
    private ResultSet rs;


    public ArrayList<MemberVO> list() {
        ArrayList<MemberVO> list = new ArrayList<>();

        try {

            connDB();

            String query = "SELECT * FROM emp";
            rs = stmt.executeQuery(query);

            while (rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                int sal = rs.getInt("sal");

                MemberVO data = new MemberVO(empno, ename, sal);
                list.add(data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list ;
    }

    public void connDB(){
        try{
            con = DriverManager.getConnection(URL, user, password);
            System.out.println("MySQL connection success.");
            stmt = con.createStatement();
            System.out.println("Statement create success.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
