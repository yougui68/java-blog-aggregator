/**
 * 
 */
package com.yosri.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yosri.jpa.entity.Item;

/**
 * @author Line
 *
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
