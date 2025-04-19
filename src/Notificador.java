import java.util.HashMap;
import java.util.Map;

public class Notificador {
    private Map<String, NotificacionFactory> factories = new HashMap<>();

    public void registrarCanal(String tipo, NotificacionFactory factory) {
        factories.put(tipo.toUpperCase(), factory);
    }

    public void enviarNotificacion(String tipo, String destinatario, String mensaje) {
        NotificacionFactory factory = factories.get(tipo.toUpperCase());
        if (factory != null) {
            Notificacion notificacion = factory.crearNotificacion(destinatario, mensaje);
            notificacion.enviar();
        } else {
            System.out.println("Canal no registrado: " + tipo);
        }
    }
}