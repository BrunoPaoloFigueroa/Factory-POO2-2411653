public class VozNotificacion implements Notificacion {
    private String telefono;
    private String mensaje;

    public VozNotificacion(String telefono, String mensaje) {
        this.telefono = telefono;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        String[] partes = dividirMensaje(mensaje, 500);
        int intentos = 0;
        boolean enviado = false;

        while (intentos < 3 && !enviado) {
            for (String parte : partes) {
                convertirTextoAVoz(parte);
                enviado = realizarLlamada(parte);
                registrarDuracion(parte.length());
            }
            intentos++;
        }

        if (!enviado) {
            System.out.println("No se pudo completar la llamada a " + telefono);
        }
    }

    private String[] dividirMensaje(String texto, int max) {
        return texto.split("(?<=\\G.{" + max + "})");
    }

    private void convertirTextoAVoz(String texto) {
        System.out.println("Convirtiendo a voz: " + texto);
    }

    private boolean realizarLlamada(String parte) {
        System.out.println("Realizando llamada con: " + parte);
        return true;
    }

    private void registrarDuracion(int caracteres) {
        int duracion = caracteres / 10;
        System.out.println("Duración estimada: " + duracion + " segundos");
    }
}