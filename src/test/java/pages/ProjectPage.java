package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {
    @FindBy(css = "a.ui.positive.small.button")
    public WebElement buttonMilestones;

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.cssSelector("a.ui.positive.small.button");
    }
}
