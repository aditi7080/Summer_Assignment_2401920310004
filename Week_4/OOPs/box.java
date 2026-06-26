class box{
    double length;
    double breadth;


    box(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length*breadth;
    }
}

class box3D extends box{
    double height;

    box3D(int length,int breadth){
        super(length,breadth);
        this.height=height;
    }
    double volume(){
        return length*breadth*height;
    }
}

public class Main{
   public static void main(String[] args) {
        box obj=new box(10,20);
       System.out.println("area of box "+ obj.area());

       box3D obj1=new box3D(10,20);
       System.out.println("area of box "+ obj1.area());
       System.out.println("Volume of box " + obj1.volume());
    }
}