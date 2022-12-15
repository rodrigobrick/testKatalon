import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.waitForPageLoad(10)

'definiendo cada array'
def names = []
def email = []
def currentAddress = []
def permanentAddress = []

'keyword para rellenar arrays para comprobacion'
CustomKeywords.'com.fillArrays.fillArrays.fillArray'(names, email, currentAddress, permanentAddress)

WebUI.setText(findTestObject('DataFromExcel/Full Name'), Full_Name)

WebUI.setText(findTestObject('DataFromExcel/Email'), Email)

WebUI.setText(findTestObject('DataFromExcel/Current address'), Current_Address)

WebUI.setText(findTestObject('DataFromExcel/Permanent Address'), Permanent_Address)

for (int i = 1; i <= 5; i++) {
	if ((names[i]) == Full_Name) {
		println('el dato que se muestra es correcto: ' + (names[i]))
		WebUI.takeScreenshot('C:\\Users\\Public\\'+names[i]+'.png')
	}
	
	if ((email[i]) == Email) {
		println('el dato que se muestra es correcto: ' + (email[i]))
	}
	
	if ((currentAddress[i]) == Current_Address) {
		println('el dato que se muestra es correcto: ' + (currentAddress[i]))
	}
	
	if ((permanentAddress[i]) == Permanent_Address) {
		println('el dato que se muestra es correcto: ' + (permanentAddress[i]))
	}
}

WebUI.delay(2)

WebUI.closeBrowser()

