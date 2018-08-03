
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Repas repas1 = new Repas();
		
		repas1.setNom("Lasagnes");
		repas1.setIngredients("tomates, fromage, viande.");
		repas1.setPrix(15.25);
		
		Salades salade1 = new Salades();
		salade1.setNomSalades("Nicoise");
		salade1.setIngredients("laitue, oeufs, tomates, pommes de terre, banane.");
		salade1.setPrix(8.90);
		
		Pizza pizza1 = new Pizza();
		
		pizza1.setNomPizza("Simple");
		pizza1.setIngredients("tomates, fromage, basilic, banane.");
		pizza1.setPrix(20.95);
		
		Dessert dessert1 = new Dessert();
		
		dessert1.setNomDessert("Tiramisu");
		dessert1.setIngredients("creme fraiche, cafe, chocolat, banane.");
		dessert1.setPrix(5.95);
		
		
		System.out.println("Votre commande : \n");
		//repas1.creerRepas();
		
		salade1.typeSalade(salade1);
		salade1.afficherIngredients();
		
		pizza1.typePizza(pizza1);
		pizza1.afficherIngredients();
		
		dessert1.typeDessert();
		dessert1.prixDessertUnitaire(dessert1);
		dessert1.afficherIngredients();
		
		
		repas1.calculerTotal(pizza1, dessert1,salade1);

	}

}
