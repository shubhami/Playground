#include<stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int i;
  for(i=0;str[i]!='\0';i++){
  if(str[i]!='a'&&str[i]!='A'&&str[i]!='e'&&str[i]!='E'&&str[i]!='i'&&str[i]!='I'&&str[i]!='o'&&str[i]!='O'&&str[i]!='u'&&str[i]!='U'){
  printf("%c",str[i]);
  }
  }
  //Type your code here
  
  return 0;
}