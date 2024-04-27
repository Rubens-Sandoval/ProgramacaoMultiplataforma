A classe "Car" define a entidade carro e suas variáveis, possui encapsulamento e um método para exibir seus atributos.

A classe abstrata "CarCreator" deixa uma um objeto da classe "Car" criado para uso futuro e cria a assinatura do método factoryMethod.

A classe "Client" contém o método main onde cria duas intancias de CarCreator, uma utilizando a classe de aplicação FiatConcretCreator e outra utilizando VolksConcretCreator.

As classes "ConcretProductGol" e "ConcretProductPalio" são subclasses da classe "Car", onde são definidos seus atributos.

As classes "FiatConcretCreator" e "VolksConcretCreator" são implementações da classe abstrata "CarCreator".