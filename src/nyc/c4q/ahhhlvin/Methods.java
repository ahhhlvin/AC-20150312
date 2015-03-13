package nyc.c4q.ahhhlvin;

public class Methods {

    public static void speak() {
        System.out.println("hello");

    }

    public static void shoutOut(String name, int age) {
        System.out.println("Hey, " + name + ", you are " + age + "-years-old");
        speak();  // calling the method that has been defined above!
    }

/*
    public static void main(String[] args) {
        String n = "Von Neumann";

        shoutOut(n);              // we are 'CALLING' methods here, 'shoutOut()'
        shoutOut("Grace Hopper"); // <-- this is a 'literal' version


    } */
}

