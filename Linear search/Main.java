#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,flag=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  int val;
  scanf("%d",&val);
  for(i=0;i<n;i++){
  if(arr[i]==val){
  flag=i+1;
    break;
  }
  }
  if(flag!=0){
    printf("%d",flag);
  }
  else if(flag==0){
  printf("%d isn't present in the array.",val);
  }
  return 0;
}