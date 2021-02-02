#include<bits/stdc++.h>
using namespace std;
 
char s[120][120];
 
int main()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        scanf("%s",s[i]);
    int tot = 0;
    long long ans = 0;
    for(int i=0;i<n;i++)
    {
        int tot = 0;
        for(int j=0;j<n;j++)
            if(s[i][j]=='C')
                tot++;
        ans += tot*(tot-1)/2;
        tot = 0;
        for(int j=0;j<n;j++)
            if(s[j][i]=='C')
                tot++;
        ans+=tot*(tot-1)/2;
    }
    cout<<ans<<endl;
}