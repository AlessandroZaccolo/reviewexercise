import java.util.List;

// Create another class Main where you try your class
public class Main {


    public static void main(String[] args) {

        Range r = new Range(5, 15);

        r.loopRange();

        r.setStart(10);
        r.setEnd(25);

        System.out.println(r.listRange());



    }
}
