package com.quipa.profile.web.service;

import java.util.List;

import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.quipa.profile.web.representation.ProfileRepresentation;
import com.quipa.profile.web.representation.ProfileRequest;

@WebService
public interface ProfileWebService {

	public List<ProfileRepresentation> getProfiles();

	public ProfileRepresentation getProfile(Long profileId);

	public ProfileRepresentation createProfile(ProfileRequest profileRequest);

	public Response uploadFile(List<Attachment> attachments, HttpServletRequest request);

	public ProfileRepresentation profileLogin(String mobilePhoneNumber, String password);

}
