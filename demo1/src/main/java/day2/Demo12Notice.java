package day2;

/*
关于byte/short/char类型直接赋值整数常量的说明：只要赋值的整数没有超出对应的范围，
那么javac编译器会自动加上一个强制转换(byte)(short)(char)。

1. 如果没有超出对应类型的范围，编译器会自动加上强转
2. 如果超出了对应类型的范围，那么直接编译报错
*/
public class Demo12Notice {
	public static void main(String[] args) {
		// 我准确地写了一个int数字，但是没有超出byte类型的范围，所以是确定的。
		// int --> byte类型，编译器会自动加上强转
		byte num1 = /*(byte)*/ 30; // 我没有超出byte类型的范围
		System.out.println(num1); // 30

		// byte num2 = 128; // 我超出了byte类型的范围

		// int --> char，没有超出char类型的范围
		// 编译器会自动加上一个强制转换(char)
		char zifu = /*(char)*/ 65;
		System.out.println(zifu); // A
	}
}
