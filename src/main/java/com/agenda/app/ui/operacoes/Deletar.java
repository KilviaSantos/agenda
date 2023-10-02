package com.agenda.app.ui.operacoes;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Deletar extends Operacao{

  public Deletar(UI ui) {
    super(ui);
  }

  @Override
  public void execute(ContatoRepository repo) {
    ui.print("Deletando Contato ...");
    int id = inputValidId(repo);
    
    repo.deleteById(id);
    
    ui.print("Contato deletado com sucesso!");
  }

  private int inputValidId(ContatoRepository repo){
    int id = ui.inputInt("Digite o ID do contato que deseja deletar:");
    if (!repo.existsById(id)) {
      ui.print("ID não encontrado! Tente novamente.\n");
      return inputValidId(repo);
    }
    return id; 
  }
}
