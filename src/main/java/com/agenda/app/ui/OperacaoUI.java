package com.agenda.app.ui;

import com.agenda.app.ui.operacoes.Operacao;

public class OperacaoUI {

  public static Operacao get(UI ui) {
    int opcao = getValidOption(ui);

    return Functionalidades.get(opcao).apply(ui);
  }

  private static int getValidOption(UI ui) {    
    int opcao = ui.inputInt("Digite uma opção (0, 1, 2, 3, ou 4):");
    
    if (opcao < 0 || opcao > 4) {
      return getValidOption(ui);
    }
    return opcao;
  }
}
