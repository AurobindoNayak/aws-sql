package com.ants.springreactive.controller;

import com.ants.springreactive.repository.MoviesRepo;
import com.ants.springreactive.vo.MovieDetails;
import jakarta.validation.Valid;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Flux;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
public class MoviesController {

    @Autowired
    private MoviesRepo moviesRepo;

    @PostMapping("/saveAllMovies")
    public Flux<MovieDetails> saveAllMovie(@RequestBody @Valid Flux<MovieDetails> md) {
        return moviesRepo.saveAll(md);
    }

    @PostMapping("/saveMovie")
    public ResponseEntity<Mono<MovieDetails>> saveMovie(@RequestBody @Valid MovieDetails md) {
        return new ResponseEntity<>(moviesRepo.save(md), HttpStatus.CREATED);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Mono<MovieDetails>> findMovieById(@PathVariable long id) {
        return new ResponseEntity<>(moviesRepo.findById(id), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Flux<MovieDetails>> findMovieById() {
        return new ResponseEntity<>(moviesRepo.findAll(), HttpStatus.CREATED);
    }

    @PutMapping("/updates/{id}")
    public Mono<ResponseEntity<MovieDetails>> updateMovieWithResponseEntity(@RequestBody MovieDetails md, @PathVariable long id) {

        Mono<MovieDetails> movieDetailsMono = moviesRepo.findById(id).flatMap(x -> {
            x.setMovieId(id);
            x.setMovieName(md.getMovieName());
            x.setReleaseYear(md.getReleaseYear());
            return moviesRepo.save(x);
        });

//        return movieDetailsMono.map(x -> {
//            return new ResponseEntity<>(x, HttpStatus.OK);
//        });

        //this is for checking empty or not
        return movieDetailsMono.map(ResponseEntity::ok)
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/update/{id}")
    public Mono<MovieDetails>updateMovie(@RequestBody MovieDetails md, @PathVariable long id) {
        return moviesRepo.findById(id).flatMap(x -> {
            x.setMovieId(id);
            x.setMovieName(md.getMovieName());
            x.setReleaseYear(md.getReleaseYear());
            return moviesRepo.save(x);
        });
    }

    @GetMapping("/get/{year}")
    public ResponseEntity<Flux<MovieDetails>> findByyear(@PathVariable int year){
        //MovieDetails byreleaseYear = moviesRepo.findByreleaseYear(year);
        return new ResponseEntity<>(moviesRepo.findByreleaseYear(year),HttpStatus.OK);
    }
}
