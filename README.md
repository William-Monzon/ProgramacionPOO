# Programación Orientada a Objetos
Este repositorio es utilizado para aprender sobre la programación orientada a objetos utilizando el lenguaje de programación java. En la clase `main` se llama a todas las demás clases y se realiza la ejecución.
### Type Casting
El `Type Casting` es cuando convierte un tipo de dato a otro tipo de dato, por ejemplo convertir un int a double o viceversa.
### Packages
Los `packages` utilizados por ahora son 2 y en el archivo main importo un `packages` para utilizar la clase dentro de ese paquete.
### Enum
El `Enum` guarda constantes, osea que no pueden cambiar, y se utiliza cuando es usuario quiere saber en este caso una pizza grande, mediana o pequeña. En la clase main pido una pizza pequeña.
### Initializer Block
En esta clase inicializo el Bloque de Inicialización estatico y el bloque de inicialización de instancias en el cual el bloque estático se ejecuta solo una vez y antes el método `main` mientras que el bloque de instancia se inicializa después del `main` y se puede ejecutar más de una vez.
### Pass Value/Pass Reference 
En la clase paso dos valores por referencia, esto quiere decir que las variables que cambio, también realizan el cambio en las variables originales, por eso las variables toman la referencia de las originales. Minetras que en el paso por valor solo hago una copia de las originales sin modificarlas.
### Exception Handling
En esta clase con la palabra `throws` anuncio que el programa tendrá una excepción, mientras que con `throw` lanzó la excepción que en este caso es cuando el númeor ingresado es mayor a 100. Todo lo evaluó en un `try-catch`.
### Encapsulation
En la encapsulación utilice los getters and setters para poder ingresar o cambiar datos de los atributos `private` e imprimirlos en el `Main`.
### Inheritance
En la herencia hice que las clases hijas `Carro` y `Camion` hereden los atributos y métodos de la clase padre `Vehiculo`. En cada clase hija sobreescribe los metodos colocando a cada métod el `@Override` para que se sepa que están sobreescritos. En el main instacié las clase y probe el Upcasting and Downcasting con las tres clases, en este último arroje una excepción para saber si el objeto `vehiculo` es un carro, pero como antes se habia dicho que `vehiculo` es un camion, lanza la excepción.
### Polymorphism
Utilice la clase padre `Figura` y las clases hija `Rectangulo`, `Circulo` y `Cuadrado`, al instanciar `rectangulo` lo hice como referencia de tipo `Figura` pero el objeto en si es un rectangulo. Al igual que con rectangulo con las otras instancias hice lo mismo. Para saber siuna variable es instancia dede alguna clase utilice el `instanceof`.