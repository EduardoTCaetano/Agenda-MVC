package br.com.agenda.control;

import br.com.agenda.interfaces.IControl;
import java.util.ArrayList;
import java.util.List;

public class Control<T> implements IControl<T> {
    private List<T> lista;
    
    public Control(){
        lista = new ArrayList<T>();
    }

    @Override
    public void inserir(T t) {
        lista.add(t);
    }

   @Override
    public void mostar() {
        for(T t: lista) {
            System.out.println(t);
        }
    }

    @Override
    public void excluir(T t) {
       lista.remove(t);
    }
}
