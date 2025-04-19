public class EmailNotificacionFactory implements NotificacionFactory {
    @Override
    public Notificacion crearNotificacion(String destinatario, String mensaje) {
        return new EmailNotificacion(destinatario, mensaje);
    }
}