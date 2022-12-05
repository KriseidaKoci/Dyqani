public class Produkt {
    private String emri;
    private int sasia;
    private int cmimi;

    public Produkt(String emri, int sasia, int cmimi) {
        this.emri = emri;
        this.sasia = sasia;
        this.cmimi = cmimi;
    }


    public String getEmri() {
        return emri;
    }

    public int getSasia() {
        return sasia;
    }

    public int getCmimi() {
        return cmimi;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public void setCmimi(int cmimi) {
        this.cmimi = cmimi;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "emri='" + emri + '\'' +
                ", sasia=" + sasia +
                ", cmimi=" + cmimi +
                '}';
    }
}
