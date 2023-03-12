/*
 *Project Name : BigDataWorking
 *Author : Ashish Jaiswal for Future Automation
 *Client : ICICI Bank
 *Organization : ICICI Bank
 */
package com.imb.basepackage;

import java.io.IOException;

import com.imb.keywords.Keywords;
import com.imb.utility.PropertyReadUtils;

public class BaseClass {

	public static void launchBaseClass() throws IOException {

		Keywords.launchBrowser(PropertyReadUtils.getProperty("browserName", "resources/application.properties")[0]);
		Keywords.maximizeWindow();
		Keywords.customizedWait(5000);
		Keywords.launchURL(PropertyReadUtils.getProperty("uat.url", "resources/application.properties")[0]);

	}
}
