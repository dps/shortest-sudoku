main(int j,char**V){char*R=V[1],i=0,k=48,x;for(;*R>k;*++R||puts(R-i))++i;
for(;++k<58;*R=1)for(j=81;j--&&R[x=j-i]^k|x%9*(j/9-i/9)*
(j/27^i/27|j%9/3^i%9/3);)!j&&main(*R=k,V);}