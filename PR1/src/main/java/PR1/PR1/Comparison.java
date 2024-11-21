package PR1.PR1;

public class Comparison {

    //Modular function to check if number
    public static boolean isNumber(Object obj) {
        return (obj instanceof Number); 
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

            if (-aValue > -bValue) {
                return "A";
            } else if (-aValue < -bValue) {
                return "B";
            } else {
                return "Equal";
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

            if (elmntA > elmntB) {
                return "A";
            } else if (elmntA < elmntB) {
                return "B";
            } else {
                return "Equal";
            }
        } else {
            return "Error: Both inputs must be numbers";
        }
    }
}