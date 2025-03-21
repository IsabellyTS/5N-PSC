public class App {
    public static void main(String[] args) {
        System.out.println("Programa com Associação");

        Fabricante f1 = new Fabricante("Coca cola", "Brasil");

        PRODUTO p1 = new PRODUTO(125, "Fanta", 2.60, f1);
        System.out.println(p1.getCodigo() + " é fabricado por:" + p1.getFabricante().getNome());

        PRODUTO p2 = new PRODUTO(234, "Sprite", 2.10, f1);
        System.out.println(p2.getCodigo() + " é fabricado por: " + p2.getFabricante().getNome()); //tal.tal = o ponto chama o identificador

    }
}


// scanner é definidido dentro do main= variável = não é referência <- leitor nao é caracteristica de mundo real






//*  APAGADO PARA CRIAR UM NOVO ENDEREÇO
// System.out.println("Teste Produto App");
// PRODUTO p1 = new PRODUTO();
//  System.out.println("Código: " + p1.getCodigo());
//  PRODUTO p2; //apenas a referência, endereço p guardar o objeto
//  p2 = new PRODUTO();
//  p2.setCodigo(666);
//  System.out.println("Código: " + p2.getCodigo());
//  PRODUTO p3 = new PRODUTO(2001, "Coca", 2.50, "Coca");
//  System.out.println("p3: " + p3.getCodigo() + "," +p3.getFabricante());
// }
//get = busca valor
//set = configurar/atribuir valor*//