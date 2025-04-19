public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        notificador.registrarCanal("EMAIL", new EmailNotificacionFactory());
        notificador.registrarCanal("SMS", new SMSNotificacionFactory());
        notificador.registrarCanal("PUSH", new PushNotificacionFactory());
        notificador.registrarCanal("VOZ", new VozNotificacionFactory());

        notificador.enviarNotificacion("EMAIL", "bruno@xddddd.com", "Hola mundo");
        notificador.enviarNotificacion("SMS", "4242442042", " SMS");
        notificador.enviarNotificacion("PUSH", "device123", " un Push");
        notificador.enviarNotificacion("VOZ", "32222222222", "zzzzzzzzzZZZZZZZZZZZZZZZZZZzzzzzzzzzzzzzzzzzzzz");
    }
}