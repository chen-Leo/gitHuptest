package level1;

import java.sql.*;

//所用的数据库版本为 8.0
public class JDBCUtil {
    static { // 加载JDBC 驱动程序
        try {
            String name = "com.mysql.cj.jdbc.Driver";
            Class.forName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/test"
                            + "?serverTimezone=GMT%2B8",
                    "root",
                    "0405duanQWER789");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(ResultSet rs, PreparedStatement prestatement, Connection con) { //关闭数据库
        try {
            if (rs != null) rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (prestatement != null) prestatement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (con != null) con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
