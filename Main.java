public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.add(5, 3));
    }
}
abstract class Calculator{
    abstract int add(int a,int b);
}
class Demo extends Calculator{
    int add(int a,int b){
        return a+b;
    }

}

