import com.eviware.soapui.support.GroovyUtils

def baseDir = 'C:\\'
new File(baseDir, 'Countries.txt').eachLine { line -> 		
	/*
	 * The eachline() closure method iterates through the given reader line by line. 
	 * The first argument of the method is the line content, and it is assigned to a variable country.
	 */
	def country = line.trim() 
	
	// Setting country read from file to the TestStep property 'CountryName' defined on TestCase 'Props'	
	testRunner.testCase.getTestStepByName("Props").setPropertyValue("CountryName", "$country")	

	// Executing testStep
	testRunner.runTestStepByName("CountryISOCode")

	/* Logging response
	 * Getting the testStep 'CountryISOCode' response content xml
	 * With the response xml holded in 'responseHolder' variable, we can optionaly get the Node value for logging purpose
	 */	
	def groovyUtils = new GroovyUtils(context)	
	def responseHolder = groovyUtils.getXmlHolder( testRunner.testCase.testSteps["CountryISOCode"].testRequest.response.responseContent )	
	String countryCode = responseHolder.getNodeValue("//*:CountryISOCodeResult") 	
	log.info (" >>> " + "Country: " +country+ " - " + "ISOCode: " +countryCode)
	
}