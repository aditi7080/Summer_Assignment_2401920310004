package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test{
    public static void main(String[] args) {
        //1. instance of Veena class
        Veena v = new Veena();
        v.play();
        //2. instance of Saxophone class
        Saxophone s = new Saxophone();
        s.play();

        //3.Placing the above instances in a variable of type Playable and then calling play()
        Playable p;

        p=new Veena();
        p.play();

        p=new Saxophone();
        p.play();

    }
}