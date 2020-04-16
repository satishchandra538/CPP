#include<iostream>
#define N 9

int checkRow(int matrix[][N],int row){

}
int checkColumn(int matrix[][N])
{
}
int checkGrid(int matrix[][N])
{
}
int checkfeasibility(int matrix[][N],int value){
    return !checkRow() && !checkColumn() && !checkGrid();
}

int sudukoSolver(int matrix[][N]){

    int row=0,col=0,value,i,j;
    if(matrix[row][col]!=0){
        for(i=1;i<=9;i++){
            if (checkfeasibility(matrix, value)){
                matrix[row][col]=value;
                sudukoSolver(matrix);
                return 1;
            }
        }
    }



}

int main(){

    return 0;
}