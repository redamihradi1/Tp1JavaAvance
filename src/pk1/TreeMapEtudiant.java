package pk1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEtudiant {
	// E-Q4
	private SortedMap<String, Etudiant> treeMap = new TreeMap<>();

	// E-Q9
	private SortedMap<Integer, Etudiant> cneTreeMap = new TreeMap<>();

	public TreeMapEtudiant() {
		String cin = null;
		for (int i = 0; i < 10; i++) {
			cin = "cin" + (int) (Math.random() * 10000);
			treeMap.put(cin, new Etudiant("nom" + i, "prenom" + i, cin, 125 + (int) (Math.random() * 10000)));
		}

	}

	// E-Q1
	public void afficherCinEtudiant() {
		Set<Map.Entry<String, Etudiant>> cinEtudiant = treeMap.entrySet();
		Iterator<Map.Entry<String, Etudiant>> it = cinEtudiant.iterator();
		while (it.hasNext()) {
			Map.Entry<java.lang.String, pk1.Etudiant> entry = (Map.Entry<java.lang.String, pk1.Etudiant>) it.next();

			System.out.println(entry.getKey() + "===>" + entry.getValue());

		}
	}

	// E-Q2
	public Etudiant rechercherPremierEtudiant() {

		return treeMap.get(treeMap.firstKey());

	}

	// E-Q3
	public Etudiant rechercherDernierEtudiant() {

		return treeMap.get(treeMap.lastKey());

	}

	// E-Q5
	public SortedMap<String, Etudiant> entreDeuxValeurs(String cle1, String cle2) {

		return treeMap.subMap(cle1, cle2);

	}

	// E-Q6
	public SortedMap<String, Etudiant> superieurA(String cle) {

		return treeMap.tailMap(cle);

	}

	// E-Q7
	public SortedMap<String, Etudiant> inferieurA(String cle) {

		return treeMap.headMap(cle);

	}

	// E-Q8
	public Comparator renvoyerComparateur() {
		return treeMap.comparator();

	}

	// E-Q10
	public String renvoyerCin(Etudiant et) {

		Set<Map.Entry<String, Etudiant>> set = treeMap.entrySet();

		Iterator<Map.Entry<String, Etudiant>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Etudiant> entry = it.next();
			if (entry.getValue() == et) {
				return entry.getKey();
			}
		}
		return null;

	}

	// Q11
	public void AjouterEtudiant(Etudiant et) {
		treeMap.put(et.getCin(), et);

	}

	// Q12
	/*
	 * public boolean supprimerEtudiant(Etudiant et ) { return
	 * treeMap.remove(et.getCin(), et); }
	 */
	public boolean supprimerEtudiant(Etudiant et) {
		return treeMap.remove(et.getCin()) != null;
	}

	// Q13
	public void joindreAvecUneAutreMap(Map<String, Etudiant> map) {
		this.treeMap.putAll(map);

	}

	/********************************************************************************/
	public static void main(String[] args) {

		TreeMapEtudiant treeMap = new TreeMapEtudiant();
		treeMap.afficherCinEtudiant();
		System.out.println("***********************************************************************");
		System.out.println(treeMap.rechercherPremierEtudiant());
		System.out.println("***********************************************************************");
		System.out.println(treeMap.rechercherDernierEtudiant());
		System.out.println("***********************************************************************");
		System.out.println(treeMap.entreDeuxValeurs("cin4545", "cin7878").toString());
		System.out.println("***********************************************************************");
		System.out.println(treeMap.superieurA("cin10000").toString());
		System.out.println("***********************************************************************");
		System.out.println(treeMap.inferieurA("cin10000").toString());
		System.out.println("***********************************************************************");
		System.err.println(treeMap.renvoyerComparateur());
		System.out.println("***********************************************************************");
		Etudiant et = new Etudiant("nom5", "prenom5", "cin"+(int) (Math.random() * 10000), (int) (Math.random() * 10000));
		treeMap.AjouterEtudiant(et);
		System.err.println("Etudiant ajoute avec succes ! ");
		System.out.println("***********************************************************************");
		if(treeMap.renvoyerCin(et) == null) {
			System.out.println("Etudiant introuvable !!");
		}
		else {
			System.out.println("Etudiant trouvé !!");
			System.out.println(treeMap.renvoyerCin(et).toString());
		}
		System.out.println("***********************************************************************");
		if(treeMap.supprimerEtudiant(et)) {
			System.out.println("Etudiant supprime");
		}
		else {
			System.err.println("Etuidiant introuvable");
		}
		System.out.println("***********************************************************************");
		
		System.out.println("***********************************************************************");

	}

}
