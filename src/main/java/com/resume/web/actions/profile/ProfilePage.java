package com.resume.web.actions.profile;

import com.resume.lib.base.DriverManager;
import com.resume.web.locators.profile.ProfileLocators;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    ProfileLocators profileLocators;

    public ProfilePage(WebDriver driver){
        profileLocators = new ProfileLocators(driver);
    }

    public String getEmail(){
        return profileLocators.getEmail();
    }

//    public void download(){
//        String originalWindow = DriverManager.getDriver().getWindowHandle();
//        for (String windowHandle : DriverManager.getDriver().getWindowHandles()) {
//            if(!originalWindow.contentEquals(windowHandle)) {
//                DriverManager.getDriver().switchTo().window(windowHandle);
//                break;
//            }
//        }
//        System.out.println(profileLocators.getEmail());
//        profileLocators.clickOnAttachedCsvButton();
//        profileLocators.clickOnDownloadCsvButton();
//    }
}
