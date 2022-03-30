package pk1;

import java.util.Comparator;

public class ComparateurParCNE implements Comparator<Etudiant>{

	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		// TODO Auto-generated method stub
		return o1.getCne() - o2.getCne();
	}

}
