# iniciante-java-oo-2022

## Versão 2.0
> Status: Em Desenvolvimento

### Breve descrição
Nessa 2º versão não me apeguei ao desenho porque tive um pouco de dificuldade na versão e sim comecei programando a main e conforme a necessidade fui aprimorando, criando mais código ou modificando o menos possível.

Dessa forma confesso que ainda precisei refatorar mas muito pouco comparado ao que precisei mudar na versão 1 para o código funcionar.

### Explicação
- Classe DadosAleatorios: Responsável por gerar os dados inventados para a execução do projeto;
- Classe IniciaMovimentoCodar: É a classe principal com o método main
- Classe Random: Utilizei várias vezes para simular uma decisão aleatória, usei o nextBoolean e nextInt

1. O programa começa com o processo seletivo divido em etapas: agendamento das entrevistas e realização das entrevista, isso retorna uma lista de candidatos;
2. É formado uma turma com os aprendizes, mentores e até mesmo os recrutadores. Inclusive esse código pode ser apromorado mais fazendo com que os recrutadores avaliem os interesses dos aprendizes continuamente, mas isso pode ficar para uma outra hora;
3. A turma é iniciada e a evolução dela (turma) é divida em 4 etapas por ciclo de módulo, ou seja, 1º módulo => 4 etapas; 2º => mais 4 e assim por diante;
4. Inicialmente o mentor líder que recebeu uma lista de módulos e determinou os desafios préviamente, libera para a turma;
5. Os aprendizes absorvem o conteúdo do módulo de forma aleatória aquele conteúdo pode ser tornar um conhecimento ou uma dúvida, ambos são divididos por listas separadas;
6. Os aprendizes compartilham suas dúvidas e um mentor aleatório explica (tira a dúvida), e isso remove a dúvida de todo e qualquer aprendiz que tenha a mesma dúvida na turma;
7. Por fim o mentor lança o desafio, uma observação é que o módulo só permite o getDesafio para o MentorLider, e os aprendizes resolvem;
8. Assim um ciclo de módulo é finalizado e ao fim de todos os módulos o movimento codar é finalizado.

## Versão 1.0
> Status: Concluído

A modelagem desse projeto segue o esboço feito no draw.io:
[Movimento Codar](https://drive.google.com/file/d/1JTykce0otRLihWIxCL6onYFPwS3FzOl_/view?usp=sharing)

### Etapas
- [x] Esboço;
- [x] Recrutamento:
    - [x] Pessoa e Interesse
    - [x] Candidato
    - [x] Recrutador
    - [x] Organizador e Conferencia
    - [x] Entrevista
- [x] Construção das turmas:
    - [x] Mentor Lider e Mentor
- [x] Evolução dos módulos sem dúvidas:
    - [x] Passa o próximo módulo;
    - [x] Aprendizes absorvem aprendizado
- [x] Evolução dos módulos com dúvidas:
    - [x] Aprendiz compartilha dúvida;
    - [x] Mentores resolvem dúvida.
