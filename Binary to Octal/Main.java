#include<stdio.h>

int main()
{
  int bin,octal=0,j=1,remainder;
  scanf("%d",&bin);
  while(bin!=0){
    
  remainder=bin%10;
    octal=octal+remainder*j;
    j=j*2;
    bin=bin/10;
    
  }
  int rem,oc=0,i=1;
  while(octal!=0){
  rem=octal%8;
    oc=oc+rem*i;
    i=i*10;
    octal=octal/8;
    
  }
  printf("%d",oc);
  //Type your code here
}