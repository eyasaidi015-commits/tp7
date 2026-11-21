package tp7;

public abstract class Assiette extends ustensile {

    public Assiette(int annee) {
        super(annee);
    }

    public abstract double surface();
}