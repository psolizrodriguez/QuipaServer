package com.quipa.profile.web.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.profile.web.representation.ProfileRepresentation;
import com.quipa.profile.web.representation.ProfileRequest;
import com.quipa.profile.web.workflow.ProfileActivityImpl;

@Component
@Path("/profileservice/")
public class ProfileResource implements ProfileWebService {
	@Autowired
	ProfileActivityImpl profileActivity;

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/profile")
	public List<ProfileRepresentation> getProfiles() {
		System.out.println("GET METHOD Request for all profiles .............");
		return profileActivity.getProfiles();
	}

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/profile/{profileId}")
	public ProfileRepresentation getProfile(@PathParam("profileId") Long profileId) {
		return profileActivity.getProfile(profileId);
	}

	@POST
	@Produces({ "application/xml", "application/json" })
	@Path("/profile")
	public ProfileRepresentation createProfile(ProfileRequest profileRequest) {
		System.out.println("POST METHOD Request");
		return profileActivity.createProfile(profileRequest);
	}

	@POST
	@Path("/file")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(List<Attachment> attachments, @Context HttpServletRequest request) {
		System.out.println("Saving file");
		for (Attachment attr : attachments) {
			DataHandler handler = attr.getDataHandler();
			try {
				InputStream stream = handler.getInputStream();
				MultivaluedMap<String, String> map = attr.getHeaders();
				OutputStream out = new FileOutputStream(new File(AppBaseConstantsWeb.IMAGES_PATH + AppBaseUtilsWeb.getFileName(map)));
				int read = 0;
				byte[] bytes = new byte[1024];
				while ((read = stream.read(bytes)) != -1) {
					out.write(bytes, 0, read);
				}
				stream.close();
				out.flush();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return Response.ok("file uploaded").build();
	}

}