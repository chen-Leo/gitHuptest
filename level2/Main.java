package level2;

import level2.Animal;
import level2.Bird;
import level2.Dog;
import level2.Fish;


public class Main {
	public static void main(String[] args) {
	     Animal one = new Animal("肉","雄性", "大地",5,50);
	     Bird two = new Bird("肉","雄性", "天空" ,5,50);
	     Dog three = new Dog("杂食","雄性", "大地" ,5,50);
	     Fish four = new Fish("植物","无性别", "海洋" ,7,45);
	     System.out.println("animal:");
	     one.showDetails();
	     one.move();
	     System.out.println("bird:");
	     two.showDetails();
	     two.move();
	     System.out.println("dog:");
	     three.showDetails();
	     three.move();
	     System.out.println("fish:");
	     four.showDetails();
	     four.move();
	}
}
	
	
	
	


