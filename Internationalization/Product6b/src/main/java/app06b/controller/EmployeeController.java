package app06b.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import app06b.domain.Employee;
import app06b.domain.FileUpload;

@org.springframework.stereotype.Controller
@SessionAttributes("employee")
public class EmployeeController {

	private static final Log logger = LogFactory
			.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(Employee employee) {
		System.out.println("Hello EmployeeForm.");
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid @ModelAttribute Employee employee,
			BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException(
					"You've attempted to bind fields that haven't been allowed in initBinder(): "
							+ StringUtils.addStringToArray(suppressedFields,
									", "));
		}
		
		// save product here
		
		model.addAttribute("employee", employee);
		
		//return "EmployeeDetails";
		model.addAttribute("fileUpload", new FileUpload());
		return "UploadImage";
	}
	
	@RequestMapping(value="/uploadImage", method = RequestMethod.POST)
	public String uploadImage(@RequestParam ("file")MultipartFile file,@RequestParam("name") String name
			, HttpServletRequest request,@ModelAttribute Employee employee,
			SessionStatus status) throws FileNotImageTypeException {

		String rootDirectory = request.getServletContext().getRealPath("/");

		System.out.println("root directory = " + rootDirectory);

		if (!file.isEmpty()) {
			if(!file.getOriginalFilename().endsWith("PNG")){
				throw new FileNotImageTypeException();
			}
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = rootDirectory;
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				// return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				// return "You failed to upload " + name + " => " +
				// e.getMessage();
			}
		} else {
			// return "You failed to upload " + name
			// + " because the file was empty.";
		}

		status.setComplete();
		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields("id");
		// binder.setRequiredFields("username", "password", "emailAddress");
		logger.info("initBinderin EmployeeController");
	}
	
	@ExceptionHandler(FileNotImageTypeException.class)
	public ModelAndView handleError(HttpServletRequest req,
			FileNotImageTypeException exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("invalidProductId", exception.getMessage());
		mav.setViewName("ImageUploadError");
		return mav;
	}
	
}
