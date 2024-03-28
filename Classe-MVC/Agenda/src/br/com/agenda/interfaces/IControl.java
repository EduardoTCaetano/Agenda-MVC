package br.com.agenda.interfaces;

public interface IControl<T> {
    void inserir(T t);
    void mostar();
    void excluir(T t);
}
