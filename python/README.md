#Python

The shortest C solver is 169 chars.

##To run
```
$ echo 000010000301400860900500200700160000020805010000097004003004006048006907000080000 | python sudoku.py
```

##Contributors

 * The original python program of length 178 bytes was written by Mark Byers, with help from marienz and Random832, originally based on the Perl program above.
 * David Warren changed ‘%d’%5**18 to `14**7*9` which reduced the program to 177 bytes (and also improves the performance of the algorithm).
 * Yu-Xi Lim suggested using raw_input() and input() which reduced the clean version to 169 bytes and the ‘cheating’ version to 155 bytes.