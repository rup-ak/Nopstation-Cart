package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentsReports1 {
    private ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }
}
