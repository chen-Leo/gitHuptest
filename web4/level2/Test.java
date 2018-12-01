package level2;

import java.sql.Connection;
import java.sql.SQLException;


public class Test {


    public static void main(String[] args) {
        Connection con = JDBCUtil.getConnection();

        Main main = new Main(con);


        Department dep1 = new Department("生鲜",1001,100,"小1","110","重庆");
        Worker worker1 = new Worker(1101,"小1","110","重庆",20,1001);
        Worker worker2 = new Worker(1102,"小2","111","重庆",21,1001);
        Worker worker3 = new Worker(1103,"小3","112","重庆",24,1001);
        Worker worker4 = new Worker(1100,"小4","113","重庆",22,1001);
        Supplier supplier1 = new Supplier("肝厂","17589665872","重庆");
        Commodity commodity1 = new Commodity(2001,"肝",600,2600,1001,"肝厂");
        Storehouse storehouse1 = new Storehouse(3001,"小2","重庆");






        try {

//            main.createTable();
//            System.out.println("插入信息");
//            main.insertDeapartment(dep1);
//            main.insertWorker(worker1);
//            main.insertWorker(worker2);
//            main.insertWorker(worker3);
//            main.insertSupplier(supplier1);
//            main.insertCommodity(commodity1);
//            main.insertStorehouse(storehouse1);
//            main.select();
//
//            System.out.println("删除1103的员工信息");
//            main.deleteWorker(1103);
//            main.select();
            System.out.println("更新1101员工的信息");
            worker1.setWorkerAge(18);
            main.updateWorker(worker1);
            main.select();



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(main.getRs(), main.getPreparedStatment(), main.getCon());
        }
   }
}



















