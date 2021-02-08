#include<cstdio>
#include<cstring>
#include<algorithm>
#include<iostream>
using namespace std;
 
char s1[1005],s2[1005];
 
int main(){
    while(scanf("%s%s",s1,s2)!=EOF){
        if(strcmp(s1,s2) == 0) printf("%s\n",s1);
        else printf("1\n");
    }
    return 0;
}