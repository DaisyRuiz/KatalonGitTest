import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
WebDriver driver = DriverFactory.getWebDriver();
//WebUI.click(findTestObject('Object Repository/LoginUDG/button_Ingresar'),FailureHandling.STOP_ON_FAILURE)
driver.findElement(By.xpath("//button[@class='btn btn-block btn-wine mt-3']")).click();

Thread.sleep(2000);

String msj1= "Este valor es requerido."
WebUI.verifyMatch(msj1, driver.findElement(By.className("parsley-required")).getText(), false, FailureHandling.STOP_ON_FAILURE)
	
String msj2="Este valor es requerido."

WebUI.verifyMatch(msj2, driver.findElement(By.xpath("id('parsley-id-5')/li[@class='parsley-required']")).getText(), false, FailureHandling.STOP_ON_FAILURE)