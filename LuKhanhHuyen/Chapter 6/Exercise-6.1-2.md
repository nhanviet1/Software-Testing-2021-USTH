# Exercise 6.1-2

## Problems:
* Where Made: Cars can be manufactured at other places than the 3 mentioned. The tester should include an "other" case.
* Energy Source: Hybrid overlaps gas and electric. The tester should remove hybrid.
* Size: A hatch-back car can have 2 or 4 doors. So the tester should split this into two distince characteristics: Number of doors and hatch-back.

## Correct:
There should be 4 characteristics:
* Where Made: North America, Europe, Asia, Other
* Energy Source: gas, electric, hybrid
* Number of Doors: 2, 4
* Hatch-back: True, False