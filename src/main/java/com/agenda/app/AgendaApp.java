package com.agenda.app;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.Menu;
import com.agenda.app.ui.OperacaoUI;
import com.agenda.app.ui.UI;
import com.agenda.app.ui.operacoes.Operacao;

@Component
public class AgendaApp implements CommandLineRunner  {
  
  private UI ui;
  private ContatoRepository repo;

  public AgendaApp(ContatoRepository repo){
    this.ui = new UI();
    this.repo = repo;  
  }

  @Override
  public void run(String... args) throws IOException {
    Menu menu = new Menu(ui);
    menu.header();
    
    do {
      menu.operacoes();
      Operacao op = OperacaoUI.get(ui);
      
      ui.clean();
      op.execute(repo);
      
      if (op.isLeave()) {
        
        break;
      }
    } while(true);    
  
    this.ui.print("\n\nFIM\n\n");
  }
}
