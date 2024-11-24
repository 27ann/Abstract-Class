// Subclass Manusia
class Manusia extends MakhlukHidup {
    private String jenisKaki;

    public Manusia(String jenisKaki) {
        this.jenisKaki = jenisKaki;
    }

    @Override
    public String berdiri() {
        return "Manusia berdiri dengan " + jenisKaki + ".";
    }

    @Override
    public String oksigen() {
        return "Manusia membutuhkan oksigen untuk bernapas.";
    }
}
