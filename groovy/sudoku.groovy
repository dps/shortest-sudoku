def r(a){def i=a.indexOf(48);if(i<0)print a else(('1'..'9')-(0..80).collect{
j->g={(int)it(i)==(int)it(j)};g{it/9}|g{it%9}|g{it/27}&g{it%9/3}?a[j]:'0'})
.each{i==0?r(it+a[i+1..-1]):r(a[0..<i]+it+a[i+1..-1])}}