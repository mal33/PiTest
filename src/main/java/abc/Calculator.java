package abc;

public class Calculator {


    static long round (double x) {
        if (x < 0) { //”>” durch “<” ersetzt
            return (long) (x + 0.5);
        } else {
            return (long) (x - 0.5);
        }
    }
}

