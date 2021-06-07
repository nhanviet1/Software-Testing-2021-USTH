#Excercise 3.5
---
Only the first element. 
In the RIPR model:

* Reachability: If there is a fault with the first element then it is reached, but for the other elements, it is not reached.
* Infection: Yes. The incorrect state can totally happen.
* Propagation: No. the whole list can be incorrect but first element can still be correct.
* Revealability: No. The test assertion cannot reveal the fault.
```java
@Test
public void testSort()
{

	names.add("Laura");
	names.add("Han");
	names.add("Alex");
	names.add("Ashley");
	names.sort();
	asserTrue("Sort method", names.getFirst().equals("Alex"));
}
```