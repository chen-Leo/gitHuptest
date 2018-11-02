package test2;

public class Animal {
  private String foodKind;
  private String gender;
  private int age;
  private String livePlace;
  private int hungerValue;
  Animal(){
	  this.foodKind = "NULl";  this.gender= "NULl";  this.livePlace = "NULl"; this.age = -1 ; this.hungerValue = -1;
  }
  Animal(String foodKind,String gender,String livePlace,int age,int hungerValue){
	  this.foodKind = foodKind;
	  this.gender = gender;
	  this.age = age;
	  this.hungerValue = hungerValue;
	  this.livePlace = livePlace;
  }
  
 //set  和   get 方法
  public String getFoodKind() {
	return foodKind;
}
  public String getGender() {
	return gender;
}
  public int getAge() {
	return age;
}
  public String getLivePlace() {
	return livePlace;
}
  public int getHungerValue() {
	return hungerValue;
}
  public void setFoodKind(String foodKind) {
	this.foodKind = foodKind;
}
  public void setGender(String gender) {
	this.gender = gender;
}
  public void setAge(int age) {
	this.age = age;
}
  public void setLivePlace(String livePlace) {
	this.livePlace = livePlace;
}
  public void setHungerValue(int hungerValue) {
	this.hungerValue = hungerValue;
}
  
  //吃东西
  public void eatFood() {              
	  System.out.println("饭真香");
	  hungerValue = hungerValue + 50; 
  }
  //移动
  public void move() {        
	  System.out.println("the animai can move");
  }
  // 展示这个动物的属性  顺便如果饿了就叫
  public void showDetails() {        
	  System.out.println("its foodKind :" + foodKind);
	  System.out.println("its gender :" + gender);
	  System.out.println("its age :" + age);
	  System.out.println("its livePlace :" + livePlace);
	  System.out.println("its hungerValue :" + hungerValue);
	  if(hungerValue <= 60) {
		  System.out.println("it is hungry now");
	  }
  }
  
}
