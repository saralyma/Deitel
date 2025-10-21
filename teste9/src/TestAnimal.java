public class TestAnimal
{
    public static void main(String[] args) {

        // 1. Instanciando o Cachorro (Subclasse) - AGORA COM O NR. DOCUMENTO!
        Cachorro meuCachorro = new Cachorro(
                "Bolt", true, "Labrador",
                "Canis familiaris", "Castanhos", "Grande",
                "Cachorro", 30.5, "Doméstico",
                "DOC-BOLT-456" // <--- NOVO PARÂMETRO nrDocumento (7º de herança)
        );

        // 2. Instanciando o Animal (Superclasse) - AGORA COM O NR. DOCUMENTO!
        Animal animalGenerico = new Animal(
                "Homo Sapiens", "Verdes", "Medio",
                "Humano", 75.0, "Urbano"
                
        );

        System.out.println("==================================================");
        System.out.println("        Demonstração de Polimorfismo e Sobrecarga");
        System.out.println("==================================================");

        // --- 1. CHAMADAS DO ANIMAL GENÉRICO (Superclasse) ---
        System.out.println("\n--- ANIMAL GENÉRICO (Comportamento Básico) ---");
        animalGenerico.emitirSom(); // Animal.emitirSom()
        animalGenerico.dormir();    // Animal.dormir()
        animalGenerico.comer();     // Animal.comer() (versão Superclasse)


        // --- 2. CHAMADAS DO CACHORRO (Sobrescrita e Sobrecarga) ---
        System.out.println("\n--- CACHORRO (Comportamento Sobrescrito e Sobrecarga) ---");

        // 2.1. Sobrescrita do Método (Override)
        System.out.print("Cachorro - Comer Padrão: ");
        meuCachorro.comer();

        // 2.2. Sobrecarga 1 (Overload) - Usa 'super.comer()'
        System.out.print("Cachorro - Comer C/ Super: ");
        meuCachorro.comer(true);

        // 2.3. Sobrecarga 2 (Overload)
        System.out.print("Cachorro - Comer C/ Porção: ");
        meuCachorro.comer(5);

        // 2.4. Outros Métodos Sobrescritos
        System.out.print("Cachorro - Dormir: ");
        meuCachorro.dormir();

        System.out.print("Cachorro - Som: ");
        meuCachorro.emitirSom();

        // 2.5. Método que Acessa a Superclasse
        System.out.println("\n--- CACHORRO (Características Herdadas) ---");
        meuCachorro.exibirCaracteristicas(); // Usa super.getCorDosOlhos()

        // =================================================================
        // === NOVO TESTE: Acesso ao Atributo PROTECTED ===
        // =================================================================
        System.out.println("\n--- TESTE DE ACESSO PROTECTED ---");

        // Chamando o método que o Cachorro tem para mostrar o atributo PROTECTED herdado:
        meuCachorro.exibirDocumentoProtegido();

        // Nota: A linha abaixo ainda daria erro, provando a proteção:
        // System.out.println(meuCachorro.nrDocumento);
    }
}