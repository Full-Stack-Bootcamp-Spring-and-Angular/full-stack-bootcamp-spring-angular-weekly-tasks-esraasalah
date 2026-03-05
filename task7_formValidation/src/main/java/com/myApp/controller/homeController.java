package com.myApp.controller;

import com.myApp.model.Employee;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class homeController {

    @RequestMapping("/")
    public String showEmployeeForm(Model model){

          Employee employee = new Employee();
          model.addAttribute("employee",employee);

        System.out.println("showEmployeeForm");
        return "employeeForm";

    }

    @RequestMapping("/employeeData")
    public String saveEmployeeForm(@Valid    @ModelAttribute("employee") Employee employee , BindingResult bindingResult , Model model){
        System.out.println("saveEmployeeForm");

    if(bindingResult.hasErrors()){
        return "employeeForm";
     }


        return "employeeData" ;

    }



    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,stringTrimmer);



    }





}
