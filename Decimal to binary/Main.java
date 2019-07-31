#include<stdio.h>
int main()
{
  //Type your code here
  int n,t=0,i;
  scanf("%d",&n);
  int a[100];
  while(n>0){
    a[t]=n%2;
    t++;
    n=n/2;
    
  }
  for(i=t-1;i>=0;i--){
  printf("%d",a[i]);
  }
  return 0;
}