package Aula.construtor;
import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Kaio", 31);
        System.out.println(p1.exibirDados()); 

        Pessoa p2 = new Pessoa("Vitor", 31);
        System.out.println(p2.exibirDados()); 

    }
}