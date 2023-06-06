import java.util.regex.Pattern;

public class Regex implements IRegex {
    private Pattern pattern;

    public Regex(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean regexx(String input) {
        // Como Foi dito em sala Mathes com S é validação e com  R é Pesquisa
        // O retorno será uma busca pelos Inputs e vai validar se é ou n uma expressão
        return pattern.matcher(input).matches();
    }
    
}
