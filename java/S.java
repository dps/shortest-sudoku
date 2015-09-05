class S{public static void main(String...a){int i=a[0].indexOf(48),j;char
k=48,c[]=a[0].toCharArray();if(i<0)System.out.print(c);else
for(;++k<58;){for(j=81;j-->0&&((j-i)%9*(j/9^i/9)*(j/27^i/27|j%9/3^i%9/3)
|c[j]^k)!=0;);c[i]=k;if(j<0)main("".valueOf(c));}}}