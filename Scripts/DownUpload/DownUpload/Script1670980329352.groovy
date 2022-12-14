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

WebUI.navigateToUrl('https://demre.cl/publicaciones/modelos-resoluciones-pruebas')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('DownUpload/Modelo de Prueba'))

WebUI.click(findTestObject('DownUpload/DownloadPDF'))

WebUI.navigateToUrl('https://demoqa.com/upload-download')

WebUI.click(findTestObject('DownUpload/UploadFile'), FailureHandling.STOP_ON_FAILURE)

'custom keyword para encontrar el archivo'
CustomKeywords.'com.busquedaRuta.busquedaRutaFile.BusquedaFile'()

try {
    elementoSubido = WebUI.verifyElementVisible(findTestObject('DownUpload/Validacion'), FailureHandling.STOP_ON_FAILURE)

    print('ELEMENTO SUBIDO CORRECTAMENTE \n')

    WebUI.takeScreenshot('C:\\Users\\Public\\elemento subido.png')
}
catch (Exception e) {
    print('ERROR: \n' + e)
} 

WebUI.delay(5)

WebUI.closeBrowser()

