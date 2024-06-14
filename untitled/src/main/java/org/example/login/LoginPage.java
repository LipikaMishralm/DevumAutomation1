package org.example.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public class LogInPage {

        WebDriver driver;

        //Declaration

        //Xpath for fetching the userName
        @FindBy(id = "mat-input-0")
        private WebElement user_nameEdt;

        //Xpath for fetching the password
        @FindBy(xpath = "//input[@type='password']")
        private WebElement passwordEdt;

        //Xpath for fetching signIn button
        @FindBy(xpath = "//span[text()='Sign In']")
        private WebElement signInBtn;

        //Xpath for validate the login page
        @FindBy(xpath = "//h3[contains(text(),'Manage Apps')]")
        private WebElement manageAppText;

        //Xpath for clicking on double arrow
        @FindBy(xpath = "//mat-icon[contains(text(),' keyboard_double_arrow_right')]")
        private WebElement doubleArrow;

        //Xpath for clicking on appStudio
        @FindBy(xpath = "//span[text()=\"App Studio\"]")
        private WebElement appStudio;

        //Xpath to validate appStudio
        @FindBy(xpath = "//label[contains(text(),'DISTRIBUTING LOVE ')]")
        private WebElement myAppName;

        //Xpath for clicking on newPage button
        @FindBy(xpath = "//span[text()='New Page']")
        private WebElement newpage;

        //Xpath for writing pageName
        @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
        private WebElement pageName;

        //@FindBy(xpath = "//mat-label[contains(text(),'Name')]")
        // private  WebElement pagename;

        //Xpath for clicking on dropdown
        @FindBy(xpath = "//*[@id=\"mat-select-value-3\"]/span")
        private WebElement dropDwon;

        // @FindBy(xpath = "//span[contains(@class,'mat-mdc-select-placeholder mat-mdc-select-min-line ng-tns-c3393473648-19 ng-star-inserted')]")
        //private  WebElement dropdown;

        //Xpath for selecting master page
        @FindBy(xpath = "//*[@id=\"mat-option-5\"]/span")
        private WebElement selectMasterpage;

        // @FindBy(xpath = "//span[contains(text(),' empty_master_page ')]")
        //private  WebElement selectpage;

        //Xpath for saving the newPage
        @FindBy(xpath = "//span[text()='SAVE']")
        private WebElement savePage;

        //Xpath for validating newPage is created or not
        @FindBy(xpath = "(//div[contains(text(),'Test_1')])[1]")
        private WebElement newPageName;

        //Xpath for searching the newly created page
        @FindBy(id = "mat-input-4")
        private WebElement serachMyPage;

        //Xpath for displayed page
        @FindBy(xpath = "//div[contains(text(),'Test_1')][1]")
        private WebElement pageDisplyed;

        //Xpath for clicking on outline part
        @FindBy(xpath = "(//span[normalize-space()='Outline'])[1]")
        private WebElement clickonOutLine;

        //Xpath for clicking on my page in outline
        @FindBy(xpath = "//span[contains(text(),' Test_1_page_Web')]")
        private WebElement clickOnChildPage;

        //Xpath for mouseHover to childpage
        @FindBy(xpath = "//span[contains(text(),'Add child')]")
        private WebElement childPage;

        //Xpath for mouseHover to Basic element
        @FindBy(xpath = "//span[contains(text(),' Basic Elements ')]")
        private WebElement basicElement;

        //Xpath for mouseHover to image control
        @FindBy(xpath = "//span[contains(text(),'Image ')]")
        private WebElement image;

        //Xpath for expand the childpage in outline
        @FindBy(xpath = "(//span[contains(@class,'mat-mdc-focus-indicator')])[9]")
        private WebElement expandTest_1;

        //Xpath for click on image to edit in properties
        @FindBy(xpath = "(//span[@contenteditable='true'])[2]")
        private WebElement clickOnImage;

        //Xpath to verify image is added or not
        @FindBy(xpath = "//span[contains(text(),'Image')]")
        private WebElement imageAdded;

        //Xpath for clicking on properties
        @FindBy(xpath = "//span[contains(text(),'Properties')]")
        private WebElement properties;

        //Xpath for file upload in image
        @FindBy(xpath = "//span[contains(text(),'Select File')]")
        private WebElement fileUpload;

        //Xpath for select the file
        @FindBy(xpath = "//img[@src='https://devum-client-public-bucket.s3.amazonaws.com/devum/images/images/thumbnails/Personnel.jpg']")
        private WebElement selectFile;

        //Xpath for continue after file selected
        @FindBy(xpath = "//span[contains(text(),'Continue')]")
        private WebElement continuebtn;

        //Xpath for margins

        //Top margin
        @FindBy(xpath = "(//input[@type='number'])[3]")
        private WebElement topMargin;

        //bottom margin
        @FindBy(xpath = "(//input[@type='number'])[4]")
        private WebElement bottomMargin;

        //left margin
        @FindBy(xpath = "(//input[@type='number'])[1]")
        private WebElement leftMargin;

        //right margin
        @FindBy(xpath = "(//input[@type='number'])[2]")
        private WebElement rightMargin;

        //Xpath for paddings

        //Top padding
        @FindBy(xpath = "(//input[@type='number'])[7]")
        private WebElement toppadding;

        //bottom padding
        @FindBy(xpath = "(//input[@type='number'])[8]")
        private WebElement bottompadding;

        //left padding
        @FindBy(xpath = "(//input[@type='number'])[5]")
        private WebElement leftpadding;

        //right padding
        @FindBy(xpath = "(//input[@type='number'])[6]")
        private WebElement rightpadding;

        //Xpath for height
        @FindBy(xpath = "(//input[@type='number'])[10]")
        private WebElement height;

        //Xpath for width
        @FindBy(xpath = "(//input[@type='number'])[9]")
        private WebElement width;

        //Xpath for publish the page
        @FindBy(id = "publish")
        private WebElement publish;

        //xpath for leaving the page
        @FindBy(xpath = "(//mat-icon[contains(text(),'clear ')])[3]")
        private WebElement leavePage;

        //Xpath for confirm leave
        @FindBy(xpath = "//button[@class='btn success-btn']")
        private WebElement yesLeave;

        //Xpath for clicking on 3 dots to delete
        @FindBy(xpath = "//button[contains(@class,'mat-mdc-menu-trigger rt-horiz-icon mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base')]")
        private WebElement clickOnDots;

        //Xpath to click on Disable
        @FindBy(xpath = "//span[contains(text(),'Disable')]")
        private WebElement disable;

        //Xpath for confirm disable
        @FindBy(xpath = "//span[text()='YES, Disable']")
        private WebElement yesDisable;

        //Xpath for deleting the page
        @FindBy(xpath = "(//span[contains(@class,'ng-star-inserted')])[4]")
        private WebElement delete;

        //Xpath for confirm delete
        @FindBy(xpath = "(//span[contains(@class,'mdc-button__label')])[11]")
        private WebElement yesDelete;

        //Xpath for validate delete
        @FindBy(xpath = "//p[contains(text(),'Sorry, no records match your search criteria. Please try again with different keywords or filters.')]")
        private WebElement noRecordFoundText;

        //Xpath for logOutArrow
        @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[1]")
        private WebElement logOutarrow;

        //Xpath for logOut
        @FindBy(xpath = "//span[text()='Logout']")
        private WebElement logOut;


        //Initialisation
        public LogInPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        //Utilisation
        public WebElement getUser_nameEdt() {
            return user_nameEdt;
        }

        public WebElement getPasswordEdt() {
            return passwordEdt;
        }

        public WebElement getSignInBtn() {
            return signInBtn;
        }

        public WebElement getAppStudio() {
            return appStudio;
        }


        public void logInToApp(String USERNAME, String PASSWORD) throws InterruptedException {
            user_nameEdt.click();
            Thread.sleep(1000);
            user_nameEdt.sendKeys(USERNAME);
            passwordEdt.sendKeys(PASSWORD);
            signInBtn.click();
            

            //Login validation
            Thread.sleep(3000);
            String expectedURL = "https://testbed.devum.com/#/app-studio/landing-page";
            String actualURL = driver.getCurrentUrl();
            if (actualURL.equals(expectedURL)) {
                System.out.println("Test pass : User has loggged in successfully");
            } else {
                System.out.println("Test fail : User is unable to login!!!");
            }
            Thread.sleep(3000);
        }

        public void appStudio() throws InterruptedException {
            Thread.sleep(10000);
            doubleArrow.click();
            appStudio.click();
            Thread.sleep(3000);

            //validation of app studio
            boolean displayAppName = myAppName.isDisplayed();

            if (displayAppName) {
                System.out.println("Test Pass : User is navigated to App Studio Page");
            } else {
                System.out.println("Test Fail : User is Not navigated to App Studio Page");
            }
        }

        public void createNewPage() throws InterruptedException {

            Thread.sleep(3000);
            newpage.click();
            pageName.sendKeys("Test_1");
            dropDwon.click();
            selectMasterpage.click();
            savePage.click();

            //validating new page is created or not
            boolean testPage = newPageName.isDisplayed();
            if (testPage) {
                System.out.println("Test pass: New page created successfully");
            } else {
                System.out.println("Test fail: New page is not created!!!");
            }
        }

        public void searchNewPage() throws InterruptedException {
            Thread.sleep(3000);
            serachMyPage.clear();
            serachMyPage.sendKeys("Test_1");
        }

        public void clickOnNewPage() throws InterruptedException {
            Thread.sleep(3000);
            pageDisplyed.click();
        }

        public void clickOnOutLine() throws InterruptedException {
            Thread.sleep(3000);
            clickonOutLine.click();
        }

        public void imageControl() throws InterruptedException {
            Thread.sleep(3000);
            Actions a = new Actions(driver);
            a.contextClick(clickOnChildPage).perform();
            Thread.sleep(3000);
            a.moveToElement(childPage).perform();
            a.moveToElement(basicElement).perform();
            Thread.sleep(3000);
            a.moveToElement(image).perform();
            image.click();
            Thread.sleep(2000);
            expandTest_1.click();
            clickOnImage.click();

            //Validating the image control
            Thread.sleep(5000);
            boolean image = imageAdded.isDisplayed();
            if (image) {
                System.out.println("Test pass : Image added successfully");
            } else {
                System.out.println("Test fail : unable to add image");

            }
        }

        public void imageEdit() throws InterruptedException {
            Thread.sleep(3000);
            properties.click();
            Thread.sleep(2000);
            fileUpload.click();
            Thread.sleep(2000);
            selectFile.click();
            continuebtn.click();
            Thread.sleep(2000);
        }

        public void validateMargin() throws InterruptedException {

            Thread.sleep(3000);
            String topMarginValue = topMargin.getAttribute("value");
            System.out.println("Initial margin Value:" + topMarginValue);
            topMargin.sendKeys("50");
            Thread.sleep(3000);
            String topMarginValueAdded = topMargin.getAttribute("value");
            System.out.println("Added margin value: " + topMarginValueAdded);

            //validating top margin
            if (topMarginValue != topMarginValueAdded) {
                System.out.println("Test pass : Top margin value added");
            } else {
                System.out.println("Test fail: Top margin value not added");
            }

            Thread.sleep(3000);
            String bottomMarginValue = bottomMargin.getAttribute("value");
            System.out.println("Initial margin Value:" + bottomMarginValue);
            bottomMargin.sendKeys("50");
            Thread.sleep(3000);
            String bottomMarginValueAdded = bottomMargin.getAttribute("value");
            System.out.println("Added margin value: " + bottomMarginValueAdded);

            //validating bottom margin
            if (bottomMarginValue != bottomMarginValueAdded) {
                System.out.println("Test pass : bottom margin value added");
            } else {
                System.out.println("Test fail : bottom margin value not added");
            }


            Thread.sleep(3000);
            String leftMarginValue = leftMargin.getAttribute("value");
            System.out.println("Initial margin Value:" + leftMarginValue);
            leftMargin.sendKeys("50");
            Thread.sleep(3000);
            String leftMarginValueAdded = leftMargin.getAttribute("value");
            System.out.println("Added margin value: " + leftMarginValueAdded);

            //validating left margin
            if (leftMarginValue != leftMarginValueAdded) {
                System.out.println("Test pass : left margin value added");
            } else {
                System.out.println("Test fail : left margin value not added");
            }


            Thread.sleep(3000);
            String rightMarginValue = rightMargin.getAttribute("value");
            System.out.println("Initial margin Value:" + rightMarginValue);
            rightMargin.sendKeys("50");
            Thread.sleep(3000);
            String rightMarginValueAdded = rightMargin.getAttribute("value");
            System.out.println("Added margin value: " + rightMarginValueAdded);

            //validating right margin
            if (rightMarginValue != rightMarginValueAdded) {
                System.out.println("Test pass : right margin value added");
            } else {
                System.out.println("Test fail : right margin value not added");
            }
            Thread.sleep(3000);
        }

        public void validatePadding() throws InterruptedException {

            Thread.sleep(3000);
            String topPaddingValue = toppadding.getAttribute("value");
            System.out.println("Initial padding Value:" + topPaddingValue);
            toppadding.sendKeys("10");
            Thread.sleep(3000);
            String topPaddingValueAdded = toppadding.getAttribute("value");
            System.out.println("Added padding value: " + topPaddingValueAdded);

            //validating top padding
            if (topPaddingValue != topPaddingValueAdded) {
                System.out.println("Test pass : Top padding value added");
            } else {
                System.out.println("Test fail : Top padding value not added");
            }

            Thread.sleep(3000);
            String bottomPaddingValue = bottompadding.getAttribute("value");
            System.out.println("Initial padding Value:" + bottomPaddingValue);
            bottompadding.sendKeys("10");
        }
    }
}
