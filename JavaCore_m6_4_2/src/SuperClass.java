public class SuperClass {
    public int a;
    public int b;

    SuperClass(int a) {
        this.a = 15;
        this.b = 33;
    }

    public int add(int v) {
        System.out.println(a);
        this.a += v;
        System.out.println(a);
        return a;
    }
}
