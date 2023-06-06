import java.util.HashMap;
import java.util.Map;

// Classe USando SINGLETON
public class Tradutor {
    private static Tradutor instance;

    // O MAP é uma Interface, usada para armazenar pares de chaves e valor 
    private Map<String, String> traduzindo;

    private Tradutor() {
        // Usando O HashMap<>() que é uma implementacao do MAP 
        traduzindo = new HashMap<>();
        
        traduzindo.put("Hi, Clóvis!", "Oi, Clóvis");
        traduzindo.put("I'm working on your activity", "Estou trabalhando na sua atividade");
        traduzindo.put("I hope it turns out well", "Espero que fique bom");
    }


    // CRIANDO A ÚNICA INSTANCIA
    public static Tradutor getInstance() {
        if (instance == null) {
            instance = new Tradutor();
        }
        return instance;
    }

    public String traducao(String frase) {
        // O método getOrDefault(Object key, V defaultValue) da interface
        // Map , implementado pela classe HashMap, é usado para obter o
        // valor mapeado com a chave especificada. Se nenhum valor for mapeado
        // com a chave fornecida, o valor padrão será retornado.
        return traduzindo.getOrDefault(frase, "Ops, essa tradução não existe, adicione na class Tradutor");
    }

}
