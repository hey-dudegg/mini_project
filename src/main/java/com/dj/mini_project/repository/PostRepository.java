package com.dj.mini_project.repository;

import com.dj.mini_project.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long>, CrudRepository<Post,Long> {
}
