
package com.egg.newsEgg.repositories;

import com.egg.newsEgg.Entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drome
 */
@Repository
public interface NewsRepository extends JpaRepository<News, String>{
    
    @Query("Select n from News n where n.title = title")
    public News findbyTitle(@Param("title") String title);
    
     
    
    
}
