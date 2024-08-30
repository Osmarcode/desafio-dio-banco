# Criando um Banco Digital com Java e Orientação a Objetos - Desafio Bootcamp DIO Claro.
Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. 
Para isso, vamos interpretar o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), 
as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).” 
Foram abordados e colocados em prática os 4 pilares da Programação Orientada a Objetos:
Obs.:Foram inseridos dentro da classe Application, onde roda o programa, alguns dados para testes que serão visualizados via console na IDE.

**Encancapsulamento: Proteção dos nossos atributos, onde utilizamos os modificadores de acesso:**
- Public -> Os métodos e atributos da classe, podem ser acessados por qualquer outra classe dentro e fora do pacote.
O modificador de acesso do tipo Public é utilizado geralmente em métodos.

public void sacar(double valor) {
	
        saldo -= valor;
		
	}

Por ser do tipo **public**, pode este método sacar(double valor) ser acessado apenas sendo chamada sua assinatura Ex.: ContaCorrenteUsuario.sacar(50);

- Private -> Não pode ser acessado externamente, apenas dentro da classe, acesso externo só através dos métodos Get(obter valor) e Set(modificar valor).
private String nome;

//aqui ele só pode ser acessado quando usados os métodos:

public String getNome() {
		
  return nome;

 }
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
cliente.setNome("Carlos"); 

System.out.println(cliente.getnome()); //saída: Carlos

- Protected -> Nesse caso o acesso aos atributos e métodos da Classe tem relação direta com herança entre a Classe Pai e as classes filhas.

//com esse modificador de acesso **protected**, continua protegido e 
agora pode ser usado apenas pelas classes filhas conta Corrente e Poupança

 **protected** int agencia;
	
 **protected** int numero;
	
 **protected** double saldo = 0;
	
 **protected** Cliente cliente;

- Default -> O acesso só poderá ser realizado por classes que estiverem dentro do mesmo pacote.
Quando não especificamos o tipo de modificador de acesso, ele assume o valor Default.

**Herança:** Quando uma classe estende/herda/modifica os comportamentos da classe pai.
  Ex.: A Classe Conta possui os atributos cliente, numeroConta, agencia, saldo que são comuns a ContaCorrente e Poupanca,
  por isso as Contas Corrente e Poupanca herdaram de Conta.

**Abstração:** Habilidade de se concentrar nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais.

**Polimorfismo:** Permite que uma classe ou interface seja usada de várias maneiras, podemos referenciar os métodos de uma classe,
  utilizando o mesmo nome, mas com assinaturas diferentes.

Configurei o **Lombok** no Eclipse, ele deixa o Java menos verboso na questão de que todas as vezes que criarmos uma classe,
que deve ter os atributos como private preferencialmente, o **Lombok** nos poupa o trabalho de criar Getters e Setters
utilizando apenas duas annotations , deixa o código mais limpo com um visual mais agradável. 
Exemplo criação da Classe Banco com annotations que criam automaticamente os Getters e Setters.

@Getter @Setter // as annotations.

public class Banco {

 //atributos
 
	private String nome;
	private List<Conta> contas;

 //contrutor 
 
	public Banco(String nome, List<Conta> contas) {
		
  super(); //chama o construtor da classe pai garantindo sua inicialização correta.
		
  this.nome = nome;
		
  this.contas = contas;
  
	}

//Onde os Getters e Setters ficariam...

}

## 🛠 Tecnologias Utilizadas

- **Java**
- **IDE Spring Tools Suite STS**
- **Lombok:** Biblioteca para redução de boilerplate no código Java.
- **Ferramenta de Build:** Maven (por conta do Lombok para configurar a dependência)
- **Versionamento de Código:** Git
