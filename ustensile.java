package tp7;

public abstract class ustensile {
    protected int annee;

    public ustensile(int annee) {
        this.annee = annee;
    }
    public double valeur() {
        int age = 2019 - annee;
        if (age<50) {
        	return 0;
        	
        }else {
        	return age-50;
        }
    }
}
