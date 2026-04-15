// Sistema de veiculos - 4 Pilares da POO em Java
// Uma locadora de veiculos calcular o valor da diaria
// de diferentes tipos de veiculos (carro e moto).
// Cada tipo tem seu proprio calculo.

// Pilar 1 - Abstracao
// Modelar apenas o que importa: marca, modelo, ano, placa, preco base.
// Metodo calcularDiaria() abstrato pois cada veiculo tera sua propria diaria (calcular).

abstract class Veiculo {
    //Atributos protegidos - > encapsulamentos
    private String marca;
    private String modelo;
    private  int ano;
    private String placa;
    private  double precoBase;

    //Construtor da classe
    public  Veiculo(String marca, String modelo, int ano, String placa, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;

    }

    ///  Metodo abstrato - Cada subtipo define o calculo
    public abstract double calcularDiaria();

    // Pilar 2 - Encapsulamento
    // Modificadores Via Getters e Setters
    // O Setter de precobase tem validacao: nao aceita valores negativos

    public String getMarca () {
        return marca;
    }

    public String getModelo () {
        return modelo;
    }

    public String getPlaca() {
        return  placa;
    }
    public int getAno () {
        return ano;
    }
    public double getPrecoBase () {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0) {
            System.out.println("Erro: preco nao pode ser negativo");
            return;
        }

        this.precoBase = precoBase;

    }

    public  String exibirDados () {
        return marca + " " + modelo + " (" + ano + ")";

     }

}

// Pilar 3 - Heranca
// Carro e moto herdam tudo de veiculo, mas cada um adiciona
// seus proprios atributos e implementa calcularDiaria() do seu jeito.
// carro -> qidPortas (atributo)
// metodo calcularDiaria -> se qidPortas >= 4 ent~ao acrescimo de 20%











