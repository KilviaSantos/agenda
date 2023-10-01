package com.agenda.app.ui.operacoes;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Sair  extends Operacao {
  public Sair(UI ui) {
    super(ui);
  }

  public void execute(ContatoRepository repo) {
    ui.print("Saindo ...");
  }

  public boolean isLeave(){
    return true;  
  }
}
