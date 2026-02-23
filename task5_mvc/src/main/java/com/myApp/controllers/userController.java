package com.myApp.controllers;

import java.time.LocalDate;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

     @RequestMapping("/register")
    public String showHomePage()
    {
        return "userForm";
    }





    @RequestMapping("/userData")
    public String processForm(HttpServletRequest request , Model model)
    {
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"));
        String city = request.getParameter("city");
        


          // save the user data in database 

          // get user data from database to be displayed in the user profile page 

          

        //step2: add name to model
        model.addAttribute("firstName" , firstName);
        model.addAttribute("lastName", lastName) ;
        model.addAttribute("dateOfBirth", dateOfBirth);
        model.addAttribute("city" , city);
         
        //step3: return view page
        return "userData";
    }
      


}
