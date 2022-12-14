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

WebUI.navigateToUrl('https://www.easy.cl/')

WebUI.maximizeWindow()

'espera para que la pagina cargue'
WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Easy/CategoriasLogo'))

'Validacion del texto "categorias"'
WebUI.verifyElementText(findTestObject('Easy/CategoriasText'), 'Categorías')

WebUI.click(findTestObject('Easy/Muebles'))

'espera para que la pagina cargue'
WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Easy/Ver mas'))

text = WebUI.getText(findTestObject('Easy/ContenidoMuebles'))

print('Contenido Muebles: \n' + text)

WebUI.scrollToPosition(10, 10)

WebUI.click(findTestObject('Easy/Cajas Organizadoras'))

'espera para que la pagina cargue'
WebUI.waitForPageLoad(10)

WebUI.takeScreenshot('C:\\Users\\Public\\cajas organizadoras.png')

WebUI.verifyElementPresent(findTestObject('Easy/Añadir al carro'), 5)

WebUI.click(findTestObject('Easy/Añadir al carro'))

WebUI.waitForElementClickable(findTestObject('Easy/Carro de compras'), 5)

WebUI.click(findTestObject('Easy/Carro de compras'))

urlEasy = WebUI.getUrl()

if (urlEasy == 'https://www.easy.cl/checkout/#/cart') {
    println('URL CORRECTA')
	WebUI.takeScreenshot('C:\\Users\\Public\\carro.png')
} else {
    println('URL CORRECTA')
}

WebUI.click(findTestObject('Easy/Ir a comprar'))

WebUI.waitForPageLoad(10)

WebUI.navigateToUrl('https://www.easy.cl/checkout/#/cart')

WebUI.closeBrowser()

