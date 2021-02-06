#include<stdio.h>
int main(){
	char str[11];
	while( scanf("%s",str)==1 ){
		char ans[11];
		bool mark[26]={false};
		int ptr=0;
		
		char max=0;
		for(int i=0;str[i]!='\0';i++)
			if( str[i]>max )
				max=str[i];
		for(int i=0;str[i]!='\0';i++)
			if( str[i]==max )
				ans[ptr++]=str[i];
 
		ans[ptr++]='\0';
		printf("%s\n",ans);
	}
	return 0;
}