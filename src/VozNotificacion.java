public class VozNotificacion implements Notificacion {
    private String telefono;
    private String mensaje;

    public VozNotificacion(String telefono, String mensaje) {
        this.telefono = telefono;
        this.mensaje = mensaje;
    }

    private void convertirTextoAVoz() {
        System.out.println("Convirtiendo mensaje a voz: " + mensaje);
    }

    private void registrarDuracion() {
        System.out.println("Registrando duración de la llamada a " + telefono);
    }

    private void intentarLlamada() {
        int intentos = 0;
        boolean exito = false;

        while (intentos < 3 && !exito) {
            System.out.println("Intentando llamada #" + (intentos + 1) + " a " + telefono);
            intentos++;
            exito = true; // Simulamos éxito
        }

        if (!exito) {
            System.out.println("No se pudo contactar a " + telefono);
        }
    }

    @Override
    public void enviar() {
        convertirTextoAVoz();
        intentarLlamada();
        registrarDuracion();
        System.out.println("Llamada de voz enviada a " + telefono + ": " + mensaje);
    }
}