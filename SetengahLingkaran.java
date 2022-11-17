package BangunDatar;

/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class SetengahLingkaran implements BangunDatar {
 double jari2;
    double luasSetengahLingkaran;

    public SetengahLingkaran(double diameter){
        this.jari2=diameter/2;
    }

    @Override
    public void luas() {
        luasSetengahLingkaran=jari2*jari2*3.14*0.5;
    }

    @Override
    public double getLuas() {
        return luasSetengahLingkaran;
    }
    
}   