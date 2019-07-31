#include <stdio.h>
int main() {
	// Type your code here
  char ch;
  scanf("%c",&ch);
  int d= ch;
  if(d>=97 && d<=122){
  d=d-32;
  }
  else if(d>=65 && d<=90){
  d=d+32;
  }
  printf("%c",d);
	return 0;
}