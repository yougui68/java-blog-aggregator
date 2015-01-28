/**
 * 
 */
package com.yosri.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yosri.jpa.entity.Blog;

/**
 * @author Line
 *
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
