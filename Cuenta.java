public class Cuenta {
    //Metodo construtor
        private String titular;
        private double cantidad;
        //METODOS CONSTRUCUTOR: SOBRECARGAR DE METODOS
    public Cuenta(String tit){
        titular=tit;
        cantidad=0;
    }
    public Cuenta(String tit,double cantInicial){
        titular=tit;
        cantidad=cantInicial;
    }
    //metodos
    //GETTERS Y SETTERS DE TITULAR
    public String darTitulo(){
        return titular;
    }
    public void dameTitular(String NuevoTitulo){
        titular=NuevoTitulo;
    }
    //GETTERS Y SETTERS DE CANTIDAD
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setTitular(String tit){
        titular=tit;
    }
    public void setCantidad(double cant){
        cantidad=cant;
    }
    public void ingresar(double cant){
        if (cantidad>=0){
            cantidad+=cant;
        }
    }
    public void retirar(double cant){
        if (cant>cantidad){
            cantidad=0;
        }else{
            cantidad-=cant;
        }
    }


}
