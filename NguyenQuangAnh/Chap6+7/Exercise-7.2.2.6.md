*__Question:__ Answer questions bases on graph in Figure 2.2*

*__Answer:__*
- *a. Enumerate the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.*<br><br>
    - Node Coverage: {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9}
    - Edge Coverage: {(n0, n3), (n0, n4), (n1, n4), (n2, n5), (n2, n6), (n3, n7), (n4, n7), (n4, n8), (n5, n1), (n5, n9), (n6, n9), (n8, n5)}
    - Prime  Path Coverage: {[n0, n3, n7], [n0, n4, n7], [n0, n4, n8, n5, n1], [n0, n4, n8, n5, n9], [n1, n4, n8, n5, n1], [n1, n4, n8, n5, n9], [n2, n5, n1, n4, n7], [n2, n5, n1, n4, n8], [n2, n5, n9], [n2, n6, n9], [n4, n8, n5, n1, n4], [n5, n1, n4, n8, n5], [n8, n5, n1, n4, n7], [n8, n5, n1, n4, n8]}<br><br>
    
- *b. List test paths that achieve Node Coverage but not Edge Coverage on the graph.*<br><br>[n0, n3, n7], [n1, n4, n8, n5, n9], [n2, n6, n9]<br><br>

- *c. List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.*<br><br>[n0, n4, n7], [n2, n5, n1, n4, n7], [n0, n3, n7], [n1, n4, n8, n5, n9], [n2, n6, n9]<br><br>

