#include <iostream>
using namespace std;

int main()
{
    int t, i, j,q,p,n,num,even,odd;
    cin >> t;
    while (t--){
        cin>>n>>q;
        int quer[n];
        for(i=0;i<n;i++){
            cin>>quer[i];
        }
        int p[q];
        for (i = 0; i < q; i++)
        {
            cin >> p[i];
        }
        num=0;
        for(i=0;i<q;i++){
            num=p[i];
            even=0;
            odd=0;
            //cout<<"num="<<num<<"\n";
            for(j=0;j<n;j++){
                num = num ^ quer[j];
                if(num%2==0){
                    even++;
                    //cout<<"even="<<num<<" "<<"quer[j]="<<quer[j]<<"\n";
                }
                else{
                    odd++;
                    //cout<<"odd="<<num<<" "<<"quer[j]="<<quer[j]<<"\n";
                }
                num = p[i];
            }
            cout<<even<<" "<<odd<<"\n";
        }
    }
return 0;
}
