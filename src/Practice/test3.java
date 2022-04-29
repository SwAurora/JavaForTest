package Practice;

import java.sql.*;

public class test3
{
    public static void main(String[] args)
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/TEMPDB";
        String id = "root";
        String pw = "1234";

        String sql;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try
        {
            Class.forName(driver);
            System.out.println("Driver Loading Success");
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB Connected..");

            pstmt = conn.prepareStatement("select * from student_tbl");
            rs = pstmt.executeQuery();

            while(rs.next())
            {
                System.out.print(rs.getString("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("age") + " ");
                System.out.print(rs.getString("addr") + " ");
                System.out.println();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
        }
    }
}
