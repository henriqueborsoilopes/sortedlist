# Sorted List

### A aplicação tem como obejtivo receber números inteiros digitado pelo usuário e fornecer três opções para ordernação da lista, do menor valor para o maior valor. As três opções de ordenação são: bolha, inserção e seleção. Ao final exibirá no console a lista original, a lista ordenada e o tempo que demorou para ordernar a lista.

## Linguagem Java versão 17

## Diagrama de classe
![sortvector](https://user-images.githubusercontent.com/52636328/233746192-8f9599c0-b39f-4f25-ad54-787f17a8992a.png)

## Estrutura do projeto
### Conforme o diagrama de classe, o projeto tem 3 pastas:

#### 1º pasta -> arrayactivit
##### Contém o método de execução 'main' que na qual executa os métodos da classe UI, e as sub-pastas:

#### 1º sub-pasta -> methods contém as classes:
### Classe Vector 
##### Tem a função de criar vetor; adicionar valores no vetor; imprimir no console o vetor; e exportar o vetor para outras classes;
### Classe SelectionSort
##### Tem a função de ordenar um vetor utilizando o método de ordenação por seleção; imprimir o vetor ordenado no console; e imprimir o tempo de execução do método da ordenação;
### Classe InsertionSort 
##### Tem a função de ordenar um vetor utilizando o método de ordenação por inserção; imprimir o vetor ordenado no console; e imprimir o tempo de execução do método da ordenação;
### Classe BubbleSort 
##### Tem a função de ordenar um vetor utilizando o método de ordenação por bolha; imprimir o vetor ordenado no console; e imprimir o tempo de execução do método da ordenação;

### 2º sub-pasta -> ui contém uma classe e uma sub-pasta:
### Classe UI 
##### Tem a função de perguntar para o usuário o tamanho do vetor; perguntar os valores para adicionar no vetor; perguntar qual método de ordenação deseja ( esse método chama outro método que imprime no console o vetor ordenado); imprimir o vetor antes da ordenação; imprime o tempo de execução de cada método de ordenação para fins de comparação do tempo; pergunta para o usuário se deseja continuar criando vetores; método que executa os três tipos de métodos de ordenação; método para auxiliar na validação do método de ordenação escolhido pelo usuário; e, por último, método auxiliar para validação da escolha se continuar ou não criando novos vetores;
### 1º sub-pasta -> exceptions 
##### Contém duas classe de exceções 'DataTypeException e ValueChoosenException' personalizadas que extende da classe padrão de exceção 'RuntimeException'. Como pode haver exceções na classe UI é disparado uma exceção personalizada e na classe Application ficará responsável por capturar e imprimir a mensagem do erro no console. 

## Como testar?
### Para realizar o teste pode fazer o clone do projeto e abrir na sua IDE de preferência e rodar a aplicação. 
