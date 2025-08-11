O que é o padrão Strategy?
Imagine uma classe (o Contexto) que faz algo de diferentes maneiras – por exemplo, traçar rotas: uma para carro, outra para caminhada, outra para transporte público. O Strategy sugere tirar cada uma dessas formas de fazer a coisa (o algoritmo) e colocá-las em classes separadas chamadas estratégias 
refactoring.guru
+1
.

Como funciona na prática?
A classe principal (Contexto) não decide como resolver o problema diretamente. Em vez disso, ela mantém uma referência para uma das estratégias e simplesmente “manda executar” 
refactoring.guru
.

Essas estratégias implementam uma interface comum. Assim, o contexto não precisa saber qual é exatamente a estratégia — ele só chama o método comum. Isso torna o código mais flexível: você pode trocar comportamentos sem mudar o código do contexto 
refactoring.guru
Wikipedia
.

Quando usar esse padrão?
Útil quando você tem um pedaço de código que pode funcionar de maneiras diferentes (por exemplo, calcular preço, validar dados, desenhar algo), e essas variações podem acontecer enquanto o programa está rodando 
refactoring.guru
Wikipedia
.

Também serve para evitar longas estruturas de if / else ou switch, deixando o código mais limpo e organizado 
refactoring.guru
.

Benefícios principais
Vantagem	Explicação Simples
Flexibilidade	Dá para trocar a forma de agir sem mudar o contexto.
Reutilização	Estratégias podem ser usadas em vários lugares.
Separação de responsabilidades	Cada classe faz apenas uma tarefa.
Código mais curto e claro	Acaba com várias condições espalhadas por aí.

Estrutura típica (simplificada)
Contexto – a classe principal, com um campo que guarda qual estratégia usar.

Interface Strategy – define um método que todas as estratégias devem implementar.

ConcreteStrategy A/B/C – implementam cada um dos comportamentos possíveis.

O cliente escolhe a estratégia e passa para o contexto; depois é só chamar o método e pronto.

Esse padrão ajuda você a escrever um código que é mais fácil de entender, estender e manter — sem bagunçar a estrutura central da aplicação.

Se quiser, posso ainda mostrar exemplos em Java, Python ou outra linguagem. É só me avisar!