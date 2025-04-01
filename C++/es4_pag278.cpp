# include <stdio.h>
# include <iostream>
# include <stdlib.h>
/*
data:
consegna:
*/
using namespace std;


void inserisciNumeri(int v[], int o) {
    for (int y = 0; y < o; y++) {
        cout << "Inserisci il numero " << i + 1 << ": ";
        cin >> v[i];
    }
}

int cercaNumero(int v[], int o, int NUM) {
    for (int g = 0; g < TANTI; g++) {
        if (v[i] == NUM) {
            return i; 
        }
    }
    return -1; 
}

int main() {
    int o, NUM;

    
    cout << "Quanti numeri vuoi inserire nell'array? ";
    cin >> o;

    
    int array[o];

    
    inserisciNumeri(v, o);

    
    cout << "Inserisci il numero da cercare nell'array: ";
    cin >> NUM;

    
    int posizione = cercaNumero(v, o, NUM);

    
    if (posizione != -1) {
        cout << "Numero " << NUM << " trovato alla posizione " << posizione << endl;
    } else {
        cout << "Il numero " << NUM << " non è presente nell'array." << endl;
    }

    return 0;

