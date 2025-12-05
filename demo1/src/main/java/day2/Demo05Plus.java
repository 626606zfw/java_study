package day2;

/*
加法运算符"+"在各种数据类型中的使用规则

1. 字符串类型说明：字符串加法就是拼接操作
2. 字符类型char说明：在计算之前char会被提升为int类型，然后计算。
char类型的字母和int类型的数字之间的对应关系是ASCII或Unicode
3. 字符串String类型的说明：任何数据类型和字符串进行相加操作的时候，结果都是字符串
任何数据类型和字符串类型进行相加的时候，都会被转换为字符串类型
*/
public class Demo05Plus {
	public static void main(String[] args) {
		// 字符串类型的基本使用
		// 数据类型 变量名称 = 数据值;
		String str1 = "Hello";
		System.out.println(str1); // Hello

		System.out.println("Hello" + "World"); // HelloWorld

		String str2 = "Java";
		// String + int --> String
		System.out.println(str2 + 20); // Java20

		// 优先级运算
		// String + int + int
		// String		+ int
		// String
		System.out.println(str2 + 20 + 30); // Java2030

		System.out.println(str2 + (20 + 30)); // Java50
	}
}
