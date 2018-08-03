import java.util.Scanner;

public class Facturation {
	
	double sommeTotale;
	
	public double calculerTotal(Pizza a, Dessert b, Salades c) {
		sommeTotale = a.getPrix() + b.getPrix() + c.getPrix();
		System.out.println("\nLe montant total de votre commande est de : " + sommeTotale + " Euros" );
		
		return sommeTotale;
	}
	
	public void reductionConsommateur() {
		
		System.out.println("\nSi vous �tes demandeur d'emploi tapez 1, si vous �tes �tudiant tapez 2, sinon tapez 3 :"); 
		
		Scanner var = new Scanner(System.in);
		int reduc = var.nextInt();
		
		
		if (reduc == 1) {
			System.out.println("Vous b�n�ficiez de 20% de reduction");
			sommeTotale = sommeTotale - (20/sommeTotale)*100;
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100;
			System.out.println("Le montant de votre commande est d�sormais de : " + sommeTotaleArrondie + " Euros");
		}
		else if(reduc == 2) {
			System.out.println("Vous b�n�ficiez de 10% de reduction");
			sommeTotale = sommeTotale - (10/sommeTotale)*100;
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100;
			System.out.println("Le montant de votre commande est d�sormais de : " + sommeTotaleArrondie + " Euros");
		}
		else if(reduc == 3) {
			System.out.println("Vous ne b�n�ficiez pas de r�duction\nLe montant total de votre commande est de : " + sommeTotale + " Euros");
		}
		else {
			System.out.println("Je n'ai pas compris votre demande");
		}
		
		
	}
}

