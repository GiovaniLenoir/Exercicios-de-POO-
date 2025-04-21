public class Carro {
    private double velocidadeAtual;

    public Carro(double velocidadeInicial) {
        this.velocidadeAtual = velocidadeInicial;
    }

    public double getVelocidade() {
        return this.velocidadeAtual;
    }

    public void setVelocidade(double novaVelocidade) {
        if (novaVelocidade < 0) {
            throw new IllegalArgumentException("A velocidade não pode ser negativa.");
        }
        this.velocidadeAtual = novaVelocidade;
    }

    public void acelerar(double incremento) {
        if (incremento >= 0 && incremento < 20) {
            setVelocidade(this.velocidadeAtual + incremento);
        } else {
            throw new IllegalArgumentException("O valor para acelerar deve ser entre 0 e 20.");
        }
    }

    public void reduzir(double decremento) {
        if (decremento >= 0 && decremento < 30) {
            setVelocidade(this.velocidadeAtual - decremento);
        } else {
            throw new IllegalArgumentException("O valor para reduzir deve ser entre 0 e 30.");
        }
    }

    public static void main(String[] args) {
        try {
            Carro meuCarro = new Carro(50);
            System.out.println("Velocidade inicial: " + meuCarro.getVelocidade() + " km/h");

            meuCarro.acelerar(15);
            System.out.println("Velocidade após acelerar: " + meuCarro.getVelocidade() + " km/h");

            meuCarro.reduzir(10);
            System.out.println("Velocidade após reduzir: " + meuCarro.getVelocidade() + " km/h");

            meuCarro.acelerar(25);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

