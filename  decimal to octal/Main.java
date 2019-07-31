#include<stdio.h>
int main()
{
  //type your code here
  int n,i,t=0;
  int a[50];
  scanf("%d",&n);
  while(n>0){
  a[t]=n%8;
    t++;
    n=n/8;
  }
  for(i=t-1;i>=0;i--){
  printf("%d",a[i]);
  }
  return 0;
}