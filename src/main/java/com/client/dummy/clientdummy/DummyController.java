package com.client.dummy.clientdummy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class DummyController {

	@Value( "${user.newrole}")
	   public String newrole;
	@Value( "${user.role}")
	   public String role;
	 @RequestMapping(value = "/whoami/{username}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	    public String whoami(@PathVariable("username") String username) {
	        return String.format("Hello "+  username+"  I think you are having this role +role+ " +" new role"+newrole);
	    }
}
