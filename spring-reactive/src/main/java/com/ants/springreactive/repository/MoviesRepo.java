package com.ants.springreactive.repository;

import com.ants.springreactive.vo.MovieDetails;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MoviesRepo extends ReactiveMongoRepository<MovieDetails,Long> {

    public Flux<MovieDetails> findByreleaseYear(Integer releaseYear);
}
