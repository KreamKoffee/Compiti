# include <stdio.h>
# include <iostream>
# include <stdlib.h>
# include <time.h>
# define R 5
# define C 4
/*
data:
consegna:
*/
using namespace std;

void carica(int mat[][C])
{
	for (int i=0; i<R; i++)
	{
		for (int j=0; j<C; j++)
		{
			mat[i][j] = rand()%10+5;
		}
	}
}

void stampa(int mat[][C])
{
	for (int i=0; i<R; i++)
	{
		for (int j=0; j<C; j++)
		{
			printf("%2d\t", mat[i][j]);
		}
		
		cout << endl;
	}
}

int main()
{
	
	int mat[R][C];
	
	carica(mat);
	stampa(mat);


system("pause");
}

