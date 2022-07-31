package day30_Inheritance;

public class muhasebe extends persone_02 {

    protected int saatUcreti;
    protected String statu;
    protected int maas;

    protected int maasHesapla() {
        int maas = saatUcreti * 8 * 30;
        return maas;

    }

}
