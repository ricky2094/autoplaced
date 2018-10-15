import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TS_29_Kartu_kredit_cicilan')

suiteProperties.put('name', 'TS_29_Kartu_kredit_cicilan')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ricky.nugroho\\Katalon Studio\\blanja mobile\\Reports\\TS_29_Kartu_kredit_cicilan\\20181015_104722\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TS_29_Kartu_kredit_cicilan', suiteProperties, [new TestCaseBinding('Test Cases/TC_01_Member_Login/TC_MOBILE_LOGIN', 'Test Cases/TC_01_Member_Login/TC_MOBILE_LOGIN',  null), new TestCaseBinding('Test Cases/TC_02_PDP/TC_PDP_digital', 'Test Cases/TC_02_PDP/TC_PDP_digital',  null), new TestCaseBinding('Test Cases/TC_03_Trade/Choose Payment Method/TC_29_Digital_Kartu_Kredit_Cicilan', 'Test Cases/TC_03_Trade/Choose Payment Method/TC_29_Digital_Kartu_Kredit_Cicilan',  null), new TestCaseBinding('Test Cases/TC_03_Trade/TC_Click_Button_Order_and_get_order_number', 'Test Cases/TC_03_Trade/TC_Click_Button_Order_and_get_order_number',  null)])
