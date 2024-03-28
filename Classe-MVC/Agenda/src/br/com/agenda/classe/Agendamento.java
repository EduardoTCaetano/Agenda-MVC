package br.com.agenda.classe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private Contato contato;
    private Date dtaAgenda;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Date getDtaAgenda() {
        return dtaAgenda;
    }

    public void setDtaAgenda(String data) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date dataResponse = f.parse(data);
        this.dtaAgenda = dataResponse;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contato:" + getContato() + "\n")
          .append("Data Agenda: " + getDtaAgenda()+ "\n");
        return sb.toString();
    }
}
