package com.ants.springreactive.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection= "MovieDetails")
public class MovieDetails {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;
    @NotNull
    @NotBlank(message = "movieName must be present")
    private String movieName;
    @NotNull
    @Positive(message = "releaseYEar should be a valid year")
    private int releaseYear;
}
