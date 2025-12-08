package day09.demo02;

public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }
    public void method() {
        // 因为本类当中有numZi，所以这里用本类的numZi
        System.out.println(numZi);
        // 因为本类当中有num，所以这里用本类的num
        System.out.println(num);
        // 因为本类当中有numFu，所以这里用本类的numFu
        System.out.println(numFu);
        // 因为本类当中有num，所以这里用本类的num
        System.out.println(super.num);
        // 因为父类当中有numFu，所以这里用父类的
    }

}
