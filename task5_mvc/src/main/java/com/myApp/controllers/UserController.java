package com.myApp.controllers;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import com.myApp.dao.DataBaseOperations;
import com.myApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    DataBaseOperations dataBaseOperations ;

     @RequestMapping("/register")
    public String showHomePage()
    {
        return "register";
    }





    @RequestMapping("/userData")
    public String processForm(HttpServletRequest request , Model model)
    {
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"));
        String city = request.getParameter("city");
        


          // save the user data in database 

        User user = new User(null , firstName , lastName , dateOfBirth , city) ;
        System.out.println("save user to database");


        dataBaseOperations.saveUser(user);


          

        //step2: add name to model
        model.addAttribute("firstName" , firstName);
        model.addAttribute("lastName", lastName) ;
        model.addAttribute("dateOfBirth", dateOfBirth);
        model.addAttribute("city" , city);
         
        //step3: return view page
        return "userData";
    }
      


}
