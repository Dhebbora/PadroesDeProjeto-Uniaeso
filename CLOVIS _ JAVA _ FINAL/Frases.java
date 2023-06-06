class Frases implements Expressao {
    private String frases;

    public Frases(String frases) {
        this.frases = frases;
    }

    // PADRÂO INTERPRETER 
    public String interpret(Tradutor tradutor) { 
        return tradutor.traducao(frases);
    }
}