package Aula.construtor;

public class Pessoa { //atributos
    private String nome;
    private Integer idade;


    public Pessoa(){
    } //construtor vazio

    public Pessoa(String nome, int idade){   //construtor com parametros
    this.nome = nome;
    this.idade = idade;
    }
    public String exibirDados(){    //metodo do tipo String para exibir os dados atravez do return
       return "Nome: " + nome + " | Idade: " + idade;
    }
}