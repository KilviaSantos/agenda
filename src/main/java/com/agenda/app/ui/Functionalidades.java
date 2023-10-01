package com.agenda.app.ui;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import com.agenda.app.ui.operacoes.Alterar;
import com.agenda.app.ui.operacoes.Consultar;
import com.agenda.app.ui.operacoes.Criar;
import com.agenda.app.ui.operacoes.Deletar;
import com.agenda.app.ui.operacoes.Operacao;
import com.agenda.app.ui.operacoes.Sair;

public class Functionalidades {
  private static final Map<Integer, Function<UI, Operacao>> OPERACOES; 

  static {
    final Map<Integer, Function<UI, Operacao>> list = new HashMap<>();
   
    list.put(0, (ui) -> new Sair(ui));
    list.put(1, (ui) -> new Criar(ui));
    list.put(2, (ui) -> new Consultar(ui));
    list.put(3, (ui) -> new Alterar(ui));
    list.put(4, (ui) -> new Deletar(ui));

    OPERACOES = Collections.unmodifiableMap(list);
  }

  public static Function<UI, Operacao> get(int opcao) {
    Function<UI, Operacao> getOperacao = OPERACOES.get(opcao);
    
    if (getOperacao == null) {
      throw new IllegalArgumentException("Operacao invalida: " + opcao);
    }

    return getOperacao;
  }
}
