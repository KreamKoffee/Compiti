#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;

void carica(int tavola[10][10]) {
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < 10; ++j) {
            tavola[i][j] = (i + 1) * (j + 1);
        }
    }
}

void stampa(int tavola[10][10]) {
    printf("Tavola Pitagorica:\n");

    printf("    ");
    for (int j = 1; j <= 10; ++j) {
        printf("%4d", j);
    }
    printf("\n");

    
    printf("   +");
    for (int j = 0; j < 10; ++j) {
        printf("----");
    }
    printf("\n");

    
    for (int i = 0; i < 10; ++i) {
        printf("%2d |", i + 1); 
        for (int j = 0; j < 10; ++j) {
            printf("%4d", tavola[i][j]);
        }
        printf("\n");
    }
}

int main()
{
	int tavola[10][10];
	
	carica(tavola);
	stampa(tavola);



	system("pause");
}

