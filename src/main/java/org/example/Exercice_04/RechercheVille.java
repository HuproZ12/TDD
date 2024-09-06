package org.example.Exercice_04;

import java.util.List;

public class RechercheVille {
    private List<String> villes;

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public List<String> Rechercher(String mot) throws NotFoundException {
        if(mot.length() < 2){
            throw new NotFoundException();
        }
        return null;
    }
}