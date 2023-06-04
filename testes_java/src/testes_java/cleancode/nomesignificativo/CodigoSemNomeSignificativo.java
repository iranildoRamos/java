package testes_java.cleancode.nomesignificativo;

import java.util.ArrayList;
import java.util.List;

public class CodigoSemNomeSignificativo {
	
	public List<int[]> theList() {
		int campo[] = { 1, 2, 3, 4 };
		List<int[]> thelist = new ArrayList<int[]>();
		thelist.add(campo);
		return thelist;
	}
	
	
	
	//TODO: ANTES
	public List<int[]> getThem() {
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList())//* 1. Que tipos de coisas estão em theList?
			if (x[0] == 4) 		 //* 2. Qual a importância de um item na posição zero na theList
								 //* 3. Qual a importância do valor 4 mencionado no if(...)?
				list1.add(x);
		return list1;			 //* 4.Como eu usaria a lista retornada?
	}

}
