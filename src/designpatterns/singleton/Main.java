package designpatterns.singleton;

public class Main {

	public static void main(String[] args) {
		
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		
		System.out.println(s1.equals(s2));
		
				
	}

}
