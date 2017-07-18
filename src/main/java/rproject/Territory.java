package rproject;

public class Territory {

	private String name;

	private int index;

	private Player owner;

	private int cntUnits;

	private int territoryCount;

	public Territory(String name) {
		this.name = name;
		this.index = territoryCount++;
		cntUnits = 1;
	}

	public void changeOwner(Player newOwner) {
		owner.removeTerritory(this);
		newOwner.addTerritory(this);
		setOwner(newOwner);
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getUnits() {
		return cntUnits;
	}
}
