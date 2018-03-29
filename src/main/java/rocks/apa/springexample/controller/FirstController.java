/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocks.apa.springexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tim
 */

@RestController
public class FirstController extends BaseController {
    

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String findAll() {
        logger.debug("Someone is getting all the employees");
        
        return "Hello";
    }
    
    
    
}
