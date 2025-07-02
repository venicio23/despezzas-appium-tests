
# despezzas-appium-tests

Este projeto foi desenvolvido com o propósito de **estudo e aplicação prática de automação de testes mobile** usando **Appium** e **JUnit**. Nosso foco é automatizar interações com o aplicativo **Despezzas**, disponível na Play Store, aplicando o padrão de design **Page Object Model (POM)** para garantir um código limpo, reutilizável e de fácil manutenção.

---

## 🚀 Tecnologias Utilizadas

* **Appium**: Framework de automação de código aberto para aplicativos nativos, híbridos e web.
* **Java**: Linguagem de programação utilizada para escrever os testes.
* **JUnit 4.12**: Framework de testes unitários para Java.
* **Maven**: Ferramenta de automação de build para gerenciar dependências e o ciclo de vida do projeto.
* **Android SDK**: Necessário para ferramentas como ADB e emuladores.

---

## 📂 Estrutura do Projeto

A estrutura do projeto segue o padrão **Page Object Model**:

```

despezzas-appium-tests/
├── pom.xml
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── qavenicio/
│       │           └── despezzas/
│       │               ├── core/                \# Classes base e de configuração (DriverFactory, BasePage)
│       │               │   ├── DriverFactory.java
│       │               │   └── BasePage.java
│       │               ├── page/                \# Classes Page Object (HomePage, TaskPage, LoginPage, etc.)
│       │               │   ├── HomePage.java
│       │               │   └── TaskPage.java
│       │               └── test/                \# Classes de teste (cenários de automação)
│       │                   └── home/
│       │                       └── HomeTest.java
│       └── resources/                           \# Recursos para testes (se houver, como arquivos de dados)
└── target/                                      \# Diretório de build (gerado pelo Maven)

```
```
