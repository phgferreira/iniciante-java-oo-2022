# iniciante-java-oo-2022

## Desafio

Desafio do módulo "Back-end - Java e Orientação a Objetos Básico" do Movimento Codar 2022. Pratique Java e Orientação a Objetos construindo um sistema para gestão de um zoológico!

## Pré-requisitos

- Instale o [Git](https://git-scm.com/).
- Faça um fork desse projeto clicando no botão `Fork` no canto superior direito da página, conforme a imagem abaixo. 

<img src="https://docs.github.com/assets/images/help/repository/fork_button.png" alt="Realizando o fork" width="400" />

- Acesse o fork que você criou e faça o clone para a sua máquina. Clique primeiro no botão `Code` e depois copie a URL. 

<img src="https://docs.github.com/assets/images/help/repository/https-url-clone-cli.png" alt="Copiando a URL" width="400" />

- Realize o clone com o comando `git clone` + a URL copiada.

- Abra o projeto na sua IDE ou editor de texto preferido. Se não tiver um recomendamos o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/).

### Zoologia

Zoologia é a ciência que estuda a vida animal. O estudo dos animais analisa as diferentes características, estruturas, forma do corpo, desenvolvimento, crescimento, reprodução, locomoção, e sistemas (digestório, respiratório, circulatório, excretor, nervoso e etc.), além da ecologia (interação do organismo com o meio) e evolução (surgimento e desaparecimento ou resquício de alguma estrutura ou característica).
[Fonte](https://www.infoescola.com/biologia/zoologia/)

## Resolvendo o desafio

Seu desafio é utilizar seus conhecimentos de Java e Orientação a Objetos para construir um sistema que irá manter o cadastro dos animais de um zoológico.

O sistema deverá ter 3 funcionalidades principais:

1. Cadastrar os animais em sistema
   1. Criação
   3. Exclusão
2. Cadastro de localizações
   1. Criação
   2. Exclusão
3. Alocar/Mover 1 animal
   1. Transferir o animal para determinada localização

### Cadastrando animais

Para cadastrar um animal, o usuário deverá informar:
- Nome científico
- Nome popular
- Peso
- Altura
- Comprimento
- Classificação
  - Invertebrados: Poríferos, Cnidários, Platelmintos, Nematelmintos, Anelídeos, Moluscos, Artrópodes e Equinodermos
  - Vertebrados: Peixes, Anfíbios, Répteis, Aves e Mamíferos

Regras:
- O sistema deverá gerar um identificador único para cada animal cadastrado
- As medidas de peso possíveis são: toneladas, quilogramas, gramas ou miligramas
- As medidas de altura e comprimento possíveis são: milimetros, centimetros ou metros

### Cadastrando localizações

Para cadastrar uma localização, o usuário deverá informar:
- Tipo
- Dimensões
  - Altura
  - Largura
  - Comprimento

Regras:
- Os tipos de localização possíveis são: aquário, terra e lago, sendo que cada tipo pode comportar as seguintes classificações de animais:
  - Aquário: Poríferos, Anfíbios, Répteis, Peixes, Mamíferos, Cnidários, Platelmintos, Nematelmintos, Anelídeos, Moluscos, Artrópodes, Equinodermos
  - Terra: Anfíbios, Répteis, Aves, Mamíferos
  - Lago: Répteis, Peixes, Aves, Mamíferos
- Os aquários podem conter água doce, água salgada ou não conter água
- As medidas de altura, largura e comprimento possíveis são: milimetros, centimetros ou metros
- Podem existir diversas localizações do mesmo tipo, o limite é a criatividade para o tamanho do zoológico :)
- O sistema deverá gerar um identificador único para cada localização cadastrada

### Alocando animais

Ao selecionar esta opção, o sistema deverá dar a opção de escolher um animal e mostrar ao usuário uma lista com todos os animais cadastrados contendo seus respectivos:
- ID
- Nome popular
- Dimensões (Altura x Comprimento)
- Classificação
- Alocado em

Ao escolher um animal, deverá ser apresentada uma lista com as localizações cadastradas que estão disponíveis para a classificação do animal selecionado. A lista deve mostrar:
- ID
- Dimensões (Comprimento x Largura x Altura)

Regras:
- Animais diferentes não podem ficar em uma mesma localização

### Avisos

- Crie os arquivos e faça a organização do projeto conforme achar necessário.
- A forma como irá demonstrar as informações e solicitar entrada do usuário poderá ser via console. Fique à vontade para fazer de outra forma se preferir.
- O sistema não precisa manter as informações cadastradas ao ser reiniciado. No entanto, fique à vontade para manter os dados se quiser.
