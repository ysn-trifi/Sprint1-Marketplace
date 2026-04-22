public class Produit {
    private String titre;
    private double prix;
    private boolean estAchete;

    public Produit(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
        this.estAchete = false;
    }

    public String getTitre() {
        return titre;
    }

    public double getPrix() {
        return prix;
    }

    public boolean isAchete() {
        return estAchete;
    }

    public void setAchete(boolean achete) {
        this.estAchete = achete;
    }
}