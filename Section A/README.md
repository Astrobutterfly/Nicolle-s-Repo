Section A
Anagram Problem

The instructions stated that the code should be written in a file
called anagram.py, however the student has named 
their class as 'Solution' in Line 1. If the student also named the file Solution.py this
could cause a compilation error when the student submits their 
code to an automatic marker,as it may have been programmed to only recognise submission files named anagram.py
It is standard convention to define python classes the 
same as the name of the Python Modules(a simple python file with 
a .py extension) they are contained in.This is because module names
are mapped to file names. Modules should have short, 
all lowercase names. It would be good practise for the student to
write their code in a file called anagram.py and define their 
class as "class anagram".
On line 2 the function name should be lowercase. Underscores may be used to
seperate words instead of CamelCase syntax in Python.


On line 6, the student makes use of the sorted() method which takes
the iterable that should be sorted as a necessary parameter. That
parameter is missing on this line. The method should take in 'i' as 
a parameter when sorted() is used on line 7. ie. x = " ".join(sorted(i))



After the above stipulated shortcomings have been rectified and the 
program is executed, it is not producing correct output. It is only
printing the word bat. This is because the logic of the if statement 
on line 6 is incorrect. The condition should be, if the word is not in results.
If this is the case, the word in position i should be the sorted word.
The else condition should execute if previously  the word is present
which means it is an anagram. In that case it  should increment i.


Lastly, it is also best practice to add comments to one's code. It helps
both the author of the code and those that may review the code to understand
what certain lines or blocks of code are meant to achieve. This makes the process
of debugging quicker by making it easier to follow the logic of the algorithm.


I commend the student on efficient use of the list and map data structures
to produce an optimal solution to the anagram problem rather than a brute force approach.
With the use of the inbuilt sort algorithm the student efficiently ensures that for any given
list of english words, the algorithm will optimally group the anagrams with O(n) complexity.
The student also follows a neat indention style.
