#include <iostream>
#include <vector>
#include <algorithm>
#include <random>
#include <unordered_set>
#include <ctime>

using namespace std;


void exibir(const vector<int>& lista) {
    for (int item : lista) {
        cout << item << " ";
    }
    cout << endl;
}

vector<int> gerarListaAleatoria(int tamanho) {
    vector<int> lista;
    mt19937 gen(time(0)); 
    uniform_int_distribution<> dis(1, 40);

    for (int i = 0; i < tamanho; ++i) {
        lista.push_back(dis(gen));
    }

    return lista;
}

vector<int> gerarListaAleatoria2(int tamanho) {
    vector<int> lista;
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> dis(1, 40);

    for (int i = 0; i < tamanho; ++i) {
        lista.push_back(dis(gen));
    }

    return lista;
}


void mostrarNumerosComuns(const vector<int>& lista1, const vector<int>& lista2) {
    unordered_set<int> set1(lista1.begin(), lista1.end());

    cout << "Numeros comuns nas duas listas:" << endl;
    for (int num : lista2) {
        if (set1.count(num) > 0) {
            cout << num << " ";
        }
    }
    cout << endl;
}


void mostrarNumerosUnicos(const vector<int>& lista1, const vector<int>& lista2) {
    unordered_set<int> set1(lista1.begin(), lista1.end());
    unordered_set<int> set2(lista2.begin(), lista2.end());

    cout << "Numeros unicos na Lista 1:" << endl;
    for (int num : lista1) {
        if (set2.count(num) == 0) {
            cout << num << " ";
        }
    }
    cout << endl;

    cout << "Numeros unicos na Lista 2:" << endl;
    for (int num : lista2) {
        if (set1.count(num) == 0) {
            cout << num << " ";
        }
    }
    cout << endl;
}

int main() {

    int tamanho = 10;

    vector<int> lista1 = gerarListaAleatoria(tamanho);
    vector<int> lista2 = gerarListaAleatoria2(tamanho);

    cout << "Conteudo da Lista 1:" << endl;
    exibir(lista1);
    cout << "Conteudo da Lista 2:" << endl;
    exibir(lista2);

    mostrarNumerosComuns(lista1, lista2);

    mostrarNumerosUnicos(lista1, lista2);

    return 0;
}
