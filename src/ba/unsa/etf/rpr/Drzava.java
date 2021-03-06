package ba.unsa.etf.rpr;

public class Drzava {
    private static int count = 0;
    private int id;
    private String naziv;
    private Grad glavniGrad;

    public Drzava() {
        id = count;
        count++;
    }

    public Drzava(int id, String naziv, Grad glavniGrad) {
        if(id == -1) {
            this.id = count;
            count++;
        }
        else
            this.id = id;
        this.naziv = naziv;
        this.glavniGrad = glavniGrad;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }
}
