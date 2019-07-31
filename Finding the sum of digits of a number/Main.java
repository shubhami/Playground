#include <stdio.h>
int main() {
	//Type your code
  int n,t,k=0;
  scanf("%d",&n);
  while(n>0){
  t=n%10;
    k=k+t;
    n=n/10;
  }
  printf("%d",k);
	return 0;
}