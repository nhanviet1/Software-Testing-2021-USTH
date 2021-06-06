*__Question:__ Doing the following exercises:* <br><br>
*__Answer:__*
- *a. Write Java method with signature "public static Vector union (Vector a, Vector b)".*
```java
private static Vector union (Vector a, Vector b) {
        Vector result = new Vector(a);
        for (Object i: b) {
            if (!a.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
```
- *b. There may be a variety of defects and ambiguities. Describe as many possible faults as you can.*
    <br><br>
    1. Vector a and Vector b has 2 different element types.
    2. The method does not return any values.
    3. Passing the same Vector.
    <br><br>
- *c. Create a set of test cases that would reveal the faults. Document a rationale for each test in your test set.*
```java
private static int checkType(Vector a, Vector b) {
        for (Object obja: a) {
            for (Object objb: b) {
                if (obja.getClass() != objb.getClass()) {
                    System.out.println("Two vectors does not have same type");
                    return 0;
                }
            }
        }
        return 1;
    }
```
```java
private static int checkValues(Vector a, Vector b) {
    if (a == b) {
        System.out.println("Two vector are the same");
        return 0;
    }
    return 1;
    }
```

- *d. Rewrite the method signature to be precise enough.*
```java
private static Vector union_remake (Vector a, Vector b) {
    if (checkType(a, b) == 0) {
        return new Vector();
    }
    else if (checkValues(a, b) == 0) {
        return a;
    }
    Vector result = new Vector(a);
    for (Object i: b) {
        if (!a.contains(i)) {
            result.add(i);
        }
    }
    return result;
}
```
