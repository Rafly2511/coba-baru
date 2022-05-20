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

WebUI.navigateToUrl('https://www.google.com/intl/id/gmail/about/')

WebUI.click(findTestObject('Object Repository/GmailRegister/Page_Gmail Email Gratis, Pribadi, dan Aman _892921/span_Buat akun'))

WebUI.setText(findTestObject('Object Repository/GmailRegister/Page_Buat Akun Google/input_Lanjutkan ke Gmail_firstName'), 
    namaDepan)

WebUI.setText(findTestObject('Object Repository/GmailRegister/Page_Buat Akun Google/input_Lanjutkan ke Gmail_lastName'), 
    namaBelakang)

WebUI.setText(findTestObject('Object Repository/GmailRegister/Page_Buat Akun Google/input_Lanjutkan ke Gmail_Username'), 
    namaPengguna)

WebUI.setEncryptedText(findTestObject('Object Repository/GmailRegister/Page_Buat Akun Google/input_Anda dapat menggunakan huruf, angka  _4773d5'), 
    sandi)

WebUI.setEncryptedText(findTestObject('Object Repository/GmailRegister/Page_Buat Akun Google/input_Anda dapat menggunakan huruf, angka  _981399'), 
    konfirmasi)

WebUI.click(findTestObject('Object Repository/GmailRegister/Page_Buat Akun Google/span_Berikutnya'))

