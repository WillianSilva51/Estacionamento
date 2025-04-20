package br.ufc.quixada.poo;

public class Carro extends Veiculo {

  public Carro(String id) {
    super(id);
  }

  public double calcularValor(Long duration) {
    return Math.max(duration * 0.1, 5);
  }
}