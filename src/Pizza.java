
public class Pizza extends Repas {
	
	String nomPizza;

public void typePizza(Repas totalUnitaire) {
	System.out.println("La pizza choisie est une : " + nomPizza + "\nSon prix est de : " + totalUnitaire.getPrix() + " Euros" );
}

public String getNomPizza() {
	return nomPizza;
}

public void setNomPizza(String nomPizza) {
	this.nomPizza = nomPizza;
}

}
