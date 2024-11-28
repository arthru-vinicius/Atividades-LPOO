
##Uso de métodos e classes abstratas##  

**Por que `Shape` é abstrata?**  
`Shape` é abstrata porque ela serve como base para outras formas como `Circle` e `Rectangle`. Não faz sentido criar uma "forma genérica" sem saber como calcular área ou perímetro, então ela força as subclasses a implementarem esses métodos.

**O que os métodos abstratos fazem?**  
Os métodos abstratos garantem que todas as formas (`Circle`, `Rectangle`, etc.) tenham `getArea()` e `getPerimeter()`, mas cada forma pode implementar de forma diferente. Isso deixa o código organizado.

**O que acontece com o polimorfismo?**  
Quando usamos algo como `Shape s1 = new Circle(...)`, mesmo que `s1` seja do tipo `Shape`, os métodos como `getArea()` chamam a versão da subclasse `Circle`. Mas, se tentarmos usar algo específico de `Circle`, como `getRadius()`, dá erro porque `Shape` não tem esse método.

**Erros no teste:**  
   - Não podemos criar um objeto `Shape` diretamente porque é abstrata.  
   - Não dá para acessar métodos específicos da subclasse sem um downcast.  
   - Se o downcast for para o tipo errado, dá erro em tempo de execução.

**Por que usar classes abstratas?**  
Porque elas criam uma base comum para várias classes relacionadas, como formas geométricas. Isso ajuda a organizar o código e evitar duplicação.
