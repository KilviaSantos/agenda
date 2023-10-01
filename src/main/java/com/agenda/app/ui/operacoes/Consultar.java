package com.agenda.app.ui.operacoes;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Consultar extends Operacao {
  public Consultar(UI ui) {
    super(ui);
  }

  public void execute(ContatoRepository repo){
    ui.print("Consultando ...");
  }
}
