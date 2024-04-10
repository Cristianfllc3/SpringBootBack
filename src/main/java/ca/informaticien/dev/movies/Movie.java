package ca.informaticien.dev.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Document(collection = "movies")
@Data // Extencion que se encarga de la gestion de GET/SET/STRING de cada atributo
@AllArgsConstructor //Facilita el constructor con todos los argumentos
@NoArgsConstructor

public class Movie {

    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference(lazy = false)  //Una de las formas de crear relacion entre tablas "MANUAL REFERENCE RELATIONSHIP"
    private List<Review> reviewIds;

}

