package level2;
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
        String sql =
                "create table department(" +  //建立部门表
                        "departmentName varchar(20)," +
                        "departmentNum int ," +
                        "monthCast int," +
                        "director varchar(10)," +
                        "departmentContactWay  varchar(50)," +
                        "deapartmentAddress varchar(50)," +
                        "PRIMARY KEY (departmentNum))";

        String sql1 =
                "create table worker(" +    //建立员工表
                        "workerNum int," +
                        "workerName varchar(10) UNIQUE ," +
                        "contactWay varchar(50)," +
                        "workerAddress varchar(50)," +
                        "workerAge    int," +
                        "departmentNum  int ," +
                        "PRIMARY KEY(workerNum)," +
                        "FOREIGN KEY(departmentNum )REFERENCES department (departmentNum))";

        String sql2 =
                "create table supplier (" +    //建立供应商表
                        "supplierName    varchar(20)," +
                        "supplierPhoneNum char(11)," +
                        "supplierAddress varchar(50)," +
                        "PRIMARY KEY(supplierName ))";

        String sql3 =
                "create table commodity(" + //建立商品表
                        "commodityNum int," +
                        "commodityName varchar(20)," +
                        "purchasingCost  int," +
                        "price int," +
                        "departmentNum  int ," +
                        "supplierName varchar(20)," +
                        "FOREIGN KEY(departmentNum )REFERENCES department (departmentNum)," +
                        "FOREIGN KEY(supplierName )REFERENCES supplier (supplierName)," +
                        "PRIMARY KEY(commodityNum))";
        String sql4 =
                "create table storehouse(" +  //建立仓库表
                        "storehouseNum int ," +
                        "storehouseControllerName varchar(10)," +
                        "storehouseContactWay    varchar(50)," +
                        "PRIMARY KEY(storehouseNum ))";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql1);
            pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql2);
            pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql3);
            pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql4);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //插入一条部门信息
    public int insertDeapartment(Department department) {
        int i = 0;
        String sql = "insert into Department (departmentName,departmentNum,monthCast,director,departmentContactWay,deapartmentAddress) values(?,?,?,?,?,?)";
        try {
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1,department.getDepartmentName());
            pstmt.setInt(2, department.getDepartmentNum());
            pstmt.setInt(3, department.getMonthCast());
            pstmt.setString(4, department.getDirector());
            pstmt.setString(5,department.getDepartmentContactWay());
            pstmt.setString(6,department.getDeapartmentAddress());
            //executeUpdate()，返回int ，表示有多少条数据受到了影响
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

//插入一条员工信息
    public int insertWorker(Worker worker) {
        int i = 0;
        String sql = "insert into Worker (workerNum,workerName,contactWay,workerAddress,workerAge,departmentNum) values(?,?,?,?,?,?)";
        try {
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setInt(1, worker.getWorkerNum());
            pstmt.setString(2,worker.getWorkerName() );
            pstmt.setString(3,worker.getContactWay());
            pstmt.setString(4,worker.getWorkerAddress());
            pstmt.setInt(5,worker.getWorkerAge());
            pstmt.setInt(6,worker.getDepartmentNum());
            //executeUpdate()，返回int ，表示有多少条数据受到了影响
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
//插入一条供应商信息
public int insertSupplier(Supplier supplier) {
    int i = 0;
    String sql = "insert into supplier (supplierName,supplierPhoneNum,supplierAddress) values(?,?,?)";
    try {
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        pstmt.setString(1,supplier.getSupplierName());
        pstmt.setString(2,supplier.getSupplierPhoneNum());
        pstmt.setString(3,supplier.getSupplierAddress());
        //executeUpdate()，返回int ，表示有多少条数据受到了影响
        i = pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return i;
}
//插入一条商品信息
public int insertCommodity(Commodity commodity) {
    int i = 0;
    String sql = "insert into commodity (commodityNum,commodityName,purchasingCost,price,departmentNum,supplierName) values(?,?,?,?,?,?)";
    try {
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        pstmt.setInt(1, commodity.getCommodityNum());
        pstmt.setString(2,commodity.getCommodityName());
        pstmt.setInt(3,commodity.getPurchasingCost());
        pstmt.setInt(4,commodity.getPrice());
        pstmt.setInt(5,commodity.getDepartmentNum());
        pstmt.setString(6,commodity.getSupplierName());
        //executeUpdate()，返回int ，表示有多少条数据受到了影响
        i = pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return i;
}
//插入一条仓库信息
public int insertStorehouse(Storehouse storehouse) {
    int i = 0;
    String sql = "insert into storehouse (storehouseNum,storehouseControllerName,storehouseContactWay) values(?,?,?)";
    try {
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        pstmt.setInt(1,storehouse.getStorehouseNum());
        pstmt.setString(2,storehouse.getStorehouseControllerName());
        pstmt.setString(3,storehouse.getStorehouseContactWay());
        //executeUpdate()，返回int ，表示有多少条数据受到了影响
        i = pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return i;
}


    //更新一条员工信息
    public int updateWorker(Worker worker) throws SQLException {
        int i = 0;
        String sql = "update worker set " +
                "workerName = '"+ worker.getWorkerName()+"',"+
                "workerAge = '"+ worker.getWorkerAge()+"',"+
                "contactWay = '"+worker.getContactWay()+"'," +
                "departmentNum = '" +worker.getDepartmentNum() +"'" +
                "where workerNum = " + worker.getWorkerNum();
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
        String sql = "select * from department";
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String departmentName = rs.getString(1);
            int departmentNum = rs.getInt(2);
            int monthCast = rs.getInt(3);
            String director = rs.getString(4);
            String departmentContactWay = rs.getString(5);
            String deapartmentAddress = rs.getString(6);
            System.out.println(departmentName + "\t" +departmentNum + "\t" + monthCast + "\t" + director +  "\t" + departmentContactWay +"\t" + deapartmentAddress);
        }
        sql = "select * from  worker";
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int workerNum = rs.getInt(1);
            String workerName = rs.getString(2);
            String contactWay = rs.getString(3);
            String workerAddress = rs.getString(4);
            int workerAge =rs.getInt(5);
            int departmentNum = rs.getInt(6);
            System.out.println(workerNum + "\t" + workerName + "\t" + contactWay +  "\t" + workerAddress +"\t" + workerAge +"\t" +departmentNum);
        }
        sql = "select * from  supplier";
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String supplierName = rs.getString(1);
            String supplierPhoneNum = rs.getString(2);
            String supplierAddress = rs.getString(3);
            System.out.println(supplierName + "\t" + supplierPhoneNum + "\t" + supplierAddress);
        }
        sql = "select * from  commodity";
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int commodityNum = rs.getInt(1);
            String commodityName = rs.getString(2);
            int purchasingCost = rs.getInt(3);
            int price =  rs.getInt(4);
            int departmentNum = rs.getInt(5);
            String supplierName = rs.getString(6);
            System.out.println( commodityNum + "\t" + commodityName + "\t" + purchasingCost + "\t" + price + "\t" + departmentNum +"\t" +supplierName);
        }
        sql = "select * from  storehouse";
        pstmt = (PreparedStatement) con.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int storehouseNum = rs.getInt(1);
            String storehouseControllerName = rs.getString(2);
            String storehouseContactWay  = rs.getString(3);
            System.out.println(  storehouseNum + "\t" + storehouseControllerName + "\t" +storehouseContactWay );
        }
    }


    //根据员工的员工号删除该员工的员工信息
    public int deleteWorker(int workerNum ) throws SQLException {
        int i = 0;
        String sql = "delete from worker where workerNum = " + workerNum ;
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
