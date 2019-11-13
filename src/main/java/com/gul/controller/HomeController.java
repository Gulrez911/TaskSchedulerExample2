package com.gul.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.gul.entity.UploadedFile;

@Controller
public class HomeController {

	private Logger logger = Logger.getLogger(HomeController.class);

	@GetMapping("/")
	public String view() {
		logger.info("View method called");
		System.out.println("testing");
		return "index";
	}

	@RequestMapping("/save-product")
	public void saveFile(HttpServletRequest request, @ModelAttribute UploadedFile uploadedFile,
			BindingResult bindingResult, Model model) {

		MultipartFile multipartFile = uploadedFile.getMultipartFile();
		String fileName = multipartFile.getOriginalFilename();
		try {
			File file = new File(request.getSession().getServletContext().getRealPath("/image"), fileName);
			multipartFile.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/product-input-form")
	public String inputProduct(Model model) {
		return "productForm";
	}
}
