package com.agenda.app.ui.operacoes;

import com.agenda.app.model.Contato;
import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Alterar extends Operacao {

  public Alterar(UI ui) {
    super(ui);
  }

  @Override
  public void execute(ContatoRepository repo) {
    ui.print("Alterando Contato...\n");

    int id = inputValidId(repo);
    String nome = ui.input("Digite o nome do contato:");
    String endereco = ui.input("Digite o endereço do contato:");
    String telefone = inputValidPhone();
    String email = inputValidEmail();

    Contato contato = new Contato(nome, endereco, telefone, email);
    contato.setId(id);

    Contato saved = repo.save(contato);

    ui.clean();
    ui.print("Contato alterado:");
    ui.print(saved.toString());
  }
  
  private int inputValidId(ContatoRepository repo){
    int id = ui.inputInt("Digite o ID do contato:");
    if (!repo.existsById(id)) {
      ui.print("ID não encontrado! Tente novamente.\n");
      return inputValidId(repo);
    }
    return id;
 
  }

  private String inputValidPhone(){
    String telefone = ui.input("Digite o telefone do contato:");
    // TODO: implement validation here 
    
    return telefone;
  }

    private String inputValidEmail(){
    String telefone = ui.input("Digite o email do contato:");
    // TODO: implement validation here 
    
    return telefone;
  }
}
