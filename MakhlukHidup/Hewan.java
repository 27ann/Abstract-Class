// Subclass Hewan
class Hewan extends MakhlukHidup {
    private String kakiDepan;
    private String kakiBelakang;

    public Hewan(String kakiDepan, String kakiBelakang) {
        this.kakiDepan = kakiDepan;
        this.kakiBelakang = kakiBelakang;
    }

    @Override
    public String berdiri() {
        return "Hewan berdiri menggunakan " + kakiDepan + " dan " + kakiBelakang + ".";
    }

    @Override
    public String oksigen() {
        return "Hewan membutuhkan oksigen untuk bernapas.";
    }
}