// Main Class
public class MainMakhlukHidup {
    public static void cekMakhlukHidup(MakhlukHidup makhluk) {
        System.out.println(makhluk.berdiri());
        System.out.println(makhluk.oksigen());
    }

    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia("dua kaki");
        MakhlukHidup hewan = new Hewan("dua kaki depan", "dua kaki belakang");
        MakhlukHidup tumbuhan = new Tumbuhan("akar");

        cekMakhlukHidup(manusia);
        cekMakhlukHidup(hewan);
        cekMakhlukHidup(tumbuhan);
    }
}