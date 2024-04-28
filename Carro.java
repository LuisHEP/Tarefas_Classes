// Classe que representa um objeto do mundo real: Carro
public class Carro {

    // Propriedades do carro
    private final String modelo;
    private final String cor;
    private final int anoFabricacao;

    // Construtor para inicializar as propriedades do carro
    public Carro(String modelo, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    // Método para desligar o carro
    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    // Método principal para testar a classe Carro
    public static void main(String[] args) {

    // Criando um objeto Carro
    Carro meuCarro = new Carro("Fusca", "Azul", 2000);

    // Exibindo informações do carro
    meuCarro.exibirInformacoes();

    // Ligando o carro
    meuCarro.ligar();

    // Desligando o carro
    meuCarro.desligar();
    }
}
