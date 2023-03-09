package br.com.vinicius.adapter;

import java.io.File;

public class DropBoxAdapter implements IPersistenciaArquivos {

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.upload(new DropBoxFile(file.getAbsolutePath()));
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile dbFile = dropBox.download(caminho);
        return new File(dbFile.getLocalPath());
    }
}
