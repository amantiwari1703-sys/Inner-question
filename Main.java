public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getNumber());
    }
}
abstract class Demo{
    abstract int getNumber();
}
class Test extends Demo{
    int getNumber(){
        return 100;
    }

}