#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float l,p,h;
  scanf("%f%f",&l,&p);
  float k=(l*l)+(p*p);
  h=sqrt(k);
  printf("%.2f",h);
  return 0;
}