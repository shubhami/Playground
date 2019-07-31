#include<stdio.h>
int main()
{
  int a[3];
  int n=3;
  int t,i,j;
  for(i=0;i<n;i++){
  scanf("%d",&a[i]);
  }
  for(i=1;i<n;i++){
  for(j=0;j<i;j++){
  if(a[i]>a[j]){
  t=a[i];
    a[i]=a[j];
    a[j]=t;
  }
  }
  }
  printf("%d ",a[1]);
  // Type your code here
}