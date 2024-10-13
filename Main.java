// Classe principal para demonstrar o funcionamento
public class Main {
    public static void main(String[] args) {
        // Tentativa de acesso por um usuário não autorizado
        Documento documento1 = new DocumentoProxy("Relatório Confidencial", "usuario");
        documento1.exibir(); // Acesso negado

        // Tentativa de acesso por um usuário autorizado
        Documento documento2 = new DocumentoProxy("Relatório Confidencial", "admin");
        documento2.exibir(); // Acesso concedido
    }
}
