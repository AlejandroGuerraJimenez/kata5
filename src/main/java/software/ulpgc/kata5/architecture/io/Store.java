package software.ulpgc.kata5.architecture.io;

import software.ulpgc.kata5.architecture.Model.Movie;

import java.sql.SQLException;
import java.util.stream.Stream;

public interface Store {
    Stream<Movie> movies() throws SQLException;
}
