#Excercise 5.1
#Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.

###(a) Does T1 necessarily satisfy C2?
Yes, T1 satisfies C1 and C1 subsumes C2.
###(b) Does T2 necessarily satisfy C1?
No, T2 only satisfies C2, C2 is smaller than C1.
###(c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault.
It could happen that T2 contains that one test that reveals the fault, and T1 doesn't because T1 can be different with T2.