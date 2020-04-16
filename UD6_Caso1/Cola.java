
public class Cola {
	
	class NodoCola {
	    int dato;
	    NodoCola sig;

	    public NodoCola(int x) {
	      dato = x;
	      sig = null;
	    }
	  }

	  NodoCola first;
	  NodoCola end;

	  public Cola() {
	    end = null;
	  }

	  public void insertar(int x) {
	    NodoCola nuevo_nodo = new NodoCola(x);
	    if (first == null) {
	      first = nuevo_nodo;
	      end = nuevo_nodo;
	    } else {
	      end.sig = nuevo_nodo;
	      end = nuevo_nodo;
	    }
	  }; // Insertar dato en la cola

	  public int recuperar() {
	    if (first == null)
	      return -99999;
	    ;
	    int x = first.dato;
	    first = first.sig;
	    return x;
	  } // Extraer dato de la cola
	  
	  public void obtener() {
	    	
	    	if (first!=null)
	        {
	            int informacion = first.dato;
	            first = first.sig;
	            end = first;
	            System.out.println("Obtenemos el dato de la cima: "+informacion);
	        }
	        else
	        {
	            System.out.println("No hay datos en la cola");
	        }
	  } // Mostrar dato de la cima de la cola extrayendolo

	  public void devolver() {
	    if (first == null)
	    	System.out.println("No hay datos en la cola");
	    else
	    	System.out.println("Devolvemos el dato de la cima: "+first.dato);
	  }  // Mostrar dato de la cima de la cola sin extraerlo 
	  
	  public void imprimir() {
	        NodoCola reco=first;
	        System.out.println("Listado de todos los elementos de la cola:");
	        while (reco!=null) {
	            System.out.print(reco.dato+" ");
	            reco=reco.sig;
	            System.out.println();
	        }
	        System.out.println();
	    } // Imprimir datos de la cola
	  
	  public static void main(String[] ar) {
	        Cola cola1 = new Cola();
	        System.out.println("Insertamos datos en la cola.");
	        cola1.insertar(4);
	        cola1.insertar(12);
	        cola1.insertar(13);
	        cola1.insertar(25);
	        cola1.insertar(33);
	        cola1.insertar(45);
	        cola1.insertar(58);
	        
	        cola1.imprimir();
	        
	        System.out.println("Extraemos un dato de la cola.");
	        cola1.recuperar();
	        cola1.imprimir();
	        
	        cola1.devolver();
	        
	        cola1.insertar(5);
	        cola1.imprimir();
	        
	        cola1.devolver();
	        
	        cola1.obtener();
	        cola1.imprimir();
	    }

}
