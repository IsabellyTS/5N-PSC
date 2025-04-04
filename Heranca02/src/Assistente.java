public class Assistente extends Funcionario{

    private String especializacao;


    public Assistente(){

    }
    public Assistente (String nome, String endereco, int anoCont, String especializacao){
    super (nome, endereco, anoCont);
    this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}