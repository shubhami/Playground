#include<stdio.h>

int main()
{
  int arr[4];
  int n=4,i,t,j;
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  for(i=1;i<n;i++){
  for(j=0;j<i;j++){
  if(arr[j]>arr[i]){
  t=arr[i];
    arr[i]=arr[j];
    arr[j]=t;
  }
  }
  }
  printf("%d",arr[0]);
  // Type your code here
}