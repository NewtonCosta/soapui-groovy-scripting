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