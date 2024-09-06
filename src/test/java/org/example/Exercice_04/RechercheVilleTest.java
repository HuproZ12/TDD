package org.example.Exercice_04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;

    @BeforeEach
    public void init(){
        List<String> villes = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
        rechercheVille = new RechercheVille(villes);
    }

    // Si le texte de la recherche contient moins de 2 caractères, Une exception est levée de type NotFoundException.
    @Test
    public void testWhenSearchSizeLessThan_2_ThenResultNotFoundException() {
        Assertions.assertThrows(NotFoundException.class, () -> rechercheVille.Rechercher("a"));
    }
}
