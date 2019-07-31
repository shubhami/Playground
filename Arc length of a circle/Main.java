#include<stdio.h>
int main(){
float r,a,pi=3.14;
  scanf("%f%f",&r,&a);
  float k=a/360.0;
  float al=k*2.0*pi*r;
  printf("%.2f",al);
return 0;
}