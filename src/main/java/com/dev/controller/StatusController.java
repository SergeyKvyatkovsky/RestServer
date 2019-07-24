package com.dev.controller;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import org.springframework.http.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin
@RestController
@RequestMapping("/request")
public class StatusController {
    //http://localhost:8084/remind/get

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    //@ResponseBody
//    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    public ResponseEntity<String> getStatus(ModelMap modelMap){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "http://tut.by");
        return new ResponseEntity<String>("privet Serega", httpHeaders, HttpStatus.MOVED_PERMANENTLY);
    }

    @RequestMapping(value = "/gett", method = RequestMethod.GET)
    @ResponseBody
    public String getStatus200(ModelMap modelMap){
        return "Ошибка 200";
    }

    @RequestMapping(value = "/getty", method = RequestMethod.POST)
    @ResponseBody
    public String getStatus100(ModelMap modelMap){

        return "dfgergerwergwergg";
    }
    
    @PostMapping(value = "/product", consumes = MediaType.ALL_VALUE)
    public String add(@RequestBody String name){
        //HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.add("Access-Control-Allow-Origin","*");
        StringBuilder sb = new StringBuilder("{\"msg\":\"Privet ");
        String[] s = name.split("name=");
        sb.append(s[1]);
        sb.append("\"}");
        System.out.println(sb.toString());
        return sb.toString();
    }


}
