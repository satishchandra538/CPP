#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
	    
	    //input
		int n,i;
		cin>>n;
		int a[n],b[n];
		for(i=0;i<n;i++)
		cin>>a[i];
		for(i=0;i<n;i++)
		cin>>b[i];
		
		//algo
		long long int max=0;
		for(i=0;i<n;i++){
			long long int p=a[i]*20-b[i]*10;
			if(p>max)
				max=p;
            }
        cout<<max<<endl;
        }
    return 0;
}
