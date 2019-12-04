package cicd.learn.tp1;

public class Car {
	
	private String modele;
	private String marque;
	private float prix;
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Car(String modele, String marque, float prix) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.prix = prix;
	}
	
	
	

}
