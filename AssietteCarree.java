package tp7;

public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }
    public double surface() {
        return cote * cote;
    }
    public double valeur() {
        return 5 * super.valeur(); 
    }
}
