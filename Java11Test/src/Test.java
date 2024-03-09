public class Test {

    static  int x = 5;
    int y=5;
    public void m1(){
        System.out.println(y);
        System.out.println(x);
    }

    public static void m2(){
       // System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println(x);
        Test t = new Test();
        System.out.println(t.y);
    }
}
