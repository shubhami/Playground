#include<stdio.h>
int main()
{
  int max=-99999;
  int n;
  scanf("%d",&n);
  int i;
  int arr[n];
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++){
  if(arr[i]>max){
  max=arr[i];
  }
  }
  printf("%d",max);
  	//type your code here
}