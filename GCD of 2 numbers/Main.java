// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b,c,d,e,f,i,k;
  scanf("%d%d",&a,&b);
  if(a<b){
  c=a;
    d=b;
  }
  else{
    c=b;
    d=a;
  }
for(i=1;i<=c;i++){
  if(d%i==0 && c%i==0){
  k=i;
  }
}
  printf("%d",k);
  // Enter your code here 
  
   return 0;
}