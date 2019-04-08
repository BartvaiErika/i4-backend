package fundamentals2.excercise6part1;

import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertThat;

@SpringBootTest
class BooksTest {
    @Autowired
    Books books;

    @ParameterizedTest
    @CsvSource({
            "Harry Potter, 3",
            "The Foundation, 2",
            "The Lord of the Rings, 4"
    })
    void getBookshop(String book, Integer copies) {
        List<Book> ListOfBooks = books.getBook();
        Map<String,Integer> actual = ListOfBooks.stream().collect(Collectors.toMap(e->e.getTitle(),e->e.getCopies()));
        assertThat(actual, IsMapContaining.hasEntry(book,copies));
    }
}