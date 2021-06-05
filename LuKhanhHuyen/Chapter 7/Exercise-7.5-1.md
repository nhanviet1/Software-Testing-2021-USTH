# Exercise 7.5.1

## Question
Use the class BoundedQueue2 for questions a–f below. A compilable version is available on the book website in the file
BoundedQueue2.java. The queue is managed in the usual circular fashion. Suppose we build an FSM where states are defined by the
representation variables of BoundedQueue2. That is, a state is a 4-tuple defined by the values for [elements, size, front, back]. For example, the initial state has the value [[null, null], 0, 0, 0], and the state that results from pushing an object obj onto the queue in its initial state is [[obj, null], 1, 0, 1].

## Answer
### a) We do not care which specific objects are in the queue. Consequently, there are really just four useful values for the
variable elements. What are they?
The values for elements are:
* [null, null]
* [object, null]
* [null, object]
* [object, object]

### b) How many states are there?
There are:
* 4 possible values of elements
* 3 possible values of size
* 2 possible values of front (null and object)
* 2 possible values of back (null and object)
There must be total of 48 possible states

### c) How many of these states are reachable?
There are 4 states reachable, following the values for elements.

### d) Show the reachable states in a drawing.
4 reachable states:
* {[null, null], 0, null, null}
* {[object, null], 1, object, null}
* {[null, object], 1, null, object}
* {[object, object], 2, object, object}
