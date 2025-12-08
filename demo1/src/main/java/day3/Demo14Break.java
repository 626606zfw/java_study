package day3;

/*
break关键字的使用场合主要有以下几种：

1. 在switch语句当中，一旦执行，就会跳出switch语句结构，结束整个switch语句
2. 在各种循环语句当中，一旦执行，就会跳出循环语句结构，结束整个循环语句

循环语句的选择有一个小建议：
只要是确定了某种情况下for循环或者while循环
*/
public class Demo14Break {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// 假设，从第4课开始老师全都要睡觉了，不需要再继续了
			if (i == 4) { // 如果当前是第4课
				break; // 那么就终止整个循环
			}
			System.out.println("Hello" + i);
		}
	}
}
