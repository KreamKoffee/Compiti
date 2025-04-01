# include <stdio.h>
# include <iostream>
# include <stdlib.h>
/*
data:
consegna:
*/
using namespace std;

void inizializza(int v[])
{
	cout << "inserisci il 0 numero: ";
	cin >> v[0];
	
	for (int h=1; h<10; h++)
	{
		do{
			printf("inserisci il %d numero: ", h);
			cin >> v[h];
		}while (v[h] < v[h-1]);
	}
}

void stampa(int v[10])
{
	for (int g=0; g<10; g++)
	{
		cout << v[g] << "\t";
	}
	cout << endl;
}

int main()
{
	int v[10];
	
	
	inizializza(v);
	stampa(v);


system("pause");
}

