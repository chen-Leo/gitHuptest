package level1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

    public Connection getCon() {
        return con;
    }

    public PreparedStatement getPreparedStatment(){
        return pstmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public Main(Connection con) {
        this.con = con;
    }

    //建立学生表
    public void createTable() {
        String sql = "CREATE TABLE students " +
                "(studentNum INT, " +
                " name VARCHAR(20)," +
                " grade INT ," +
                " PRIMARY KEY ( studentNum ))";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //插入一条学生信息
    public int insert(Student student) {
        int i = 0;
        String sql = "insert into students (Name,StudentNum,grade) values(?,?,?)";
        try {
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getStudentNum());
            pstmt.setInt(3, student.getGrade());
            //executeUpdate()，返回int ，表示有多少条数据受到了影响
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //更新一条学生信息
    public int update(Student student) throws SQLException {
        int i = 0;
        String sql = "update students set StudentNum='" + student.getStudentNum() + "', grade =  '" + student.getGrade() + "'"
                + " where StudentNum='" + student.getStudentNum() + "'";
        try {
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    //查询数据库中的所有结果
    public void select() throws SQLException {
        String sql = "select * from students";
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int studentNum = rs.getInt(1);
            String name = rs.getString(2);
            int grade = rs.getInt(3);
            System.out.println(studentNum + "\t" + name + "\t" + grade);
        }
    }


    //根据学生的学号删除该学生的学生信息
    public int delete(int studentNum) throws SQLException {
        int i = 0;
        String sql = "delete from students where studentNum = " + studentNum;
        try {
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("resutl:" + " " +i);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return i;
    }
}
