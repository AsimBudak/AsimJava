package day25_Constructor;

public class volvo {

    String marka = "Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPlilotSorgusu();
    int maxHiz=maxHizAta();
    public volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
    }

    public volvo() {

    }


    public int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }

    public boolean otomatikPlilotSorgusu() {
        boolean sonuc = false;

        if (elektrikliMi) {
            sonuc = true;
        }
        return sonuc;
    }
public String toString(){
        String arabaOzellikleri="model: "+ model+"yakit:" +yakit+"max hiz: "+maxHiz;




        return arabaOzellikleri;

}


}
