package level2;

public class Supplier {
   private String supplierName;
   private String supplierPhoneNum;
   private String supplierAddress;

   public Supplier (String supplierName,String supplierPhoneNum,String supplierAddress){
       this.supplierAddress = supplierAddress;
       this.supplierName = supplierName;
       this.supplierPhoneNum = supplierPhoneNum;
   }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPhoneNum() {
        return supplierPhoneNum;
    }

    public void setSupplierPhoneNum(String supplierPhoneNum) {
        this.supplierPhoneNum = supplierPhoneNum;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }
}
