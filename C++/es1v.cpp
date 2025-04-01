# include <stdio.h>
# include <iostream>
# include <stdlib.h>
/*
data:
consegna:
*/
using namespace std;

int main()
{
	int n, m, resto;
	int conta = 0;
	do{
		cout << "inserisci il primo numero: ";
		cin >> n;
		cout << "inserisci il secondo numero: ";
		cin >> m;
	}while(m>n);
	
	
	while (n>m)
	{
		n-=m;
		conta++;
		cout << m << endl;
	}
	
	resto = n;
	
	cout << "resto: "<< resto << endl;
	cout << "queziente: "<< conta << endl;


system("pause");
}

