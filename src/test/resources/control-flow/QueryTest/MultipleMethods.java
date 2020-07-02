package xisong;

public class MultipleMethods {
    public void method1() {
        System.out.println("Method1");
    }

    public int method2() {
        System.out.println("Method2");
        return 2;
    }

    public String method3() {
        System.out.println(s = "Method3");
        return s;
    }

    public String method3(int a) {
        System.out.println(s = "Method3");
        return new String(a);
    }
}