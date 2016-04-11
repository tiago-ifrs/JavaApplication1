/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author redes2
 */
public class Valores implements ValoresITF {

    private final ArrayList<Integer> vetor;

    @Override
    public boolean ins(int v) {
        if (v > 0) {
            if (size() < 10) {
                return this.vetor.add(v);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int del(int i) throws IndexOutOfBoundsException {
        int valor;
        if (i >= this.vetor.size()) {
            return -1;
        } else {
            if (this.vetor.size() >= 0) {
                valor = this.vetor.remove(i);
                return valor;
            } else {
                return -1;
            }
        }
    }

    @Override
    public int size() {
        /*
        int s = 0;
        if (this.vetor != null) {
            s = this.vetor.size();
        }
        return s;*/
        return this.vetor.size();
    }

    @Override
    public double mean() {
        double acc = 0;
        for (int i = 0; i < size(); i++) {
            acc += (double) this.vetor.get(i);
        }
        return acc / size();
    }

    @Override
    public int greater() {
        int maior = 0;
        int at;
        if (size() > 0) {
            for (int i = 0; i < size(); i++) {
                at = vetor.get(i);
                if (at > maior) {
                    maior = at;
                }
            }
            return maior;
        } else {
            return -1;
        }
    }

    @Override
    public int lower() {
        int menor;
        int at;
        if (size() > 0) {
            menor = vetor.get(0);
            for (int i = 0; i < size(); i++) {
                at = vetor.get(i);
                if (at < menor) {
                    menor = at;
                }
            }
            return menor;
        } else {
            return -1;
        }
    }

    public Valores() {
        this.vetor = new ArrayList();

    }

}
