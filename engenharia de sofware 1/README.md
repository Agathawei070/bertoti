## 09/08/2024 comentário do livro de engenharia de software no google

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

"Within Google, we sometimes say, 'Software engineering is programming integrated over time.' Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

## Resumo 
Esses dois trechos destacam a diferença entre programação e engenharia de software, apontando que, embora a programação seja fundamental para criar software, a engenharia de software envolve uma visão mais ampla e estratégica.

O primeiro trecho enfatiza que na engenharia de software é essencial considerar o tempo (para garantir a manutenção e adaptação ao longo do tempo), escala (para lidar com o crescimento do software e da organização) e as compensações (tomada de decisões complexas e de maior risco).

O segundo trecho reforça essa ideia, afirmando que a engenharia de software é mais do que apenas programação. Ela envolve o gerenciamento contínuo do software ao longo do tempo, incluindo desenvolvimento, modificação e manutenção, o que exige um conjunto de habilidades e preocupações além da simples criação de código.

## 15/08/2024 Três exemplos de tradeoffs citando requisitos não funcionais
## ios vs android

Desempenho
- iOS : Desempenho geralmente mais consistente devido ao controle total da Apple sobre o hardware e o software. Os dispositivos iOS são otimizados para funcionar perfeitamente com o sistema operacional, resultando em menos variações de desempenho entre dispositivos.
- Android : Varia dependendo do dispositivo, pois é usado em uma ampla gama de hardware de diferentes fabricantes. O desempenho pode ser excelente em dispositivos de ponta, mas menos eficiente em dispositivos de menor custo.

Segurança
- iOS : Conhecido por suas fortes medidas de segurança, incluindo um ecossistema mais fechado, atualizações de segurança regulares e a revisão rigorosa de aplicativos na App Store. A arquitetura do iOS foi projetada para proteger os dados do usuário e prevenir malware.
- Android : oferece mais flexibilidade, mas essa abertura pode ser uma desvantagem em termos de segurança. Embora o Google implemente atualizações de segurança, a fragmentação do sistema faz com que nem todos os dispositivos recebam essas atualizações imediatamente. A Google Play Store também tem menos controle rigoroso sobre os aplicativos.

Usabilidade
- iOS : Interface de usuário altamente intuitiva e consistente entre dispositivos. A Apple mantém um design uniforme e experiência de usuário previsível, o que facilita a navegação e o uso do sistema.
- Android : Oferece uma maior personalização, o que permite aos usuários adaptar a interface ao seu gosto. No entanto, essa flexibilidade pode resultar numa experiência menos consistente entre diferentes dispositivos.

Escalabilidade
- iOS : A escalabilidade do iOS é limitada pelo número de dispositivos Apple disponíveis. Embora seja mais fácil garantir uma experiência uniforme, o alcance é limitado aos produtos da Apple.
- Android : Altamente escalável devido à sua adoção por uma ampla gama de fabricantes em diferentes mercados e faixas de preço. A variedade de dispositivos Android significa que ele pode atingir uma base de usuários muito maior.

Manutenibilidade
- iOS : Menor diversidade de dispositivos facilita a manutenção e a aplicação de atualizações. A Apple controla quando e como as atualizações são lançadas, garantindo que a maioria dos usuários possa atualizar para a versão mais recente.
- Android : A fragmentação do sistema operacional dificulta a manutenção, já que as atualizações são muitas vezes dependentes dos fabricantes e operadoras, o que pode resultar em atrasos significativos ou falta de suporte para dispositivos mais antigos.

Compatibilidade
- iOS : Altamente compatível com outros dispositivos Apple, proporcionando uma integração perfeita dentro do ecossistema Apple (por exemplo, iCloud, Handoff, Continuity).
- Android : Compatível com uma grande variedade de dispositivos e periféricos, não apenas aqueles fabricados pelo Google. Essa abertura facilita a integração com diferentes plataformas e dispositivos, mas pode resultar em problemas de compatibilidade em alguns casos.

Confiabilidade
- iOS : geralmente mais confiável devido ao controle rígido sobre hardware e software, resultando em menos falhas e bugs.
- Android : A confiabilidade pode variar dependendo do fabricante e do modelo do dispositivo, com algumas personalizações potencialmente introduzindo instabilidades.

Privacidade
- iOS : A Apple coloca uma forte ênfase na privacidade, com políticas específicas sobre como os dados dos usuários são coletados e usados. Os usuários têm mais controle sobre as permissões dos aplicativos e o acesso a dados pessoais.
- Android : O Google coleta uma quantidade significativa de dados dos usuários para personalização e publicidade. Embora o Android tenha melhorado suas políticas de privacidade ao longo dos anos, a natureza aberta do sistema e a dependência de serviços do Google podem ser uma preocupação para alguns usuários.

Ambos os sistemas operacionais têm pontos fortes e fracos em termos de requisitos não funcionais. A escolha entre iOS e Android dependerá das necessidades específicas, como o controle sobre o hardware, a necessidade de personalização, questões com privacidade e segurança, entre outros fatores.

## Max vs Disney+

Desempenho
- Max : O Max oferece uma boa qualidade de streaming, especialmente em conteúdos premium como séries originais e filmes. No entanto, nos seus primeiros anos, foram feitas críticas sobre problemas de estabilidade e desempenho, especialmente em dispositivos mais antigos.
- Disney+ : Geralmente apresenta um desempenho estável e rápido, com streaming suave e tempos de carregamento rápidos. O serviço foi bem recebido desde o lançamento, com algumas reclamações em relação ao desempenho.

Segurança
- Max : Adota boas práticas de segurança para proteger os dados dos usuários, incluindo criptografia e autenticação em duas etapas. No entanto, o histórico de segurança da plataforma, especialmente durante o período como HBO Max, teve alguns desafios menores, como vulnerabilidades no login.
- Disney+ : Desde o seu lançamento, a segurança tem sido uma prioridade. O serviço implementa criptografia robusta e mecanismos de segurança para proteger contas e dados dos usuários. Houve algumas preocupações iniciais sobre o hacking de contas, mas a Disney reforçou suas medidas de segurança.

Usabilidade
- Max : A interface do Max tem sido melhorada ao longo do tempo, mas ainda pode ser considerada menos intuitiva em comparação com concorrentes como o Disney+. A navegação nem sempre é direta, e alguns usuários têm dificuldade em encontrar conteúdos específicos.
- Disney+ : A plataforma é conhecida por sua interface de usuário limpa, intuitiva e fácil de usar. A navegação é simples, com categorias bem organizadas e uma busca eficiente, o que contribui para uma experiência de usuário positiva.

Escalabilidade
- Max : O Max possui uma infraestrutura capaz de suportar grandes volumes de usuários simultâneos, especialmente em lançamentos de conteúdos populares. A plataforma tem presença expandida globalmente, embora a escala seja mais limitada em comparação com o Disney+.
- Disney+ : Altamente escalável, o Disney+ foi lançado em muitos países simultaneamente e continua a se expandir rapidamente. A plataforma lida bem com picos de tráfego, especialmente durante lançamentos de grandes títulos, devido à infraestrutura robusta da Disney.

Compatibilidade
- Max : Compatível com uma ampla gama de dispositivos, incluindo smart TVs, consoles de videogame, dispositivos móveis e navegadores web. Entretanto, a experiência pode variar dependendo do dispositivo, como alguns modelos mais antigos apresentando problemas.
- Disney+ : Oferece ampla compatibilidade com praticamente todos os dispositivos modernos, incluindo smart TVs, consoles de videogame, dispositivos móveis, navegadores e até dispositivos mais antigos. A consistência na experiência do usuário em diferentes plataformas é um ponto forte.

Confiabilidade
- Max : A confiabilidade do Max tem sido uma área de foco, com melhorias ao longo do tempo. No entanto, houve períodos em que a plataforma causou falhas e problemas de buffer, especialmente em momentos de alta demanda.
- Disney+ : Desde o seu lançamento, o Disney+ tem sido considerado altamente confiável, com poucas interrupções de serviço e problemas técnicos. A plataforma gerencia bem o tráfego intenso, como visto em estreias de séries populares.

Disney+ destaca-se pela usabilidade , confiabilidade e escalabilidade superiores, proporcionando uma experiência mais consistente e estável para os usuários. Max tem sido melhorado continuamente, mas ainda enfrenta desafios em termos de usabilidade e confiabilidade , embora apresente um bom desempenho em conteúdo premium e uma compatibilidade ampla.

## Spotify vs Deezer

Desempenho
- Spotify : Conhecido por seu desempenho suave e ritmo de carregamento rápido. Oferece streaming de música em várias qualidades, adaptando-se bem à velocidade da conexão de internet do usuário, o que proporciona uma experiência consistente.
- Deezer : Também oferece um desempenho sólido com streaming fluido. A qualidade do áudio pode ser ajustada conforme a preferência do usuário e a velocidade de conexão, garantindo uma experiência de streaming sem interrupções.

Segurança
- Spotify : Implementa boas práticas de segurança, incluindo criptografia de dados e autenticação em duas etapas. Tem uma abordagem proativa em relação à segurança de dados, respondendo rapidamente a vulnerabilidades e ameaças potenciais.
- Deezer : Possui medidas de segurança semelhantes, com foco na proteção de dados do usuário e na privacidade. A empresa também tem investido em melhorar suas práticas de segurança para prevenir acessos não autorizados e proteger a integridade das informações dos usuários.

Usabilidade
- Spotify : apresenta uma interface intuitiva e fácil de navegar, com recursos como playlists personalizadas, recomendações baseadas em algoritmos e integração social. A experiência do usuário é geralmente considerada excelente, com atualizações regulares que melhoram a usabilidade.
- Deezer : Também oferece uma interface amigável e fácil de usar, com funcionalidades como o Flow, que cria uma mixagem personalizada de músicas para o usuário. O design é limpo e a navegação é direta, facilitando o acesso a diferentes gêneros e artistas.

Escalabilidade
- Spotify : Altamente escalável, suporta milhões de usuários simultâneos em todo o mundo. O serviço é capaz de lidar com grandes volumes de tráfego, especialmente durante o lançamento de novos álbuns e playlists populares.
- Deezer : Também escalável, embora possuísse uma base de usuários menor em comparação com o Spotify. Deezer tem uma infraestrutura para atender a uma ampla audiência global, mas sua escala é menor devido à sua menor participação no mercado.

Compatibilidade
- Spotify : Compatível com uma ampla gama de dispositivos, incluindo smartphones, tablets, computadores, smart TVs, sistemas de áudio e carros. A experiência é consistente em todas as plataformas.
- Deezer : Oferece compatibilidade com dispositivos semelhantes, incluindo integração com dispositivos de áudio de alta fidelidade, carros e smart TVs. A experiência do usuário é igualmente consistente e fluida em diferentes plataformas.

Confiabilidade
- Spotify : É considerado altamente confiável, com prejuízo no serviço. A plataforma mantém-se estável mesmo em momentos de alta demanda e é atualizada regularmente para garantir a estabilidade.
- Deezer : Também é confiável, com manutenção regular e atualizações que ajudam a prevenir interrupções e garantir uma experiência de streaming contínua.

Privacidade
- Spotify : Segue políticas rigorosas de privacidade, garantindo que os dados dos usuários sejam usados ​​de forma transparente e segura. Os usuários têm controle sobre suas preferências de privacidade e compartilhamento de informações.
- Deezer : Também adere às políticas de privacidade, com transparência no uso de dados e opções para os usuários controlarem suas configurações de privacidade. A Deezer respeita a privacidade dos usuários e implementa medidas para proteger suas informações.

Ambos os serviços oferecem uma experiência de streaming de música de alta qualidade com fortes medidas de segurança e privacidade. A escolha entre Spotify e Deezer pode depender de preferências pessoais em relação à usabilidade, compatibilidade de dispositivos, e recursos exclusivos como o Flow do Deezer ou as playlists personalizadas do Spotify.

## 16/08/2024 escolher a arquitetura de uma empresa e comentar seus tradeoffs
## Arquitetura da Netflix

A Netflix utiliza uma arquitetura de microserviços em sua plataforma global de streaming. Essa arquitetura é composta por centenas de serviços pequenos e independentes, cada um responsável por uma funcionalidade específica, como recomendação de conteúdo, streaming de vídeo, autenticação de usuários, entre outros.

Vantagens da Arquitetura de Microserviços na Netflix
Escalabilidade

Vantagem: Cada microserviço pode ser escalado independentemente com base na demanda. Por exemplo, serviços que lidam com streaming de vídeo podem ser escalados durante horários de pico, enquanto outros serviços, como a recomendação de conteúdo, podem ter uma escala diferente.
Trade-off: A escalabilidade independente exige um monitoramento detalhado e ferramentas avançadas de orquestração e automação, aumentando a complexidade operacional.
Resiliência

Vantagem: A falha de um microserviço não compromete toda a plataforma. Se o serviço de recomendação falhar, por exemplo, os usuários ainda podem acessar e assistir ao conteúdo.
Trade-off: Implementar resiliência requer a adoção de padrões como circuit breakers e fallbacks, além de uma arquitetura robusta para lidar com a comunicação entre serviços, o que aumenta a complexidade do desenvolvimento.
Flexibilidade Tecnológica

Vantagem: A Netflix pode escolher a melhor tecnologia para cada microserviço. Um serviço pode ser implementado em Java, outro em Node.js, e outro em Python, de acordo com a necessidade.
Trade-off: A diversidade tecnológica pode aumentar a dificuldade de integração e o overhead de gerenciar diferentes stacks de tecnologia, incluindo treinamento de desenvolvedores e suporte a múltiplas plataformas.
Agilidade no Desenvolvimento

Vantagem: Equipes independentes podem desenvolver, testar e implantar seus microserviços sem interferir umas nas outras, acelerando o processo de desenvolvimento e implantação.
Trade-off: A coordenação entre equipes é crucial para garantir a coesão do sistema, e a comunicação entre microserviços pode introduzir desafios de latência e consistência de dados.
Desvantagens e Desafios
Complexidade Operacional

A manutenção de uma arquitetura de microserviços é complexa devido ao grande número de serviços que precisam ser monitorados, gerenciados e orquestrados. A Netflix investiu pesadamente em ferramentas internas, como o Simian Army, para garantir a resiliência e a robustez de sua infraestrutura.
Comunicação entre Microserviços

A comunicação entre os microserviços, especialmente em uma escala global como a da Netflix, pode introduzir latências, falhas de rede e desafios de consistência de dados. A Netflix utiliza mecanismos como service discovery e API gateways para gerenciar essa comunicação.
Monitoramento e Observabilidade

Com centenas de microserviços em execução, a observabilidade é crítica. A Netflix desenvolveu ferramentas como o Hystrix (circuit breaker) e o Turbine para monitorar a saúde e o desempenho de seus serviços. Entretanto, esse nível de monitoramento requer investimentos significativos em infraestrutura e pessoal.

Conclusão
A arquitetura de microserviços da Netflix oferece alta escalabilidade, resiliência e flexibilidade, o que permite que a empresa lide com milhões de usuários simultâneos em todo o mundo. No entanto, esses benefícios vêm com desafios significativos, incluindo a complexidade operacional, a necessidade de uma infraestrutura robusta, e a gestão de comunicação entre serviços. A Netflix superou muitos desses desafios por meio de uma forte cultura de engenharia, investimentos em automação e desenvolvimento de ferramentas internas para garantir a continuidade e a qualidade do serviço.


## 23/08/2024 fazer classes UML ao lado de código java mostrando a relação entre eles como fizemos no quadro



