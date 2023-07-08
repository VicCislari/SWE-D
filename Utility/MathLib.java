package Utility;

public class MathLib {

    // Returns floor of square root of x
    public static int floorSqrt(int x){

        int sqrt;

        assert (x > 0): "pre-condition is wrong. x is negative. SQRT";
        assert (x%1 == 0): "pre-condition is wrong. variable is not int. SQRT";

        // Base cases
        if (x == 0 || x == 1)
            sqrt = x;
        else {
            // Starting from 1, try all numbers until
            // i*i is greater than or equal to x.
            int i = 1, result = 1;

            while (result <= x) {
                i++;
                result = i * i;
            }
            sqrt = i - 1;
        }

        assert ((sqrt * sqrt) == x) : "post-condition is wrong. SQRT";
        return sqrt;

    }
}
