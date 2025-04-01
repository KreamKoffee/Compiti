#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#define MAX 3
using namespace std;

/* 
Nome: Alex
Cognome : Lin
*/

typedef struct casa{
	int metriq;
	char classe;
	int costo;
	float cmedio;
	
}casa;

void carica(casa vet[])
{
	int i, j;
	
	for (i=0; i<MAX; i++)
	{
		printf("Casa %d \n", i+1);
		printf("metri quadri: ");
		scanf("%d", &vet[i].metriq);
		
		printf("Classe energetica: ");
		cin >> vet[i].classe;
		
		printf("Costo: ");
		scanf("%d", &vet[i].costo);
		
		vet[i].cmedio = (float)vet[i].costo / vet[i].metriq;
		
		
	}
}

void stampa(casa vet[]){
	
	for (int i=0; i<MAX; i++)
	{
		
		printf("\nCasa %d \n", i+1);
		printf("metri quadri: %d \n", vet[i].metriq );
		printf("classe energetica: %c \n", vet[i].classe);
		printf("Costo: %d \n", vet[i].costo);
		printf("Costo medio per metro quadro: %.2f \n", vet[i].cmedio);
		
	}
	
}

void scambio(casa &a, casa &b)
{
	casa temp;
	temp = a;
	a = b;
	b = temp;
}

void ordina(casa vet[])
{
	for (int i=0; i<MAX-1; i++)
	{
		for (int j=i+1; j<MAX; j++)
		{
			if  (vet[i].metriq < vet[j].metriq)
			{
				scambio(vet[i], vet[j]);
			}	
		}
	}
}

void ordina_classe_ene(casa vet[])
{
	for (int i=0; i<MAX-1; i++)
	{
		for (int j=i+1; j<MAX; j++)
		{
			if  (vet[i].classe > vet[j].classe)
			{
				scambio(vet[i], vet[j]);
			}else
			{
				if (vet[i].classe == vet[j].classe)
				{
					if  (vet[i].metriq < vet[j].metriq)
					{
						scambio(vet[i], vet[j]);
					}
				}
			}
		}
	}
}


int main()
{
	casa vet[MAX];
	
	carica(vet);
	
	
	printf("\nprima ordinamento: \n");
	stampa(vet);
	ordina(vet);
	
	
	printf("\ndopo ordinamento in base alla grandezza: \n");
	stampa(vet);
	
	ordina_classe_ene(vet);
	printf("\ndopo ordinamento in base alla classe energetica: \n");
	stampa(vet);



	system("pause");
}

