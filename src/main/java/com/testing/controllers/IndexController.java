package com.testing.controllers;

import com.testing.exceptions.ValueNotFoundException;

public class IndexController {
	public String index(){
        return "index";
    }

    public String oopsHandler() {
        throw new ValueNotFoundException();
    }
}
