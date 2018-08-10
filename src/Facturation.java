import java.util.Scanner;

public class Facturation  {
	
	double sommeTotale;
	
	public double calculerTotal(Pizza a, Dessert b, Salades c) {
		sommeTotale = a.getPrix() + b.getPrix() + c.getPrix();
		System.out.println("\nLe montant total de votre commande est de : " + sommeTotale + " Euros" );
		
		return sommeTotale;
	}
	
	public void reductionConsommateur() throws InterruptedException {
		
		
		
		System.out.println("\nSi vous êtes demandeur d'emploi tapez 1, si vous êtes étudiant tapez 2, "
				+ "si vous avez un code promo tapez 3, sinon tapez 4 :"); 
		
		
		Scanner var = new Scanner(System.in);
		int reduc = var.nextInt();
		
		while(reduc!=1 && reduc!=2 && reduc!=3 && reduc!=4) {
			
			System.out.println("Je n'ai pas compris votre demande");
			
			System.out.println("\nSi vous êtes demandeur d'emploi tapez 1, si vous êtes étudiant tapez 2,"
					+ " si vous avez un code promo tapez 3, sinon tapez 4 :");
			 var = new Scanner(System.in);
			 reduc = var.nextInt();
			}

		
		
		if (reduc == 1) {
			System.out.println("Vous bénéficiez de 20% de reduction");
			sommeTotale = sommeTotale - (sommeTotale*0.2);
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100; 
			Thread.sleep(1000);
			System.out.println("\nLe montant de votre commande est désormais de : " + sommeTotaleArrondie + " Euros");
		}
		else if(reduc == 2) {
			System.out.println("Vous bénéficiez de 10% de reduction");
			sommeTotale = sommeTotale - (sommeTotale*0.10);
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100;
			Thread.sleep(1000);
			System.out.println("\nLe montant de votre commande est désormais de : " + sommeTotaleArrondie + " Euros");
		}
		
		else if(reduc == 3) {
			
			System.out.println("\nTapez votre code promo");
			Scanner var2 = new Scanner(System.in);
			String codeReduc = var2.next();
			
			while(!codeReduc.equals("banane50")) {
				
			System.out.println("Code reduction invalide");
			
			System.out.println("\nTapez votre code promo");
			 var2 = new Scanner(System.in);
			 codeReduc = var2.next();
			}
			 
			 if(codeReduc.equals("banane50")) {
					System.out.println("Vous beneficiez de 50% de reduction");
					Thread.sleep(1000);
					sommeTotale = sommeTotale - (sommeTotale*0.50);
					double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100;
					System.out.println("\nLe montant total de votre commande est de : " + sommeTotaleArrondie + " Euros");
					}		
				
			
			
			
		}
		else if(reduc == 4) {
			System.out.println("\nVous ne bénéficiez pas de réduction");
			Thread.sleep(1000);
			System.out.println("\nLe montant total de votre commande est de : " + sommeTotale + " Euros");
		}	
			
		else {
			System.out.println("\nJe n'ai pas compris votre demande");
			
		}
	}		
}