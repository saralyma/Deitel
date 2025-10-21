public class TestAnimal2 {


    // MÉTODO: Aceita um Animal e um Cachorro
    public static void  comunicarAnimal(Animal animal ,Cachorro cachorro) {

        System.out.println("--- NOVO MÉTODO DE COMUNICAÇÃO ---");
        System.out.println("Espécie: " + animal.getEspecie());

        animal.emitirSom();
        animal.comer();

        // Testando as Sobrecargas do Cachorro
        cachorro.comer();
        cachorro.comer(true);
        cachorro.comer(3);

        animal.dormir();

        // =======================================================
        // === NOVO TESTE PARA MOSTRAR O DADO PROTECTED ===
        // =======================================================
        System.out.println("\n--- DADO PROTEGIDO (Acesso Indireto) ---");
        // O Cachorro (Subclasse) expõe o dado que ele consegue acessar:
        cachorro.exibirDocumentoProtegido(); // <-- É ASSIM QUE CONSEGUIMOS!


        // =======================================================
        // === NOVO TESTE PARA MOSTRAR O DADO PROTECTED ===
        // =======================================================
        System.out.println("\n--- DADO PROTEGIDO (Acesso Indireto) ---");
        // O Cachorro (Subclasse) expõe o dado que ele consegue acessar:
        animal.exibirDocumentoProtegido(); // <-- É ASSIM QUE CONSEGUIMOS!
    }

    public static void main(String[] args) {

        // 1. Instanciando o Cachorro (Subclasse) - CORRIGIDO O CONSTRUTOR!
        Cachorro meuCachorro = new Cachorro(
                "Bolt", true, "Labrador", "Canis familiaris", "Castanhos",
                "Grande", "Cachorro", 30.5, "Doméstico",
                "DOC-BOLT-456" // <--- NOVO ARGUMENTO
        );

        // 2. Instanciando o Animal (Superclasse) - CORRIGIDO O CONSTRUTOR!
        Animal animalGenerico = new Animal(
                "Homo Sapiens", "Verdes", "Medio", "Humano",
                75.0, "Urbano"
                
        );

        System.out.println("\n==================================================");
        System.out.println("        Demonstração de Polimorfismo Aplicado");
        System.out.println("==================================================");

        // Chamada 1: Passando o Animal Genérico E o Cachorro - CORRIGIDO A CHAMADA!
        comunicarAnimal(animalGenerico, meuCachorro);

        System.out.println("\n--------------------------------------------------");

        // Chamada 2: Passando o Cachorro como Animal E como Cachorro - CORRIGIDO A CHAMADA!
        comunicarAnimal(meuCachorro, meuCachorro);
    }
}