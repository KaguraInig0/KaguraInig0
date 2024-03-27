#include <iostream> 
#include <fstream>
#include "sub.h"
using namespace std;
int num = 0;
int a;
int b;

int main()
{
    fstream file;
    file.open("source.txt");
    if (!file) {
        cout << "Error" << endl;
    }
    for (int i = 0; i < 1; i++) {
        file >> num;
        cout << num << endl;
    }
    file.close();

    file.open("target.txt");
    if (!file) {
        cout << "Error" << endl;
    }
    for (int i = 0; i < 1; i++) {
        file << 5;
    }

    cout << "Enter a value for A" << endl;
    cin >> a;
    cout << "Enter a value for B" << endl;
    cin >> b;
    cout << mysub(a, b) << endl;
    
}