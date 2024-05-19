package Exceptions;

public class MagiaInsuficienteException extends Exception{
    public MagiaInsuficienteException(String nome){
        super(nome+" não tem magia suficiente para este ataque.");
    }
}
