package ba.lam.model.dao;

import ba.lam.model.entity.Blog;

import java.util.List;

public interface IBlogDao {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
