public class Pessoa {
    String nome;
    char sexo;
    String dataNascimento;
    String estadoCivil;

    public Pessoa(String nome, char sexo, String dataNascimento, String estadoCivil){
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }
    public void exibirInfo(){
        System.out.println("Nome: " +nome);
        System.out.println("Sexo: " +sexo);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Estado Civil: " + estadoCivil);
    }
    public static void main(String[]args){
        Pessoa pessoa1 = new Pessoa("Juliana", 'F', "26/04/1984", "Solteira");
        Pessoa pessoa2 = new Pessoa("Giovani", 'M', "12/07/1997", "Solteiro");

        pessoa1.exibirInfo();
        System.out.println();
        pessoa2.exibirInfo();
    }
}
