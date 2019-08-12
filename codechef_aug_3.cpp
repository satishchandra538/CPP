#include<iostream>
#include<string>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		string str;
		cin>>str;
		int total=0,i=0;
		for(int i=0;i<str.size();i++){
			if(str[i]=='1')
				total++;
		}
		if(total%2==0)
			cout<<"LOSE"<<endl;
		else
			cout<<"WIN"<<endl;
	}
	return 0;
}
