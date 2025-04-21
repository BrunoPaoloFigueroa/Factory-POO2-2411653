public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new ConcreteNotificacionFactory();

        Notificador notificador = new Notificador(factory);


        notificador.enviarNotificacion("EMAIL", "bruno.figueroa@usil.pe", "Hola xd");
        notificador.enviarNotificacion("SMS", "322254548", "xdddddddddddddd");
        notificador.enviarNotificacion("VOZ", "@edgfa@", "blablanbla");


    }
}