#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define MAX 3
using namespace std;

typedef struct alunno{
	char cognome[20];
	char nome[20];
	int voto;
}alunno;

void carica(alunno vet[])
{
	for (int i =0; i<MAX; i++)
	{
		system("cls");
		printf("Alunno %d \n", i+1);
		printf("Cognome: ");
		scanf("%s", &vet[i].cognome);
		printf("Nome: ");
		scanf("%s", &vet[i].nome);
		printf("Voto: ");
		scanf("%d", &vet[i].voto);
	}
}

void stampa(alunno vet[])
{
	for (int i=0; i<MAX; i++)
	{
		printf("Alunno %d \n", i+1);
		printf("Cognome: %s\n", vet[i].cognome);
		printf("Nome: %s\n", vet[i].nome);
		printf("Voto: %d\n", vet[i].voto);
		
	}
}

void trova(alunno vet[], char cognome[], char nome[])
{
	for (int i=0; i<MAX; i++)
	{
		if((strcmp(vet[i].cognome, cognome) == 0) && (strcmp(vet[i].nome, nome) == 0))
		{
			printf("Alunno %d \n", i+1);
			printf("Cognome: %s\n", vet[i].cognome);
			printf("Nome: %s\n", vet[i].nome);
			printf("Voto: %d\n", vet[i].voto);
		}
	}
}

int main()
{
	alunno vet[MAX];
	system("color 0B");
	char nome[20], cognome[20];
	
	carica(vet);
	system("cls");
	stampa(vet);
	
	printf("\nCognome da ricercare: ");
	scanf("%s", &cognome);
	
	printf("Nome da ricercare: ");
	scanf("%s", &nome);
	
	
	trova(vet, cognome, nome);

	system("pause");
}

