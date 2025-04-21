public class OnibusEscolar {
    private int quantidadeDeEstudantes;
    private int quantidadeDeProfessores;
    
    public OnibusEscolar(int quantidadeDeEstudantes, int quantidadeDeProfessores) {
        this.setAlunos(quantidadeDeEstudantes);
        this.quantidadeDeProfessores = quantidadeDeProfessores;
        if (quantidadeDeProfessores == 0) {
            this.quantidadeDeEstudantes = 0; 
        }
    }
    
    public int getQuantidadeDeEstudantes() {
        return quantidadeDeEstudantes;
    }
    
    public int getQuantidadeDeProfessores() {
        return quantidadeDeProfessores;
    }
    
    public void setAlunos(int quantidade) {
        if (quantidade > 40) {
            System.out.println("Número de estudantes excedeu o limite de 40. Ajustando para 40.");
            this.quantidadeDeEstudantes = 40; 
        } else {
            this.quantidadeDeEstudantes = quantidade;
        }
    }
    
    public void removerAlunos(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a remover deve ser maior que zero.");
        }
        if (quantidadeDeEstudantes - quantidade < 0) {
            this.quantidadeDeEstudantes = 0; 
        } else {
            this.quantidadeDeEstudantes -= quantidade;
        }
    }
    
    public void setProfessores(int quantidade) {
        this.quantidadeDeProfessores = quantidade;
        if (quantidade == 0) {
            this.quantidadeDeEstudantes = 0; 
        }
    }

    public static void main(String[] args) {
        try {
            OnibusEscolar onibus = new OnibusEscolar(45, 2);
            System.out.println("Quantidade de estudantes: " + onibus.getQuantidadeDeEstudantes());
            System.out.println("Quantidade de professores: " + onibus.getQuantidadeDeProfessores());
            
            onibus.removerAlunos(5);
            System.out.println("Quantidade de estudantes após remoção: " + onibus.getQuantidadeDeEstudantes());
            
            onibus.removerAlunos(100); 
            System.out.println("Quantidade de estudantes após tentativa de remoção excessiva: " + onibus.getQuantidadeDeEstudantes());
            
            onibus.setProfessores(0);
            System.out.println("Quantidade de estudantes após zerar professores: " + onibus.getQuantidadeDeEstudantes());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

