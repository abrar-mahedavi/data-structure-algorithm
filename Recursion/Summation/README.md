# data-structure-algorithm

## Problem Statement

Find the sum of the first N natural numbers


## Steps to solve:

### Logic

For getting sum(n) we can first get the answer of sum(n-1). Then, by applying n + sum(n-1) we can get the final answer.

#### Step 1: We will write a function that will return us the sum of (n-1) natural numbers

#### Step 2: Each time we will call the recursion function with (n-1) value & add it with n

#### Step 3: At last, we will add a base condition for the recursion to stop.

Now coming back to the main topic of today’s lecture that is –

### What is a Recursion Tree ??

A recursion tree is a pictorial representation of all the processes happening to solve any given recursive problem.

## Sample Problem

Find Nth Fibonacci Number

### Steps to Solve:

For getting fibo(n) we can first get the answer of fibo(n-1) and fibo(n-2) then by applying fibo(n-1) + fibo(n-2) we can get the final answer.

#### Step 1: We will write a function that will basically return us the value of fibo(n-1) and fibo(n-2).

#### Step 2: Each time we will call the recursion function with fibo(n-1) and fibo(n-2) value & add it.

#### Step 3: At last we will add a base condition for the recursion to stop.

### Recursion Tree

### Time Complexity: O(2 ^ N)

As time complexity depends on number of nodes, hence Time Complexity is O( 2 ^ N)

### Space Complexity: O(N)

Space Complexity will be equal to height of the recursive tree, thus Space Complexity is O(N)
A repo to learn the concepts of the data structure and algorithm
