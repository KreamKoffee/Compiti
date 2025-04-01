# include <stdio.h>
# include <iostream>
# include <stdlib.h>
/*
data:
consegna:
*/
using namespace std;

int sommaNum(int n, int m, int somma)
{
	for (;n < m; n++)
	{
		cout << n << endl;
		somma+=n;
	}
	return(somma);
}

int main()
{
	int n, m, somma = 0;
	int conta = 0;
	do{
		cout << "inserisci il primo numero: ";
		cin >> n;
		cout << "inserisci il secondo numero: ";
		cin >> m;
	}while(m<n);
	
	somma = sommaNum(n,m, somma);
	
	cout << "la somma dei numeri vale: "<< somma << endl;


system("pause");
}

