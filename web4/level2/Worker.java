package level2;

public class Worker {
    private  int  workerNum;
    private String  workerName;
    private String contactWay;
    private String workerAddress;
    private int workerAge;
    private int departmentNum;

    public Worker(int  workerNum, String  workerName, String contactWay, String workerAddress, int workerAge, int departmentNum) {
        this.workerNum = workerNum;
        this.workerName = workerName;
        this.contactWay = contactWay;
        this.workerAddress = workerAddress;
        this.workerAge = workerAge;
        this.departmentNum = departmentNum;
    }


    public int getWorkerNum() {
        return workerNum;
    }

    public void setWorkerNum(int workerNum) {
        this.workerNum = workerNum;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(String workerAddress) {
        this.workerAddress = workerAddress;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }

    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }
}
