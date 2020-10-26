package CS;

/**
 * cs设计模式
 * 这个模式有点类似于装饰器模式 他可以在方法执行前 与 方法执行后 进行一系列操作
 * 当然 也有可能就是装饰器模式
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