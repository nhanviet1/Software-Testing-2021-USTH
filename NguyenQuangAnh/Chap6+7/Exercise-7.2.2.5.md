*__Question:__ Answer questions for the graph defined by the following sets:*

- N = {1, 2, 3, 4, 5, 6, 7}
- N0 = {1}
- Nf = {7}
- E = {(1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (5, 6), (6, 1)} <br><br>
  Also consider the following (candidate) test paths:<br><br>
- p1 = [1,2,4,5,6,1,7]
- p2 = [1,2,3,2,4,6,1,7] 
- p3 =[1,2,3,2,4,5,6,1,7]

*__Answer:__*
- *b. List the test requirements for Edge-Pair Coverage.*<br><br> The edge pairs are: [1, 2, 3], [1, 2, 4], [2, 3, 2], [2, 4, 5], [2, 4, 6], [3, 2, 3], 
  [3, 2, 4], [4, 5, 6], [4, 6, 1], [5, 6, 1], [6, 1, 2], [6, 1, 7].<br><br>
  
- *c. Does the given set of test paths satisfy Edge-Pair Coverage? If not, identify what
  is missing.*<br><br>No, it doesn't. t0 and t1 do not tour edges: [3, 2, 3], [6, 1, 2].<br><br>
  
- *d. Consider the simple path [3, 2, 4, 5, 6] and test path [1, 2, 3, 2, 4, 6, 1, 2, 4, 5, 6, 1, 7]. Does the test path tour the simple path directly? With a sidetrip?
  If so, identify the sidetrip.*<br><br>The test path tours with a sidetrip [4, 6, 1, 2, 4].<br><br>

- *e. List the test requirements for Node Coverage, Edge Coverage, and Prime Path
  Coverage on the graph.*<br><br> 
  - NC: {1, 2, 3, 4, 5, 6, 7}
  - EC: (1, 2), (1, 7), (2, 3), (2, 4), (3, 2), (4, 5), (4, 6), (6, 1), (5, 6)
  - PPC: [1, 2, 4, 5, 6, 1], [1, 2, 4, 6, 1], [2, 4, 6, 1, 2], [2, 4, 5, 6, 1, 2],<br>
  [3, 2, 4, 6, 1, 7], [3, 2, 4, 5, 6, 1, 7], [4, 6, 1, 2, 4], [4, 5, 6, 1, 2, 4], <br>
  [4, 6, 1, 2, 3], [4, 5, 6, 1, 2, 3], [5, 6, 1, 2, 4, 5], [6, 1, 2, 4, 6], <br>
  [6, 1, 2, 4, 5, 6], [3, 2, 3], [2, 3, 2]<br><br>
    
- *f. List test paths that achieve Node Coverage but not Edge Coverage on the graph.*<br><br>[1, 2, 3, 2, 4, 5, 6, 1, 7]<br><br>

- *g. List test paths that achieve Edge Coverage but not Prime Path Coverage on the
  graph.*<br><br> [1, 2, 3, 2, 4, 5, 6, 1, 7]<br>[1, 2, 4, 6, 1, 7]<br><br>