# include <stdio.h>
# include <iostream>
# include <stdlib.h>
# include <time.h>
#define M 3
/*
data:
consegna:
*/
using namespace std;

void carica(int v[M])
{
	for (int i=0; i<M; i++)
	{
		v[i] = rand()%10+5;
	}
}

void stampa(int v[M])
{
	for (int i=0; i<M; i++)
	{
		printf("%d\t", v[i]);
	}
	cout << endl;
}

int main()
{
	int v[M];
	int prod = 0;
	
	srand(time(NULL));
	
	
	
	carica(v);
	stampa(v);
	
	prod = v[0];
	
	for (int i=0; i<M; i++)
	{
		      
		
		prod *= v[i];
	}
	
	printf("il prodotto tra i numeri vale: %d\n", prod);
	
	


system("pause");
}

