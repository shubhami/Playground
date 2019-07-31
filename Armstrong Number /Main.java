#include <stdio.h>
int main() {
	//Type your code
  int n,count=0,k,sum=0,cube,l;
  scanf("%d",&n);
  int t=n;
  l=n;
  while(t>0){
  t=t/10;
    count++;
  }

  while(n>0){
  k=n%10;
    cube=k*k*k;
    sum=sum+cube;
    n=n/10;
  }
  if(l==sum){
  printf("Armstrong Number");
  }
  else{
  printf("Not an Armstrong Number");
  }
	return 0;
}