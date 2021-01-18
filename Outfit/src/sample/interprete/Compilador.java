package sample.interprete;

import javafx.scene.control.TextArea;

import static sample.interprete.TiposToken.*;

public class Compilador {
    //String texto="";
    private TextArea consola;
    public Compilador (TextArea tx){
        this.consola=tx;
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

                Token token=new Token(tipoToken,arreglo[1].trim());
                arrayToken.add(token);


            }else{
                this.consola.appendText("\n la variable con el nombre"+ arreglo[1]+" ya esta declarada");
            }

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
}
