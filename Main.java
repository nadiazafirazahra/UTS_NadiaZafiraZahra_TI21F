package BangunDatar;

/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class Main {
    public static void main(String[] args){
        double luas_arsir;
        PersegiPanjang persegiPanjang1=new PersegiPanjang(12,7);
        SetengahLingkaran setengahLingkaran1=new SetengahLingkaran(12);

        persegiPanjang1.luas();
        setengahLingkaran1.luas();
        luas_arsir=persegiPanjang1.getLuas()-setengahLingkaran1.getLuas();
        System.out.println("Luas Persegi Panjang = "+persegiPanjang1.getLuas());
        System.out.println("Luas Setengah Lingkaran = "+setengahLingkaran1.getLuas());
        System.out.println("");
        System.out.println("Luas Arsir = "+(persegiPanjang1.getLuas()-setengahLingkaran1.getLuas()));
    }
}