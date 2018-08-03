
public class Repas {
	
	String nom;
	String ingredients;
	double prix;
	double sommeTotale;
	
	public void calculPrixTotal() {
		
	}
	
	public double calculerTotal(Pizza a, Dessert b, Salades c) {
		sommeTotale = a.getPrix() + b.getPrix() + c.getPrix();
		System.out.println("\n\nLa somme totale de votre commande est de : " + sommeTotale + " Euros" );
		
		return sommeTotale;
	}
	public void afficherIngredients() {
		System.out.println("Ingrédients contenus : " + ingredients + "\n");
	}
	
	public void creerRepas() {
		System.out.println("Votre commande : \n\nUn plat de : "  + nom + "\nIngrédients contenus : " + ingredients + 
		"\nSon prix est de : "+ prix + " Euros\n");
		
	}
	
	public void modifierRepas() {
		
	}
	
	public void supprimerRepas() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}

