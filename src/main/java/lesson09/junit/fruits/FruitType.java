package lesson09.junit.fruits;

/**
 * @author spasko
 */
public enum FruitType {
	STRAWBERRY("Strawberry"), APPLE("Apple"), PEAR("Pear"), ORANGE("Orange");

	FruitType(String name) {
		this.name = name;
	}

	private String name;

	public String toString() {
		return name;
	}

}
