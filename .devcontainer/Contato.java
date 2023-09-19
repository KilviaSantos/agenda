public class Contato {
    private String id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    // Construtor
    public Contato(String id, String nome, String endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\nEmail: " + email;
    }


}