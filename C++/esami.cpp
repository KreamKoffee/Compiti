/*
alunno:
classe:
data:
*/
#include <string.h>
#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#define MAX 30
//
using namespace std;

typedef struct esame{
	char materia[20];
	int voto;
}esami;

void carica(esami v[], int dim)
{
	
	for( int i=0; i<dim; i++)
	{
		system("cls");
		printf("inserisci la materia: ");
		scanf("%s", &v[i].materia);
		printf("insersci il voto: ");
		scanf("%d", &v[i].voto);
		cout << endl;
	}
}

void stampa(esami v[], int dim)
{
	for( int i=0; i<dim; i++)
	{
		printf("materia: %s\n", v[i].materia);
		printf("voto: %d\n", v[i].voto);
		cout << endl;
	}
}


int menu()
{
	int n;
	do{
		
		printf("1 - carica \n");
		printf("2 - stampa \n");
		printf("3 - cerca \n");
		printf("4 - uscita \n");
		printf("fai la scelta: ");
		scanf("%d", &n);
		cout << endl;
		return(n);
	}while( n > 4 || n < 1);
	
	
}

int num_esami()
{
	int num;
	do
	{
		printf("inserisci il numero di esami: ");
		scanf("%d", &num);
	}while(num <0 || num >= 30);
	return(num);
}

void cerca(esami v[], int dim, char materia[])
{
	for (int i=0; i<MAX; i++)
	{
		
		if (strcmp(materia, v[i].materia) == 0)
		{
			printf("materia: %s\n", v[i].materia);
			printf("voto: %d\n", v[i].voto);
			cout << endl;
			break;
			
		}
		
	}
}

int main()
{
	int scelta;
	esami v[MAX];
	int dim;
	char materia[20];
		
	do{
		
		scelta = menu();
		
		switch(scelta)
		{
	
			case 1:
			
				dim = num_esami();
				carica(v, dim);
				break;
				
			case 2:	
				stampa(v, dim);
				break;
		
			case 3:
				printf("inserisci la materia da cercare: ");
				scanf("%s", &materia);
				cerca(v, dim, materia);
				break;
		}	
		
			
	}while( scelta != 4);
	
	

	system("pause");
}

