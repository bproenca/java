package br.com.bcp.tdd.domain.model;

import org.apache.commons.lang3.Validate;

/**
 * @author bruno.proenca
 */
public class User {

    private final String name;

    private final String password;

    public User(String name, String password) {
	Validate.notNull(name);
	Validate.notNull(password);

	if (name.equals(password)) {
	    throw new IllegalArgumentException("User name and password cannot be the same");
	}

	this.name = name;
	this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	User other = (User) obj;
	if (name == null) {
	    if (other.name != null) {
		return false;
	    }
	} else if (!name.equals(other.name)) {
	    return false;
	}
	return true;
    }

    public String getName() {
	return name;
    }

    public String getPassword() {
	return password;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public String toString() {
	return "User [name=" + name + ", password=" + password + "]";
    }
}
