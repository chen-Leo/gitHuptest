package level1;

import java.sql.Connection;
import java.sql.SQLException;


public class Test {


    public static void main(String[] args) {
        Connection con = JDBCUtil.getConnection();

        Main main = new Main(con);


        Student stu1 = new Student("cang",001,59);
        Student stu2 = new Student("k4ii",002,60);
        Student stu3 = new Student("cangの彼女",003,61);


        try {

            main.createTable();

            System.out.println("加入001，002的学生信息");
            main.insert(stu1);
            main.insert(stu2);
            main.select();

            System.out.println("删除002的学生信息");
            main.delete(2);
            main.select();

            System.out.println("更新001的成绩为60");
            stu1.setGrade(60);
            main.update(stu1);
            main.select();

            System.out.println("插入003的学生信息");
            main.insert(stu3);
            main.select();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(main.getRs(), main.getPreparedStatment(), main.getCon());
        }
   }
}



















