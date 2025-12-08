package day3;

/*
while循环有两种标准形式：一种是标准格式，一种是扩展格式。

标准格式：
while (条件判断) {
	循环体
}

扩展格式：

初始化语句;
while (条件判断) {
	循环体;
	步进语句;
}
*/
public class Demo10While {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("我答应你" + i);
		}
		System.out.println("=================");

		int i = 1; // 1. 初始化语句
		while (i <= 10) { // 2. 条件判断
			System.out.println("我答应你" + i); // 3. 循环体
			i++; // 4. 步进语句
		}
	}
}
