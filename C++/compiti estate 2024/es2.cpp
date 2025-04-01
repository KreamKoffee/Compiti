#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
using namespace std;

float area(float L1, float L2,float L3,float P)
{
	float a;
	float p;
	p = P/2;
	a = sqrt(p*(p-L1)*(p-L2)*(p-L3));
	return(a);
}

float perimetro(float L1,float L2,float L3)
{
	float P=0;
	P = L1+L2+L3;
	return(P);
}

int main()
{
	float L1, L2, L3, h, P, A;
	printf("inserisci il primo lato: ");
	scanf("%d", &L1);
	printf("inserisci il secondo lato: ");
	scanf("%d", &L2);
	printf("inserisci il terzo lato: ");
	scanf("%d", &L3);
	printf("inserisci l'altezza: ");
	scanf("%d", &h);
	
	P = perimetro(L1,L2,L3);
	A = area(L1,L2,L3,P);
	
	printf("il perimetro e': %.2f", P);
	printf("l'area e': %.2f", A);



	system("pause");
}

