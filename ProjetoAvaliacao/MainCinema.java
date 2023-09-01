public class MainCinema {
    public static void main(String[] args) {
        Filme movie1 = new Filme("Besouro Azul", "Aventura", 127);
        Filme movie2 = new Filme("A Freira 2", "Terror", 110);
        Filme movie3 = new Filme("Jogos Vorazes: A Cantiga dos Pássaros e...", "Ação/Aventura", 165);
        
        

        SalaCinema movieTheater1 = new SalaCinema(1, 55);
        SalaCinema movieTheater2 = new SalaCinema(2, 45);
        SalaCinema movieTheater3 = new SalaCinema(3, 40);
        SalaCinema movieTheater4 = new SalaCinema(4, 60);
        
        System.out.println();
        movieTheater1.exibirFilme(movie1 );
        movieTheater2.exibirFilme(movie2 );
        movieTheater3.exibirFilme(movie1 );
        movieTheater4.exibirFilme(movie3 );
        

        System.out.println();
        movieTheater1.encerrarFilme();
        movieTheater2.encerrarFilme();
    }
}