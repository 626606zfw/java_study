package day3;

/*
无限循环也叫做死循环

死循环的标准格式：
while (true) {
	循环体
}
*/
//死循环会消耗CPU资源
//在实际应用中通常需要配合 break 语句或中断机制来适时退出
public class Demo16DeadLoop {
	public static void main(String[] args) {
		while (true) {
			System.out.println("I Love Java!");
		}

		// System.out.println("Hello");
	}
}
