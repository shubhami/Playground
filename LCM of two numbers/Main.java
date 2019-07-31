#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,i,t=1;
  scanf("%d%d",&a,&b);
  for(i=1;i<=b;i++){
  t=a*i;
    if(t%a==0 && t%b==0){
    printf("%d",t);
      break;
    }
  }
  return 0;
}