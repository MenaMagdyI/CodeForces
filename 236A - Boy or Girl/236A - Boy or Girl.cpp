#include <iostream>//2nd
#include <string>
#include <algorithm>
#include <cmath>
#include <stdio.h>
using namespace std;
 
int main()
{
    int n=0;
    string m;
    cin >>m;
    sort(m.begin(),m.end());
    for(int i=0;i<m.size();i++)
    {while(m[i]==m[i+1])
            m.erase(i,1);}
        for(int i=0;i<m.size();i++)
        {n++;}
    
    if(n%2==0)cout << "CHAT WITH HER!";
    else cout << "IGNORE HIM!";
 
}