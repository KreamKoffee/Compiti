#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;

typedef struct corsa{
	int numero;
	int posizione;
	int tempo;
	
}corsa;

int main()
{
	corsa tim;
	
	printf("inserisci il numero: ");
	scanf("%d", &tim.numero);
	printf("inserisci la posizione: ");
	scanf("%d", &tim.posizione);
	printf("inserisci il tempo in secondi: ");
	scanf("%d", &tim.tempo);
	



	system("pause");
}

