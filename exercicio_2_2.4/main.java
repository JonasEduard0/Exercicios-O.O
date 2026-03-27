public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Livro A", "Autor A", 100);
        Livro l2 = new Livro("Livro B", "Autor B", 200);
        Livro l3 = new Livro("Livro C", "Autor C", 300);

        Livro.NomeDaBiblioteca = "Biblioteca Central";

        System.out.println("ANtes:");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        // alterando o static
        Livro.NomeDaBiblioteca = "Biblioteca Nova";

        System.out.println("Depois :");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}

//O atributo static pertence à classe Livro e não aos objetos dela. Ñão existe um NomeDaBiblioteca por objeto existe só um valor pra todos