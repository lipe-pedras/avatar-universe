# Avatar Universe: Arquitetura com Design Patterns em Java

> Um projeto acadêmico que modela o universo de Avatar utilizando uma arquitetura avançada com Padrões de Projeto para criar um sistema coeso, flexível e de baixo acoplamento.

---

## 📜 Sobre o Projeto

Este projeto foi desenvolvido para a disciplina de **Projeto de Software** e tem como principal objetivo aplicar de forma prática um conjunto de Padrões de Projeto (Design Patterns) em um domínio conhecido: o universo de Avatar.

O sistema explora conceitos como espíritos primordiais, a natureza dos elementos e os diferentes estilos de dobra, demonstrando como os padrões **Singleton, Mediator, Strategy, Proxy** e **Static Factory Method** podem ser combinados para construir um software robusto e elegante.

---

## 🎨 Diagrama de Classes

A arquitetura do projeto foi planejada para ser modular e extensível. O diagrama de classes abaixo ilustra as principais entidades e seus relacionamentos.

![Diagrama de Classes do Projeto Avatar](Avatar.png)

---

## 🧠 Padrões de Projeto (Design Patterns) Aplicados

A espinha dorsal deste projeto é o uso combinado de múltiplos Padrões de Projeto para gerenciar estado, comportamento e acesso a recursos.

### 1. Singleton (Padrão de Criação)

* **Propósito:** Garantir que uma classe tenha apenas uma instância e fornecer um ponto de acesso global a ela.
* **Aplicação no Projeto:** Diversas entidades no universo de Avatar são, por natureza, únicas. O padrão Singleton foi usado para modelar essa característica:
    * **Espíritos e Entidades Cósmicas:** As classes `Raava`, `Vaatu`, `MoonSpirit` e `SozinComet` são Singletons, pois representam entidades únicas e indivisíveis na lore do universo.
    * **Elementos Fundamentais:** As classes `Air`, `Water`, `Fire` e `Earth` também são Singletons. Isso representa a ideia de que o "elemento" em si é um conceito único e compartilhado, ao qual os dobradores se conectam.
    * **Mediador:** A classe `RaavaAndVaatuMediator`, por mediar a interação entre dois Singletons, também é um Singleton para garantir um único ponto de controle para essa comunicação.

### 2. Mediator (Padrão Comportamental)

* **Propósito:** Reduzir o acoplamento entre um conjunto de objetos, encapsulando a forma como eles interagem através de um objeto mediador central.
* **Aplicação no Projeto:** A relação entre `Raava` e `Vaatu` é inerentemente complexa.
    * A classe **`RaavaAndVaatuMediator`** atua como o mediador, centralizando a lógica de interação entre eles. Dessa forma, `Raava` e `Vaatu` não precisam se conhecer diretamente, o que os desacopla e simplifica a manutenção.

### 3. Strategy (Padrão Comportamental)

* **Propósito:** Definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis.
* **Aplicação no Projeto:** A "dobra" de um elemento é tratada como um algoritmo (uma estratégia).
    * A classe `Physical` (contexto) contém uma referência a uma estratégia de dobra. As diferentes dobras (`WaterBending`, `FireBending`, etc.) são as "Estratégias Concretas".
    * Isso permite que um personagem execute sua dobra sem precisar de condicionais, simplesmente delegando a ação para o seu objeto de estratégia.

### 4. Proxy (Padrão Estrutural)

* **Propósito:** Fornecer um substituto ou um espaço reservado para outro objeto, a fim de controlar o acesso a ele.
* **Aplicação no Projeto:** O Proxy gerencia a relação entre um Dobrador (cliente) e o Elemento Singleton (serviço/recurso).
    * Em vez de o Dobrador acessar o Elemento diretamente, ele o faz através de um Proxy.
    * Este Proxy pode controlar o acesso, gerenciar uma conexão ou simplesmente abstrair a complexidade do objeto Elemento real. Ele atua como um "embaixador" do Elemento para o Dobrador.

### 5. Static Factory Method (Padrão de Criação Simples)

* **Propósito:** Utilizar um método estático para encapsular a lógica de criação de um objeto, oferecendo uma alternativa mais flexível e descritiva a um construtor público.
* **Aplicação no Projeto:** O método **`Avatar.createAvatar()`** é um exemplo clássico deste padrão. Em vez de expor um construtor (`new Avatar()`), a classe `Avatar` centraliza a criação em um único ponto, permitindo a implementação de regras de negócio complexas:
    1.  **Controle de instâncias:** A lógica interna do método garante que apenas uma instância represente o Avatar "vivo" atualmente, retornando o Avatar atual, caso este ainda esteja vivo, e um novo tente ser criado.
    2.  **Gerenciamento do Ciclo de Vida:** Ao restringir e controlar as instâncias de Avatar, é possível garantir o funcionamento da pilha pastAvatars, que contém todos os Avatares instânciados no código, representando a conexão que os eles tinha entre si.
* **Vantagens:** Isso torna o código mais expressivo (`Avatar.createAvatar()` vs. `new Avatar()`), centraliza regras críticas de negócio e abstrai a complexidade do processo de criação para o cliente.

