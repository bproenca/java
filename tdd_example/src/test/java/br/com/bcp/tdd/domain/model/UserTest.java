/**
 *
 */
package br.com.bcp.tdd.domain.model;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author bruno.proenca
 */
public class UserTest {

    @Test(expected = NullPointerException.class)
    public void test_construct_User_passing_null_name() {
	new User(null, "x");
    }

    @Test(expected = NullPointerException.class)
    public void test_construct_User_passing_null_password() {
	new User("x", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_construct_User_with_invalid_password() {
	new User("c", "c");
    }

    @Test
    public void test_construct_User_with_valid_password() {
	Assert.assertNotNull(new User("a", "b"));
    }
}
