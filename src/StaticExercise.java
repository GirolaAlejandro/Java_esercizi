
    // Static keyword exercise

    // 1) Create a new Java class called 'StaticExercise'.

    public class StaticExercise {
    // 2) Inside 'StaticExercise', declare a static variable of type int named 'counter'. Initialize it to 0.
    static int counter = 0;

    /* 3) Next, create a static method named 'incrementCounter'.
    This method should increase the value of 'counter' by 1 every time it's called.
     */
     public static void incrementCounter() {
        counter++;
    }
    // 4) Create a static block that prints a message "Static block is executed" whenever the class is loaded.
    static {
        System.out.println("Static block is executed");
    }

    /* 5) Finally, in the main method, create a loop that calls 'incrementCounter' five times.
     After each call, print the current value of 'counter'. */

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            incrementCounter();
            System.out.println("counter: " + counter);

        }
    }
}
