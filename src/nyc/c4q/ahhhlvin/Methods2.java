package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/12/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Methods2 {

    public static int getNumber() {

        System.out.println("1");
        return 3;   // return cannot be 'return 1' because we defined STRING in the scope
    }

    public static String getString() {
        return "Ohayo";   // return cannot be 'return 1' because we defined STRING in the scope
    }

    public static void main(String[] args) {
        getNumber();
        System.out.println();
    }

}
