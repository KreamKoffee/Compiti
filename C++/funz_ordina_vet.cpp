# include <stdio.h>
# include <iostream>
# include <stdlib.h>
# include <time.h>
/*
data:
consegna: tramite funzioni carica, stampa,
ordina crescente e stampa un vettore di interi dim 1
*/
using namespace std;

const int dim=10;


void carica(int vet[])
{
	int i;
	for (i=0; i<dim; i++)
	{
		vet[i]=rand()%10+10;
	}
}

void stampa(int vet[])
{
	int i;
	for (i=0; i<dim; i++)
	{
		printf("%d \t", vet[i]);
	}
	cout << endl;
}

void ordina(int vet[])
{
	int i,j;
	int temp;
	for(i=0; i<dim-1; i++)
	{
		for (j=0; j<dim-1-i; j++)
		{
			if (vet[j] > vet[j+1])
			{
				temp = vet[j];
				vet[j] = vet[j+1];
				vet[j+1] = temp;
			}
		}
	}
}

void stampavet(int vet[])
{
	int i;
	
	printf("vettore ordinato: \n");
	for (i=0; i<dim; i++)
	{
		printf("%d \t", vet[i]);
	}
	cout << endl;
}

int main()
{
	int vet[dim];
	
	
	srand(time(NULL));
	carica(vet);
	printf("prima ordinamento \n");
	stampa(vet);
	ordina(vet);
	
	stampavet(vet);


system("pause");
}

