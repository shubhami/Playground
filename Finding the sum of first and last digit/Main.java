#include <stdio.h>
int main() {
	//Type your code
  int n,fd;
  scanf("%d",&n);
  int ld=n%10;
  while(n>=100){
  n=n/10;
  }
  fd=n/10;
  printf("%d",fd+ld);
	return 0;
}