open String let rec s p=try let rec(%)=(mod)and i=index p '0'and b
j=i<>j&(i/9=j/9||i%9=j%9||i/27=j/27&i%9/3=j%9/3)&p.[i]=p.[j]||j<80&b(j+1)in
iter(fun c->p.[i]<-c;b 0||()=s p;())"948721536";p.[i]<-'0'with
_->print_string p;;s(read_line())