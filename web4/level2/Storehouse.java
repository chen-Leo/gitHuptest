package level2;


public class Storehouse {
    private  int  storehouseNum;
    private String storehouseControllerName;
    private  String storehouseContactWay;

    public Storehouse (int  storehouseNum, String storehouseControllerName,String storehouseContactWay){
        this.storehouseContactWay = storehouseContactWay;
        this.storehouseControllerName =storehouseContactWay;
        this.storehouseNum = storehouseNum;
    }

    public int getStorehouseNum() {
        return storehouseNum;
    }

    public void setStorehouseNum(int storehouseNum) {
        this.storehouseNum = storehouseNum;
    }

    public String getStorehouseControllerName() {
        return storehouseControllerName;
    }

    public void setStorehouseControllerName(String storehouseControllerName) {
        this.storehouseControllerName = storehouseControllerName;
    }

    public String getStorehouseContactWay() {
        return storehouseContactWay;
    }

    public void setStorehouseContactWay(String storehouseContactWay) {
        this.storehouseContactWay = storehouseContactWay;
    }
}
