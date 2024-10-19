public class SistemaIbge {
    public static void main(String[] args) { // método main
        for (Contar e : Contar.values()) { // Contar passa a ser "e", ":" -> igual
            // System.out.println(e.getSigla() + " - " + e.getNome());
        }
        Contar eb = Contar.PARANA; // eb passa a representar o Contar
        // vou imprimir informações de estado

        // Lembrando que "eb" passou a ser o Contar que é a classe

        System.out.println(eb.getNome()); // imprime o nome do estadp
        System.out.println(eb.getSigla()); // imprime a sigla do estadp
        System.out.println(eb.getNomeMaiusculo()); // imprime a nome maiusculo do estado
        System.out.println(eb.getIbge());
    }
}
