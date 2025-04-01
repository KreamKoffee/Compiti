# include <stdio.h>
# include <iostream>
# include <stdlib.h>
# include <time.h>
/*
data:
consegna:
*/
using namespace std;

int main()
{
	int v[10];
	bool a;
	
	srand(time(NULL));
	
	for (int h=0; h<10; h++)
	{
		v[h] = rand()%10+1;
	}
	
	for (int h=0; h<10; h++)
	{
		cout << v[h] << endl;
	}
	
	for (int h=0; h<9; h++)
	{
		if (v[h+1] < v[h])
		{
			a = 1;
		}
		
	}
	
	if (a == 1)
	{
		cout << "il vettore non e' ordinato \n";
	}else
	{
		cout << "il vettore e' ordinato\n";
	}
	


system("pause");
}

