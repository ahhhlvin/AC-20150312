package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/12/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
import java.util.Scanner;

public class drawRocket {

   public static void starLine() {


   }


    public static void body() {
        

    }


    public static void capTail(int size) {
        String cap = "/**/";
        for (int i = 0; i < size; i++) {
            cap += "/";
        }

        for (int i = -1; i < size; i++) {
            cap += "/";
        }

        System.out.println(cap);
    }


    public static void drawLine(int size) {
        String line = "+";
        for (int i = 0; i < size; i++) {
            line += "*=*=";
        }

        line += "+";
        System.out.println(line);


    }



    public static void drawRocket(int size) {

        drawLine(size);

        drawLine(size);
        drawLine(size);
        capTail(size);
    }



    public static void main(String[] args) {

        drawRocket(1);

        drawRocket(2);

        drawRocket(3);


    }

}
