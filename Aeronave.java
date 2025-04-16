public class Aeronave {
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeCombustivel;
    private double queimaCombustivelMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMinuto){
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMinuto = queimaCombustivelMinuto;
    }
    public double tempoAr(){
        return capacidadeCombustivel / queimaCombustivelMinuto;
    }
    public double distanciaMaxima(){
        double tempoHoras = tempoAr() / 60;
        return tempoHoras  * velocidadeMaxima;
    }
    public String getModelo(){
        return modelo;
    }
    public int getPassageiros(){
        return  passageiros;
    }

    public static void main(String[]args){
         
    }

}
