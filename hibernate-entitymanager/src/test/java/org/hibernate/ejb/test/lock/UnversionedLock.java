//$Id$
package org.hibernate.ejb.test.lock;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

/**
 * @author Emmanuel Bernard
 */
@Entity
public class UnversionedLock {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
