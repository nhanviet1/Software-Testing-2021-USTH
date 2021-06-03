# Ex1.5: . Below are four faulty programs. Each includes test inputs that result in failure. Answer the following questions about each program
## findLast
### a) Explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.

* Describe: i variable must run in range (0, length). Given (1, length) 
* Correct: 
```java
for (int i = x.length - 1; i >= 0; i--)
```
### b) If possible, give a test case that does not execute the fault. If not, briefly explain why not.
* Input: x = null, y = 2 
* The null value for x will result in a NullPointerException before the loop test is run 
* 
### c) If possible, give a test case that executes the fault, but does not result in an error state. If not, briefly explain why not.
* Input: x = {2,3,5}, y = 2
* No error executed when x is not 0 
### d) If possible give a test case that results in an error, but not a failure. If not, briefly explain why not. Hint: Don’t forget about the program counter.
* Input: x = {2,3,5}, y = 4
* Error is executed but not give failure when y does not in x

