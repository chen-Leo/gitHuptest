package test;

public class Test {



			   public static void main(String args[]){
			      
			      String str = "ww,w,runoob,com";
			      String[] temp;
			      String delimeter = ",";  // 指定分割字符
			      temp = str.split(delimeter); // 分割字符串
			      // 普通 for 循环
			      for(int i =0; i < temp.length ; i++){
			         System.out.println(temp[i]);
			         System.out.println("");
			      }
			 
	}

}
