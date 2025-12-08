package day3;

/*
三种循环的区别

1. 如果条件判断从来没有满足过，那么for循环和while循环都不会执行任何次，但是do-while循环至少会执行一次。
2. for循环的变量作用域最小，只有循环内部才可以使用。while循环和do-while循环的初始化变量本就在循环之外，所以循环之后还可以继续使用。
*/
public class Demo13LoopDifference {
	public static void main(String[] args) {
		for (int i = 1; i < 0; i++) {
			System.out.println("Hello");
		}
		// System.out.println(i); // 这是一个错误写法，因为变量i存在于for循环小括号内，只有for循环自己可以使用。
		System.out.println("================");

		int i = 1;
		do {
			System.out.println("World");
			i++;
		} while (i < 0);
		// 变量已经存在于do-while循环的范围之外，所以仍然可以使用变量i
		System.out.println(i); // 2
	}
}
