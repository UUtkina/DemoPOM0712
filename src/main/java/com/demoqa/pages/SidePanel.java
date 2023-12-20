package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJSExecuter(alerts, 0, 300);
        return new AlertsPage(driver);
    }
    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJSExecuter(browserWindows,0,300);
        return  new BrowserWindowsPage(driver);
    }
    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage getSelectMenu() {
        clickWithJSExecuter(selectMenu,0,600);
        return new SelectMenuPage(driver);
    }
    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPage selectPracticeForm() {
        clickWithJSExecuter(practiceForm,0,100);
        return  new PracticeFormPage(driver);
    }
    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;
    public TextBoxPage selectTextBox() {
        click(textBox);
        return new TextBoxPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;

    public ButtonsPage selectButtons() {
        clickWithJSExecuter(buttons,0,300);
        return new ButtonsPage(driver);
    }
    @FindBy(xpath = "//span[.='Links']")
    WebElement links;

    public LinksPage selectLinks() {
        clickWithJSExecuter(links,0,400);
        return new LinksPage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinks;
    public LinksPage selectBrokenLinks() {
        clickWithJSExecuter(brokenLinks,0,400);
        return new LinksPage(driver);
    }
}
