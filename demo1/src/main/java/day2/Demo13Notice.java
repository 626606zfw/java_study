package day2;

/*
在给变量赋值的时候，如果右侧全都是常量，没有任何变量，
那么编译器会直接进行计算得到结果。
short result = 5 + 8; // 左右全都是常量，没有任何变量参与运算
编译之后，得到.class字节码文件，相当于"直接就是"。
short result = 13;
只要某个算式的值没有超出对应类型范围，就是正确的。

编译器优化：编译器会自动计算常量表达式的值。

注意事项：一个表达式中只要有变量参与，那么就不能进行编译器优化了。
*/
public class Demo13Notice {
	public static void main(String[] args) {
		short num1 = 10; // 正确写法，因为我也没有超出short类型的范围
		
		short a = 5;
		short b = 8;
		// short + short --> int + int --> int
		// short result = a + b; // 错误写法，结果需要是int类型
		
		// 我不涉及变量参与运算，可以使用编译器优化，直接写常量运算就没有问题
		short result = 5 + 8;
		System.out.println(result);
		
		short result2 = (short) (5 + a +8); // 18
		System.out.println(result2);

		short result3 = (short) (42226 + 5);// -23055
		System.out.println(result3);
	}
}
