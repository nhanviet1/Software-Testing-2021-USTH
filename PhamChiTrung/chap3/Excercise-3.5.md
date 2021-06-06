You can assume that the object names has been properly instantiated and 
the add() and sort() methods have already been tested and work correctly


Answer:
The assertion only checks the first element in the list. So if a test 
causes a fault to infect, and then propagate to another part of the final
state, the failure will not be revealed. The test oracle needs to look at
the entire list.
