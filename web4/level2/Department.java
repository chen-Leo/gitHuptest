package level2;

public class Department {
   private int departmentNum;
   private String departmentName;
   private int monthCast;
   private String director;
   private String departmentContactWay;
   private String deapartmentAddress;

   public Department(String departmentName,int departmentNum, int monthCast, String director,String departmentContactWay,String deapartmentAddress) {
       this.deapartmentAddress = deapartmentAddress;
       this.departmentContactWay = departmentContactWay;
       this.departmentNum = departmentNum;
       this.director = director;
       this.monthCast = monthCast;
       this.departmentName = departmentName;
   }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }

    public int getMonthCast() {
        return monthCast;
    }

    public void setMonthCast(int monthCast) {
        this.monthCast = monthCast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDepartmentContactWay() {
        return departmentContactWay;
    }

    public void setDepartmentContactWay(String departmentContactWay) {
        this.departmentContactWay = departmentContactWay;
    }

    public String getDeapartmentAddress() {
        return deapartmentAddress;
    }

    public void setDeapartmentAddress(String deapartmentAddress) {
        this.deapartmentAddress = deapartmentAddress;
    }
}
