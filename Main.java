public class Main {
    public static void main(String[] args){
        Outer o=new Outer();
        Outer.inner i=o.new inner();
        i.show();


    }
}
class Outer{

    class inner{
        void show(){
            System.out.println("static inner class");
        }

    }
}