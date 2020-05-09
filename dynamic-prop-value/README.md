# SoapUI Property - Assigning property Values dynamically
 _Assigning file content to SoapUI Property's value during test execution._

### **Description**
> _By definition, SoapUI allow property definition at multiple levels within the project hierarchy (*Project, TestSuite, TestCases, TestStep, MockServices, MockResponses and Global Properties*)_.

In this project, is shwon how we can use Properties in TestStep project level. The propertie value is assigned dinamically during test case execution, by reading these values from file.

### **Main Idea**
The main idea of this sanple is, while request execution, dinamically pass the crountrie's name from .txt file as property value, and get Iso code as response for each country. To acomplish that, I built a SoapUI using <a href="http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso" target="_blank"> DataFlex Web Service project</a> as example and utilize the CountryISOCode request.

### **Project Structure**
To get this sample running on your SoapUI, after cloning this repo, just go to `SoapUI->File->Import project (ctrl+i)->Select soapui-project.xml file`.

### **Runnig the project**
For script purpose, in order to get propertie values dynamically, just create _Countries.txt file on C:_. After that, just go Run Test Case. For result check, go to script execution log and see the result of request.

## References
* [Working with Properties](https://www.soapui.org/scripting-properties/working-with-properties/)
* [DataFlex Web Service](http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso)
