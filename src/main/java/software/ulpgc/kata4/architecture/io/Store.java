package software.ulpgc.kata4.architecture.io;

import software.ulpgc.kata4.architecture.Model.Movie;

import java.util.List;
import java.util.stream.Stream;

public interface Store {
    Stream<Movie> movies();
}
