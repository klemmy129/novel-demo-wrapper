package com.klemmy.novel.ghostwriter.service;

import com.klemmy.novelideas.api.BookDto;
import com.klemmy.novelideas.api.CharacterGenderDto;
import com.klemmy.novelideas.client3.NovelIdeasClient3;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ImportAutoConfiguration
@AllArgsConstructor
public class GhostWriterService3 {

  private final NovelIdeasClient3 novelIdeasClient3;

//TODO Pageable is not working
//  public Page<BookDto> loadAllBooks(String queryTitle, LocalDateTime startDate, LocalDateTime endDate,
//                                        BookState state, PageRequest pageable) {
//    return novelIdeasClient33.getAllBooks(queryTitle,
//        startDate,
//        endDate,
//        state,
//        pageable);
//  }

  public BookDto getBook(Integer id) {
    return novelIdeasClient3.getBooKById(id);
  }

  public List<CharacterGenderDto> getAllGenders() {
    return novelIdeasClient3.getAllGenders();
  }
}
