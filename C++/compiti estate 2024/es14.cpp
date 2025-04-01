#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;

int main()
{
	int num1, num2;
	
	printf("inserisci il primo numero: ");
	scanf("%d", &num1);
	printf("inserisci il secondo numero: ");
	scanf("%d", &num2);
	
	if (num1<num2){
		
		printf("%d e' maggiore di %d \n",num2, num1);
	}else{
		printf("%d e' maggiore di %d \n",num1, num2);
	}



	system("pause");
}

