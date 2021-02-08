
#include<bits/stdc++.h>
using namespace std;
int main()
{
    string ch;
    cin>>ch;
    int l=ch.size();
    int n=l;
    string st;
    set<string> W;
    while(l--)
    {
        char temp=ch[n-1];
        for(int i=n-1;i>0;i--)
        {
            ch[i]=ch[i-1];
        }
        ch[0]=temp;
        W.insert(ch);
    }
    cout<<W.size();
 
    return 0;
}