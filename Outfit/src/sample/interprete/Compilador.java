package sample.interprete;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import static sample.interprete.TiposToken.*;

public class Compilador {
    //String texto="";
    private TextArea consola;
    private VBox pane;
    public Compilador (TextArea tx, VBox pane){

        this.consola=tx;
        this.pane=pane;
    }
    public boolean compliar (String renglon){
        boolean errores=false;
        if (renglon.contains("print")){
            int f1=renglon.indexOf('(')+1;
            int f2=renglon.length()-1;
            String texto=renglon.substring(f1,f2);
            this.consola.appendText("\n "+texto);
        }else if (renglon.contains("declarar")){
            String[] arreglo=renglon.split(" ");
            if (!validar(arreglo[1].trim())){
                String tipoToken="";
                if (arreglo[3].equals("camiseta")) {
                    tipoToken = CAMISETA;
                }else{
                    tipoToken = PANTALON;
                }

                Token token=new Token(tipoToken,"chica",arreglo[1].trim());
                arrayToken.add(token);


            }else{
                this.consola.appendText("\n la variable con el nombre"+ arreglo[1]+" ya esta declarada");
            }

        }else if (renglon.contains("combinar")){
            int f1=renglon.indexOf('(')+1;
            int f2=renglon.length()-1;
            String texto=renglon.substring(f1,f2).trim();
            if (validar(texto)){

                Token t1=buscarToken(texto);
                System.out.println(t1.getTipo());
                System.out.println(t1.getTalla());
                System.out.println(t1.getColor());
                Label label=new Label("Combinando las "+t1.getTalla()+" camisetas");
                pane.getChildren().add(label);

            }else {
                this.consola.appendText("\n la ropa con el nombre"+texto+" no esta declarado");
            }
            this.consola.appendText("\n "+texto);
        }
        return errores;
    }
    public boolean validar(String nombre){
        boolean existe=false;
        for (int x=0; x<arrayToken.size();x++){
            if (arrayToken.get(x).getTipo().equals(nombre)){
                existe=true;
            }
        }
        return existe;
    }
    public Token buscarToken(String nombre){
        Token existe=null;
        for (int x=0; x<arrayToken.size();x++){
            if (arrayToken.get(x).getTipo().equals(nombre)){
                return arrayToken.get(x);
            }
        }
        return existe;
    }
}
