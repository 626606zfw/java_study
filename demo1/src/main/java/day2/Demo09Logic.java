package day2;

/*
逻辑运算符包括：
与（并且）：	&&	全都是true才是true，只要有false就是false
或（或者）：	||	只要有一个是true就是true，全都是false才是false
非（取反）：	!	原来是true就是false，原来是false就是true

与"&&"和"||"具有短路效果：当左边的条件已经能够判断出最终结果时，那么右边的代码将不会执行，从而节省一定的性能。

注意事项：
1. 逻辑运算符只能操作boolean值。
2. 与、或需要左右各有一个boolean值，而取非只需要唯一的一个boolean值即可。
3. 与、或运算符可以连续使用多个条件进行判断，可以这样写：
例如：条件A && 条件B
例如：条件A && 条件B && 条件C

TIPS：
对于1 < x < 3这种写法应该避免使用，而应该使用逻辑运算符来组合条件：
int x = 2;
1 < x && x < 3
*/
public class Demo09Logic {
	public static void main(String[] args) {
		System.out.println(true && false); // false
		// true && true --> true
		System.out.println(3 < 4 && 10 > 5); // true
		System.out.println("============");

		System.out.println(true || false); // true
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		System.out.println("============");

		System.out.println(true); // true
		System.out.println(!true); // false
		System.out.println("============");

		int a = 10;
		// false && ... 由于左边为false，发生短路，右边不执行
		System.out.println(3 > 4 && ++a < 100); // false
		System.out.println(a); // 10
		System.out.println("============");

		int b = 20;
		// true || ... 由于左边为true，发生短路，右边不执行
		System.out.println(3 < 4 || ++b < 100); // true
		System.out.println(b); // 20
	}
}
