public class Aluno extends Pessoa{ //a classe aluno criou uma entensão para herança de Pessoa
    private int matricula;
    private String curso;

    public Aluno(){

    }

    public Aluno(String nome, String endereco, String nacionalidade, int matricula, String curso){
     super(nome, endereco, nacionalidade);   //pegou a herança dos atributos e acrescentou os atributos do aluno
        this.curso = curso;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibeInfo(){
        System.out.println ("Nome: " + getNome());
        System.out.println ("Enedereço; " + endereco);
    }
}
