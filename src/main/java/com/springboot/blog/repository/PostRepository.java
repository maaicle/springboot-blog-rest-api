package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
   Tutorial says: Does not need @Repository annotation because JpaRepository is extended by JpaRepositoryImplementation
   which is implemented by SimpleJpaRepository which has the @Repository and @Transactional annotation. Not exactly sure
   why that works.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
}
