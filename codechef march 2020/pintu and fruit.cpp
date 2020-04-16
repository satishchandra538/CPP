#include <iostream>
using namespace std;

int main()
{
    int t, i, j, n, m, min , total, ftype;
    cin >> t;
    while (t--)
    {	min=99999;
        cin >> n >> m;
        int type[n], price[n];
        for (i = 0; i < n; i++)
            cin >> type[i];
        for (i = 0; i < n; i++)
            cin >> price[i];

        for (i = 0; i < m; i++)
        {
            total = 0;
            for(i=0;i<n;i++){
                if(type[i]!=0){
                    ftype=type[i];
                    break;
                }
            }
            for (j = 0; j < n; j++)
            {
                if (ftype == type[j])
                {
                    total += price[j];
                    type[j] = 0;
                }
            }
            if (min > total && total != 0)
            {
                min = total;
            }
        }
        cout << min << "\n";
    }
    return 0;
}
