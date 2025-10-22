package tp8_interfaces_excepciones.ejercicio02;

public class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(String message) {
        super(message);
    }
}
