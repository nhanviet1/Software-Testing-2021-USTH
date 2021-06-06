*__Question:__ Given the 4 faulty programs. Answer questions.*

*__Answer:__*

- *Find last Element.*
  <br><br>
    - a. Does not check the first index of array.<br>
      Modification: 
      ```java
      for (int i=x.length-1; i>-1; i--).
      ```
    - b. test: x = [1, 2, 3], y = 2; Expect = 1.
    - c, d, e. There will be no error state.
      <br> <br>
      
- *Find last index Zero.*
  <br><br>
    - a. Check for the first index of zero instead of the last.
      Modification: 
      ```java
      for (int i=x.length-1; i > -1; i--)
      ```
    - b. test: x = [1, 1, 0]; Expect = 2.
    - c, d, e. There will be no error state.
      <br> <br>

- *Count positive elements.*
  <br><br>
    - a. The method does not static.<br>
        Modification: 
      ```java
      public static int countPositive(int[] x)
      ```
        The condition takes 0 as a positive values.<br>
        Modification: 
      ```java
      if (x[i] > 0)
      ```
    - b, c, d. There will always be an error.
    - e. The error is: non-static method countPositive(int[]).
      <br> <br>

- *Count odd or positive elements.*
  <br><br>
    - a. The % cannot apply for minus values.<br>
      Modification: 
      ```java
      if (Math.abs(x[i])%2 == 1 || x[i] > 0)
      ```
    - b. test x = [0, 1, 2, 4, -2]; Expect = 3.
    - c, d, e. There will be no error state.
      <br> <br>

- *The f questions of all methods:* *Check Exercise_1_5.java*.



