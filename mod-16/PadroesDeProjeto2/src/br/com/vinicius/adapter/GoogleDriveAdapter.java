package br.com.vinicius.adapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GoogleDriveAdapter implements IPersistenciaArquivos {

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googleDrive) {
        this.googleDrive = googleDrive;
    }

    @Override
    public void gravar(File file) {
        String name = file.getName();
        try {
            byte[] bytes = Files.readAllBytes(file.toPath());
            googleDrive.send(bytes, name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public File ler(String caminho) {
        Path path = Paths.get(caminho);
        try {
            Files.write(path, googleDrive.get(caminho));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new File(path.toUri());
    }
}
