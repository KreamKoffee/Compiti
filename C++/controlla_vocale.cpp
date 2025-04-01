#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;

void fun(char c)
{
	switch(c){
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'I':
		case 'i':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			printf("il carattere e' una vocale \n");
		
		default:
			printf("il carattere non e' una vocale \n");
	}
		
}

int main()
{
	char c;
	
	printf("inserisci un carattere: ");
	cin >> c;
	
	fun(c);


 	system("pause");
}

