package demo24.com.example2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller1 {
@RequestMapping("/")
public String s1()
{
	return"hello";
	
}
}
