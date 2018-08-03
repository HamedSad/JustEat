
public class Salades extends Repas{
	
	String nomSalade;
	
	public void typeSalade(Repas totalSalade) {
		System.out.println("La salade choisie est une : " + nomSalade + "\nSon prix est de " + totalSalade.getPrix() + " Euros" ); 
			
	}

	public String getNomSalades() {
		return nomSalade;
	}

	public void setNomSalades(String nomSalades) {
		this.nomSalade = nomSalades;
	}
	

}
