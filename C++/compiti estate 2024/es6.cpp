#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;

int main()
{
	int num, pari = 0;
	
	for (int i=0; i<10; i++)
	{
		printf("inserisci un numero: ");
		scanf("%d", &num);
		
		if (num%2 == 0)
		{
			pari++;
		}
	}
	
	printf("sono stati inseriti %d numeri pari\n", pari);



	system("pause");
}

