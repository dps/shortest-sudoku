#Ruby

The shortest Ruby solver is 122 chars.

##To run
```
$ ruby sudoku.rb 200370009009200007001004002050000800008000900006000040900100500800007600400089001
```

##Notes on the solution
The program can be made a further one byte shorter if the 80 character per line restriction is removed, by putting everything on one long line.

The quotes around the result can be removed, but this adds 1 more byte to the length of the program.

##Contributors

 * The program is a port of the Perl version to Ruby initially by Justin Giancola.
Mark Byers reduced it to 134 bytes.
 * acw1668 changed `(p a)` to `p(a)` to reduce it to 133 bytes, saving one byte.
 * Martin DeMello changed `(?1..?9).map` to `[*?1..?9]` to reduce the program to 130 bytes, saving three bytes.
 * flagitious reduced the program to 122 bytes (with thanks to marmaladea for the trick of changing `$*<<(…)` to `$*.<<… .`