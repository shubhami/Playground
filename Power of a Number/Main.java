#include <stdio.h>
int main()
{
  	//Your code here   
  long int a,b,c=1;
  scanf("%ld%ld",&a,&b);
  if(b==0){
  printf("1");
  }
  else if(b>0){
  while(b>0){
  c=c*a;
    b--;
  }
  printf("%ld",c);
  }
  else{
  printf("Wrong input");
  }
    return 0;
}