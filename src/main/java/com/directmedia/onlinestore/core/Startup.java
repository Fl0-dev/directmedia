package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {
    public static void main(String[] args) {

        //création de 3 artistes
        Artist bowie = new Artist("David Bowie");
        Artist pacino = new Artist("Al Pacino");
        Artist scarlett = new Artist("Scarlett Johansson");
        //création de 3 oeuvres
        Work lifeOnMars = new Work("Life on Mars");
        Work scarface = new Work("Scarface");
        Work underTheSkin = new Work("Under The Skin");
        //Ajout de l'artiste principal
        lifeOnMars.setMainArtist(bowie);
        scarface.setMainArtist(pacino);
        underTheSkin.setMainArtist(scarlett);
        //Ajout de l'année de sortie
        lifeOnMars.setRelease(1973);
        scarface.setRelease(1983);
        underTheSkin.setRelease(2013);
        //Ajout d'un résumé
        lifeOnMars.setSummary("Life on Mars? est une chanson de David Bowie parue en 1971 sur l'album Hunky Dory.");
        scarface.setSummary("Scarfacen est un film de gangsters américain réalisé par Brian De Palma, sorti en salles aux États-Unis en décembre 1983.");
        underTheSkin.setSummary("Under the Skin est un film de science-fiction britannique de Jonathan Glazer, sorti en 2013.");
        //Ajout du genre
        lifeOnMars.setGenre("Pop-Rock");
        scarface.setGenre("Drame");
        underTheSkin.setGenre("Drame");
        //Ajout au catalogue
        Catalogue.listOfWorks.add(lifeOnMars);
        Catalogue.listOfWorks.add(scarface);
        Catalogue.listOfWorks.add(underTheSkin);
        //Affichage
        for (Work work:Catalogue.listOfWorks) {
            System.out.printf("%s (%d)%n",work.getTitle(),work.getRelease());
        }

    }
}
