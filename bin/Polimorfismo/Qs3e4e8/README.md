
## Interface vs Classe Abstrata ##

**Quando usar interfaces**  
- Use interfaces para definir um conjunto de métodos que diferentes classes devem implementar, mesmo que elas não tenham relação entre si. É útil quando você precisa combinar comportamentos de várias interfaces (múltiplas implementações).

**Quando usar classes abstratas**  
- Use classes abstratas quando existe uma relação hierárquica clara entre as classes e você deseja compartilhar código entre elas. Classes abstratas são uma base comum, com métodos que podem ser parcialmente implementados.

**Diferenças práticas**  
- Uma classe pode implementar várias interfaces, mas só pode herdar de uma classe abstrata.  
- Interfaces não têm atributos de instância, apenas constantes, enquanto classes abstratas podem ter atributos normais.  
- Interfaces são ideais para contratos gerais; classes abstratas são usadas para relações próximas entre subclasses.
