
public class Pila {
	
	class NodoPila {
	    int dato;
	    NodoPila sig;

	    public NodoPila(int x) {
	      dato = x;
	      sig = null;
	    }
	  }

	  NodoPila end;
	  NodoPila raiz;

	  public Pila() {
	    end = null;
	    raiz = null;
	  }

	  public void insertar(int x) {
	    NodoPila nuevo_nodo = new NodoPila(x);
	    if (raiz == null)
	    	raiz = nuevo_nodo;
	    else {
	    	nuevo_nodo.sig = raiz;
	    	raiz = nuevo_nodo;
	    }
	  } // Insertar dato en la pila

	  public int recuperar() {
	    if (raiz == null)
	      return -99999;
	    ;
	    int x = raiz.dato;
	    raiz = raiz.sig;
	    return x;
	  } // Extraer dato de la pila
    
    public void devolver() {
    	
    	if (raiz == null)
    		System.out.println("No hay datos en la pila");
          else
        	  System.out.println("Devolvemos el dato de la cima: "+raiz.dato);
    } // Mostrar dato de la cima de la pila sin extraerlo
    
    public void obtener() {
    	
    	if (raiz!=null)
        {
            int informacion = raiz.dato;
            raiz = raiz.sig;
            end = raiz;
            System.out.println("Obtenemos el dato de la cima: "+informacion);
        }
        else
        {
            System.out.println("No hay datos en la pila");
        }
    } // Mostrar dato de la cima de la pila extrayendolo
    
    public void imprimir() {
        NodoPila reco=raiz;
        System.out.println("Listado de todos los elementos de la pila:");
        while (reco!=null) {
            System.out.print(reco.dato+" ");
            reco=reco.sig;
            System.out.println();
        }
        System.out.println();
    } // Imprimir datos de la pila
    
    public static void main(String[] ar) {
        Pila pila1=new Pila();
        System.out.println("Insertamos datos en la pila.");
        pila1.insertar(4);
        pila1.insertar(12);
        pila1.insertar(13);
        pila1.insertar(25);
        pila1.insertar(33);
        pila1.insertar(45);
        pila1.insertar(58);
        
        pila1.imprimir();
        
        System.out.println("Extraemos un dato de la pila.");
        pila1.recuperar();
        pila1.imprimir();  
        
        pila1.devolver();
        pila1.imprimir();
        
        pila1.obtener();
        pila1.imprimir();
    }

}
