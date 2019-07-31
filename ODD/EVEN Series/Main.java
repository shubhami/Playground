#include<stdio.h>
int main()
{
	//type your code here
	int n,d;
  scanf("%d",&n);
  if(n>0 && n%2!=0){
  d=n/2;
    printf("%d",d*2);
  }
  else if(n==0){
  printf("0");
  }
  else if(n>0 && n%2==0){
  d=(n/2)-1;
    printf("%d",d);
  }
}