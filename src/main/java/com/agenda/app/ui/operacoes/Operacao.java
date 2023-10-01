package com.agenda.app.ui.operacoes;

import com.agenda.app.repository.ContatoRepository;
import com.agenda.app.ui.UI;

public abstract class Operacao {
    protected UI ui;

    public Operacao(UI ui) {
        this.ui = ui;
    }

    public abstract void execute(ContatoRepository repo);

    public boolean isLeave() {
        return false;
    }
    
    // public static void processarOpcao(int opcao) {
    //     switch (opcao) {
    //         case 0:
    //             System.out.println("Saindo da função.");
    //             break;
    //         case 1:
    //             System.out.println("Incluindo informações de contato.");
    //             // Adicione aqui o código para incluir informações de contato.
    //             break;
    //         case 2:
    //             System.out.println("Consultando informações de contato.");
    //             // Adicione aqui o código para consultar informações de contato.
    //             break;
    //         case 3:
    //             System.out.println("Alterando informações de contato.");
    //             // Adicione aqui o código para alterar informações de contato.
    //             break;
    //         case 4:
    //             System.out.println("Deletando informações de contato.");
    //             // Adicione aqui o código para deletar informações de contato.
    //             break;
    //     }
    //     ;
    // }
}
