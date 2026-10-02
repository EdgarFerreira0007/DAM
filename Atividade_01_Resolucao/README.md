# Atividade 01 — Mostrar Frase

## Objetivo

Lê uma frase, acrescenta «Autor desconhecido» e mostra o resultado.

## Solução implementada

- MainActivity.java liga a interface ao clique.
- FraseFormatter.java isola e valida a regra.
- activity_main.xml reproduz o campo, botão e resultado.

## Passos de construção

1. Criar um projeto **Empty Views Activity** em Java.
2. Definir os textos em `res/values/strings.xml` e as cores no ficheiro de recursos.
3. Construir a hierarquia visual em `res/layout/` com medidas `dp` e texto em `sp`.
4. Obter as Views por `findViewById` e associar os eventos pedidos no enunciado.
5. Manter a regra principal numa classe Java independente da Activity sempre que existe lógica calculável.
6. Tratar entradas vazias, inválidas ou casos-limite antes de atualizar o ecrã.
7. Executar os testes e, no Android Studio, confirmar o resultado num dispositivo/emulador.

## Abrir no Android Studio

1. Abrir o Android Studio.
2. Escolher **Open** e selecionar esta pasta (a pasta que contém `settings.gradle`).
3. Confirmar **JDK 17** e deixar concluir o **Gradle Sync**.
4. Instalar/selecionar o SDK Android 35, se solicitado.
5. Selecionar um emulador ou dispositivo com API 24 ou superior.
6. Executar a configuração `app`.

## Estrutura essencial

- `app/src/main/java/`: código Java.
- `app/src/main/res/layout/`: interface XML.
- `app/src/main/res/values/`: textos, cores e tema.
- `app/src/test/java/`: testes unitários da lógica independente do Android.
- `referencias/`: enunciado original e imagens incorporadas.

## Testar

No Android Studio, clicar com o botão direito na pasta `app/src/test` e escolher **Run Tests**. Por terminal, com JDK 17 e SDK Android configurados:

```bash
./gradlew test
./gradlew assembleDebug
```

O APK, após um build bem-sucedido, fica normalmente em `app/build/outputs/apk/debug/app-debug.apk`.

## Estado de verificação

- Lógica Java independente: compilada com `javac` e testada com JUnit 4.13.2.
- XML, recursos e ligações Java/XML: validados estaticamente pelo pacote.
- Build Android/APK: não executado nesta máquina por ausência de Android SDK.
- Instalação e execução em emulador/dispositivo: por confirmar no Android Studio.

