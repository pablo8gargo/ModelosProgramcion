# Patrones de Diseño

## Strategy

Se usa cuando un objeto necesita cambiar su comportamiento en tiempo de ejecución sin modificar su código, y cuando en vez de meter todo en una sola clase, se separan los comportamientos en clases diferentes y se elige cuál usar. Es un **patrón de comportamiento** que posee:

- **Context**: tiene referencia a la Strategy que va a utilizar (el tipo de `Duck` llama al comportamiento que necesite).
- **Strategy** (`<<interface>>`): es donde definimos el método del comportamiento (`FlyBehavior` crea método `fly()`).
- **ConcreteStrategy**: implementan de `Strategy` el método (`fly()`) y lo reescriben como lo necesiten (por ejemplo, `FlyNoWay` o `FlyWithWings`).

![Diagrama de Strategy](https://imgur.com/32O64r6.png)
---

## Observer

Se usa cuando queremos que muchos objetos se enteren automáticamente cuando otro objeto cambia. Es un **patrón de comportamiento** que posee:

- **Subject** (`<<interface>>`): con los métodos `registerObserver(Observer o)`, `removeObserver(Observer o)` y `notifyObservers()`. Es quien emite el evento.
- **ConcreteSubject** (`WeatherData`): implementa los métodos de `Subject` y tiene otros métodos que lanzan la notificación cuando algo cambia (por ejemplo, `measurementsChanged()`).
- **Observer** (`<<interface>>`): crea un método `update()` que debe ser llamado cuando el evento ocurra en el `Subject`.
- **ConcreteObservers**: clases que implementan `Observer` y tienen la lógica que se ejecuta cuando el evento ocurre (por ejemplo, `HeatIndex` y `WeatherCondition`).

![Diagrama de Observer](https://imgur.com/F2Rk6M3.png)
---

## Bridge

Lo usamos cuando necesitamos crear objetos con los mismos atributos pero diferentes caracteristicas, es distinto de Strategy porque Strategy se enfoca en comportamientos. Es un **patrón estructural** que posee:

- **Abstraction** (`Forma`): es la interfaz principal que define operaciones genéricas como `dibujar()` y `colorear(Color color)`. No se preocupa por los detalles, simplemente dice "esto se debe hacer".
- **RefinedAbstraction** (`Cuadrado`, `Círculo`, `Triángulo`): son implementaciones concretas que amplían la abstracción, definiendo específicamente cómo se dibuja cada forma, pero delegando la acción de colorear a un `Color`.
- **Implementor** (`Color`): es la interfaz que declara el método `colorear()`. Define "qué significa colorear", pero no cómo se aplica un color específico.
- **ConcreteImplementor** (`Rojo`, `Azul`, `Amarillo`): implementaciones específicas del `Color`, cada una define su manera concreta de colorear (por ejemplo, colorear de rojo, azul o amarillo).

![Diagrama de Bridge](https://imgur.com/Hl6JqPp.png)
---

## Builder

Se usa cuando queremos construir objetos complejos paso a paso y queremos controlar cómo se arma, separando la construcción de la representación final. Es un **patrón de creación** que posee:

- **Director** (`Chef`): es quien orquesta la construcción. No construye directamente el objeto, sino que llama a los métodos del `Builder` en un orden específico (por ejemplo: primero el pan, luego la carne, etc).
- **Builder** (`<<interface>>`): define los pasos de construcción con métodos llamados `BuildPart()`, como en nuestro caso `buildBread()` o `buildMeat()`.
- **ConcreteBuilder** (`TodoTerrenoBurguerBuilder`): implementa los métodos de `Builder` o los `BuildPart()` para armar partes específicas del objeto. Aquí se crea realmente la hamburguesa (pan de ajonjolí, doble carne, mozzarella, etc).
- **Product** (`Burguer`): es el objeto complejo que queremos construir. Se va armando con todas las partes: pan, carne, queso y toppings. Realmente estamos haciendo el set de cada parte.

![Diagrama de Builder](https://imgur.com/2nIEfxQ.png)
---

## Chain of Responsibility

Se usa cuando queremos **pasar una solicitud por una cadena de objetos** hasta que uno de ellos la maneje. Es un **patrón de comportamiento** que posee:

- **Client** (`Main`): es quien inicia la solicitud y le da orden a los Manejadores Concretos.
- **AbstractHandler** (`<<interface>> Handler`): define la interfaz común para todos los manejadores. Tiene dos metodos el primero es `nextHandler` que sirve parasaber que Handler va despues, y el metodo `handle(request)` el cual los `ConcreteHandler` implementarán.
- **ConcreteHandler** (`CoinFiveHundred`, `CoinTwoHundred`, `CoinOneHundred`, `CoinFifty`): implementan la lógica específica para procesar la solicitud.  
  Cada uno:
  - Intenta manejar la solicitud (por ejemplo, dar las monedas de su valor).
  - Si no puede completarla, pasa la solicitud al `nextHandler`.
![Diagrama de Builder](https://imgur.com/ote9Mkx.png)

---

## Flyweight

**(1 UML)**