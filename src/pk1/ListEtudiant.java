package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListEtudiant {
	private List<Etudiant> liste = new ArrayList<>();

	public ListEtudiant() {

		for (int i = 0; i < 10; i++) {
			liste.add(new Etudiant("nom" + i, "prenom" + i, "cin" + (int) (Math.random() * 10000),
					125 + (int) (Math.random() * 10000)));
		}

	}

	public void afficher() {
		Iterator<Etudiant> it = liste.iterator();
		while (it.hasNext()) {
			Etudiant et = it.next();
			System.out.println(et);
		}

	}

	public void ajouter(Etudiant et) {
		liste.add(et);
	}

	public boolean supprmer(Etudiant et) {
		return liste.remove(et);
	}

	public boolean verifierExistence(Etudiant et) {
		return liste.contains(et);
	}
	
	public void trierCIN() {
		Collections.sort(liste);	
	}
	
	public void trierCNE() {
		Collections.sort(liste, new ComparateurParCNE());	
	}

	public static void main(String[] args) {
		ListEtudiant listetudiant = new ListEtudiant();
		listetudiant.afficher();
		System.out.println("\n*************************************************");
		listetudiant.trierCIN();
		listetudiant.afficher();
	}

}
