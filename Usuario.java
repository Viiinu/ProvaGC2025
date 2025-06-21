public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }

    public static void main(String[] args) {
        Usuario usuarioNovo = new Usuario("Vini", 19);
        System.out.println(usuarioNovo.nome);
    }
}
