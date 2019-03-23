package designpatterns.singleton;

public class SingletonClass {

	private SingletonClass() {
	}

	private static SingletonClass instance = null;

	public static SingletonClass getInstance() {
		if (instance == null)
			instance = new SingletonClass();
		return instance;
	}

}
