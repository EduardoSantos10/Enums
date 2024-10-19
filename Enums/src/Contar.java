public enum Contar {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANIERO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piaui", 13),
    MARANHAO("MA", "Maranhao", 14),
    PARANA("PR", "Parana", 15);

    // ENUMS -> não são variaveis e sim, objetos pré estabelecidos.
    private String nome;

    private String sigla;

    private int ibge;

    // Construtor
    private Contar(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;

    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase(); // vai me retornar em letras maiusculas
    }
}
