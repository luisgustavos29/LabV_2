// Classe concreta que representa um documento sensível
public class DocumentoReal implements Documento{
    private String nome;

    public DocumentoReal(String nome) {
        this.nome = nome;
        carregarDocumento();
    }

    // Simula o carregamento do documento
    private void carregarDocumento() {
        System.out.println("Carregando documento: " + nome);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo documento: " + nome);
    }

}
