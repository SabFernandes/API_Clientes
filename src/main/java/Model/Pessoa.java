package Model;
import java.util.List;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String cpf;
    //private List<Contato> contato;
    //private List<Endereco> endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf) {
        //, List<Contato> contato, List<Endereco> endereco

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        //this.contato = contato;
        //this.endereco = endereco;
    }

}

