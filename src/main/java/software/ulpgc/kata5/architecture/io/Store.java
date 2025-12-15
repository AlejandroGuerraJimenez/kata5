package software.ulpgc.kata5.architecture.io;

import software.ulpgc.kata5.architecture.Model.Movie;

import java.util.stream.Stream;

public interface Store {
    Stream<Movie> movies();
}
