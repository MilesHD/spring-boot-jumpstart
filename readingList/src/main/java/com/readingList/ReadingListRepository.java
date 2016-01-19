
package com.readingList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data takes care of instantiating and configuring the Repository
// you defined with the interface
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}