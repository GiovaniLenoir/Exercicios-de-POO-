public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea(){
        return  Math.PI * raio * raio;
    }
    public double getRaio(){
        return raio;
    }

    public static void main(String[]args){
        Circulo c1 = new Circulo(2.0);
        Circulo c2 = new Circulo(3.5);
        Circulo c3 = new Circulo(3.0);
        Circulo c4 = new Circulo(4.5);
        Circulo c5 = new Circulo(5.0);

        System.out.println("Área do círculo c1: " + c1.calcularArea());
        System.out.println("Área do círculo c2: " + c2.calcularArea());
        System.out.println("Área do círculo c3: " + c3.calcularArea());
        System.out.println("Área do círculo c4: " + c4.calcularArea());
        System.out.println("Área do círculo c5: " + c5.calcularArea());
    }
}
