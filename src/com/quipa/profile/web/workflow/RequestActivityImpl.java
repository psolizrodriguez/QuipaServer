package com.quipa.profile.web.workflow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;
import com.quipa.model.profile.Request;
import com.quipa.profile.web.representation.RequestRepresentation;
import com.quipa.profile.web.representation.RequestRequest;
import com.quipa.service.profile.ProfileService;
import com.quipa.service.profile.RequestService;

@Service
public class RequestActivityImpl implements RequestActivity {

	@Autowired
	private ProfileService profileService;
	@Autowired
	private RequestService requestService;

	public RequestRepresentation createRequest(RequestRequest requestRequest) {
		Request request = new Request(null,
				AppBaseUtilsWeb.StringToCalendar(requestRequest.getDate(), AppBaseConstantsWeb.DATE_FORMAT),
				requestRequest.getFromHour(), requestRequest.getToHour(), requestRequest.getHours(),
				requestRequest.getPriceHour(), requestRequest.getSubTotal(), requestRequest.getTaxes(),
				requestRequest.getTransportation(), requestRequest.getTotal(), requestRequest.getRequiredSkill(),
				requestRequest.getJobTitle(), requestRequest.getDescription(),
				AppBaseConstantsWeb.REQUEST_STATUS_PENDING, profileService.getById(requestRequest.getProfileId()),
				profileService.getById(requestRequest.getProspectId()));
		request = requestService.save(request);
		return new RequestRepresentation(request);
	}

	public RequestRepresentation getRequest(Long requestId) {
		return new RequestRepresentation(requestService.getById(requestId));
	}

	@Override
	public List<RequestRepresentation> getRequestsByProfileId(Long profileId) {
		List<Request> requests = new ArrayList<>();
		List<RequestRepresentation> requestRepresentations = new ArrayList<>();
		requests = requestService.getRequestsByProfileId(profileId);
		System.out.println("request size " + requests.size());
		Iterator<Request> it = requests.iterator();
		while (it.hasNext()) {
			Request request = (Request) it.next();
			requestRepresentations.add(new RequestRepresentation(request));
		}
		return requestRepresentations;
	}

	@Override
	public List<RequestRepresentation> getRequestsByProspectId(Long prospectId) {
		List<Request> requests = new ArrayList<>();
		List<RequestRepresentation> requestRepresentations = new ArrayList<>();
		requests = requestService.getRequestsByProspectId(prospectId);
		System.out.println("request size " + requests.size());
		Iterator<Request> it = requests.iterator();
		while (it.hasNext()) {
			Request request = (Request) it.next();
			requestRepresentations.add(new RequestRepresentation(request));
		}
		return requestRepresentations;
	}

}
