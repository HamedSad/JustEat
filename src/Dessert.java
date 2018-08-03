
public class Dessert extends Repas{
	
	String nomDessert;

	
	public void prixDessertUnitaire(Repas totalDessert) {
		System.out.println("Son prix est de " + totalDessert.getPrix() + " Euros");
	}
	
	public void typeDessert() {
		System.out.println("Le dessert choisi est : " + nomDessert); 
			
	}

	public String getNomDessert() {
		return nomDessert;
	}


	public void setNomDessert(String nomDessert) {
		this.nomDessert = nomDessert;
	}
}

