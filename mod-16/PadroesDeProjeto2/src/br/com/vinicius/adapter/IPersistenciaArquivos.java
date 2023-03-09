package br.com.vinicius.adapter;

import java.io.File;

public interface IPersistenciaArquivos {

    void gravar(File file);

     File ler(String caminho);
}
