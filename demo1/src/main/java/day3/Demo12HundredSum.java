package day3;

/*
题目：计算1-100之间偶数的和。

思路：
1. 既然范围已经确定了是从1到100之间，那么我就从1开始2、3一直加到100，这样一个一个进行累加。
2. 总共100个数字，但是只需要偶数的累加，判断偶数（if语句）：偶数就是 num % 2 == 0
3. 需要一个变量用来记录累加的和，也就相当于准备一个存钱罐。
*/
public class Demo12HundredSum {
	public static void main(String[] args) {
		int sum = 0; // 用来累计和的存钱罐

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // 判断是偶数
				sum += i;
			}
		}
		System.out.println("结果是：" + sum);
	}
}
