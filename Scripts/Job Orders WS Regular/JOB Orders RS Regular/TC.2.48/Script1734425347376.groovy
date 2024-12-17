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

WebUI.openBrowser(GlobalVariable.baseURL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Back Assigned TechniciansRoleTechnician_767d05'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Work Stages Defect Rectification Record_04ac9e'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Amend'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Update Reference Update reference under_85b53d'))

WebUI.setText(findTestObject('Object Repository/Page_Workchestra/input_checkbox'), '3834000-40')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Workchestra/select_Typo Error  Missing Field  For Furth_ac932f'), 
    'Missing Field', true)

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Confirm and Sign Amendment Please place_5a5de2'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/img_Created_cursor-pointer'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/tab_Work StageReferenceStatusAction1. Preli_50eee8'))

WebUI.closeBrowser()

