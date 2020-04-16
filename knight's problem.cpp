#include <iostream>
using namespace std;
#define N 8
static int count = 0;
static int movex[] = {2, 1, 2, 1, -2, -1, -2, -1};
static int movey[] = {1, 2, -1, -2, 1, 2, -1, -2};
int checkValidity(int x, int y, int soln[][N])
{
    if (x >= 0 && x < N && y >= 0 && y < N && soln[x][y] == -1)
        return 1;
    else
    {
        return 0;
    }
}
int displaySolution(int soln[][N])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cout << soln[i][j] << " ";
        }
        cout << "\n";
    }
}
int createSolution(int x, int y, int stepNumber, int soln[][N])
{
    if (stepNumber == N * N)
    {
        return 1;
    }

    int nextx, nexty, i;
    for (i = 0; i < N; i++)
    {
        nextx = x + movex[i];
        nexty = y + movey[i];
        if (checkValidity(nextx, nexty, soln))
        {
            stepNumber++;
            soln[nextx][nexty] = stepNumber;
            createSolution(nextx, nexty, stepNumber, soln);
            return 1;
        }

        cout << "inside loooooooooooooooooooooooooooooooooooooooooooop" << ++count << "\n\n";
        displaySolution(soln);
    }
    displaySolution(soln);
}

int main()
{
    int soln[N][N], x = 0, y = 0;

    //initialising values -1 in solution matrix
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            soln[i][j] = -1;
        }
    }
    createSolution(x, y, 0, soln);
    soln[x][y] = 0;
    cout << "final----------------------------\n\n";
    displaySolution(soln);
    cout << "\n\ncount=" << count;
    return 0;
}
