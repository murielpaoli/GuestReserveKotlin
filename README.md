# GuestReserveKotlin/TryBnB App

Este é um aplicativo Android desenvolvido em Kotlin, com o objetivo de criar e exibir as reservas feitas pelos hóspedes, utilizando dados da API Restful-booker.

## Funcionalidades

- **Layout intuitivo**: Implementação do layout seguindo os princípios do Material Design para garantir uma interface agradável e fácil de usar.
- **Validação de componentes**: Validação de estados dos componentes para garantir que os dados inseridos pelos usuários sejam corretos.
- **Consumo de API Rest**: Uso do Retrofit para consumir a API Restful-booker.
- **Arquitetura MVVM**: Seguindo a arquitetura MVVM (Model-View-ViewModel) para manter o código organizado e fácil de manter.

### Outras funcionalidades desenvolvidas

- **Estrutura inicial da tela**: (LinearLayout, ConstraintLayout, ImageView).
- **Barra de navegação inferior**: Adição de uma barra de navegação na parte inferior da tela inicial com um fragment container.
- **Navegação do BottomNavigation**: Ao clicar em cada item do menu, o respectivo fragmento é chamado.
- **Fragmento Perfil**: Estrutura do fragmento Perfil.
- **Validação do Login e Password**: Validação dos campos de login e senha.
- **Requisição via Retrofit**: Requisição ao endpoint POST `/auth` usando Retrofit.
- **Fragmento Reservas**: Estrutura do layout do fragmento Reservas.
- **Tela Para Criar uma Reserva**: Layout e validação da tela de Criar Reserva.

## Ferramentas e Tecnologias

<details>
  <summary><strong>Linguagens de Programação</strong></summary><br />
  <strong>Kotlin</strong><br />
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=kotlin" alt="Linguagens de Programação">
  </a>
</details>

<details>
  <summary><strong>Ambiente de desenvolvimento</strong></summary><br />
  <strong>Android Studio</strong><br />
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=androidstudio&theme=dark" alt="Ambiente de desenvolvimento">
  </a>
</details>

<details>
  <summary><strong>Princípios aplicados para a criação da interface do usuário</strong></summary><br />
  <strong>Material Design</strong><br />
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=materialui&theme=dark" alt="Princípios aplicados para a criação da interface do usuárion">
  </a>
</details>

<details>
  <summary><strong>Biblioteca para consumo de API Rest</strong></summary><br />
  <strong>Retrofit</strong><br />
</details>

## Como Executar o app

Para rodar este app localmente, siga os passos abaixo:

1. Clone o repositório:
    ```sh
    git clone git@github.com:murielpaoli/GuestReserveKotlin.git
    ```

2. Entre na pasta do repositório que você acabou de clonar:
    ```sh
    cd GuestReserveKotlin
    ```
3. Crie uma branch a partir da branch main:
    ```sh
    Exemplo: git checkout -b user-GuestReserveKotlin
    ```
Agora, você ja pode abrir o repositorio clonado com o Android Studio ou outra IDEs e executar o aplicativo
