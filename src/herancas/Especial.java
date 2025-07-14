package herancas;

public class Especial extends Ninja {
    String ataqueEspecial;
    public Especial (String nome, int idade, String missao, char rankMissao, String statusMissao,String ataqueEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.rankMissao = rankMissao;
        this.statusMissao = statusMissao;
        this.ataqueEspecial = ataqueEspecial;

    }

    public String toString() {
        return "nome: " + nome+
                ", idade: " + idade +
                ", missao: " + missao +
                ", rankMissao(" + rankMissao+ ")"+
                ", statusMissao: " + statusMissao+
                ", ataque especial: "+ataqueEspecial;
    }
}

