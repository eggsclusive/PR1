package PR1.PR1;

//Students Riad Zoabi (211830369) and Yonatan Mattar (315957571)

public class Comparison {

    //Modular function to check if number:
    public static boolean isNumber(Object obj) {
        return obj != null && obj instanceof Number;
    }

    public static String compareNormal(Object A, Object B) {
        if (isNumber(A) && isNumber(B)) {
            double aValue = ((Number) A).doubleValue();
            double bValue = ((Number) B).doubleValue();

            if (aValue > bValue) {
                return "A";
            } else if (aValue < bValue) {
                return "B";
            } else {
                return "Equal";
            }
        } else {
            return "Error: Both inputs must be numbers";
        }
    }

    public static String compareNegatives(Object A, Object B) {
        if (isNumber(A) && isNumber(B)) {
            double aValue = ((Number) A).doubleValue();
            double bValue = ((Number) B).doubleValue();

            double tolerance = 1e-9; //Floating-point inaccuracies..
            if (Math.abs(aValue - bValue) < tolerance) {
                return "Equal";
            } else if (aValue > bValue) { //If A > B, -A < -B, so B is larger..
                return "A"; //A is "larger" when bValue is greater..
            } else { //If A < B, -A > -B, so A is larger..
                return "B"; //B is "larger" when aValue is greater..
            }
        } else {
            return "Error: Both inputs must be numbers";
        }
    }

    public static String compareElements(Object A, Object B) {
        if (isNumber(A) && isNumber(B)) {
            double aValue = ((Number) A).doubleValue();
            double bValue = ((Number) B).doubleValue();

            if (aValue == 0 || bValue == 0) {
                return "Error: Cannot perform element comparison with zero";
            }

            double elmntA = 1.0 / aValue;
            double elmntB = 1.0 / bValue;

            double tolerance = 1e-9; //Floating-point comparison..
            if (elmntA < elmntB - tolerance) { //Reverse comparison..
                return "A";
            } else if (elmntA > elmntB + tolerance) {
                return "B";
            } else {
                return "Equal";
            }
        } else {
            return "Error: Both inputs must be numbers";
        }
    }
}