import java.util.Scanner;

public class Facturation  {
	
	double sommeTotale;
	
	public double calculerTotal(Pizza a, Dessert b, Salades c) {
		sommeTotale = a.getPrix() + b.getPrix() + c.getPrix();
		System.out.println("\nLe montant total de votre commande est de : " + sommeTotale + " Euros" );
		
		return sommeTotale;
	}
	
	public void reductionConsommateur() throws InterruptedException {
		
		System.out.println("\nSi vous �tes demandeur d'emploi tapez 1, si vous �tes �tudiant tapez 2, si vous avez un code reduc tapez 3, sinon tapez 4 :"); 
		
		Scanner var = new Scanner(System.in);
		int reduc = var.nextInt();
		
		
		if (reduc == 1) {
			System.out.println("Vous b�n�ficiez de 20% de reduction");
			sommeTotale = sommeTotale - (sommeTotale*0.2);
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100; 
			Thread.sleep(1000);
			System.out.println("\nLe montant de votre commande est d�sormais de : " + sommeTotaleArrondie + " Euros");
		}
		else if(reduc == 2) {
			System.out.println("Vous b�n�ficiez de 10% de reduction");
			sommeTotale = sommeTotale - (sommeTotale*0.10);
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100;
			Thread.sleep(1000);
			System.out.println("\nLe montant de votre commande est d�sormais de : " + sommeTotaleArrondie + " Euros");
		}
		
		else if(reduc == 3) {
			System.out.println("\nTapez votre code de reduction");
			Scanner var2 = new Scanner(System.in);
			String codeReduc = var2.next();
			
			if(codeReduc.equals("banane50")) {
			System.out.println("Vous beneficiez de 50% de reduction");
			Thread.sleep(1000);
			sommeTotale = sommeTotale - (sommeTotale*0.50);
			double sommeTotaleArrondie = (double) Math.round(sommeTotale * 100) / 100;
			System.out.println("\nLe montant total de votre commande est de : " + sommeTotale + " Euros");
			}
			
			else {
			System.out.println("Code reduction invalide");
			}
		}
		else if(reduc == 4) {
			System.out.println("\nVous ne b�n�ficiez pas de r�duction");
			Thread.sleep(1000);
			System.out.println("\nLe montant total de votre commande est de : " + sommeTotale + " Euros");
		}	
			
		else {
			System.out.println("\nJe n'ai pas compris votre demande");
		}
	}		
}