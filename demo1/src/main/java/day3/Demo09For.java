package day3;

/*
循环结构的基本组成部分：一般可以分为四部分：

1. 初始化语句：在循环开始最初执行，而且只执行唯一一次。
2. 条件判断：用来决定是否继续执行循环，如果为true就继续执行，为false就循环退出。
3. 循环体：重复要做的事情内容，若干行语句。
4. 步进语句：每次循环之后都要进行的扫尾工作，每次循环结束之后都要执行一次。
*/
public class Demo09For {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println("我打算原谅你了：" + i);
		}
		System.out.println("程序停止");
	}
}
