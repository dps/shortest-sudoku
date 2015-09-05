#K

The shortest Sudoku solver in any language is written in [K](https://en.wikipedia.org/wiki/K_(programming_language)). K is a synthesis of APL and LISP.

##To run
```
$ q sudoku.k 200370009009200007001004002050000800008000900006000040900100500800007600400089001 2>/dev/null </dev/null
```

##How to get K
There is an open source implementation of the K programming language by Kevin Lawler called [Kona](https://github.com/kevinlawler/kona).  Unfortunately, the Sudoku solver doesn't seem to work with the OSS implementation, but you might have fun figuring out how this esoteric language works in general.  K was originally designed by Arthur Whitney and Kx Systems, and is used in Kx Systems KDB+ product.  [An evaluation version is available on their website](http://kx.com/software-download.php) and the 32-bit version of KDB+ is available for free and the solution works with that version.

```
$ m32/q sudoku.k 200370009009200007001004002050000800008000900006000040900100500800007600400089001 2>/dev/null </dev/null
Welcome to kdb+ 32bit edition
For support please see http://groups.google.com/d/forum/personal-kdbplus
Tutorials can be found at http://code.kx.com/wiki/Tutorials
To exit, type \\
To remove this startup msg, edit q.q
284375169639218457571964382152496873348752916796831245967143528813527694425689731
```

##Notes on the solution
 * Originally written by Arthur Whitney (the developer of K) and Attila Vrabecz.
 * Small changes made by Jason Nordwick.
 * Members of the K mailing list also suggested changes.