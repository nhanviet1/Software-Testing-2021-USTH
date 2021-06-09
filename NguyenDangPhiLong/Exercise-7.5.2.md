# Exercise 7.5.2

## For the following questions a–c, consider the FSM that models a (simplified) programmable thermostat. Suppose the variables that define the state and the methods that transition between states are:
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
### a) How many states are there?
States {sleep, low}, {sleep, high}, {wake, low}, {wake, high}
### b) Draw and label the states (with variable values) and transitions (with method names).
```
    (wake, low)     -> advance()    -> (sleep, low)
    (wake, low)     -> up()         -> (wake, high)
    (wake, high)    -> advance()    -> (sleep, high)
    (wake, high)    -> down()       -> (wake, low)
    (sleep, low)    -> advance()    -> (wake, low)
    (sleep, low)    -> up           -> (sleep, high)
    (sleep, high)   -> advance()    -> (wake, high)
    (sleep, high)   -> down()       -> (sleep, low)
```
### c) A test case is simply a sequence of method calls. Provide a test set that satisfies Edge Coverage on your graph.
* up( ) -> advance( ) (1, 2, 4)

* advance( ) -> up( ) (1, 3, 4)

* down( ) -> advance( ) (4, 3, 1)

* advance( ) -> down( ) (4, 2, 1)
