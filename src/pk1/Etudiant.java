package pk1;

public class Etudiant implements Cloneable , Comparable<Etudiant> {
	private String nom, prenom, cin;
	private int cne;

	@Override
	public int hashCode() {
		return this.cin.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Etudiant) {
			Etudiant etd = (Etudiant) obj;
			return this.cin == etd.cin;
		}
		return false;
	}

	@Override
	protected Object clone() {
		try {
			return (Etudiant) super.clone();
		} catch (Exception e) {
			System.err.println("Erreur de clonage");
		}
		return null;
	}

	public Etudiant(String nom, String prenom, String cin, int cne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public int getCne() {
		return cne;
	}

	public void setCne(int cne) {
		this.cne = cne;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", cne=" + cne + "]";
	}

	@Override
	public int compareTo(Etudiant o) {
		
		return this.cin.compareTo(o.cin);
	}
	

}
