package com.company;

import com.company.models.UsuarioJogo;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo marcelo = new UsuarioJogo("Marcelo","LFo");
        System.out.println(marcelo.getPontuacao());
    }
}

