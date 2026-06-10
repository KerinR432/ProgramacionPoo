# Apuntes rapidos para el examen de POO en Java

Estos apuntes estan pensados para repasar rapido y entender lo importante sin perderse en teoria innecesaria.

## 1. Que es la POO

POO significa Programacion Orientada a Objetos.

La idea principal es representar el programa como si estuviera formado por objetos del mundo real.

- Una clase es la plantilla.
- Un objeto es una instancia real de esa clase.
- Los atributos guardan datos.
- Los metodos definen lo que el objeto puede hacer.

Ejemplo mental:

- Clase: `Cuenta`
- Objeto: la cuenta de Ana
- Atributos: titular, cantidad
- Metodos: ingresar, retirar

## 2. Clase, objeto, atributos y metodos

Ejemplo del repositorio: `Cuenta.java` y `Person.java`.

```java
public class Cuenta {
    private String titular;
    private double cantidad;

    public void ingresar(double cant) {
        cantidad += cant;
    }
}
```

Que debes saber explicar:

- `class` crea una clase.
- `private` protege los atributos.
- `public` permite usar el metodo desde fuera.
- Para crear un objeto se usa `new`.

```java
Cuenta c1 = new Cuenta("Ana", 1000);
```

## 3. Constructor

El constructor sirve para inicializar el objeto cuando se crea.

Se reconoce porque:

- Tiene el mismo nombre que la clase.
- No tiene tipo de retorno.

Ejemplo:

```java
public Cuenta(String tit, double cantInicial) {
    titular = tit;
    cantidad = cantInicial;
}
```

## 4. Sobrecarga de metodos

Sobrecargar significa tener varios metodos o constructores con el mismo nombre, pero distintos parametros.

Ejemplo claro en `Cuenta.java`:

```java
public Cuenta(String tit) {
    titular = tit;
    cantidad = 0;
}

public Cuenta(String tit, double cantInicial) {
    titular = tit;
    cantidad = cantInicial;
}
```

Idea clave de examen:

- Sobrecarga = mismo nombre, distinta firma.
- Se decide en compilacion.

## 5. Encapsulacion

Encapsular es ocultar los datos internos del objeto y permitir el acceso controlado mediante metodos.

Por eso casi siempre los atributos se ponen `private`.

Luego se usan getters y setters:

```java
public String getTitular() {
    return titular;
}

public void setTitular(String tit) {
    titular = tit;
}
```

Por que es importante:

- Evita cambios incorrectos desde fuera.
- Permite validar antes de modificar un dato.
- Hace el codigo mas seguro y mantenible.

## 6. La palabra `this`

`this` se usa para referirse al objeto actual.

Sirve mucho cuando el parametro y el atributo se llaman igual.

```java
public void setPeso(double peso) {
    this.peso = peso;
}
```

Significa: el `peso` del objeto actual toma el valor del parametro `peso`.

## 7. Atributos y metodos `static`

`static` significa que pertenece a la clase, no a cada objeto.

Ejemplo del repositorio: `Person.java`

```java
private static int id_sig = 1;
```

Esto hace que todos los objetos `Person` compartan la misma variable, util para generar identificadores.

Regla facil:

- No estatico: cada objeto tiene su copia.
- Estatico: todos comparten la misma.

## 8. Herencia

Herencia significa que una clase hija reutiliza atributos y metodos de una clase padre.

Se usa con `extends`.

Ejemplo del proyecto: en la clinica veterinaria hay una clase `Animal` y luego clases hijas como `Perro`, `Gato`, `Pajaro` o `Reptiles`.

Ventajas:

- Reutilizar codigo.
- Evitar repetir atributos comunes.
- Organizar mejor el programa.

Ejemplo tipico:

```java
public class Perro extends Animal {
}
```

## 9. Clase abstracta

Una clase abstracta no se puede instanciar directamente.

Se usa como base comun para otras clases.

Ejemplo del repositorio: `Animal.java`

```java
public abstract class Animal {
    public abstract String dameDatosAnimal();
}
```

Que significa esto:

- `Animal` define lo comun a todos los animales.
- Cada clase hija esta obligada a implementar `dameDatosAnimal()`.

Si te preguntan la diferencia:

- Clase normal: se puede crear con `new`.
- Clase abstracta: no se puede crear con `new`.

## 10. Polimorfismo

Polimorfismo significa que una referencia del tipo padre puede guardar objetos de distintas clases hijas.

Ejemplo mental:

```java
Animal a = new Perro(...);
Animal b = new Gato(...);
```

Ambos son `Animal`, pero cada uno se comporta como su clase real.

Ventaja principal:

- Puedes trabajar de forma general con objetos distintos.

Esto se usa mucho con colecciones:

```java
ArrayList<Animal> animales = new ArrayList<>();
animales.add(new Perro(...));
animales.add(new Gato(...));
```

## 11. Sobreescritura de metodos

Sobreescribir es redefinir en la clase hija un metodo que ya existia en la clase padre.

Se usa para adaptar el comportamiento.

Ejemplo:

- La clase padre declara `dameDatosAnimal()`.
- Cada hija devuelve sus datos a su manera.

No confundas:

- Sobrecarga: mismo nombre, distintos parametros.
- Sobreescritura: mismo metodo, pero redefinido en la hija.

## 12. Interfaces

Una interfaz define un contrato: dice que metodos debe tener una clase, pero no guarda normalmente el estado del objeto como una clase tradicional.

En el proyecto aparece en `POOAvanzadoUD7/Interfaces`.

Ejemplo de uso:

```java
ArrayList<Comunicador> coms = new ArrayList<Comunicador>();
```

Idea clave:

- Si varias clases saben enviar mensajes, todas pueden implementar la interfaz `Comunicador`.
- Luego las tratas a todas por igual.

Diferencia rapida entre clase abstracta e interfaz:

- Clase abstracta: relacion de herencia fuerte, base comun.
- Interfaz: capacidades que una clase promete cumplir.

## 13. Colecciones: `ArrayList`

Una coleccion sirve para guardar muchos objetos.

La mas usada aqui es `ArrayList`.

Ejemplo del proyecto: `ClinicaVeterinaria.java`

```java
private ArrayList<Animal> lista_animales;
```

Operaciones basicas que debes saber:

```java
lista_animales = new ArrayList<>();
lista_animales.add(animal);
lista_animales.get(0);
lista_animales.size();
```

Recorrerla:

```java
for (Animal animal : lista_animales) {
    System.out.println(animal.getNombre());
}
```

Cuando usar `ArrayList`:

- Cuando no sabes de antemano cuantos elementos vas a guardar.
- Cuando quieres anadir elementos facilmente.

## 14. Excepciones

Las excepciones sirven para controlar errores.

Ejemplo del repositorio: `UsoEdadNoEstaEnRango.java`

```java
public static void validarEdad(int edad) throws ExcepcionEdadNoEstaEnRango {
    if (edad <= 0 || edad >= 100) {
        throw new ExcepcionEdadNoEstaEnRango("Edad fuera de rango");
    }
}
```

Palabras clave fundamentales:

- `try`: bloque donde puede ocurrir el error.
- `catch`: bloque que captura el error.
- `throw`: lanza una excepcion.
- `throws`: avisa de que un metodo puede lanzar una excepcion.

Ejemplo completo:

```java
try {
    validarEdad(-1);
} catch (ExcepcionEdadNoEstaEnRango e) {
    System.out.println(e.getMessage());
}
```

Regla facil para no liarte:

- `throw` lanza.
- `throws` declara.

## 15. Excepciones personalizadas

Una excepcion personalizada se crea cuando el error tiene sentido propio dentro del programa.

Ejemplo tipico:

- Edad no valida.
- Saldo incorrecto.
- Dato obligatorio vacio.

Ventaja:

- El programa es mas claro.
- El error tiene un nombre explicativo.

## 16. Entrada de datos con `Scanner`

`Scanner` permite leer datos desde teclado.

Ejemplo tipico del proyecto:

```java
Scanner scanner = new Scanner(System.in);
int opcion = scanner.nextInt();
String nombre = scanner.nextLine();
```

Cuidado clasico de examen:

- `nextInt()` no consume el salto de linea.
- Si luego usas `nextLine()`, a veces tienes que limpiar la entrada.

## 17. Ficheros: lectura y escritura

En el proyecto se usan `FileReader` y `FileWriter`.

Idea basica:

- `FileWriter`: escribe en un fichero.
- `FileReader`: lee de un fichero.

Ejemplo simplificado:

```java
FileWriter fil = new FileWriter("bloc.txt");
fil.write("Hola");
fil.close();
```

```java
FileReader leer = new FileReader("bloc.txt");
int c;
while ((c = leer.read()) != -1) {
    System.out.print((char) c);
}
leer.close();
```

Siempre recuerda:

- Abrir.
- Leer o escribir.
- Cerrar.

## 18. Interfaces graficas con Swing

En `IinterfacesGraficasUD9` aparecen ejemplos con `JFrame`, `JPanel`, `JButton`, `JTextField` y `JLabel`.

Ejemplo de estructura de una ventana:

```java
public class VentanitaCalculadora extends JFrame implements ActionListener {
}
```

Conceptos basicos:

- `JFrame`: la ventana principal.
- `JPanel`: el contenedor.
- `JButton`: boton.
- `JTextField`: caja de texto.
- `JLabel`: etiqueta.
- `ActionListener`: escucha clics de botones.

Funcionamiento:

1. Creas la ventana.
2. Anades componentes.
3. Registras eventos con `addActionListener(this)`.
4. Programas la respuesta en `actionPerformed`.

## 19. `toString()`

`toString()` sirve para mostrar un objeto en forma de texto.

Ejemplo en `Person.java`:

```java
@Override
public String toString() {
    return "Person{" +
            "dni=" + dni +
            ", nombre='" + nombre + '\'' +
            '}';
}
```

Para que sirve en examen:

- Mostrar datos facilmente.
- Comprobar que el objeto se ha creado bien.
- Hacer mas legible la salida por pantalla.

## 20. `main`

El metodo `main` es el punto de entrada del programa.

```java
public static void main(String[] args) {
}
```

Muchos archivos `Uso...java` del proyecto sirven justo para probar las clases desde `main`.

## 21. Cosas que suelen preguntar en examen

### Diferencia entre clase y objeto

- Clase: modelo o plantilla.
- Objeto: instancia real creada a partir de esa plantilla.

### Diferencia entre atributo y metodo

- Atributo: dato.
- Metodo: accion o comportamiento.

### Diferencia entre sobrecarga y sobreescritura

- Sobrecarga: mismo nombre, distintos parametros.
- Sobreescritura: mismo metodo redefinido en una clase hija.

### Diferencia entre herencia e interfaz

- Herencia: una clase toma estructura y comportamiento de otra.
- Interfaz: una clase se compromete a implementar ciertos metodos.

### Diferencia entre `throw` y `throws`

- `throw`: lanza la excepcion.
- `throws`: avisa en la cabecera del metodo.

## 22. Errores tipicos que debes evitar

- Confundir `=` con `==`.
- Comparar cadenas con `==` en vez de `equals()`.
- Olvidar cerrar ficheros.
- Intentar acceder a atributos `private` directamente desde fuera.
- No inicializar un `ArrayList` antes de usar `add()`.
- Confundir sobrecarga con sobreescritura.
- Olvidar poner `@Override` al redefinir un metodo.
- No capturar o declarar una excepcion.

Muy importante:

- Para comparar `String`, usa `equals()`.
- Para comparar numeros o referencias simples, usa `==` segun corresponda.

## 23. Mini esquema para responder teoria

Si te cae una pregunta teorica, puedes responder asi:

### Encapsulacion

La encapsulacion consiste en ocultar los datos internos de una clase y acceder a ellos mediante metodos publicos, normalmente getters y setters. Se usa para proteger la informacion y controlar los cambios.

### Herencia

La herencia permite que una clase hija reutilice atributos y metodos de una clase padre mediante `extends`. Sirve para evitar repetir codigo y crear jerarquias.

### Polimorfismo

El polimorfismo permite tratar objetos de distintas clases hijas como si fueran del mismo tipo padre, lo que facilita trabajar de manera general y flexible.

### Excepciones

Las excepciones son mecanismos para detectar y controlar errores durante la ejecucion del programa. Se gestionan con `try`, `catch`, `throw` y `throws`.

## 24. Mini ejercicio modelo resuelto en idea

Si te piden hacer una clase sencilla, piensa en este orden:

1. Declarar atributos privados.
2. Hacer constructor.
3. Crear getters y setters si hacen falta.
4. Crear metodos utiles.
5. Si procede, hacer `toString()`.
6. Crear una clase `Uso...` con `main` para probar.

Ejemplo mental:

```java
public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public boolean aprobado() {
        return nota >= 5;
    }
}
```

## 25. Resumen express para memorizar antes de dormir

- Clase = plantilla.
- Objeto = instancia.
- Atributo = dato.
- Metodo = accion.
- Constructor = inicializa el objeto.
- Encapsulacion = proteger datos con `private`.
- Herencia = reutilizar con `extends`.
- Polimorfismo = una referencia padre puede guardar objetos hijos.
- Clase abstracta = base comun que no se instancia.
- Interfaz = contrato de metodos.
- `ArrayList` = coleccion dinamica.
- `try/catch` = controlar errores.
- `throw` = lanzar error.
- `throws` = declarar que puede lanzarse.
- `toString()` = mostrar el objeto como texto.

## 26. Lo mas probable que te entre bien

Si mañana solo puedes repasar lo minimo, estudia esto por orden:

1. Clase, objeto, atributos, metodos.
2. Constructores y sobrecarga.
3. Encapsulacion con getters y setters.
4. Herencia, polimorfismo y abstractas.
5. Interfaces.
6. `ArrayList`.
7. Excepciones.
8. `Scanner`, ficheros y nociones basicas de Swing.

## 27. Truco final para escribir mejor en el examen

Cuando expliques un concepto, intenta usar siempre esta formula:

1. Definicion corta.
2. Para que sirve.
3. Ejemplo breve.

Ejemplo:

"La herencia permite que una clase hija reutilice atributos y metodos de una clase padre mediante `extends`. Sirve para evitar repetir codigo. Por ejemplo, `Perro` puede heredar de `Animal`."

Si quieres, el siguiente paso util es que te prepare tambien un version ultra corta tipo chuleta de 1 pagina o un test de 20 preguntas con respuestas.