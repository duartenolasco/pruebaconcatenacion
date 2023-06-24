
package concatenarnumeros;

public class padre {
    //atributos
    public String nombredePropietario;
    protected String numerodeSerie;
    private String color;

    public padre(String nombredePropietario, String numerodeSerie, String color) {
        this.nombredePropietario = nombredePropietario;
        this.numerodeSerie = numerodeSerie;
        this.color = color;
    }

    public String getNombredePropietario() {
        return nombredePropietario;
    }

    public void setNombredePropietario(String nombredePropietario) {
        this.nombredePropietario = nombredePropietario;
    }

    public String getNumerodeSerie() {
        return numerodeSerie;
    }

    public void setNumerodeSerie(String numerodeSerie) {
        this.numerodeSerie = numerodeSerie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero + segundoNumero + tercerNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero - segundoNumero - tercerNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero * segundoNumero * tercerNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double primerNumero){
        return Math.sqrt(primerNumero);
    }
    
    public boolean esPrimo(int primerNumero){
        boolean primo = false;
        int contador = 0;
        for(int i = primerNumero; i > 0; i--){
            if(primerNumero % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    } 
    
}
