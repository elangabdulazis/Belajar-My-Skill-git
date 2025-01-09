package parttwo;

public class Fungsi {
    public static int tambah (int a , int b){
        return a+b;
    }
    public static int kuadrat (int y){
        return y*y;
    }
    public static void main (String[]args){
        int tambah = tambah(8,10);
        int kuadrat = kuadrat(6);
        System.out.println("Hasil Dari Tambah = " + tambah);
        System.out.println("Hasil dari Kuadrat = " + kuadrat);
    }
}

