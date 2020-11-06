package optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        //método of - constroi um optional de acordo com o valor passado
        System.out.println("Método of");
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor Opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));
        //Valor Presente


        //método ofNullable - constroi um optional de acordo com o valor passado, se o valor for null, vai construir um optional vazio
        System.out.println();
        System.out.println("Método ofNullable");

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));
        //null = não está presente

        //método empty - reconstroi um Optional vazio
        System.out.println();
        System.out.println("Método empty");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
        //empty = não está presente

        //método of(null) - Erro
        //System.out.println();
        //System.out.println("Método of(null)");
        //Optional<String> optionalNullErro = Optional.of(null);

        //System.out.println("Valor opcional que lança erro NullPointerException");
        //optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

    }
}
