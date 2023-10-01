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
}
