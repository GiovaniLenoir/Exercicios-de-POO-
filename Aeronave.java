public class Aeronave {
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeCombustivel;
    private double queimaCombustivelMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMinuto = queimaCombustivelMinuto;
    }

    public double tempoAr() {
        return capacidadeCombustivel / queimaCombustivelMinuto;
    }

    public double distanciaMaxima() {
        double tempoHoras = tempoAr() / 60;
        return tempoHoras * velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public static void main(String[] args) {
        Aeronave aeronave1 = new Aeronave("Boeing 747", 416, 920, 238000, 150);
        Aeronave aeronave2 = new Aeronave("Airbus A380", 555, 1020, 320000, 180);
        Aeronave aeronave3 = new Aeronave("Embraer E190", 114, 870, 13000, 60);
        Aeronave aeronave4 = new Aeronave("Cessna 172", 4, 226, 212, 8);

        Aeronave[] aeronaves = {aeronave1, aeronave2, aeronave3, aeronave4};

        Aeronave maisTempoAr = aeronaves[0];
        for (Aeronave a : aeronaves) {
            if (a.tempoAr() > maisTempoAr.tempoAr()) {
                maisTempoAr = a;
            }
        }

        Aeronave maisPassageiros = aeronaves[0];
        for (Aeronave a : aeronaves) {
            if (a.getPassageiros() > maisPassageiros.getPassageiros()) {
                maisPassageiros = a;
            }
        }

        Aeronave maiorDistancia = aeronaves[0];
        for (Aeronave a : aeronaves) {
            if (a.distanciaMaxima() > maiorDistancia.distanciaMaxima()) {
                maiorDistancia = a;
            }
        }

        System.out.println("=== Resultados ===");
        System.out.println("a) Aeronave com maior tempo no ar: " + maisTempoAr.getModelo() + " - " + String.format("%.2f", maisTempoAr.tempoAr()) + " minutos");
        System.out.println("b) Aeronave com mais passageiros: " + maisPassageiros.getModelo() + " - " + maisPassageiros.getPassageiros() + " passageiros");
        System.out.println("c) Aeronave com maior distância máxima: " + maiorDistancia.getModelo() + " - " + String.format("%.2f", maiorDistancia.distanciaMaxima()) + " km");
    }
}


