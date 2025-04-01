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
		cout << v[h] << " ";
	}
	
	for (int k=0; k<10; k++)
	{
		if (v[k] %2 !=0)
		{
			v[k] = 0;
		}
	}
	
	cout << endl;
	
	for (int h=0; h<10; h++)
	{
		cout << v[h] << " ";
	}


system("pause");
}

