public class Notificador {
    private NotificacionFactory factory;

    public Notificador(NotificacionFactory factory) {
        this.factory = factory;
    }

    public void enviarNotificacion(String tipo, String destinatario, String mensaje) {
        Notificacion notificacion = factory.crearNotificacion(tipo, destinatario, mensaje);
        notificacion.enviar();
    }
}
