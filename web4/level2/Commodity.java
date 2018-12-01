package level2;

public class Commodity {
    private int commodityNum;
    private String commodityName;
    private int purchasingCost;
    private int price;
    private int departmentNum;
    private String supplierName;

    public Commodity(int commodityNum, String commodityName, int purchasingCost, int price, int departmentNum, String supplierName) {
         this.commodityName = commodityName;
         this.commodityNum = commodityNum;
         this.departmentNum = departmentNum;
         this.purchasingCost = purchasingCost;
         this.price = price;
         this.supplierName = supplierName;
    }


    public int getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(int commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getPurchasingCost() {
        return purchasingCost;
    }

    public void setPurchasingCost(int purchasingCost) {
        this.purchasingCost = purchasingCost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
