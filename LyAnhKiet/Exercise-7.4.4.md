Exercise 7.4.4

Use the following methods trash() and takeOut() to answer questions a–c.

```
/* 1 */public static void trash (int x)    
/* 2 */{                         
/* 3 */   int m, n;                 
/* 4 */
/* 5 */   m = 0;                    
/* 6 */   if (x > 0)               
/* 7 */      m = 4;                
/* 8 */   if (x > 5)              
/* 9 */      n = 3*m;              
/*10 */   else                     
/*11 */      n = 4*m;             
/*12 */   int o = takeOut (m, n);
/*13 */   System.out.println ("o is: " + o);  
/*14 */}
/*15 */public static int takeOut (int a, int b)
/*16 */{
/*17 */   int d, e;
/*18 */
/*19 */   d = 42*a;
/*20 */   if (a > 0)
/*21 */      e = 2*b+d;
/*22 */   else
/*23 */      e = b+d;
/*24 */   return (e);
/*25 */}
```

(a) Give all call sites using the line numbers given.
(b) Give all pairs of last-def s and first-uses.
(c) Provide test inputs that satisfy all-coupling-uses (note that trash() only has one input).


### a)

For variable `m`, lines are 3, 5, 7, 9, 11, 12

For variable `n`, lines are 3, 9, 11, 12

### b)

For variable `m`, last def is in line 7, first use is in line 9

For variable `n`, last def is in line 11, first use is in line 21

### c)

x = 1; x = 6; x = 0
