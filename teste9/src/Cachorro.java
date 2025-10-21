//o Nosso Código: Um Cachorro é um Animal. Um Gato é um Animal.
//
//Conceito: A subclasse é uma especialização da superclasse.
//Tudo que um Animal pode fazer (dormir, emitir som, comer),
// um Cachorro também pode fazer (e, geralmente, faz de um jeito mais específico).
//



public class Cachorro extends Animal {
    // para entender a sobreclasse
    private String nome;
    private boolean orelhasCortadas;
    private String raca;


    // Construtor do Cachorro
    // A assinatura do Cachorro é completa, incluindo o nrDocumento
    public Cachorro(String nome, boolean orelhasCortadas, String raca,
                    String nomeCientifico, String corDosOlhos, String tamanho,
                    String especie, double peso, String habitat , String nrDocumento)
    {
        // 1. PRIMEIRA E ÚNICA CHAMADA SUPER (obrigatória)
        // Chama o construtor do Animal com 6 parâmetros (o que existe na classe Animal)
        super(nomeCientifico, corDosOlhos, tamanho, especie, peso, habitat );

        // 2. INICIALIZAÇÃO DO ATRIBUTO PROTECTED (usando o setter protected do pai)
        // Como o super() já foi chamado, podemos usar o setter protegido.
        // O setter 'protected' está acessível aqui porque Cachorro é Subclasse de Animal.
        super.setNrDocumento(nrDocumento);

        // 3. Inicialização dos atributos próprios do Cachorro
        this.nome = nome;
        this.orelhasCortadas = orelhasCortadas;
        this.raca = raca;
    }







    // Métodos de Comportamento

    // SOBRESCRITA (Override) - O método padrão sem parâmetros

    @Override
    public void comer() {
        System.out.println("O Cachorro está comendo coisas quentes e de humanos . (Subclasse)");
    }

    // SOBRECARGA (Overload) - O método que você queria com o super.comer()
    // Você NÃO pode ter `@Override` aqui, e a assinatura DEVE ser diferente!
    // Assinatura: comer(boolean incluirComidaAnimalGenerica)


    public void comer(boolean incluirComidaAnimalGenerica) {
        if (incluirComidaAnimalGenerica) {
            super.comer(); // Chama o método comer() da Superclasse Animal
        }
        System.out.println("O Cachorro está comendo coisas quentes e de humanos . (Subclasse)");
    }

    // Outra SOBRECARGA (mantendo seu exemplo original)
    // Assinatura: comer(int quantidade)


    public void comer(int quantidade) {
        System.out.println("O Cachorro comeu " + quantidade + " porções de algo. ");
    }


    public void exibirDocumentoProtegido() {
        // Acesso direto ao atributo 'protected' herdado
        System.out.println("O número de documento do Cachorro (acesso protected): " + this.nrDocumento);
    }

    // Método para mostrar as características pessoais

    public void exibirCaracteristicas() {
        String estadoOrelhas = this.orelhasCortadas ? "Sim" : "Não";
        System.out.println("Características do Cachorro: ");
        // Acessamos a cor dos olhos do pai (Animal) através do getter
        System.out.println(" - Cor dos olhos: " + super.getCorDosOlhos());
        System.out.println(" - Orelhas cortadas: " + estadoOrelhas);
    }
}