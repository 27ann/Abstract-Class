// Subclass Tumbuhan
class Tumbuhan extends MakhlukHidup {
    private String bagian;

    public Tumbuhan(String bagian) {
        this.bagian = bagian;
    }

    @Override
    public String berdiri() {
        return "Tumbuhan tumbuh dan berdiri dengan " + bagian + ".";
    }

    @Override
    public String oksigen() {
        return "Tumbuhan menghasilkan oksigen melalui fotosintesis.";
    }
}