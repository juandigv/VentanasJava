package jd.code;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana("Inicio Sesion");
        ventana.insertarNombre("Juan");
        ventana.insertarPassword("1234");
        ventana.validar();
        boolean respuesta = ventana.validar();
        if (respuesta) {
            System.out.println("Bienvenido!!");
        } else {
            System.out.println("No Registrado");
        }
    }
}
