package herancas;


public class Ninja {
    String nome;
    int idade;
    String missao;
    char rankMissao;
    String statusMissao;

    public Ninja() {
    }


    public Ninja(String nome, int idade, String missao, char rankMissao, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.rankMissao = rankMissao;
        this.statusMissao = statusMissao;

    }

    public String toString() {
        return "nome: " + nome+
                ", idade: " + idade +
                ", missao: " + missao +
                ", rankMissao(" + rankMissao+ ")"+
                ", statusMissao: " + statusMissao;
    }
}
