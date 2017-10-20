package com.quipa.common.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.quipa.common.constants.AppBaseConstantsWeb;
import com.quipa.common.utility.AppBaseUtilsWeb;

@Controller
public class UploadController {

	@RequestMapping(value = "/viewProfilePicture", method = RequestMethod.GET)
	public void viewProfilePicture(@RequestParam Long profileId, HttpServletRequest request,
			HttpServletResponse response) {
		InputStream is = null;
		try {
			File theFile = new File(AppBaseConstantsWeb.IMAGES_PATH);
			theFile.mkdirs();
			String logoName = profileId + AppBaseConstantsWeb.PROFILE_PICTURE_EXTENSION;
			is = new FileInputStream(
					AppBaseConstantsWeb.IMAGES_PATH + logoName);
			AppBaseUtilsWeb.setContentTypeHelper(response, AppBaseConstantsWeb.PROFILE_PICTURE_EXTENSION, logoName);
			IOUtils.copy(is, response.getOutputStream());
			response.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
			is = null;
		}
		if (is == null) {
			System.out.println("image NotFound");
			try {
				File theFile = new File(AppBaseConstantsWeb.IMAGES_PATH);
				theFile.mkdirs();
				String logoName = 0 + AppBaseConstantsWeb.PROFILE_PICTURE_EXTENSION;
				is = new FileInputStream(
						AppBaseConstantsWeb.IMAGES_PATH + logoName);
				AppBaseUtilsWeb.setContentTypeHelper(response, AppBaseConstantsWeb.PROFILE_PICTURE_EXTENSION, logoName);
				IOUtils.copy(is, response.getOutputStream());
				response.flushBuffer();
			} catch (IOException e) {
				e.printStackTrace();
				is = null;
			}
		}
	}
}
