def s(l:String):Unit={val i=l indexOf '0'
if(i<0)println(l)else
for{c<-'1'to'9'
if(0 to 80).forall(n=>((n-i)%9*(n/9^i/9)*(n/27^i/27|n%9/3^i%9/3)|l(n)^c)!=0)}
s(l.replaceFirst("0",""+c))}
s(args(0))