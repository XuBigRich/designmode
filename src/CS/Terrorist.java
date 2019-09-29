package CS;

public class Terrorist {
	private Weapon weapon;

	public Weapon getweapon() {    //多态，返回值为父类引用变量
		return weapon;//但是返回的是子类的对象
	}

	public void setweapon(Weapon wuqi) {
		this.weapon = wuqi;
	}

	public void action() {
		System.out.println("Terrorist is coming...they will filed");
		weapon.weapon();//后面会将枪作为参数传入，枪的对象调用枪的方法
	}
}
