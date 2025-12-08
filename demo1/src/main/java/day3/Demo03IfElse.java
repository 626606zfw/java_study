package day3;

// 标准的if-else语句
public class Demo03IfElse {
	public static void main(String[] args) {
		int num = 666;

		if (num % 2 == 0) { // 判断数字除以2的余数是否为0，如果是0说明是偶数
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}
}
