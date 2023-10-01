package com.agenda.app.ui.operacoes;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Alterar extends Operacao {

  public Alterar(UI ui) {
    super(ui);
  }

  @Override
  public void execute(ContatoRepository repo) {
    ui.print("Alterando ...");
  }
}
