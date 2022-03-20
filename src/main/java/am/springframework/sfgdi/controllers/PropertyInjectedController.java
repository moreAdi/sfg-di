package am.springframework.sfgdi.controllers;

import am.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public  String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
