#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int n,i=0,remainder,dno=0;
  scanf("%ld",&n);
  while(n>0){
    remainder=n%10;
    n=n/10;
    dno=dno+(remainder*pow(2,i));
    i++;
  }
  printf("%ld",dno);
  return 0;
}