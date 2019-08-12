#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int i,c[n],z[n];
		for(i=0;i<n;i++)
			cin>>c[i];
		for(i=0;i<n;i++)
			cin>>z[i];
		//algo
		
		int a=0,b=0,d=0,j;
		if(n%2==0){
			for(i=0;i<n;i++){
				if(z[i]==n)
					a++;
				else if(z[i]==n-1)
						b++;
				else if(z[i]==n-2)
						d++;
			}
			if(a==2 && b==2 && d==2)
				cout<<"YES"<<endl;
			else
				cout<<"NO"<<endl;
		}
		else{
			for(j=0;j<n;j++){
				if(z[j]==n){
					a++;
				}
				else if(z[j]==n-1)
						b++;
				else if(z[j]==n-2)
						d++;
			}
			if(a==2 && b==2 && d==1)
				cout<<"YES"<<endl;
			else
				cout<<"NO"<<endl;
		}
	}
	return 0;
}
