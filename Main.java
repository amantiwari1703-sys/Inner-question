public class Main {
    public static void main(String[] args) {
        Test t = new Test() {
            void show() {
                System.out.println("anonymous inner class");
            }
        };
        t.show();
    }
}









abstract class Test{
    abstract void show();
}
