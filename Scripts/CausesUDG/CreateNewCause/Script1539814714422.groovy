import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.WebDriver as WebDriver
import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
WebUI.callTestCase(findTestCase('Test Cases/LoginUDG/SignIn'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

WebUI.click(findTestObject('/NewCause/span_Causas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('/NewCause/a_Nueva Causa'), FailureHandling.STOP_ON_FAILURE)
//
WebUI.setText(findTestObject('/NewCause/input_name'), 'NuevaCausa', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/NewCause/input_goal'), '1000000', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/NewCause/textarea_abstract'), 'Pruebas de crear causa desde katalon')

Thread.sleep(3000)

WebDriver driver = DriverFactory.getWebDriver()
Thread.sleep(3000)

WebUI.executeJavaScript("tinymce.activeEditor.setContent('<h1>Rich text</h1> Plain text');", null)

WebUI.sendKeys(findTestObject('Object Repository/NewCause/input_main_video'),"https://www.youtube.com/watch?v=2kSyB3pjeUg" , FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/NewCause/input_color'), "#c15d5d", FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewCause/Videos'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewCause/a_Videos Complementarios'), FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/NewCause/Button_agregar video'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/NewCause/input_Video Complementario_vid'), "https://www.youtube.com/watch?v=BPNTC7uZYrI")
not_run: WebUI.click(findTestObject('Object Repository/NewCause/Button_cancelar video comple'))
WebUI.click(findTestObject('Object Repository/NewCause/Agregar'), FailureHandling.STOP_ON_FAILURE)
//
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/NewCause/Patrocinadores'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/NewCause/Button_agregar patroci'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/NewCause/span_Seleccionar logo'), FailureHandling.STOP_ON_FAILURE)

//WebUI.sendKeys(findTestObject('Object Repository/NewCause/Insert_Logo'), "caballo-mustang-salvaje.jpg", FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)
driver.findElement(By.cssSelector("#form-sponsor > div.modal-body > div > div:nth-child(2) > div.bootstrap-filestyle.input-group > span > label")).click(); 
	
// open the Upload window using selenium


//Thread.sleep("20000"); // wait for page load
Thread.sleep(2000)
//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + ); // Give path where the exe is saved.
//Runtime.runtime.exec("C:\\Users\\SYESOFTWARE-DAYSI\\Desktop\\Autolt3\\UploadLogo2.exe")
String cmd = "C:\\Users\\SYESOFTWARE-DAYSI\\Desktop\\Autolt3\\UploadLogo2.exe"
Runtime.getRuntime().exec(cmd)

WebUI.click(findTestObject('Object Repository/NewCause/button_Aceptar_patroci'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/NewCause/SaveCause'))
