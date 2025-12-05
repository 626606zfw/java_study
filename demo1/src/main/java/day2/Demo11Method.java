package day2;

/*
定义一个方法的格式：
public static void 方法名称() {
	方法体
}

方法名称的命名规范：
方法名称和变量名称一样，使用小驼峰命名法。
命名规范：也可以称为方法的定义，就是把功能代码封装到方法中。

注意事项：
1. 方法的定义先后顺序不影响执行结果
2. 方法的定义不能嵌套定义方法
3. 方法定义之后，不会自动执行。必须要调用方法才行。

调用方法的方式：

方法名称();
*/
public class Demo11Method {

	public static void main(String[] args) {
		farmer(); // 调用农民的方法
		seller(); // 调用小贩的方法
		cook(); // 调用厨师的方法
		me(); // 调用我们自己的方法
	}

	// 厨师
	public static void cook() {
		System.out.println("洗菜");
		System.out.println("切菜");
		System.out.println("炒菜");
		System.out.println("装盘");
	}

	// 我们
	public static void me() {
		System.out.println("吃");
	}

	// 小贩
	public static void seller() {
		System.out.println("从农贸市场运到市场");
		System.out.println("抬高价格");
		System.out.println("吆喝");
		System.out.println("卖给厨师");
	}

	// 农民伯伯
	public static void farmer() {
		System.out.println("播种");
		System.out.println("浇水");
		System.out.println("施肥");
		System.out.println("除虫");
		System.out.println("收割");
		System.out.println("卖给小贩");
	}
}
