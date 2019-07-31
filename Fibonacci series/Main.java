#include<stdio.h>
int main()
{
  //Type your code here
  int a=0,b=1,n,sum,t,i;
  scanf("%d",&n);
  if(n==1){
  printf("%d",a);
  }
  if(n==2){
  printf("%d %d",a,b);
  }
  if(n>2){
  printf("%d %d ",a,b);
    for(i=2;i<n;i++){
    sum=a+b;
      a=t;
      a=b;
      b=sum;
      printf("%d ",b);
    }
  }
  return 0;
}