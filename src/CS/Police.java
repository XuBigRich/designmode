package CS;

public class Police {
	private Weapon weapon;

	public Weapon getweapon() {
		return weapon;
	}

	public void setweapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void action() {
		System.out.println("Police is coming...,we will win");
		weapon.weapon();
	}
}

