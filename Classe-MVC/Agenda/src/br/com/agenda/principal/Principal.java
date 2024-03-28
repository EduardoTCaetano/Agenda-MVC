package br.com.agenda.principal;

// Atividade MVC - Integrantes Cauan Augusto Marioto e Leonardo Henrique Martucci Gussi

import br.com.agenda.classe.Agendamento;
import br.com.agenda.classe.Contato;
import br.com.agenda.control.Control;
import br.com.agenda.interfaces.IControl;
import java.text.ParseException;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Contato contato1 = new Contato();
        contato1.setNome("Eduardo Timossi Caetano");
        contato1.setDataNasc("11/01/2005");
        contato1.setCidade("Vista alegre do Alto - Sp");
        
        Contato contato2 = new Contato();
        contato2.setNome("João Gabriel Leite Guareschi");
        contato2.setDataNasc("26/05/2005");
        contato2.setCidade("Ibitinga - Sp");
        
        IControl<Contato> controlContato = new Control<Contato>();
        controlContato.inserir(contato1);
        controlContato.inserir(contato2);
        
        controlContato.mostar();
        controlContato.excluir(contato1);
        controlContato.mostar();
        
        Agendamento agendamento1 = new Agendamento();
        agendamento1.setContato(contato2);
        agendamento1.setDtaAgenda("30/04/2024");
        
        IControl<Agendamento> controlAgendamento = new Control<Agendamento>();
        controlAgendamento.inserir(agendamento1);
        
        controlAgendamento.mostar();
    }
}
