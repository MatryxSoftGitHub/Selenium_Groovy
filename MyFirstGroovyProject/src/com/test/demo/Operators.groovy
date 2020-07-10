package com.test.demo

//Arithmetic operators

assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8

//Unary Operator

assert +3 == 3
assert -4 == 0 - 4

assert -(-1) == 1

//Assignment arithmetic operator

def a = 4
a += 3

def c = 5
c *= 3

//Relational operators

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

//Bitwise operator

int o = 0b00101010
assert o == 42
int b = 0b00001000
assert o == 8
assert (o & o) == o
assert (o & b) == b
assert (o | o) == o
assert (o | b) == o

//Conditional operators

assert (!true)    == false
assert (!'foo')   == false
assert (!'')      == true

