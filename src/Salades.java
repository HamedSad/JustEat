
public class Salades extends Repas{
	
	String nomSalade;
	
	
	public void typeSalade() {
		System.out.println("La salade choisie est une : " + nomSalade); 
			
	}

	public String getNomSalades() {
		return nomSalade;
	}

	public void setNomSalades(String nomSalades) {
		this.nomSalade = nomSalades;
	}
	

}
