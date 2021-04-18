public class pemanggilan {
    public static void main(String[] args) {
        pendefinisi objek = new pendefinisi();

        objek.greeting();
        objek.kelompok("Kelompok 03");
        String print = objek.kenalan("Erika", "baca novel");
        System.out.println(print);
    }
}