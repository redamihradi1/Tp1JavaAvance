package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEtudiant {

	private Set<Etudiant> set = new HashSet<>();

	public HashSetEtudiant() {

		for (int i = 0; i < 10; i++) {
			set.add(new Etudiant("nom" + i, "prenom" + i, "cin" + (int) (Math.random() * 10000),
					125 + (int) (Math.random() * 10000)));
		}

	}

	public void afficher() {
		Iterator<Etudiant> it = set.iterator();
		while (it.hasNext()) {
			Etudiant et = it.next();
			System.out.println(et);
		}

	}
	public void vider() {
		set.clear();
	}

	public void ajouter(Etudiant et) {
		set.add(et);
	}

	public boolean supprmer(Etudiant et) {
		return set.remove(et);
	}

	public boolean verifierExistence(Etudiant et) {
		return set.contains(et);
	}

	

	public static void main(String[] args) {
		Etudiant etr = new Etudiant("charkaoui","x","x",111);
		HashSetEtudiant HashSetEtudiant = new HashSetEtudiant();
		HashSetEtudiant.afficher();
		System.out.println("\n***************************************************************");
		HashSetEtudiant.vider();
		HashSetEtudiant.ajouter(etr);
		HashSetEtudiant.ajouter(etr);
		HashSetEtudiant.ajouter(etr);
		HashSetEtudiant.afficher();
		System.out.println("\n***************************************************************");
		HashSetEtudiant.supprmer(etr);
		System.out.println(HashSetEtudiant.verifierExistence(etr));
		System.out.println("\n***************************************************************");
		HashSetEtudiant.vider();
		HashSetEtudiant.afficher();
		
		
		
	}

}
