package day3;

/*
在循环当中可以使用continue关键字。
一旦执行，就会跳过本次循环剩余的数据，立刻开始下一次循环
*/
public class Demo15Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) { // 如果当前是第4个
				continue; // 那么跳过本次循环剩余内容，立刻开始下一次（第5次）
			}
			System.out.println(i + "点到了！");
		}
	}
}
