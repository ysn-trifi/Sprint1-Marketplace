public class Main {
    public static void main(String[] args) {

        // 1. Publier un produit
        Produit p = new Produit("Résumé Math", 20.0);
        System.out.println("Produit publié : " + p.getTitre() + " | Prix: " + p.getPrix());

        // 2. Acheter le produit
        Transaction t = new Transaction(p);
        t.acheterProduit();

        // 3. Vérifier état
        if (p.isAchete()) {
            System.out.println("Le produit est marqué comme acheté.");
        }
    }
}