import percobaan2
#Function dengan non return type
def non_return_func(praktikan1, praktikan2):
    print(f"Selamat Datang di Praktikum DKP 2021 {praktikan1} dan {praktikan2}")

#Function dengan return type
def return_func(shift):
    print(f"Shift kalian adalah ", shift)
    if (shift == 1) or (shift == 2) :

        return print(f"Fungsi return mengembalikan nilai menjadi", shift * 2)
    else:
        return print("Tidak ada shift tersebut")

#Function dengan Arbitrary Type
def arbitrary_func(*penutup):
    for nama in penutup:
        print("Terimakasih", nama)

#Anonymous Function
anonim_func = lambda praktikan1, praktikan2, kelompok: print(f"Ini adalah percobaan {praktikan1} dan {praktikan2} kelompok ", kelompok )

#Pemanggilan Fungsi
non_return_func("Nanda", "Zahir")
return_func(3)
anonim_func("Nanda", "Zahir", 3)
arbitrary_func("Nanda", "Zahur", "Muhammad", "nama 4")

#Membuat Objek
p1 = percobaan2.contoh_method("Nanda" , "Zahir")
p1.mulai()
p1.selesai(3)
