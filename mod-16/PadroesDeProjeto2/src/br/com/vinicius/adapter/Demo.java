package br.com.vinicius.adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String caminhoFile = "tmp/teste.txt";

        // Lib "externa"
        DropBox dropBox = new DropBox();
        IPersistenciaArquivos persistencia = new DropBoxAdapter(dropBox);
        persistencia.gravar(new File(caminhoFile));
    }
}
