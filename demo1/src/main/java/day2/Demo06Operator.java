package day2;

/*
自增运算符++
以及自减运算符--

基本含义：将一个变量的数据加1或者减1
使用格式：写在变量名称之前或者之后，例如：++num也可以说是num++
使用方式：
    1. 单独使用：不和其他操作混合，只让变量自身发生变化。
    2. 混合使用：和其他操作混合使用，比如赋值、打印等操作。
使用区别：
    1. 在单独使用的时候，前++和后++没有任何区别，也即是：++num;和num++;完全一样的。
    2. 在混合使用的时候，有重要区别：
        A. 如果是"前++"，那么会先把变量的数值+1，然后再拿结果去使用。    先加后用。
        B. 如果是"后++"，那么会先使用变量本来的数值，然后再让变量+1。    先用后加。

注意事项：
    只有变量才能使用自增或自减运算符，常量不能使用。所以不能这样写：30++。
*/
public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1); // 10
		++num1; // 单独使用：前++
		System.out.println(num1); // 11
		num1++; // 单独使用：后++
		System.out.println(num1); // 12
		System.out.println("=================");

		// 在打印语句中的时候
		int num2 = 20;
		// 混合使用：前++，会先把变量数值+1变成21，然后打印出21
		System.out.println(++num2); // 21
		System.out.println(num2); // 21
		System.out.println("=================");

		int num3 = 30;
		// 混合使用：后++，会先把变量数值30打印出来，然后变量自己再+1得到31
		System.out.println(num3++); // 30
		System.out.println(num3); // 31
		System.out.println("=================");

		int num4 = 40;
		// 赋值操作的情况
		int result1 = --num4; // 混合使用：前--，会先把变量数值-1变成39，然后将结果39赋值给result1变量
		System.out.println(result1); // 39
		System.out.println(num4); // 39
		System.out.println("=================");

		int num5 = 50;
		// 混合使用：后--，会先把变量数值50赋值给result2，然后自己再减1变成49
		int result2 = num5--;
		System.out.println(result2); // 50
		System.out.println(num5); // 49
		System.out.println("=================");

		int x = 10;
		int y = 20;
		// 11 + 20 = 31
		int result3 = ++x + y--; // x先自增变为11，y先使用20参与运算后再自减
		System.out.println(result3); // 31
		System.out.println(x); // 11
		System.out.println(y); // 19

		// 30++; // 错误写法：常量不能使用++和--
	}
}
