package pk1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEtudiant {

	private Map<String, Etudiant> map = new HashMap<>();

	public HashMapEtudiant() {
		String cin = null;
		for (int i = 0; i < 10; i++) {
			cin = "cin" + (int) (Math.random() * 10000);
			map.put(cin, new Etudiant("nom" + i, "prenom" + i, cin, 125 + (int) (Math.random() * 10000)));
		}
	}

	public void afficherCinEtudiant() {
		Set<Map.Entry<String, Etudiant>> cinEtudiant = map.entrySet();
		Iterator<Map.Entry<String, Etudiant>> it = cinEtudiant.iterator();
		while (it.hasNext()) {
			Map.Entry<java.lang.String, pk1.Etudiant> entry = (Map.Entry<java.lang.String, pk1.Etudiant>) it.next();

			System.out.println(entry.getKey() + "===>" + entry.getValue());

		}
	}
	public void afficherCin() {
		Set<String> cin = map.keySet();
		Iterator<String> it = cin.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
	}
	public void afficherEtudiant() {
		Collection<Etudiant> etudiant = map.values();
		Iterator<Etudiant> it = etudiant.iterator();
		while (it.hasNext()) {
			Etudiant etudiant2 = (Etudiant) it.next();
			System.out.println(etudiant2);
			
		}
	}
	// 22/03/2022 // 
	public boolean verifierExistenceEtudiant(Etudiant et ) {
			return map.containsValue(et);
	}
	public Etudiant veriferExistenceEtudiantCin(String cin ) {
		return map.get(cin);
		
	}
	//Q20
	public String renvoyerEtudiant(Etudiant et ) {
		Set<Map.Entry<String, Etudiant>> set = map.entrySet();
		Iterator<Map.Entry<String, Etudiant>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Etudiant> entry = it.next();
			if(entry.getValue() == et ) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	//Q21
	public void AjouterEtudiant(Etudiant et) {
		map.put(et.getCin(), et);
		
	}
	//Q22
	/*
	public boolean supprimerEtudiant(Etudiant et ) {
		return map.remove(et.getCin(), et);
	}*/
	public boolean supprimerEtudiant(String	 cin ) {
		return map.remove(cin)!= null ;
	}
	//Q23
	public void joindreAvecUneAutreMap(Map<String,Etudiant> map ) {
		this.map.putAll(map);
		
	}
	
	

	public static void main(String[] args) {

		HashMapEtudiant mapEtudiant = new HashMapEtudiant();
		System.out.println("\n *****************************************************************************************");
		mapEtudiant.afficherCinEtudiant();
		System.out.println("\n *****************************************************************************************");
		mapEtudiant.afficherCin();
		System.out.println("\n *****************************************************************************************");
		mapEtudiant.afficherEtudiant();
	}
}
