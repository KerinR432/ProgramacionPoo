/**
 * Vamos a realizar una clase llamada Raices, donde
 * representaremos los valores de una ecuación de 2º grado.
 * Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
 * Hay que insertar estos 3 valores para construir el objeto.
 * Las operaciones que se podrán hacer son las siguientes:
 * obtenerRaices(): imprime las 2 posibles soluciones
 * obtenerRaiz(): imprime única raíz, que será cuando solo tenga una
 * solución posible.
 * getDiscriminante(): devuelve el valor del discriminante (double), el
 * discriminante tiene la siguiente formula, (b^2)-4*a*c
 * tieneRaices(): devuelve un booleano indicando si tiene dos
 * soluciones, para que esto ocurra, el discriminante debe ser mayor o
 * igual que 0.
 * tieneRaiz(): devuelve un booleano indicando si tiene una única
 * solución, para que esto ocurra, el discriminante debe ser igual que 0.
 * calcular(): mostrara por consola las posibles soluciones que tiene
 * nuestra ecuación, en caso de no existir solución, mostrarlo también.
 * Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
 * Solo varia el signo delante de -bVamos a realizar una clase llamada Raices, donde
 * representaremos los valores de una ecuación de 2º grado.
 * Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
 * Hay que insertar estos 3 valores para construir el objeto.
 * Las operaciones que se podrán hacer son las siguientes:
 * obtenerRaices(): imprime las 2 posibles soluciones
 * obtenerRaiz(): imprime única raíz, que será cuando solo tenga una
 * solución posible.
 * getDiscriminante(): devuelve el valor del discriminante (double), el
 * discriminante tiene la siguiente formula, (b^2)-4*a*c
 * tieneRaices(): devuelve un booleano indicando si tiene dos
 * soluciones, para que esto ocurra, el discriminante debe ser mayor o
 * igual que 0.
 * tieneRaiz(): devuelve un booleano indicando si tiene una única
 * solución, para que esto ocurra, el discriminante debe ser igual que 0.
 * calcular(): mostrara por consola las posibles soluciones que tiene
 * nuestra ecuación, en caso de no existir solución, mostrarlo también.
 * Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
 * Solo varia el signo delante de -b
 */
package POOBasicoUD6;

public class Raices {
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obtenerRaiz() {
        return Math.sqrt(getDiscriminante());
    }

    public double obtenerRaices() {
        return Math.sqrt(getDiscriminante());
    }

    public double getDiscriminante() {
        double solucion = 0;
        solucion = ((Math.pow(b, 2) - 4 * a * c));
        return solucion;
    }

    public boolean tieneRaices() {
        if (getDiscriminante() >= 0) {
            return true;
        }
        return false;
    }

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        }
        return false;
    }

    public String calcular() {
        double solucion1 = 0, solucion2 = 0;
        String soluciones = " ";
        if (tieneRaices()) {
            solucion1 = ((b + obtenerRaices()) / (2 * a));
            solucion2 = ((b - obtenerRaices()) / (2 * a));
        }
        if (tieneRaiz()) {
            solucion1 = ((b + obtenerRaices()) / (2 * a));
            return soluciones += solucion1;
        }
        return soluciones = solucion1 + " " + solucion2;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}

