package CS;

/**
 * cs设计模式
 */
public class CSdemo {

	public static void main(String[] args) {
		Police pp=new Police();
		Terrorist tt=new Terrorist();


		tt.setweapon(new Knife());
		pp.setweapon(new Gun());//先把值传进去，赋值给各自的武器，武器值返回后
		//再返回到action方法中使用

		tt.action();
		pp.action();
	}

}