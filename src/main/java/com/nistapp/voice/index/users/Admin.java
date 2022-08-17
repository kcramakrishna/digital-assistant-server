package com.nistapp.voice.index.users;

import io.quarkus.security.Authenticated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/admin")
@Authenticated
public class Admin {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String admin() {
		return "granted";
	}

}