package com.busquedaRuta

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

import internal.GlobalVariable

public class busquedaRutaFile {
	@Keyword
	public void BusquedaFile() {
		Robot robot = new Robot()
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_D)
		robot.keyRelease(KeyEvent.VK_D)
		robot.keyPress(KeyEvent.VK_E)
		robot.keyRelease(KeyEvent.VK_E)
		robot.keyPress(KeyEvent.VK_S)
		robot.keyRelease(KeyEvent.VK_S)
		robot.keyPress(KeyEvent.VK_C)
		robot.keyRelease(KeyEvent.VK_C)
		robot.keyPress(KeyEvent.VK_A)
		robot.keyRelease(KeyEvent.VK_A)
		robot.keyPress(KeyEvent.VK_R)
		robot.keyRelease(KeyEvent.VK_R)
		robot.keyPress(KeyEvent.VK_G)
		robot.keyRelease(KeyEvent.VK_G)
		robot.keyPress(KeyEvent.VK_A)
		robot.keyRelease(KeyEvent.VK_A)
		robot.keyPress(KeyEvent.VK_S)
		robot.keyRelease(KeyEvent.VK_S)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_DOWN)
		robot.keyRelease(KeyEvent.VK_DOWN)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_UP)
		robot.keyRelease(KeyEvent.VK_UP)
		WebUI.delay(2)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
	}
}
