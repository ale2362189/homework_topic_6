package war;

public class Card {

	private String name;
	private int value;

	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String describe() {
		return toString();
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", value=" + value + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}