package com.agenda.app.ui.operacoes;

import java.util.ArrayList;
import java.util.List;

import com.agenda.app.model.Contato;
import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public class Consultar extends Operacao {
  public Consultar(UI ui) {
    super(ui);
  }

  public void execute(ContatoRepository repo) {
    ui.print("Pelo que gostaria de pesquisar: ");
    ui.print("  1. Nome     :");
    ui.print("  2. Endereco :");
    ui.print("  3. Telefone :");
    ui.print("  4. Email    :");

    int opcao = validOption();
    String pesquisa = ui.input("Digite sua pesquisa: ");
    
    List<Contato> list;
    // TODO: refactor this to enum approach
    switch (opcao) {
      case 1:
        list = repo.findAllByNome(pesquisa);
        break;
      case 2:
        list = repo.findAllByEndereco(pesquisa);
        break;
      case 3:
        list = repo.findAllByTelefone(pesquisa);
        break;
      case 4:
        list = repo.findAllByEmail(pesquisa);
        break;
      default:
        list = new ArrayList<Contato>();
    }
    ui.clean();
    
    // tutorial: 
    // print table header
    list.forEach(c -> {
      //print table row
    });
    //print table footer
  }

  private int validOption() {
    int opcao = ui.inputInt("Digite um valor entre 1 e 4: ");
    if (opcao < 1 || opcao > 4) {
      return validOption();
    }
    return opcao;
  }
}
