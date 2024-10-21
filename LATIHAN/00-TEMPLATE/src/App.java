class motor{
    String merk;
    int tahun;
    String nopolisi;
    String warna;

    public MOTOR(String merk, int tahun, String nopolisi, String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.nopolisi = nopolisi;
        this.warna = warna;   
    }
    void showInfomotor(){
        System.out.println("merk : " + this.merk);
        System.out.println("tahun : "+ this.tahun);
        System.out.println("nopolisi : "+ this.nopolisi);
        System.out.println("warna : "+ this.warna);
    }
}
public class app {
    public static void main(String[] args) throws Exception {
        MOTOR mtr1 = new MOTOR("Honda GL Pro",1997,"G 5879","Hitam");
        mtr1.showInfomotor();
    }
}
 
 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
