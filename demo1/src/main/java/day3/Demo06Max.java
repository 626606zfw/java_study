package day3;

// 题目：使用三元运算符和标准if-else语句分别实现，获取两个数字中的最大值
public class Demo06Max {
	public static void main(String[] args) {
		int a = 105;
		int b = 20;

		// 方式一：使用三元运算符
		// int max = a > b ? a : b;

		// 方式二：使用标准if语句
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		System.out.println("最大值是" + max);
	}
}
