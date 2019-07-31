#include<stdio.h>
int main()
{
  //type your code here
  int n,s,i,ct=0,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++){
  if(i%2==0){
  s=pow(2,ct);
    ct++;
  }
  if(i%2!=0){
  s=pow(3,c);
    c++;
  }
  }
  printf("%d",s);
  return 0;
}