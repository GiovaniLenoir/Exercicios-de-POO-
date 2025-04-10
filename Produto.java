public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    double desconto;

    public Produto(String nome, String descricao, double precoUnitario, double desconto){
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
    }
    public void exibirInfo(){
        System.out.println("Produto: " +nome);
        System.out.println("Descrição: " +descricao);
        System.out.println("Preço por Unidade: " +precoUnitario);
        System.out.println("Desconto do Produto: " +desconto);
    }
    public static void main(String[]args){
        Produto produto1 = new Produto("Carderno", "Caderno em espiral tamanho médio", 4.50, 15);
        Produto produto2 = new Produto("Caneta ESF", "Caneta esferográfica 5mm", 1.20, 2);
        Produto produto3 = new Produto("Esquadro", "Esquadro de acrílico 20 cm", 2.35, 10);

        System.out.println();
        produto1.exibirInfo();
        System.out.println();
        produto2.exibirInfo();
        System.out.println();
        produto3.exibirInfo();
    }
}
