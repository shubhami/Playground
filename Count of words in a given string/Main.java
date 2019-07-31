#include<stdio.h>

int main()
{
  //Type your code here
  char str[50],i=0,count=0;
  scanf("%[^\n]s",str);
  while(str[i]!='\0'){
    if(str[i]==' '){
    count++;
    }
  i++;
  }
  count++;
  printf("%d",count);
  
}