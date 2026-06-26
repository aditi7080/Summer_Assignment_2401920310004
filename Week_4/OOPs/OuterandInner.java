class Outer{

    void display(){
        System.out.println("display method of outer class");
    }

    class Inner{
        void display(){
            System.out.println("display method of inner class");
        }
    }
}

   public class Main{
      public static void main(String[] args) {
           Outer o = new Outer();
           o.display();

           Outer.Inner in=obj.new Inner();
           in.display();
       }
   }