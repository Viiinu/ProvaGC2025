public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponivel";
        }
        return "Disponivel";
    }

    public static void main(String[] args) {
        Livro livroUm = new Livro();
        livroUm.titulo = "Java para iniciantes";
        System.out.println(livroUm.status());
        livroUm.emprestar();
        System.out.println(livroUm.status());
    }
}
