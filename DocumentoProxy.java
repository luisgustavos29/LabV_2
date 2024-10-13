// Classe Proxy que controla o acesso ao documento real
public class DocumentoProxy implements Documento{
    private DocumentoReal documentoReal;
    private String nome;
    private String usuario;

    public DocumentoProxy(String nome, String usuario) {
        this.nome = nome;
        this.usuario = usuario;
    }

    @Override
    public void exibir() {
        if (temAcesso()) {
            // Carrega o documento real se o acesso for permitido
            if (documentoReal == null) {
                documentoReal = new DocumentoReal(nome);
            }
            documentoReal.exibir();
        } else {
            System.out.println("Acesso negado a: " + nome);
        }
    }

    // Simula a verificação de permissões
    private boolean temAcesso() {
        // Apenas usuários "admin" têm acesso a documentos sensíveis
        return "admin".equals(usuario);
    }

}
