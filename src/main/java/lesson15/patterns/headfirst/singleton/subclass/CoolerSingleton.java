package lesson15.patterns.headfirst.singleton.subclass;

public class CoolerSingleton extends Singleton {
	// useful instance variables here
	protected static Singleton uniqueInstance;
 
	private CoolerSingleton() {
		super();
	}
 
	// useful methods here
}