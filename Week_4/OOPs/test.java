public interface test{
    int square(int x);
}

class Arithmatic implements test{
    public int square(int x){
        return x*x;
    }
}

public class toTestInt{
   public static void main(String[] args) {
        Arithmatic a = new Arithmatic();
        System.out.println(a.square(7));
    }
}