# Space Invaiders

## Requisitos Solicitados
#### Descrição do Jogo:
    O "Space Invaders Clone" é uma recriação do clássico jogo "Space Invaders". Neste jogo, os
jogadores assumem o papel de um piloto de nave espacial encarregado de defender a Terra de uma
invasão alienígena. O objetivo é eliminar as naves inimigas que descem em direção à superfície da
Terra, evitando ser atingido por suas armas e sobrevivendo o maior tempo possível.

#### Requisitos do Jogo:
O jogo deve atender aos seguintes requisitos:

1. [X] Nave Espacial Controlável: O jogador deve ser capaz de controlar uma nave espacial usando
controles como teclas de seta ou toques na tela, permitindo que ela se mova para a esquerda e
direita e dispare contra os inimigos.

2. [ ]Inimigos Descendentes: Os inimigos alienígenas devem ser gerados no topo da tela e se mover
para baixo em direção à nave do jogador em formação de colunas. Eles devem atacar o jogador
disparando projéteis.

3. [X]Disparo de Projéteis: A nave do jogador deve ser capaz de disparar projéteis para eliminar os
inimigos. Implemente um sistema de disparo que permita ao jogador atirar contra os inimigos.
4. [X]Detecção de Colisão: O jogo deve detectar colisões entre os projéteis da nave do jogador e os
inimigos. Quando ocorrer uma colisão, o inimigo deve ser eliminado, e o jogador deve ganhar
pontos.

5. [X]Pontuação: Implemente um sistema de pontuação que registre e exiba a pontuação do jogador
com base no número de inimigos eliminados.

6. [X]Níveis de Dificuldade: À medida que o jogador progride, aumente gradualmente a velocidade
dos inimigos ou introduza inimigos mais resistentes para aumentar o desafio. (Opcional)


## Padões Implementados


### Factory Method(Criação)
Implementado por meio da criação da interface *FactoryGame* que padroniza os elementos base do jogo(nave e inimigos),e a classe BaseGame implementa essa interface fazendo com que caso queira alterar os atores é só criar outra classe que implemente a interface FactoryGame.


### Composite(Estrutural)
O padrão traz como principal objetivo criar um estrutura hierarquica de classes que é feita utilizando as classes Actor e Word com as suas subclasses

### Observer(Comportamental)
Implementado dentro da classe Background onde contem um metodo que verifica e avisa quando ocorrer uma colisão com a parede