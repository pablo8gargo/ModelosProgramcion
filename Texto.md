# Patrones de Diseño


## Decorator

El patrón **Decorator** se usa cuando queremos **agregar funcionalidades o comportamientos adicionales a un objeto** sin modificar su estructura o heredar de su clase directamente. Es un **patrón estructural** que permite componer objetos de forma flexible, apilando “decoradores” (clases envolventes) que agregan comportamiento.


### Componentes del patrón:

- **Componente (abstracto)**: define la interfaz común para los objetos que pueden tener decoradores o accesorios adicionales.
  → En este caso es la clase abstracta `Car`, que define el método `cost()` y `getDescription()`.

- **Componente concreto**: clases a las que se les puede añadir comportamiento dinámicamente.
  → Ej: `VibrantMT`, `ZenithMT`, `GTLine`.

- **Decorator (abstracto)**: extiende la clase `Car` y define metodos para los decoradores o accesorios concretos
  → Es la clase `AccessoryDecorator`, que hereda de `Car`.

- **Decorators concretos**: clases de accesorios que **añaden comportamiento concreto**.  
  → Ej: `AluminumRim`, `BicycleRack`, `SafetyBolt`, `ThreePieceCarpet`. Cada uno modifica `cost()` y `getDescription()` agregando su parte.

- **Cliente**: crea los carros base y les aplica decoradores encadenados, sin preocuparse por cuántos o cuáles son.

![Diagrama de Observer](https://imgur.com/4PInNoV.png)


## Factory

Se usa cuando tenemos una clase que necesita objetos, pero no queremos que esa clase se preocupe por los detalles de construcción. Entonces usamos una **fábrica**, la cual creara los tipos de productos que hay con if´s anidados, referenciados bajo un **String** y estos productos son clases que heredan de una interface. Es un **patrón creacional** que posee:

- **Factory**: es la clase encargada de crear los objetos concretos según algún parámetro, bajo un metodo "create" el cual contiene if´s anindados en nuestro ejemplo: (`NotificationFactory` tiene `createNotification(String type)`).
- **Producto (interface)**: define el o los metodos que deben implementar todas las clases que serán creadas (`NotificationType` tiene el método `send()`).
- **Productos concretos**: implementan la interfaz (`EmailNotification`, `SMSNotification`, `WhatsAppNotification`) y definen el comportamiento específico.
- **Cliente**: usa la fábrica para obtener un objeto sin conocer su clase concreta (`NotificationService` llama a la factory para enviar notificaciones).

Se utiliza cuando tienes **muchos tipos de objetos que comparten una interfaz común** y quieres centralizar su creación.

![Diagrama de Observer](https://imgur.com/Xk5RPcf.png)

## Singleton

Se usa cuando solo debe existir **una única instancia** de una clase durante toda la ejecución del programa, y se necesita un **punto de acceso global** a esa instancia. Es un **patrón creacional** que posee una unica clase la cualtiene:

- **Instancia estática**: se guarda una referencia estática a sí misma (`private static BoilerSingleton instance`).
- **Constructor privado**: impide que otras clases puedan crear objetos directamente.
- **Método `public static BoilerSingleton getInstance()`**: devuelve la única "instance"
- **Metodos a usar**: Dentro de la misma clase se ponen los metodos que debe hacer la clase administrador o singleton"

**Se usa cuando** necesitas asegurar que solo haya un objeto compartido, por ejemplo, un *boiler* que debe seguir un ciclo estricto: llenar → mezclar → vaciar.

![Diagrama de Observer](https://imgur.com/2hXKDd1.png)

