public class Main {

    public static void main(String[] args) {

        // Crear lista de tickets resueltos
        ListaEnlazadaSimple ticketsResueltos =
                new ListaEnlazadaSimple();

        // Crear tickets de prueba
        Ticket ticket1 = new Ticket(
                "No puedo iniciar sesión",
                "Ana Pérez"
        );

        Ticket ticket2 = new Ticket(
                "No puedo cambiar mi contraseña",
                "Carlos Rodríguez"
        );

        Ticket ticket3 = new Ticket(
                "La página no carga",
                "María López"
        );

        // Resolver tickets
        ticket1.resolver();
        ticket2.resolver();
        ticket3.resolver();

        // Insertarlos en la lista
        ticketsResueltos.insertarInicio(ticket1);
        ticketsResueltos.insertarInicio(ticket2);
        ticketsResueltos.insertarInicio(ticket3);

        // Buscar un ticket
        Ticket encontrado = ticketsResueltos.buscar(2);

        System.out.println(encontrado);
    }
}
