Exercise 7.5.2

For the following questions a–c, consider the FSM that models a (simplified) programmable thermostat. Suppose the variables that define the state and the methods that transition between states are:

```
partOfDay : {Wake, Sleep}
temp : {Low, High}

// Initially "Wake" at "Low" temperature

// Effects: Advance to next part of day
public void advance();

// Effects: Make current temp higher, if possible
public void up();

// Effects: Make current temp lower, if possible
public void down();
```

(a) How many states are there?
(b) Draw and label the states (with variable values) and transitions (with method names). Notice that all of the methods are total, that is, their behaviors are defined for all possible inputs.
(c) A test case is simply a sequence of method calls. Provide a test set that satisfies Edge Coverage on your graph.

### a)

States {wake, low}, {wake, high}, {sleep, low}, {sleep, high}

### b)

advance()  (1) --> (3)

advance()  (3) --> (1)

advance()  (2) --> (4)

advance()  (4) --> (2)

up()  (1) --> (2)

up()  (3) --> (4)

up()  (2) --> (2)

up()  (4) --> (4)

down()  (1) --> (1)

down()  (3) --> (3)

down()  (2) --> (1)

down()  (4) --> (3)

### c)

up() -> advance() (1, 2, 4)

advance() -> up() (1, 3, 4)

down() -> advance() (4, 3, 1)

advance() -> down() (4, 2, 1)
