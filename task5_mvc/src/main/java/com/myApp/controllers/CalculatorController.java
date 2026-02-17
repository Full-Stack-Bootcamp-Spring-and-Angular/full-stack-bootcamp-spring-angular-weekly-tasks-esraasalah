package main.java.com.myApp.controllers; 

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CalculatorController {

 @RequestMapping("/")
public String showHomePage()
{
     return "formPage";
}



@RequestMapping("/processForm")
public String processForm(HttpServletRequest request , Model model )
{
     String yearFromRequest = request.getParameter("year") ;
     String monthFromRequest = request.getParameter("month") ;
     String dayFromRequest = request.getParameter("day") ;

     model.addAttribute("year", yearFromRequest) ;
     model.addAttribute("month", monthFromRequest) ;
     model.addAttribute("day" , dayFromRequest) ;

     return "resultPage" ;

}


}