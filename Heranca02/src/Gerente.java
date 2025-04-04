public class Gerente extends Funcionario {

    private int nivel;

    public Gerente(){

    }
    public Gerente (String nome, String endereco, int anoCont, int nivel){
   super (nome, endereco, anoCont);
    this.nivel = nivel;
}
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

