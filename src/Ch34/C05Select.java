package Ch34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C05Select
{
    public static void main(String[] args)
    {
        //연결관련 정보 저장용 변수
        String id = "root";
        String pw = "1234";
        String url = "jdbc:mysql://localhost:3306/testdb";

        //DB 연결관련 객체를 위한 참조 변수
        Connection conn = null;             //DB 연결객체
        PreparedStatement pstmt = null;     //SQL 쿼리 전송 객체
        ResultSet rs = null;                //쿼리결과(Select) 수신용 객체

        //연결
        try
        {
            //DB Driver 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading Success!");
            //DB 연결객체 생성
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB Connected..");
            //SQL 전송 객체
            pstmt = conn.prepareStatement("select * from member_tbl");
            //SQL 실행
            rs = pstmt.executeQuery();

            while(rs.next())
            {
                System.out.println("이름: " + rs.getString("name") + " 나이: " + rs.getInt("age") + " 주소: " + rs.getString("addr"));
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
