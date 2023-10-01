package com.agenda.app.ui;

public class Menu {

  private UI ui;

  public Menu(UI ui) {
    this.ui = ui;
  }

  public void header() {
    ui.print("|     Olá, querido usuário !       |");
    ui.print("+----------------------------------+");
    ui.print("| Bem-vindo ao Menu da sua Agenda. |");
    ui.print("|                                  |");
  }

  public void operacoes() {
    ui.print("");
    ui.print("| Escolha entre as opções :        |");
    ui.print("+----------------------------------+");
    ui.print("| 0. Sair                          |");
    ui.print("| 1. Incluir Contato               |");
    ui.print("| 2. Consultar Contato             |");
    ui.print("| 3. Alterar Contato               |");
    ui.print("| 4. Deletar Contato               |");
    ui.print("+----------------------------------+");
    ui.print("");
  }
}
