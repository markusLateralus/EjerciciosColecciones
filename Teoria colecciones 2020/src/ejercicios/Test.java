package ejercicios;

import java.util.Iterator;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaCantantesFamosos miLista=new ListaCantantesFamosos();
		
		CantanteFamoso primerCantante=new CantanteFamoso("marcos", "aromas sin sal");
		CantanteFamoso segundoCantante=new CantanteFamoso("emilio", "nuestra luz");
		
		miLista.agregar(primerCantante);
		miLista.agregar(segundoCantante);
		
		for (Iterator iterator = miLista.listaCantantesFamosos.iterator(); iterator.hasNext();) {
			CantanteFamoso object = (CantanteFamoso) iterator.next();
			System.out.println(object.getNombre());
			System.out.println(object.getDiscoConMasVentas());
		
	}
	}

}
