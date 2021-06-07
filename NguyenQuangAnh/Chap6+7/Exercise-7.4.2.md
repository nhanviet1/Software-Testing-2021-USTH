*__Question:__ Answer the questions based on following program fragment.*

!["Image"](Exercise-7.4.2-image.png)

*Use the following test inputs:*
- t1 = f1 (0, 0)
- t2 = f1 (1, 1)
- t3 = f1 (0, 1)
- t4 = f1 (3, 2)
- t5 = f1 (3, 4)

*__Answer:__*

- *b. Give the path in the graph followed by each test.*<br><br>
    - t1: [f1, f3, f5, f6]
    - t2: [f1, f3, f4, f6]
    - t3: [f1, f2] 
    - t4: [f1, f3, f4, f6]
    - t5: [f1, f2, f3, f4, f6]
<br><br>
- *c. Find a minimal test set that achieves Node Coverage.*<br><br>
{t1, t2, t3}
  <br><br>
  
- *d. Find a minimal test set that achieves Edge Coverage.*<br><br>
  {t1, t5}
  <br><br>
  
- *e. Give the prime paths in the graph. Give the prime path that is not covered by any of the test paths above.*<br><br>
    [f1, f2, f3, f4, f6]<br> [f1, f2, f3, f5, f6]<br> [f1, f3, f4, f6]<br> [f1, f3, f5, f6]
