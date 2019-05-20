package nl.drenthecollege.bas;

public class Eindopdracht1 {

    public static void main(String[] args) {
        int nummer = 10;
        for (int i = 0; i < nummer; i++ ) {
            System.out.println("Element " + i + " = " + fibonacci(i));
        }
    }

    public static int fibonacci(int nummer) {
        if (nummer <= 1) {
            return nummer;
        } else {
            return fibonacci(nummer - 1) + fibonacci(nummer - 2);
        }
    }
}


