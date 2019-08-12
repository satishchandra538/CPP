#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int i,r[n],z[n];
		for(i=0;i<n;i++){
			cin>>r[i];
		}
		for(i=0;i<n;i++){
			cin>>z[i];
		}
		
		//algo
		int a=0,b=0,c=0,p=n,q=n-1,s=n-2;
		if(n%2==0){
			for(i=0;i<n;i++){
				if(z[i]==p){
					a++;
					cout<<"i am a"<<endl;
				}
				else if(z[i]==q){
					b++;
					cout<<"i am b"<<endl;
				}
				else if(z[i]==s){
					c++;
					cout<<"i am c"<<endl;
				}
			}
			if(a==2 && b==2 && c==2){
				cout<<"YES"<<endl;
			}
			else
				cout<<"NO"<<endl;
		}
		else{
			for(int j=0;j<n;j++){
				if(z[j]==p){
					a++;
					cout<<"i am a"<<j<<endl;
				}
				else if(z[j]==q){
					b++;
					cout<<"i am b"<<j<<endl;
				}
				else if(z[j]==s){
					c++;
					cout<<"i am c"<<j<<endl;
				}
			}
			cout<<a<<" "<<b<<" "<<c<<endl;
			if(a==2 && b==2 && c==1){
				cout<<"YES"<<endl;
			}
			else
				cout<<"NO"<<endl;
		}
	}
	return 0;
}
