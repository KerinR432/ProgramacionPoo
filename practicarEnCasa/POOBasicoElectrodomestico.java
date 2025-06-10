package practicarEnCasa;

public class POOBasicoElectrodomestico {
    private double precioBase;
    private  String color;
    private  char consumoElectricidad;
    private double peso;
    private final String C_B = "Blanco";
    private final char energiaDefault = 'F';
    private final double precioDefault = 100;
    private  final double pesoDefault = 5;

    public POOBasicoElectrodomestico(){
        this.color = C_B;
        this.precioBase = precioDefault;
        this.consumoElectricidad = energiaDefault;
        this.peso = pesoDefault;
    }

    public POOBasicoElectrodomestico (double precio,double peso){
        this.color = C_B;
        this.precioBase = precio;
        this.consumoElectricidad = energiaDefault;
        this.peso = peso;
    }
    public POOBasicoElectrodomestico (String color,double precio,char energia,double peso){
        this.color = color;
        this.precioBase = precio;
        this.consumoElectricidad = energia;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoElectricidad() {
        return consumoElectricidad;
    }

    public void comprobarConsumoEnergetico(char letra){
        String letras = "ABCDEF";
        if (letras.contains(letras)){
            consumoElectricidad = letra;
        }else{
            consumoElectricidad = energiaDefault;
        }
    }

    public void comprobarColor(String color){
        String colores = "BLANCO,NEGRO,ROJO,AZUL,GRIS";
        color.toUpperCase();
        if (color.contains(colores)){
            this.color = color;
        }else{
            this.color = C_B;
        }
    }

    public double consumeEnergia(char energia,double precio){
        switch (energia){
            case 'A':
                return precio += 100;
            case 'B':
                return precio+= 80;
            case 'C':
                return precio+=60;
            case 'D':
                return precio+=50;
            case 'E':
                return precio+=30;
            case 'F':
                return precio+=10;
            default:
                return precio = precio;
        }
    }

    public void precioFinal(){
        if (peso > 0 && peso <=19){
            precioBase+=consumeEnergia(consumoElectricidad,precioBase);
            precioBase+=10;
        }

        if (peso >= 20 && peso <=49){
            precioBase+=consumeEnergia(consumoElectricidad,precioBase);
            precioBase+=50;
        }
        if (peso >= 50 && peso <=79){
            precioBase+=consumeEnergia(consumoElectricidad,precioBase);
            precioBase+=80;
        }

        if (peso > 80){
            precioBase+=consumeEnergia(consumoElectricidad,precioBase);
            precioBase+=100;
        }
    }
}
