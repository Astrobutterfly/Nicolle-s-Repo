<h2> Accessing File <h2>
The checkISBN.java file may be compiled on any IDE that is compatible with Java.
The test cases that were used for the code are those provided on 
https://edabit.com/challenge/C5mooK3wfdhoooeLw.

<h2>Worst Case complexity<h2>
To get valid output the algorithm has to take a string as input of size 10 or 13.
It then adds the string to an array of respective size. This is done with a for loop
which iterates 10 or 13 times respectively. Therefore the worst case complexity of
this procedure is O(n). There are no nested loops so the complexity remains O(n) for 
all the for loops in the algorithm.
In the process of converting a valid ISBN10 number to a valid ISBN13 number, finding
the last digit that makes the resulting ISBN13 valid, in the worst case occurs 10 times.
(We try adding 0, incrementing by 1 until we get to 9).
This is constant linear time therefore the worst case complexity of this process is 0(1).
This means the total worst case complexity of the algorithm is O(n)
