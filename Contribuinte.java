public class Contribuinte {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        if (rendaAnual <= 4000) {
            return 0;
        } else if (rendaAnual <= 9000) {
            return rendaAnual * 0.058;
        } else if (rendaAnual <= 25000) {
            return rendaAnual * 0.15;
        } else if (rendaAnual <= 35000) {
            return rendaAnual * 0.275;
        } else {
            return rendaAnual * 0.30;
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("UF: " + uf);
        System.out.printf("Renda Anual: R$ %.2f\n", rendaAnual);
        System.out.printf("Imposto a pagar: R$ %.2f\n", calcularImposto());
        System.out.println("----------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public static void main(String[] args) {
        Contribuinte c1 = new Contribuinte("João da Silva", "123.456.789-00", "PR", 40000);
        Contribuinte c2 = new Contribuinte("Maria Souza", "987.654.321-11", "RS", 35000);
        Contribuinte c3 = new Contribuinte("Pedro Lima", "456.789.123-22", "SC", 10000);
        Contribuinte c4 = new Contribuinte("Ana Costa", "321.654.987-33", "PR", 3000);
        Contribuinte c5 = new Contribuinte("Lucas Martins", "789.123.456-44", "RS", 8000);

        Contribuinte[] contribuintes = {c1, c2, c3, c4, c5};

        System.out.println("=== Informações dos Contribuintes ===");
        for (Contribuinte c : contribuintes) {
            c.exibirInfo();
        }

        Contribuinte maisImposto = contribuintes[0];
        for (Contribuinte c : contribuintes) {
            if (c.calcularImposto() > maisImposto.calcularImposto()) {
                maisImposto = c;
            }
        }

        Contribuinte menosImposto = contribuintes[0];
        for (Contribuinte c : contribuintes) {
            if (c.calcularImposto() < menosImposto.calcularImposto()) {
                menosImposto = c;
            }
        }

        double totalImposto = 0;
        for (Contribuinte c : contribuintes) {
            totalImposto += c.calcularImposto();
        }

        System.out.println("=== Resultados ===");
        System.out.printf("a) Quem mais paga imposto: %s - R$ %.2f\n", maisImposto.getNome(), maisImposto.calcularImposto());
        System.out.printf("b) Quem menos paga imposto: %s - R$ %.2f\n", menosImposto.getNome(), menosImposto.calcularImposto());
        System.out.printf("c) Total de imposto arrecadado: R$ %.2f\n", totalImposto);
    }
}

