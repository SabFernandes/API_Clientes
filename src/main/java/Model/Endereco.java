package Model;

public class Endereco {

    private String rua;
    private Integer numero;
    private Integer cep;
    private String uf;
    private String pais;
    public Endereco(){
    }

    public Endereco(String rua, Integer numero, Integer cep, String uf, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.uf = uf;
        this.pais = pais;
    }
}
