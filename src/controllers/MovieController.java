package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        for(int i=1;i<movies.length;i++){
            Movie key = movies[i];
            int j=i-1;
            while(j>=0 && (movies[j].getTitle().compareTo(key.getTitle()))>0){
                movies[j+1]=movies[j];
                j--;
            }
            movies[j+1]=key;
        }
    }
    public static void mostrarLista(Movie[] movies){
        for(Movie mov: movies){
            System.out.println(mov);
        }
    }

}
