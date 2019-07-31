#include<stdio.h>
int main()
{
 long int n,fact=1;
  scanf("%ld",&n);
  for(int i=n;i>0;i--){
  fact=fact*i;
  }
  printf("%ld",fact);
	//your code here
}