public class Transaction {
    private Produit produit;

    public Transaction(Produit produit) {
        this.produit = produit;
    }

    public void acheterProduit() {
        produit.setAchete(true);
        System.out.println("Produit acheté avec succès !");
    }

    public Produit getProduit() {
        return produit;
    }
}