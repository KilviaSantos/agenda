package com.agenda.app.ui.operacoes;

import com.agenda.app.model.Contato;
import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Criar extends Operacao {
  public Criar(UI ui) {
    super(ui);
  }

  @Override
  public void execute(ContatoRepository repo) {
    ui.print("Criando Contato ...");

    String nome = ui.input("Digite o nome do contato:");
    String endereco = ui.input("Digite o endereço do contato:");
    String telefone = inputValidPhone();
    String email = inputValidEmail();

    Contato contato = new Contato(nome, endereco, telefone, email);
    Contato saved = repo.save(contato);

    ui.clean();
    ui.print("Contato salvo:");
    ui.print(saved.toString());
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
