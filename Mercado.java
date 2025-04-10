public class Mercado {
    String nome;
    int macasVendidaAno;
    double precoMacas;
    int laranjasVendidaAno;
    double precoLaranjas;

    public Mercado(String nome, int macasVendidaAno, double precoMacas, int laranjasVendidaAno, double precoLaranjas){
        this.nome = nome;
        this.macasVendidaAno = macasVendidaAno;
        this.precoMacas = precoMacas;
        this.laranjasVendidaAno = laranjasVendidaAno;
        this.precoLaranjas = precoLaranjas;
    }
    public void exibirInfo(){
        System.out.println("Mercado: " +nome);
        System.out.println("Maças Vendidas no Ano: " +macasVendidaAno);
        System.out.println("Preço Maças: " +precoMacas);
        System.out.println("Laranjas Vendidas no Ano: " +laranjasVendidaAno);
        System.out.println("Preço Laranjas: " + precoLaranjas);
    }
    public static void main(String[]args) {
        Mercado unidadeDeBlumenau = new Mercado("Cooper", 400, 5.90, 600, 7.80);
        Mercado unidadeDeJoinville = new Mercado("Fort", 380, 8.70, 980, 6.80);
        Mercado unidadeDeFlorianopolis = new Mercado("Top", 590, 7.80, 1000, 5.30);

        System.out.println();
        unidadeDeBlumenau.exibirInfo();
        System.out.println();
        unidadeDeJoinville.exibirInfo();
        System.out.println();
        unidadeDeFlorianopolis.exibirInfo();
    }
}
