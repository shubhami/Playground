#include<stdio.h>
int main()
{
  int n=3;
  while(n--){
    char str[20];
    scanf("%s",str);
  if(n==2){
  
    int i;
    for(i=0;str[i]!='\0';i++){
    if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U'){
    str[i]='$';
    }
    }
  }
    if(n==1){
  
    int i;
    for(i=0;str[i]!='\0';i++){
    if(str[i]!='a'&&str[i]!='A'&&str[i]!='e'&&str[i]!='E'&&str[i]!='i'&&str[i]!='I'&&str[i]!='o'&&str[i]!='O'&&str[i]!='u'&&str[i]!='U'){
    str[i]='#';
    }
    }
  }
    if(n==0){
      int c = 0;
   
   while (str[c] != '\0') {
      if (str[c] >= 'a' && str[c] <= 'z') {
         str[c] = str[c] - 32;
      }
      c++;
   }
  }
    printf("%s",str);
  }
  // type your code here 
}