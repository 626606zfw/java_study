package day2;

/*
赋值运算符分为两类：

基本赋值运算符：就是一个等号"="，表示将右侧的数据赋值给左侧的变量
	int a = 30;

复合赋值运算符：
	+=		a += 3		相当于		a = a + 3
	-=		b -= 4		相当于		b = b - 4
	*=		c *= 5		相当于		c = c * 5
	/=		d /= 6		相当于		d = d / 6
	%=		e %= 7		相当于		e = e % 7

注意事项：
	1. 只有变量才能使用赋值运算符，常量不能进行赋值操作。
	2. 复合赋值运算符内部自带强制类型转换。
*/
public class Demo07Operator {
	public static void main(String[] args) {
		int a = 10;
		// 扩展格式进行赋值：a = a + 5
		// a = 10 + 5;
		// a = 15;
		// a变量原来是10，经过重新赋值得到15
		a += 5;
		System.out.println(a); // 15

		int x = 10;
		// x = x % 3;
		// x = 10 % 3;
		// x = 1;
		// x变量原来是10，经过重新赋值得到1
		x %= 3;
		System.out.println(x); // 1

		// 50 = 30; // 错误写法：常量不能进行赋值操作，等号左侧必须是变量。

		byte num = 30;
		// num = num + 5;
		// num = byte + int
		// num = int + int
		// num = int
		// num = (byte) int
		num += 5;
		System.out.println(num); // 35
	}
}
