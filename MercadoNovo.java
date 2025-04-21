public class MercadoNovo {
    String nome;
    int macasVendidaAno;
    double precoMacas;
    int laranjasVendidaAno;
    double precoLaranjas;

    public MercadoNovo(String nome, int macasVendidaAno, double precoMacas, int laranjasVendidaAno, double precoLaranjas) {
        this.nome = nome;
        this.macasVendidaAno = macasVendidaAno;
        this.precoMacas = precoMacas;
        this.laranjasVendidaAno = laranjasVendidaAno;
        this.precoLaranjas = precoLaranjas;
    }

    public void exibirInfo() {
        System.out.println("Mercado: " + nome);
        System.out.println("Maçãs Vendidas no Ano: " + macasVendidaAno);
        System.out.println("Preço Maçãs: R$ " + precoMacas);
        System.out.println("Laranjas Vendidas no Ano: " + laranjasVendidaAno);
        System.out.println("Preço Laranjas: R$ " + precoLaranjas);
        System.out.printf("Receita Total: R$ %.2f\n", calcularFaturamentoAnual());
    }

    public double calcularReceitaMacas() {
        return macasVendidaAno * precoMacas;
    }

    public double calcularReceitaLaranjas() {
        return laranjasVendidaAno * precoLaranjas;
    }

    public double calcularFaturamentoAnual() {
        return calcularReceitaMacas() + calcularReceitaLaranjas();
    }

    public static void main(String[] args) {
        MercadoNovo unidadeDeBlumenau = new MercadoNovo("Cooper", 400, 5.90, 600, 7.80);
        MercadoNovo unidadeDeJoinville = new MercadoNovo("Fort", 380, 8.70, 980, 6.80);
        MercadoNovo unidadeDeFlorianopolis = new MercadoNovo("Top", 590, 7.80, 1000, 5.30);

        unidadeDeBlumenau.exibirInfo();
        System.out.println();
        unidadeDeJoinville.exibirInfo();
        System.out.println();
        unidadeDeFlorianopolis.exibirInfo();
        System.out.println();

        MercadoNovo[] mercados = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};

        MercadoNovo maiorMacas = mercados[0];
        for (MercadoNovo m : mercados) {
            if (m.calcularReceitaMacas() > maiorMacas.calcularReceitaMacas()) {
                maiorMacas = m;
            }
        }
        System.out.println("a) Maior receita com maçãs: " + maiorMacas.nome + " - R$ " + maiorMacas.calcularReceitaMacas());

        MercadoNovo maiorLaranjas = mercados[0];
        for (MercadoNovo m : mercados) {
            if (m.calcularReceitaLaranjas() > maiorLaranjas.calcularReceitaLaranjas()) {
                maiorLaranjas = m;
            }
        }
        System.out.println("b) Maior receita com laranjas: " + maiorLaranjas.nome + " - R$ " + maiorLaranjas.calcularReceitaLaranjas());

        java.util.Arrays.sort(mercados, (m1, m2) -> Double.compare(m2.calcularFaturamentoAnual(), m1.calcularFaturamentoAnual()));

        System.out.println("c) Maior receita total: " + mercados[0].nome + " - R$ " + mercados[0].calcularFaturamentoAnual());
        System.out.println("d) Menor receita total: " + mercados[2].nome + " - R$ " + mercados[2].calcularFaturamentoAnual());
        System.out.println("e) Receita intermediária: " + mercados[1].nome + " - R$ " + mercados[1].calcularFaturamentoAnual());

        double totalMacas = 0;
        double totalLaranjas = 0;
        for (MercadoNovo m : mercados) {
            totalMacas += m.calcularReceitaMacas();
            totalLaranjas += m.calcularReceitaLaranjas();
        }

        System.out.println("f) Receita total com maçãs: R$ " + totalMacas);
        System.out.println("   Receita total com laranjas: R$ " + totalLaranjas);

        if (totalMacas > totalLaranjas) {
            System.out.println("   >>> A franquia teve maior receita com maçãs.");
        } else if (totalLaranjas > totalMacas) {
            System.out.println("   >>> A franquia teve maior receita com laranjas.");
        } else {
            System.out.println("   >>> As receitas foram iguais.");
        }
    }
}

