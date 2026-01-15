package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {
	int count=1;
//	identify manually
	int maxcount=5;
	
public boolean retry(ITestResult result) {
//	1<=5-->true-->retry........6<=5-->false----->stop retrying
	while(count<=maxcount) {
		count++;
		return true;
	}
	return false;
	
}
}
