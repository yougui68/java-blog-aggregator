/**
 * 
 */
package com.yosri.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yosri.jpa.entity.User;

/**
 * @author Line
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
