#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;

int main()
{
	
	float voto, somma=0;
	float media;
	int conta = 0;
	
	do{
		printf("inserisci un voto: ");
		scanf("%f", &voto);
		conta++;
		somma+=voto;
		
	}while(voto!=0);
	
	media = somma/(conta-1);
	printf("la media dei voti e': %.2f\n", media);



	system("pause");
}

