# Exercícios de Programação Orientada a Objetos (POO) - Java 💻☕

Este repositório contém a resolução de 9 exercícios de Programação Orientada a Objetos utilizando a linguagem Java. Os exercícios abordam conceitos fundamentais de POO, como encapsulamento, criação de classes e objetos, métodos, uso de `this`, exceções e lógica de negócios.

---

## 📚 Lista de Exercícios

### ✅ 1. Pessoa
Criação de uma classe `Pessoa` com os atributos:
- Nome
- Sexo (char)
- Data de nascimento (String)
- Estado civil

Objetivo: Criar dois objetos da classe com diferentes valores.

---

### ✅ 2. Mercado
Classe `Mercado` com:
- Nome do mercado
- Nº de maçãs vendidas por ano
- Preço das maçãs
- Nº de laranjas vendidas por ano
- Preço das laranjas

Objetivo: Criar três objetos representando diferentes mercados.

---

### ✅ 3. Produto
Classe `Produto` com os atributos:
- Nome
- Descrição
- Preço unitário
- Desconto

Objetivo: Criar três produtos com valores específicos.

---

### ✅ 4. Círculo
Classe `Circulo` com o atributo:
- Raio

Objetivo: Calcular a área de 5 objetos diferentes utilizando `Math.PI`.

---

### ✅ 5. Análise de Receita com Mercado
Usando os objetos da classe `Mercado`, calcular:
- Qual mercado teve maior receita com maçãs
- Qual teve maior receita com laranjas
- Qual mercado teve maior e menor receita no total
- Qual ficou em posição intermediária
- Se a franquia vendeu mais maçãs ou laranjas no total

---

### ✅ 6. Aeronave
Classe `Aeronave` com os atributos:
- Modelo
- Passageiros
- Velocidade máxima
- Capacidade de combustível
- Queima de combustível por minuto

Objetivo: Criar 4 aeronaves e descobrir:
- Qual fica mais tempo no ar
- Qual leva mais passageiros
- Qual voa mais longe

---

### ✅ 7. Contribuinte (Imposto de Renda)
Classe `Contribuinte` com:
- Nome
- CPF
- UF (RS, SC, PR)
- Renda anual

Cálculo do imposto conforme faixa de renda:
- 0 a 4.000 → 0%
- 4.001 a 9.000 → 5.8%
- 9.001 a 25.000 → 15%
- 25.001 a 35.000 → 27.5%
- Acima de 35.000 → 30%

Objetivo: Criar 5 objetos e calcular:
- Quem paga mais imposto
- Quem paga menos
- Total de imposto pago

---

### ✅ 8. Controle de Velocidade do Carro
Classe com métodos:
- `acelerar()`: Só permite valores entre 0 e 20
- `reduzir()`: Só permite valores entre 0 e 30

Lança exceção se os valores forem inválidos.

---

### ✅ 9. Ônibus Escolar
Classe `OnibusEscolar` com:
- Quantidade de estudantes (máx: 40)
- Quantidade de professores

Regras:
- Se professores = 0, alunos = 0
- `removerAlunos(int quantidade)`: Diminui número de alunos (sem valor negativo)

