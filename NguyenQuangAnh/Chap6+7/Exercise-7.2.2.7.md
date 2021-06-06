*__Question__ Answer questions for the graph defined by the following sets:*

- N = {0, 1, 2}
- N0 = {0}
- Nf = {2}
- E = {(0, 1), (0, 2), (1, 0), (1, 2), (2, 0)}<br><br>

*Also consider the following (candidate) paths:*
- p0 = [0, 1, 2, 0]
- p1 = [0, 2, 0, 1, 2]
- p2 = [0, 1, 2, 0, 1, 0, 2]
- p3 = [1, 2, 0, 2]
- p4 = [0, 1, 2, 1, 2]

*__Answer:__*
- *a. Which of the listed paths are test paths? Explain the problem with any path that is not a test path.*<br><br>Only p1 and p2 are test paths.<br><br>

- *b. List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).*<br><br> [n0, n1, n0], [n0, n1, n2], [n0, n2, n0], [n1, n0, n1], [n1, n0, n2], [n1, n2, n0], [n2, n0, n1], [n2, n0, n2]<br><br>

- *c. Does the set of test paths (part a) above satisfy Edge-Pair Coverage? If not, identify what is missing.*<br><br>
No. Both path do not tour: [n1, n0, n1], [n2, n0, n2]. <br><br>
  
- *d. Consider the prime path [n2, n0, n2] and path p2. Does p2 tour the prime path directly? With a sidetrip?*<br><br>
p2 tour the prime path with the sidetrip [n0, n1, n0], not directly.

