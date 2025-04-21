public class ConcreteNotificacionFactory extends NotificacionFactory {

    @Override
    public Notificacion crearNotificacion(String tipo, String destinatario, String mensaje) {
        switch (tipo) {
            case "EMAIL":
                return new EmailNotificacion(destinatario, mensaje);
            case "SMS":
                return new SMSNotificacion(destinatario, mensaje);
            case "PUSH":
                return new PushNotificacion(destinatario, mensaje);
            case "VOZ":
                return new VozNotificacion(destinatario, mensaje);
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipo);
        }
    }
}
