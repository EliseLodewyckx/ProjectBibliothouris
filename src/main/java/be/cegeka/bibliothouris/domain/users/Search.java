package be.cegeka.bibliothouris.domain.users;

/**
 * Created by elisel on 25/01/2017.
 */
public interface Search {
    Book searchByISBN(long ISBN);
}
