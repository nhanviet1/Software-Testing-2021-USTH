#Excercise 4.1
## Calc.java
```java
package com.company;

public class Calc {
    static public int sum(int x, int y) {
        return x + y;
    }

    static public int sub(int x, int y) {
        return x - y;
    }

    static public int multiply(int x, int y) {
        return x * y;
    }

    static public double divide(int x, int y) {
        return (float) x/y;
    }
}
```
## TestCalc.java
```java
package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalc {
    Calc calc = new Calc();
    private int x = 9;
    private int y = 4;

    @Test
    public void sumTest() {
        assertEqual(calc.add(x, y), 13);
    }

    @Test
    public void subTest() {
        assertEquals(calc.minus(x, y), 5);
    }

    @Test
    public void multiplyTest() {
        assertEquals(calc.multiply(x, y), 36);
    }

    @Test
    public void divideTest() {
        assertEquals(calc.divide(x, y), 2, 1);
    }
}
```