package day5.demo02;

public class Demo4Test {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); // 地址值
//        int [] arrayB = arrayA;
        int[] arrayB = new int[]{11,22,33};
        arrayB = arrayA;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);

    }
}
