public class APP {
    public static void main(String[] args) {
        System.out.println ("Exemplo herança"); //a função do ln no fina é a mesma do "escreval"
        Pessoa p1 = new Pessoa("Adri", "brasil", "Bra");
        p1.imprimeDados();
        Aluno a1= new Aluno("Isabelly","Bra","Bra",2006,"Ciência de dados");
        a1.imprimeDados();
        System.out.println("Curso: " + a1.getCurso());
        System.out.println("Matricula: " + a1.getMatricula());
        Professor prof1 = new Professor();
        prof1.setNome("Adri");
        prof1.setCodigo(123);
        System.out.println(prof1.getNome() + " tem código: " + prof1.getCodigo());
        a1.exibeInfo();
    }
}
