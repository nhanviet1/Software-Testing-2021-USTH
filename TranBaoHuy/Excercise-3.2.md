# Excercise 3.2
# Give a one-to-two paragraph explanation for how the inheritance hierarchy can affect controllability and observability.
---
Inheritance hierarchy use Object-oriented concepts and having a deep inheritance tree of classes could become more complex to test, because the sub classes are dependent of its father, that means, if we modify or update something in the super class, it will affect all its respective children, which means that every test affected by the modification have to be updated for the sub classes.

However, with the help of an inheritance hierarchy, the developer can visualize the whole system of classes more easily. The would know where to start and what to keep in mind when design sets of test cases.