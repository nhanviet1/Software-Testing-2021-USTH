# Exercise 3.8
## Develop a set of data-driven JUnit tests for the <span style="font-family:Courier">Min</span> program. These tests should be for normal, not exceptional, returns. Make your <span style="font-family:Courier">@Parameters</span> method produce both String and Integer values.

```Java
package com.company;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class TestMin {
    private List<String> list;
    @Before
    public void setUp()
    {
        list = new ArrayList<String>();
    }

    @After
    public void tearDown()
    {
        list = null;
    }

    @Test public void testForNullList()
    {
        list = null;
        try {
            Min.min (list);
        } catch (NullPointerException e) {
            return;
        }
        fail ("NullPointerException expected");
    }

    @Test (expected = NullPointerException.class)
    public void testForNullElement() {
        list.add(null);
        list.add("Huyen");
        Min.min(list);
    }

    @Test (expected = NullPointerException.class)
    public void testForSoloNullElement()
    {
        list.add (null);
        Min.min (list);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyList()
    {
        Min.min (list);
    }

    @Test
    public void testSingleElement()
    {
        list.add ("Huyen");
        Object obj = Min.min (list);
        assertEquals("Single Element List", "Huyen", obj);
    }

    @Test
    public void testDoubleElement()
    {
        list.add ("Lu");
        list.add ("Huyen");
        Object obj = Min.min (list);
        assertEquals("Double Element List", "Huyen", obj);
    }
}
```