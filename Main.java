public class Animalcachorro {
    private String nome;
    private int idade;

    public Animalcachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Animalcachorro cachorro = new Animalcachorro("Dourado", 2);
        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Idade do cachorro: " + cachorro.getIdade());

        
        cachorro.setNome("Betta");
        cachorro.setIdade(1);

        System.out.println("\nNovo nome do cachorro: " + cachorro.getNome());
        System.out.println("Nova idade do cachorro: " + cachorro.getIdade());
    }
}
