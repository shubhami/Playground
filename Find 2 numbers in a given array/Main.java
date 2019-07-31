#include<stdio.h>
int main()
{
  int n,a,b,i;
  int at=-1;
  int bt=-1;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  scanf("%d%d",&a,&b);
  for(i=0;i<n;i++){
  if(arr[i]==a){
  at=i;
  }
    if(arr[i]==b){
  bt=i;
  }
  }
  if(at>=0){
  printf("Element 1 index = %d\n",at);
  }
  else if(at==-1){
  printf("Element 1 index = -1\n",a);
  }
  if(bt>=0){
  printf("Element 2 index = %d",bt);
  }
  else if(bt==-1){
  printf("Element 2 index = -1",b);
  }
  	//type your code here
}