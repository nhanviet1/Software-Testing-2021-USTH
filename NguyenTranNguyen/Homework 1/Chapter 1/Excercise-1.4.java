import java.util.Vector;
import java.lang.RuntimeException;

public class Exercise_1_4 {
    // a. public static Vector union (Vector a, Vector b)
    // The method should return a Vector of objects that are in either
    // of the two argument Vectors
    public static Vector union (Vector a, Vector b) {
        Vector res = new Vector(a);
        for (Object i: b) {
            if (!a.contains(i)) {
                result.add(i);
            }
        }
        return res;
    }

    // b. Faults in above method:
    //  1. Vector a and Vector b may not contain elements of the same data type
    public static int checkType(Vector a, Vector b) {
        if (a[0].getClass() != b[0].getClass()) {
            throw new RuntimeException("The two vector do not contain same type of element");
        }
    }

    // d.Rewrite union Method
    public static Vector union_remake (Vector a, Vector b) {
        if (checkType(a, b) == 0) {
            return new Vector();
        }
        else{
            return union(a,b)
        }
    }
}
