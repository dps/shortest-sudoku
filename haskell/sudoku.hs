z""a=a
z('0':b)t=foldr(++)""[z b$t++[x]|x<-['1'..'9'],notElem x
d]where{d=[h$m`mod`9+i*9|i<-a]++[h$m-j 9+i|i<-a]++[h$i*9`mod`26+m-j 3-j
27+j 9|i<-a];j=mod m;m=length t;h=(!!)$t++'0':b;a=[0..8]}
z(c:b)a=z b$a++[c]
main=do
a<-getLine
putStr$z a""