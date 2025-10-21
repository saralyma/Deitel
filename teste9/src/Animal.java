public class Animal {

    private String nomeCientifico;
    private String corDosOlhos;
    private String tamanho;
    private String especie;
    private double peso;
    private String habitat;

    //incluir um atributto protect

    protected String nrDocumento; // atributo protegido



 // **NOVO CONSTRUTOR COM PARÂMETROS:** Permite inicializar os atributos do pai
        public Animal(String nomeCientifico, String corDosOlhos, String tamanho, String especie, double peso, String habitat) {
        this.nomeCientifico = nomeCientifico;
        this.corDosOlhos = corDosOlhos;
        this.tamanho = tamanho;
        this.especie = especie;
        this.peso = peso;
        this.habitat = habitat;
    }

    protected Animal(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public Animal(String corDosOlhos, String tamanho, String especie) {
        this.corDosOlhos = corDosOlhos;
        this.tamanho = tamanho;
        this.especie = especie;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    protected String getNrDocumento() {
        return nrDocumento;
    }

    protected void setNrDocumento(String nrDocumento) {
        // Podemos adicionar alguma validação aqui antes de salvar
        if (nrDocumento != null && nrDocumento.length() > 5) {
            this.nrDocumento = nrDocumento;
        }
    }


    public void emitirSom() {
        System.out.println("O animal emite um som. (Superclasse)");
    }

    public void  dormir() {
        System.out.println("O animal está dormindo. (Superclasse)");
    }

    public void comer() {
        System.out.println("O animal está comendo. (Superclasse)");
    }

    protected void exibirDocumentoProtegido() {
        System.out.println("Número de documento do Animal (acesso protected): " + this.nrDocumento);
    }
}
