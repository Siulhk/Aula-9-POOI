package livraria.unicentro;

public class AppLivros {
    public static void main(String[] args){
        Livros[] livros = new Livros[3];

        livros[0] = new Livros("No Longer Human","Osamu Dazai",1938);
        livros[1] = new Livros("Hamlet","Willian Shakespeare", 1603);
        livros[2] = new Livros("Frankenstein","Mary Shelley",1818);

        for (Livros f:livros){
            System.out.println(f.getTitulo());
            System.out.println(f.getAutor());
            System.out.println(f.getAnoPublicacao());
            System.out.println();
        }
    }
}
