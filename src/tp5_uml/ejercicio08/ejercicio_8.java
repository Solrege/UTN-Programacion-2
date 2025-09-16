package ejercicios_tp5;

public class ejercicio_8 {
    
    public static void main (String [] args) {
        // Agregación : FirmaDigital -> Usuario
        Usuario usuario = new Usuario("Marcos Alvarez", "marcos@example.com");

        // Composición : Documento contiene una FirmaDigital (creada por Documento)
        Documento doc = new Documento("Contrato", "Contenido del contrato...", 12345, "2025-09-15", usuario);

        System.out.println(doc);
        System.out.println("Firma del documento: " + doc.getFirma());
        // Aplicando Tell, Don't Ask: delegamos la impresión del usuario de la firma
        doc.imprimirUsuarioDeFirma();
    }
}
