package Utility;

public class MathLib {

    // Returns floor of square root of x
    public static int floorSqrt(int x) throws Exception {
        // Pre-Condition
        //assert (x > 0): "pre-condition is wrong. SQRT";
        //pre-Conditions
        int i = 1, result = 1;

        if (x > 0) {
            if (x == 1)
                result = x;
            else {
                // Starting from 1, try all numbers until
                // i*i is greater than or equal to x.
                while (result <= x) {
                    i++;
                    result = i * i;
                }
                result = i-1;
            }
        }
        else{
            throw new Exception("Pre-Condition not met");
        }
        if ((result * result) == x){
            throw new Exception("Post-condition is wrong. SQRT");
        }
        // Pre-Condition
        //assert ((result * result) == x) : "post condition is wrong. SQRT";
        return result;
    }

    /*
    maybe for later...
    public static double calculateSquareRoot(double number, double epsilon) {
        double guess = number; // initial guess

        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2.0; // improve guess using the Newton-Raphson method
        }

        return guess;
    }
    */

}
