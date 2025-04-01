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
	int conta = 0;
	int n, precedente;
	bool primo;
	
	
	
	while (true)
	{
		cout << "inserisci un numero: ";
		cin >> n;
		
		if (primo)
		{
			precedente = n;
			primo = false;
		}else
		{
			if (n < precedente)
			{
				break;
			}
			
			precedente = n;
		}
		
		conta++;
	}
	
	cout << "ha inserito " << conta << "numeri" << endl;
	
	


	system("pause");
}

