package PracticaExamenOrdinaria;

public class cuenta {
    private String titular  = "";
    private double cantidad = 0;

     public cuenta(String titular){
          this.titular = titular;
          this.cantidad = 0;

     }

     public String dameTitular(){
         return titular;
     }
     public void setTitular(String titular){
         this.titular = titular;
     }

    public double dameCantidad(){
        return cantidad;
    }
    public void seCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public void Ingresar(double ingreso){
         if (ingreso < 0){
             System.out.println("no puedes introducir una cantidad negativa");
         }else{
             this.cantidad += ingreso;
         }
    }

    public void retirar(double retirar){
         double rsdo =cantidad- retirar;
         if (rsdo < 0){
             this.cantidad = 0;
         }else{
             this.cantidad = rsdo;
         }
    }

    @Override
    public String toString() {
        return "cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }


}
