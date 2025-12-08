package day3;

/*
switch语句使用的注意事项：

1. 多个case后面的数值不能重复

2. switch小括号内只能是以下几种数据类型：
基本数据类型：byte/short/char/int
引用数据类型：String字符串、enum枚举

3. switch语句格式可以很灵活：前后顺序可以颠倒，而且break可以省略。
一旦匹配到一个case就开始从该位置向下执行，直到遇到break或者整个switch结束为止。
*/
public class Demo08SwitchNotice {
	public static void main(String[] args) {
		int num = 2;
		switch (num) {
			case 1:
				System.out.println("你好");
				break;
			case 2:
				System.out.println("我好");
				// break;
			case 3:
				System.out.println("大家好");
				break;
			default:
				System.out.println("你好，我也好");
				break;
		} // switch
	}
}
