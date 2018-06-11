import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/16955_testbed.html')

def firstClickableDay = WebUI.getText(findTestObject('Page_Discussion 16955/td_parameterized', ['index':1]))
WebUI.comment("first clickable day is ${firstClickableDay}")

WebUI.closeBrowser()

