package com.agenda.app.ui.operacoes;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Deletar extends Operacao{

  public Deletar(UI ui) {
    super(ui);
  }

  @Override
  public void execute(ContatoRepository repo) {
    ui.print("Deletando ...");
  }
  
}
