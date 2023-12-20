package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test
    public void registerNewStudentTest() {
        new PracticeFormPage(driver).enterPersonalData("Halina", "Utkina", "utkins@com.ua", "123654789654")
                .selectGender("Male")
                .enterData("16 Aug 1987")
                .selectSubjects(new String[]{"Maths", "English", "Chemistry"})
                .selectHobbies(new String[]{"Sports", "Music"})
                .uploadFile("C:/Tools/Screenshot 2023-11-08 211354.png")
                .selectSate("NCR")
                .selectCity("Delhi")
                .submit();
                  }

    @Test
    public void registerNewStudentChooseDateTest() {
        new PracticeFormPage(driver).enterPersonalData("Halina", "Utkina", "utkins@com.ua", "123654789654")
                .selectGender("Male")
                .chooseData("August",  "1987", "16")
                .selectSubjects(new String[]{"Maths", "English", "Chemistry"})
                .selectHobbies(new String[]{"Sports", "Music"})
                .uploadFile("C:/Tools/Screenshot 2023-11-08 211354.png")
                .selectSate("NCR")
                .selectCity("Delhi")
                .submit();
    }


}
