package ca.informaticien.dev.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "reviews")
@Data // Extencion que se encarga de la gestion de GET/SET/STRING de cada atributo
@AllArgsConstructor //Facilita el constructor con todos los argumentos
@NoArgsConstructor

public class Review {

    @Id
    private ObjectId id;

    private String body;

    public Review(String body) {
        this.body = body;
    }
}