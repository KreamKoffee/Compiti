#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#define MAX 3
using namespace std;

typedef struct libro{
	int codice;
	int pagine;
	float costo;
	float cmedio;
	
}libro;

void carica(libro vet[])
{
	int i, j;
	
	for (i=0; i<MAX; i++)
	{
		printf("Libro %d \n", i+1);
		printf("Codice: ");
		scanf("%d", &vet[i].codice);
		
		printf("numero di pagine: ");
		scanf("%d", &vet[i].pagine);
		
		printf("costo: ");
		scanf("%f", &vet[i].costo);
		
		vet[i].cmedio = (float)vet[i].costo / vet[i].pagine;
		
		
	}
}

void stampa(libro vet[]){
	
	for (int i=0; i<MAX; i++)
	{
		printf("\nLibro %d \n", i+1);
		printf("Codice: %d \n", vet[i].codice );
		printf("N.pagine: %d \n", vet[i].pagine);
		printf("Costo: %.2f \n", vet[i].costo);
		printf("Costo medio per pagina: %.2f \n", vet[i].cmedio);
	}
}

void scambio(libro &a, libro &b)
{
	libro temp;
	temp = a;
	a = b;
	b = temp;
}

void ordina(libro vet[])
{
	for (int i=0; i<MAX-1; i++)
	{
		for (int j=i+1; j<MAX; j++)
		{
			if  (vet[i].cmedio > vet[j].cmedio)
			{
				scambio(vet[i], vet[j]);
			}
		}
	}
}



int main()
{
	libro vet[MAX];
	
	carica(vet);
	printf("prima ordinamento: \n");
	stampa(vet);
	ordina(vet);
	printf("dopo ordinamento: \n");
	stampa(vet);
	



	system("pause");
}

