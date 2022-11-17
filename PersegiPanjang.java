package BangunDatar;

/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class PersegiPanjang implements BangunDatar {
 double panjang;
    double lebar;
    double luasPersegiPanjang;

    public PersegiPanjang(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    @Override
    public void luas() {
        luasPersegiPanjang=this.panjang*this.lebar;
    }

    @Override
    public double getLuas(){
        return luasPersegiPanjang;
    }
    
}