import java.util.Scanner;

public class Tugas2 {
        public static Scanner input = new Scanner(System.in);

        public static int hitungLuasPersegi(int sisi) {
            return sisi * sisi;
        }

        public static int hitungKelilingPersegi(int sisi) {
            return sisi * 4;
        }

        public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
            return panjang * lebar;
        }

        public static int hitungkelilngPersegiPanjang(int panjang, int lebar) {
            return 2 * panjang + 2 * lebar;
        }

        public static double hitungKelilingLingkaran(int jariJari) {
            return 2 * Math.PI * jariJari;
        }

        public static double hitungLuasLingkaran(int jariJari) {
            return Math.PI * jariJari * jariJari;
        }

        public static int inputSisi() {
            System.out.print("Masukan sisi : ");
            return input.nextInt();
        }

        public static int inputLebar() {
            System.out.print("Masukan lebar : ");
            return input.nextInt();

        }

        public static int inputPanjang() {
            System.out.print("Masukan panjang : ");
            return input.nextInt();

        }

        public static int inputjariJari() {
            System.out.print("Masukan jariJari : ");
            return input.nextInt();

        }

        public static void tampilkanMenu() {
            System.out.println("Pilih bangun datar \n ");
            System.out.println("1. Persegi ");
            System.out.println("2, Persegi Panjang ");
            System.out.println("3. Lingkaran");
            System.out.print("Masukan pilihan bangun datar : ");
        }

        public static void munculkanHasilPerhitunganPersegi(int sisi) {
            System.out.println("luas persrgi : " + hitungLuasPersegi(sisi) + "\nkeliling persegi : " + hitungKelilingPersegi(sisi));
        }

        public static void munculkanHasilPerhitunganPersegiPanjang(int panjang, int lebar) {
            System.out.println("luas persegi panjang : " + hitungLuasPersegiPanjang(panjang, lebar) + "\nkeliling persegi panjang : " + hitungkelilngPersegiPanjang(panjang, lebar));
        }

        public static void munculkanHasilPerhitunganlingakaran(int jariJari) {
            System.out.println("luas Lingkaran : " + hitungLuasLingkaran(jariJari) + "\nkeliling lingkaran : " + hitungKelilingLingkaran(jariJari));
        }

        public static void main(String[] args) {
            tampilkanMenu();
            int pilihanMenu = input.nextInt();
            switch (pilihanMenu) {
                case 1:
                    munculkanHasilPerhitunganPersegi(inputSisi());
                    break;
                case 2:
                    munculkanHasilPerhitunganPersegiPanjang(inputLebar(), inputPanjang());
                    break;
                case 3:
                    munculkanHasilPerhitunganlingakaran(inputjariJari());
                    break;
                default:
                    System.out.println("pilihan anda gak jelas!!!!");
            }
        }
}
