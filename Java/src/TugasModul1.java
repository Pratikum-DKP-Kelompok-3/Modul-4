import java.lang.Math;

public class TugasModul1 {
    public static void main(String[] args) {
        double pi, r;
        pi = 3.14f;
        r = 14;
        System.out.println("Kelompok: kelompok 3");
        System.out.println("Shift: shift 1");
        System.out.println("Nama Anggota 1: Ananda Muhammad Zahir (21120120140115)");
        System.out.println("Nama Anggota 2: Didan Hasan Murtaqi (21120120140103)");
        System.out.println("Nama Anggota 3: Juliant Raffa (21120120130127)");
        System.out.println("Nama Anggota 4: Sachiko Fitria Ramandanti (21120120140103)\n");
        System.out.println("Luas Lingkaran adalah " + luas(pi,r));
    }
    public static double luas(double pi, double r){
        return 0.75 * pi *Math.pow(r,2);
    }
}
