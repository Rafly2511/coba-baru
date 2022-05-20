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

WebUI.navigateToUrl('https://member.jabarcodingcamp.id/')

WebUI.setText(findTestObject('Object Repository/JCC/Page_Login Member JCC/input_Email Address_email'), 'rafly.career@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/JCC/Page_Login Member JCC/input_Password_password'), 'g1OK/JiefhWeGKEVb006Nw==')

WebUI.click(findTestObject('Object Repository/JCC/Page_Login Member JCC/button_Log In'))

WebUI.click(findTestObject('Object Repository/JCC/Page_Dasbor JCC/a_AKSES KELAS'))

WebUI.click(findTestObject('Object Repository/JCC/Page_Dasbor JCC/a_Materi'))

WebUI.closeBrowser()