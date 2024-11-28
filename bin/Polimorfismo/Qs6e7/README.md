
## Questão 7 ##

## Diagrama de Classes Solicitado ##

```
                   Animal (abstract)
                   +----------------+
                   | + greeting():void (abstract)
                   +----------------+
                          ▲
          +---------------+---------------+
          |                               |
      Cat                              Dog
+----------------+          +--------------------------+
| + greeting():void         | + greeting():void        |
|   "Meow!"                 |   "Woof!"                |
|                           | + greeting(Dog):void     |
+----------------+          |   "Woooooooooof!"        |
                            +--------------------------+
                                     ▲
                                     |
                                  BigDog
                   +-------------------------------+
                   | + greeting():void             |
                   |   "Woow!"                     |
                   | + greeting(Dog):void          |
                   |   "Woooooowwwww!"             |
                   +-------------------------------+

```
**Diagrama ASCII gerado por IA com base no meu prompt**
- "Por favor, gere um diagrama ASCII para a seguinte hierarquia de classes:
    1. Existe uma classe abstrata chamada Animal com um método abstrato greeting().
    2. A classe Cat herda de Animal e implementa o método greeting() para imprimir "Meow!".
    3. A classe Dog também herda de Animal e implementa o método greeting() para imprimir "Woof!". Ela tem um método adicional sobrecarregado chamado greeting(Dog another) que imprime "Woooooooooof!".
    4. A classe BigDog herda de Dog e redefine ambos os métodos:
        - greeting() para imprimir "Woow!".
        - greeting(Dog another) para imprimir "Woooooowwwww!".
    5. Desenhe o diagrama de herança mostrando:
        - As classes como caixas com seus métodos listados dentro.
        - Relacione as classes com setas que mostram a herança.
    6. Obrigatoriamente, inclua o método abstrato greeting() em Animal e os métodos implementados ou sobrescritos nas outras classes."

## Explicação dos resultados ##

**Subclasses e Polimorfismo:**
- Quando usamos algo como `Animal animal1 = new Cat();`, o método `greeting()` chamado é o da classe `Cat`, porque é o tipo real do objeto (mesmo que a variável seja do tipo `Animal`). Por isso, no código:
    - `animal1.greeting()` imprime `"Meow!"`.
    - `animal2.greeting()` imprime `"Woof!"` porque o objeto real é da classe `Dog`.
    - `animal3.greeting()` imprime `"Woow!"` porque o objeto real é da classe `BigDog`.

**Erro ao tentar instanciar `Animal`:**
- `Animal animal4 = new Animal();` dá erro porque `Animal` é abstrata. Classes abstratas só podem ser usadas como base para outras classes, e não podem ser instanciadas diretamente.

**Downcasting e erros:**
- Alguns downcasts funcionam, como:
    - `Dog dog2 = (Dog)animal2;` funciona porque `animal2` é realmente um `Dog`.
    - `BigDog bigDog2 = (BigDog)animal3;` funciona porque `animal3` é realmente um `BigDog`.
- Mas `Cat cat2 = (Cat)animal2;` dá erro em tempo de execução (ClassCastException), porque `animal2` é um `Dog` e não pode ser convertido para `Cat`.

**Métodos específicos (`greeting(Dog another)`):**
- `dog2.greeting(dog3);` imprime `"Woooooooooof!"` porque `dog2` é um `Dog` e chama o método `greeting()` da classe `Dog`.
- `dog3.greeting(dog2);` imprime `"Woooooowwwww!"` porque `dog3` é um `BigDog` e chama o método sobrescrito em `BigDog`.
- `bigDog2.greeting(bigDog1);` imprime `"Woooooowwwww!"` porque ambos são `BigDog` e usam o método sobrescrito de `BigDog`.

**Resumindo:**
- O método chamado depende do tipo real do objeto.
- Não dá para instanciar uma classe abstrata.
- Downcasts precisam ser compatíveis com o tipo real do objeto.
- Métodos sobrescritos funcionam de acordo com o tipo da instância, não do tipo da variável.
