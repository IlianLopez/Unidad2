package sample.interprete;

public class Token {
    private String tipo;
    private String talla;
    private String color;

    public Token(String tipo, String talla, String color) {
        this.tipo = tipo;
        this.talla = talla;
        this.color = color;
    }

    public Token(String tipoToken, String s) {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
