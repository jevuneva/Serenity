package com.demo.guru99.UserInterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demo.guru99.com/test/newtours/index.php")

public class LoginPage extends PageObject {

    public static final Target txt_Usuario = Target.the("ingresar usuario").
            located(By.name(""));
}
