public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Repas repas1 = new Repas();
		
		/*repas1.setNom("Lasagnes");
		repas1.setIngredients("tomates, fromage, viande.");
		repas1.setPrix(15.25);*/
		
		Salades salade1 = new Salades();
		salade1.setNomSalades("Nicoise");
		salade1.setIngredients("laitue, oeufs, tomates, pommes de terre.");
		salade1.setPrix(9.90);
		
		Pizza pizza1 = new Pizza();
		
		pizza1.setNomPizza("Simple");
		pizza1.setIngredients("tomates, fromage, basilic.");
		pizza1.setPrix(13.95);
		
		Dessert dessert1 = new Dessert();
		
		dessert1.setNomDessert("Tiramisu");
		dessert1.setIngredients("creme fraiche, cafe, chocolat.");
		dessert1.setPrix(5.50);
		
		Facturation facture1 = new Facturation();
		
		
		System.out.println("Votre commande : \n");
		//repas1.creerRepas();
		
		salade1.typeSalade();
		salade1.afficherIngredients();
		salade1.affichagePrixUnitaire();
		
		pizza1.typePizza();
		pizza1.afficherIngredients();
		pizza1.affichagePrixUnitaire();
		
		dessert1.typeDessert();
		dessert1.afficherIngredients();
		dessert1.affichagePrixUnitaire();
		
		facture1.calculerTotal(pizza1, dessert1, salade1);
		facture1.reductionConsommateur();

	}

}