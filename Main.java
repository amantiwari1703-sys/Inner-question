public class Main {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.callinner();

        }
    }
    class Outer{
    class inner{
        void msg(){
            System.out.println("hello inner");

        }
    }
    void callinner(){
        inner i=new inner();
        i.msg();

    }
    }




