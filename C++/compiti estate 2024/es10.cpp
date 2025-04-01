# include <stdio.h>
# include <iostream>
# include <stdlib.h>
# include <time.h>
#define MAX 10
/*
data:
consegna:
*/
using namespace std;

int main()
{
	int v[MAX];
	
	for (int i=0; i<MAX; i++)
	{
		v[i] = rand()%10+5;
	}
	
	for (int k=0; k<MAX; k++)
	{
		printf("%d\t", v[k]);
	}
	
	cout << endl;
	
	for (int j=0; j<3; j++)
	{
		v[j] *= 2;
	}
	
	for (int q=0; q<MAX; q++)
	{
		printf("%d\t", v[q]);
	}
	
	cout << endl;


system("pause");
}

