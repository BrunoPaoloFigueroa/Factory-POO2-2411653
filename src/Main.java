public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new ConcreteNotificacionFactory();

        Notificacion email = factory.crearNotificacion("EMAIL", "bruno.figueroa@usil.pe", "Hola xd");
        Notificacion sms = factory.crearNotificacion("SMS", "322254548", "xdddddddddddddd");
        Notificacion voz = factory.crearNotificacion("VOZ", "@edgfa@", "blablanbla");

        email.enviar();
        sms.enviar();
        voz.enviar();
    }
}