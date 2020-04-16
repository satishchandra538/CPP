#include <iostream>
using namespace std;
#define N 8
static int move_x[N] = {2, 1, 2, 1, -2, -1, -2, -1};
static int move_y[N] = {1, 2, -1, -2, 1, 2, -1, -2};
int checkFeasibility(int x, int y, int soln[][N])
{
	if (x > 0 && x < N && y > 0 && y < N && soln[x][y] == -1)
	{
		return 1;
	}
	else
		return 0;
}

int createSolution(int x, int y, int stepNumber, int soln[][N])
{
	if (stepNumber == N * N)
		return 1;

	int next_x, next_y;
	for (int i = 0; i < N; i++)
	{
		next_x = x + move_x[i];
		next_y = y + move_y[i];
		if (checkFeasibility(next_x, next_y, soln))
		{
			stepNumber++;
			soln[next_x][next_y] = stepNumber;
			createSolution(next_x, next_y, stepNumber, soln);
			return 1;
		}
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

int main()
{
	int soln[N][N];

	//initialising values -1 in solution matrix
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			soln[i][j] = -1;
		}
	}
	soln[0][0] = 0;
	createSolution(9, 7, 0, soln);
	displaySolution(soln);

	return 0;
}
