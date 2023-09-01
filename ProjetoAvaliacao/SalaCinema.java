class SalaCinema {
    private int numero;
    private int capacidade;
    private Filme filmeEmExibicao;

    public SalaCinema(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.filmeEmExibicao = null;
        
    }

    public void exibirFilme(Filme filme) {
        if (filmeEmExibicao == null) {
            filmeEmExibicao = filme;
            System.out.println("Filme em exibição na Sala " + numero + ": " + filme);
        } else {
            System.out.println("Já existe um filme em exibição na Sala " + numero + ".");
        }
    }

    public void encerrarFilme() {
        if (filmeEmExibicao != null) {
            System.out.println("Encerrando o filme na Sala " + numero + ": " + filmeEmExibicao.getTitulo());
            filmeEmExibicao = null;
        } else {
            System.out.println("Nenhum filme em exibição na Sala " + numero + ".");
        }
    }
}