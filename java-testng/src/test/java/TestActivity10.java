import java.io.*;
import java.time.Duration;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class TestActivity10 {
    private WebDriver driver;
    private WebDriverWait wait;
    private static Logger logger = LoggerFactory.getLogger(TestActivity10.class);

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod(alwaysRun = true)
    public void navigateToLogin() {
        driver.get("https://training-support.net/webelements/simple-form");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "excelData")
    public Iterator<Object[]> getExcelData() throws IOException {
        List<Object[]> data = new ArrayList<>();
        String excelPath = "C:/Users/AzamMustufaDidagur/Desktop/activities/java-testng/src/test/java/resources/simple-form.xlsx";

        try (FileInputStream fis = new FileInputStream(excelPath)) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null)
                    continue;

                // Read 4 columns to match the Simple Form fields
                String name = formatter.formatCellValue(row.getCell(0));
                String email = formatter.formatCellValue(row.getCell(1));
                String date = formatter.formatCellValue(row.getCell(2));
                
                String details = formatter.formatCellValue(row.getCell(3));

                data.add(new Object[] { name, email, date, details });
            }
            workbook.close();
        }
        return data.iterator();
    }

    @Test(dataProvider = "excelData", groups = { "Simple Form" })
    public void submitData(String name, String email, String date, String details) {
        logger.info("Testing -> Name: " + name + " | Email: " + email);
        sendData(name, email, date, details);
    }

    @SuppressWarnings("null")
    public void sendData(String name, String email, String date, String detail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("full-name")));

        WebElement nameField = driver.findElement(By.id("full-name"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement dateField = driver.findElement(By.xpath("//*[@id=\"signInForm\"]/input[3]"));
        WebElement detailsField = driver.findElement(By.id("additional-details"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));

        nameField.clear();
        nameField.sendKeys(name);

        emailField.clear();
        emailField.sendKeys(email);

        dateField.sendKeys(date);

        detailsField.clear();
        detailsField.sendKeys(detail);

        submitBtn.click();

        try {
            WebElement messageElement = wait
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

            String successText = messageElement.getText();
            System.out.println("Success Message: " + successText);

        } catch (TimeoutException e) {
            System.out.println("The confirmation message did not appear within the wait time.");
        }
    }
}