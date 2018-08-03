
public class Facturation {
	
	double sommeTotale;
	
	public double calculerTotal(Pizza a, Dessert b, Salades c) {
		sommeTotale = a.getPrix() + b.getPrix() + c.getPrix();
		System.out.println("\nLa somme totale de votre commande est de : " + sommeTotale + " Euros" );
		
		return sommeTotale;
	}

}
