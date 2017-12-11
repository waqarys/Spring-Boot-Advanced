package shaikh.waqar.io.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

	@RequestMapping(value="/upload", method=RequestMethod.POST, produces = MediaType.IMAGE_GIF_VALUE)
	public String upload(@RequestPart("file") MultipartFile file,
			@RequestParam("start") int start,
			@RequestParam("end") int end,
			@RequestParam("speed") int speed,
			@RequestParam("repeat") boolean repeat){
		
		
				return null;
	}
}
