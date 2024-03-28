package br.com.agenda.classe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart.Data;

public class Contato {
    private String nome;
    private Date dataNasc;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String data) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date dataResponse = f.parse(data);
        this.dataNasc = dataResponse;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       
            sb.append("Nome:" + getNome() + "\n")
            .append("Data de nascimento: " + getDataNasc() + "\n")
            .append("Cidade: " + getCidade()+ "\n");
        return sb.toString();
    }
}
