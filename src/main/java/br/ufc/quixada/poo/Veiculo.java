package br.ufc.quixada.poo;

import java.time.Duration;

public abstract class Veiculo {
  private final String idenficador;

  public Veiculo(String id) {
    idenficador = id;
  }

  public String getIdentificador() {
    return idenficador;
  }

  public abstract double calcularValor(Duration duration);
}
