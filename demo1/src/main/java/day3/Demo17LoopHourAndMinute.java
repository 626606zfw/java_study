package day3;

public class Demo17LoopHourAndMinute {
	public static void main(String[] args) {
		for (int hour = 0; hour < 24; hour++) { // 外层循环控制小时

			for (int minute = 0; minute < 60; minute++) { // 内层循环控制小时之内的分钟
				System.out.println(hour + "时" + minute + "分");
			}

		}
	}
}
