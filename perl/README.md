#Perl

The shortest Perl solver is 121 chars.

##To run
```
$ echo 000010000301400860900500200700160000020805010000097004003004006048006907000080000 | perl sudoku.pl
```

*Output*
```
452618379371429865986573241734162598629845713815397624293754186148236957567981432
```

##Notes on the solution
The program still works if `${…}for` is changed to `map{…}` , saving one byte. However now the program can consume large amounts of memory.

##Contributors

 * This program is a slightly modified version of another three line Sudoku Solver (page includes a description of how it works).
 * Mark Byers reduced it to 187 bytes.
 * Gordon McCreight reduced it to 186 bytes.
 * Pablo Carbonell reduced it to 181 bytes, and provided this comment
 >The difference with the original perl algorithm is that in this version 
I am taking in every iteration a slice @B with the values of the
contiguous cells. The trickiest thing, I think, is the way this slice is
used as a regular expression range in the grep.
 * Simon Stroh changed `@A=split//,<>` to `$/=\1;@A=<>` to reduce the program to 179 bytes.
 * Mitsuru Kariya changed `@A[map{ … }]`  to `map@A[ … ]` to reduce the program to 178 bytes.
 * Ton Hospel shortened the program to 121 bytes.
