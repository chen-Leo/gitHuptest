package test;

public class People {
  private String name;
  private String gender;
  private String identity;
  private String mind;
  private int faceValue;
  private int weight;
  private int height;
  private int age;
  
  //无参数构造函数，同时初始化;
  People(){                                            
	  this.name = "NULL"; this.gender = "NULL"; this.identity = "NULL";
	  this.faceValue = -1; this.weight = -1; this.height = -1; this.age = -1;
  }
  People(String name, String gender,String identity, String mind,int faceValue,int weight,int height,int age)
  {
	  this.name = name;
	  this.gender = gender;
	  this.identity= identity;
	  this.mind = mind;
	  this.faceValue =faceValue;
	  this.weight =weight;
	  this.height =height;
	  this.age =age;
  }
  
  public void showDetails()
  {
	  System.out.println("name: " + name);
	  System.out.println("gender: " + gender);
	  System.out.println("identity: " + identity);
	  System.out.println("mind: " + mind);
	  System.out.println("faceValue: " + faceValue);
	  System.out.println("weight: " + weight);
	  System.out.println("height: " + height);
	  System.out.println("age： " + age);
  }

}
