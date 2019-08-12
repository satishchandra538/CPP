#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int a[n],i;
		for(i=0;i<n;i++)
			cin>>a[i];
			
		//algo
		int total=0;
		for(int k=0;k<n-2;k++)
		for(i=k;i<n;i++){
				int x=a[i];
				x=x^a[i+1];
				cout<<"xor="<<x<<" k="<<k<<endl;
				if(i>k+1)
					if(x==0)
						total=total+i;
					
			/*else{
				int x=0;
				x=x^a[i];
				cout<<"x="<<x<<endl;
				if(i>k+2)
					if(x==0)
						total=total+i-1;
			}*/
		}
		cout<<total<<endl;
	}
	return 0;
}
