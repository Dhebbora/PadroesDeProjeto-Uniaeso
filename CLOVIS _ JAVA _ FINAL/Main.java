public class Main {
    public static void main(String[] args) {

        // USANDO O INTERPRETER COM O SINGLETON
        Tradutor tradutor = Tradutor.getInstance();
        
        System.out.println("---------------------------------------- Exemplo 1");
        // LISTA DE EXPRESSÃO
        Expressao[] expressaos = {
            new Frases("Hi, Clóvis!"),
            new Frases("I'm working on your activity"),
            new Frases("I hope it turns out well"),
            new Frases("Home"),
        };

        for (Expressao expressao : expressaos) {
            String traducaoPalavra = expressao.interpret(tradutor);
            System.out.println(traducaoPalavra);
        }


        // INSTANCIANDO O REGEX
        IRegex iregex = new Regex("\\d+");
        IRegex iregexs = new Regex("\\d{4}-\\d{3}");


        System.out.println("");
        System.out.println("---------------------------------------- Exemplo 2");

       
        
        // TESTE COM EXPRESSÕES REGULARES
        String input = "12345";
        boolean result = iregex.regexx(input);
        System.out.println("A Entrada de dados:  '" + input + "', é umma expressão regular: " + result);

        String input2 = "18plo";
        boolean result2 = iregex.regexx(input2);
        System.out.println("A Entrada de dados:  '" + input2 + "', é umma expressão regular: " + result2);
    
        String input3 = "8545-222";
        boolean result3 = iregexs.regexx(input3);
        System.out.println("A Entrada de dados:  '" + input3 + "', é umma expressão regular: " + result3);
        
        System.out.println("------------------------------------------------------------");

    }
}