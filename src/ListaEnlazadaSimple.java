public class ListaEnlazadaSimple {

    //Atributos de la ListaEnlazadaSimple

    private NodoLista primero;

    //Métodos de la clase ListaEnlazadaSimple

    //Constructor
    public ListaEnlazadaSimple(){
        primero = null;
    }

    //Getters
    private NodoLista getPrimero(){
        return primero;
    }

    //Setters
    private void setPrimero(NodoLista primero){
        this.primero = primero;
    }

    //Operaciones

    private boolean estaVacia(){
        return primero == null;
    }

    public void insertarInicio(Ticket ticket) {
        NodoLista nodo = new NodoLista(ticket);
        nodo.setSiguiente(primero);
        setPrimero(nodo);
    }

    public Ticket buscar(int id) {
        if (estaVacia()) {
            System.out.println("\nLa lista está vacía.\n");
            return null;
        }

        NodoLista temp = primero;

        while (temp != null) {
            if (id == temp.getTicket().getId()) {
                return temp.getTicket();
            }

            temp = temp.getSiguiente();
        }

        System.out.println("\nEl ticket no está en la lista.\n");
        return null;
    }

    private class NodoLista{

        //Atributos
        private Ticket ticket;
        private NodoLista siguiente;

        //Métodos
        // Constructor -> Paso directamente el objeto Ticket
        public NodoLista(Ticket ticket) {
            this.ticket = ticket;
            siguiente = null;
        }

        // Getters
        public Ticket getTicket() {
            return ticket;
        }

        public NodoLista getSiguiente() {
            return siguiente;
        }

        //Setters

        public void setSiguiente(NodoLista siguiente) {
            this.siguiente = siguiente;
        }

    }

}
