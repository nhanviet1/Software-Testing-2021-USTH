The text suggests both ‘2’ and ‘1’ base choices for side 1. (Other sides still have 1 base choice of ‘2’). This give two base tests: (2, 2, 2) and (1, 2, 2). According to the formula given in the text, we get 2(base) + 4 + 6 + 6 = 18 tests. However, 2 of these are redundant, so the result is 16. To clarify, we list all 18 tests, generated according to the formula:
{(2, 2, 2), //F irst base test
(0, 2, 2),(−1, 2, 2), //V ary f irst characteristic
(2, 1, 2),(2, 0, 2),(2, −1, 2), //V ary second characteristic
(2, 2, 1),(2, 2, 0),(2, 2, −1), //V ary third characteristic
{(1, 2, 2), //Second base test
(0, 2, 2),(−1, 2, 2), //V ary f irst characteristic
(1, 1, 2),(1, 0, 2),(1, −1, 2), //V ary second characteristic
(1, 2, 1),(1, 2, 0),(1, 2, −1), //V ary third characteristic
}
Here are the 16 nonredundant tests:
{(2, 2, 2),
(0, 2, 2),(−1, 2, 2),
(2, 1, 2),(2, 0, 2),(2, −1, 2),
(2, 2, 1),(2, 2, 0),(2, 2, −1),
(1, 2, 2),
(1, 1, 2),(1, 0, 2),(1, −1, 2),
(1, 2, 1),(1, 2, 0),(1, 2, −1)
}
