#include <stdio.h>
int main() {
	//Type your code
  int n,i,count=0;
  scanf("%d",&n);
  for(i=1;i<50;i++){
  if(i%2!=0 && count<n){
  printf("%d\n",i);
    count=count+1;
  }
  }
	return 0;
}