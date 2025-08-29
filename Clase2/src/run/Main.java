package run;

import models.Carrera;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //simplemente se le da un nombre al objeto, en este caso isi, pero no significa nada en especifico
        Carrera isi = new Carrera("Ingenieria en sistema de informacion","001", 10000);

        Carrera nuevaCarrera = new Carrera();
        nuevaCarrera.setNombre("Ingenieria en sistema de informacion");
        nuevaCarrera.setCodigo("001");
        nuevaCarrera.setPrecio(15000);

        System.out.println(isi);
        JOptionPane.showMessageDialog(null, nuevaCarrera);

    }

}
