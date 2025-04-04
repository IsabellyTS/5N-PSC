public class Funcionario {

    private String nome;
    private String endereco;
    private int anoCont;

    public Funcionario(){

    }
    public Funcionario (String nome, String endereco, int anoCont) {
        this.nome = nome;
        this.endereco = endereco;
        this.anoCont= anoCont;
    }

    public String getNome() {
        return nome;
    }
    public String setNome() {
        this.nome = nome;
        return null;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoCont() {
        return anoCont;
    }

    public void setAnoCont(int anoCont) {
        this.anoCont = anoCont;
    }
}
