package com.demo.guru99.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "com.demo.guru99.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginRunner {
}
