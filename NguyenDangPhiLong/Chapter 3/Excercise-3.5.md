# Ex3.5: Develop JUnit tests for the BoundedQueue class. A compilable version is available on the book website in the file BoundedQueue.java. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.

### Since the methods sort(), add() and getFirst() are tested and word correctly, then names.getFirst().equals ("Alex") must be true. The only missing line that names object isn’t initialized in the code. 
### RIRP model:  
* Reachability: No, because the fault comes from other elements except the first one 
* Infection: Yes 
* Propagation:No, because the first element always correct 
* Revealability: No, fault can't be revealed by the test 
