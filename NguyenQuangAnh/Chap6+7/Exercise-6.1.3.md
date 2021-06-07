*__Question__: Answer questions about the following table:*

!["Image"](Exercise-6.1.3-image.png)

*__Answer:__*

- *a. “Location of element in list” fails the disjointness property. Give an example that illustrates this.* <br><br>If the list has only 1 element, then Block 1 and Block 2 will be jointed.<br><br>
- *b. “Location of element in list” fails the completeness property. Give an example that illustrates this.* <br><br>The element can be null, or not in the list.<br><br>
- *c. Supply one or more new partitions that capture the intent of “Location of element in list” but do not suffer from completeness or disjointness problems.*<br><br>
    - Block 1: Element is not null and in the list.
    - Block 2: Element is not null and not in the list.
    - Block 3: Element is null.