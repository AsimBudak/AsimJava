package day30_Inheritance;

public class memur_02 extends muhasebe {




    public static void main(String[] args) {

        memur_02 memur1 = new memur_02();
        //memur1 objesi memurclass inin objesi olmasine ragmen
        //inherit ettigi muhasebe ve onun da parenti olan personel
        //classindaki tum datalari alabilir


        //personel classindan
        memur1.persNo = 1001;
        memur1.isim = "ahmet";
        memur1.soyIsim = "tepe";
        memur1.adres = "ankara";
        memur1.tel = "3212313514561";


        //muhasebe classtan
        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="memur";





    }
    @Override
    public String toString() {
        return "memur_02{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

}
