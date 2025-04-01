#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#define MAX 3
using namespace std;

typedef struct city{
	char nome[20];
	float tmax;
	float tmin;
}city;

void carica(city vet[])
{
	for (int i=0; i<MAX; i++)
	{
		system("cls");
		printf("citta' %d \n", i+1);
		printf("nome: ");
		cin >> vet[i].nome;
		printf("temperatura massima: ");
		scanf("%f", &vet[i].tmax);
		printf("temperatura minima: ");
		scanf("%f", &vet[i].tmin);
		
	}
}

void stampa(city vet[])
{
	for (int i=0; i<MAX; i++)
	{
		printf("\ncitta' %d \n", i+1);
		printf("nome: %s", vet[i].nome);
		printf("temperatura massima: %.2f \n", vet[i].tmax);
		printf("temperatura minima: %.2f \n", vet[i].tmin);
	}
}




city max(city vet[])
{
	int j = 0;
	
	for ( int i=0; i<MAX; i++)
	{
		if (vet.tmax[i] > vet.tmax[j])
		{
			j = i;
		}
	}
	
	return(vet[j]);
}

city min(city vet[])
{
	int j = 0;
	
	for ( int i=0; i<MAX; i++)
	{
		if (vet.tmin[i] < vet.tmin[j])
		{
			j = i;
		}
	}
	
	return (vet[j]);
}

int main()
{
	city vet[20];
	city tmx;
	city tmn;
	
	carica(vet);
	system("cls");
	stampa(vet);
	system("cls");
	
	tmx = max(vet);
	printf("citta' con temperatura massima: \n");
	printf("nome: %s", tmx.nome);
	printf("temperatura massima: %.2f \n", tmx.tmax);
	printf("temperatura minima: %.2f \n", tmx.tmin);
	
	tmn = min(vet);
	printf("nome: %s", tmn.nome);
	printf("citta' con temperatura minima: \n");
	printf("temperatura massima: %.2f \n", tmn.tmax);
	printf("temperatura minima: %.2f \n", tmn.tmin);
	
	
	
	



	system("pause");
}

