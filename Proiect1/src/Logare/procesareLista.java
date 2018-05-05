package Logare;

import java.util.List;

public class procesareLista {

	
	public static List procesare(List<String> lista) {
	/*	for (String str : lista) {
			if(str.contains("Salveaza ca favorit")||str.contains("Negociabil")) {
				lista.remove(str);
			}
			
		}
		*/
		int si=lista.size();
	for(int i=0;i<si;) {
		if(lista.get(i).toString().contains("Salveaza ca favorit") || lista.get(i).toString().contains("Negociabil")) {
			System.out.println(lista.get(i).toString()+"11111111111111111111");
			lista.remove(i);
			lista.add("111");

		}else {
			System.out.println("2222222222");

			i++;
		}
	}

		
		return lista;
	}

	
}
