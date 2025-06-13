<p align="center">
  <img src="https://img.shields.io/badge/Java-Strategy%20Pattern-red?style=for-the-badge&logo=java&logoColor=white" alt="Java Strategy Pattern">
</p>

<h1 align="center">🎯 Padrão de Projeto Strategy em Java</h1>

<p align="center">
  Este projeto demonstra o uso do padrão <strong>Strategy</strong> em Java com um cenário fictício de guerra, onde diferentes estratégias são adotadas conforme o tipo de inimigo.
</p>

---

## 📌 Sobre o Projeto

Este projeto simula um sistema militar fictício que analisa as características de um inimigo (número de soldados, capacidade nuclear e chance de vitória) para aplicar a **estratégia de guerra mais adequada**.

Ele utiliza o **Padrão de Projeto Strategy**, permitindo a troca dinâmica de comportamento (estratégia) durante a execução do programa, promovendo maior flexibilidade e organização do código.

---

## 🧩 Estrutura do Código

- `Estrategia` → Interface com os métodos `atacar()` e `concluir()`.
- `Guerra` → Define qual estratégia será usada com base nos atributos do inimigo.
- `Inimigo` → Classe que representa o inimigo, com dados como nome, quantidade de soldados e capacidade nuclear.
- Estratégias concretas:
  - `Diplomacia` → Recuar tropas e propor cooperação econômica.
  - `AtacarSozinho` → Atacar diretamente usando manipulações políticas.
  - `AliancaVizinha` → Formar aliança com países vizinhos para ataque conjunto.

---

## ⚙️ Funcionamento do Código

### 1. Criação do Inimigo
- Um objeto da classe `Inimigo` é criado com:
  - Nome do país.
  - Quantidade de soldados.
  - Capacidade nuclear (boolean).
  - Chance de vitória (boolean).

### 2. Exibição de Dados
- O programa imprime no console as informações básicas do inimigo.

### 3. Definição da Estratégia
- Um objeto da classe `Guerra` recebe o inimigo.
- O método `definirEstrategia()` escolhe a melhor estratégia:
  - **AliancaVizinha** → Se a quantidade de soldados for maior que 1000.
  - **Diplomacia** → Se o inimigo for nuclear.
  - **AtacarSozinho** → Se o inimigo não tiver chance de vitória.

### 4. Execução da Estratégia
- `declararGuerra()` aplica a estratégia selecionada.
- `encerrarGuerra()` executa as ações finais da guerra.

---

## 🛠️ Classes Envolvidas

- `Estrategia` *(interface)* – define os métodos `atacar()` e `concluir()`.
- `Diplomacia`, `AliancaVizinha`, `AtacarSozinho` – implementações da estratégia.
- `Inimigo` – contém os atributos do inimigo.
- `Guerra` – define e aplica a estratégia com base no inimigo.
- `Teste` – classe principal com o `main()` que executa o sistema.

---

## 🖥️ Exemplo de Saída

```bash
Inimigo: EUA
Quantidade de soldados: 900

Todas as tropas recuando...
Cooperação econômica proposta...
Inimigos desarmados.
````

---

## 🚀 Tecnologias Utilizadas

* ☕ Java (JDK 8 ou superior)
* 🧠 Programação Orientada a Objetos (POO)
* 📐 Design Patterns (Strategy)

---

## 📚 O que é o Padrão Strategy?

> O padrão **Strategy** permite selecionar algoritmos em tempo de execução.
> Ele define uma família de algoritmos, encapsula cada um e os torna intercambiáveis.
> É ideal para cenários onde há várias maneiras de realizar uma ação — como no nosso caso, com diferentes formas de lidar com o inimigo.
