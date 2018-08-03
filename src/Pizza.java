
public class Pizza extends Repas {
	
	String nomPizza;

public void typePizza() {
	System.out.println("La pizza choisie est une : " + nomPizza );
}

public String getNomPizza() {
	return nomPizza;
}

public void setNomPizza(String nomPizza) {
	this.nomPizza = nomPizza;
}

}
