package sample.Configs;

import java.util.regex.Pattern;

public class Configs {
    public static final String[] KEYWORDS = new String[] {
            "camiseta", "pantalon", "calcetas", "calcetines", "playera",
            "calzones", "pantalonera", "short", "jogger", "sudadera",
            "sueter", "chaqueta", "falda", "playera de tirantes", "brasier",
            "zapatos", "tennis", "crocs", "pulsera", "reloj",
            "corbata", "cinturon", "tirantes", "sombrero", "gorra",
            "collar", "aretes", "lentes", "anillo", "bolsa",
            "mochila", "audifonos", "monio", "diadema", "liga",
            "rojo", "azul", "amarillo", "verde", "negro",
            "blanco", "naranja", "rosa", "cafe", "morado",
            "gris", "extra chica", "chica", "mediana", "grande",
            "extra grande", "y", "o", "con", "de", "declarar", "como", "print", "combinar",
    };

    public static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    public static final String PAREN_PATTERN = "\\(|\\)";
    public static final String BRACE_PATTERN = "\\{|\\}";
    public static final String BRACKET_PATTERN = "\\[|\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    public static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public static final String sampleCode = String.join("\n", new String[] {
            "print(10)",
            "declarar x como camiseta",
            "combinar (x)",


    });
    public static String[] expresiones ={
            "declarar [a-z]{1,} como camiseta;",
            "declarar [a-z]{1,} como playera;",
            "declarar [a-z]{1,} como short;",
            "declarar [a-z]{1,} como sueter;",
            "declarar [a-z]{1,} como crocs;",
            "declarar [a-z]{1,} como tennis;",
            "declarar [a-z]{1,} como calzones;",
            "declarar [a-z]{1,} como lentes;",
            "declarar [a-z]{1,} como reloj;",
            "declarar [a-z]{1,} como anillo;",
            "print[(][a-z 0-9]{1,}[)]",
            "combinar [(][a-z 0-9]{1,}[)]",
    };
}
