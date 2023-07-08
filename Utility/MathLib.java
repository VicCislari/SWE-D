package Utility;

public class MathLib {

    // Returns floor of square root of x
    public static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static double calculateSquareRoot(double number, double epsilon) {
        double guess = number; // initial guess

        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2.0; // improve guess using the Newton-Raphson method
        }

        return guess;
    }
}
