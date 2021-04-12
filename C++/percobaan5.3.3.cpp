#include <iostream>
#include <string>

using namespace std;
void non_return_func(string praktikan1, string praktikan2, int kelompok) {
cout << "Selamat datang di Praktikum DKP 2021\n";
cout << praktikan1 << " dan " << praktikan2 << " adalah kelompok " << kelompok;
}

int return_func(int perkalian) {
if (perkalian > 0 || perkalian < 3) {
return perkalian * 3;
}
else {
return perkalian * 0;
}
}

int main() {
non_return_func("Zahir", "Nanda", 3);
cout << "\nhasil perkalian 1 dengan 3 adalah " <<
return_func(1);
return 0;
}