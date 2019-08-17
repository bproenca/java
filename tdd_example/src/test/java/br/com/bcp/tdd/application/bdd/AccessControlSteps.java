package br.com.bcp.tdd.application.bdd;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import br.com.bcp.tdd.application.AccessControl;
import br.com.bcp.tdd.domain.model.User;
import br.com.bcp.tdd.domain.rep.UsersRepository;
import br.com.bcp.tdd.domain.service.Authenticator;
import br.com.bcp.tdd.infra.UsersRepositoryDAO;

public class AccessControlSteps {

	private UsersRepository usersRepository = new UsersRepositoryDAO();
	private Authenticator authenticator = new Authenticator();
	private AccessControl accessControl = null;
	private User user = null;
	
	@Given("that a user access the system")
	public void accessTheSystem() throws Exception {
		accessControl = new AccessControl(usersRepository, authenticator);
	}
	
	@When("he tries to login with user $pUser and password $pPass")
	public void doLogin(String pUser, String pPass){
		user = accessControl.login(pUser.replaceAll("\"", ""), pPass.replaceAll("\"", ""));
	}
	
	@Then("he should see the functionalities")
	// Pretend when User not null = can access the functionalities
	public void seeFunctionalities() {
		Assert.assertNotNull(user);
	}
		
	@BeforeScenario
	public void before() throws Exception {
		usersRepository.save(new User("bill", "kkk"));
	}
	
	@AfterScenario
	public void after() {
		usersRepository.remove(usersRepository.findByName("bill"));
	}
}
