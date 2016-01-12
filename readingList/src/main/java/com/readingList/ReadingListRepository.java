
package readingList;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Datatakes care of implemting the Repository you defined with the
// interface
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}