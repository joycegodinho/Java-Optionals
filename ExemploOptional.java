package optionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println("Método isPresent()");
        System.out.println(optionalString.isPresent()); //true

        System.out.println();
        System.out.println("Método isEmpty()");
        System.out.println(optionalString.isEmpty()); //false

        System.out.println();
        System.out.println("Método ifPresent()");
        optionalString.ifPresent(System.out::println); //Valor opcional

        System.out.println();
        System.out.println("Método ifPresentOrElse()");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente")); //Valor opcional
        // Valor opcional

        System.out.println();
        System.out.println("If - Método isPresent() + get()");
        if (optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println(valor);
        } //Valor opcional

        System.out.println();
        System.out.println("map (valor) - Método ifPresent()");
        optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);
        //Valor opcional*****

        System.out.println();
        System.out.println("Método orElseThrow(IllegalStateException::new)");
        System.out.println(optionalString.orElseThrow(IllegalStateException::new));
        //Valor opcional
    }
}
