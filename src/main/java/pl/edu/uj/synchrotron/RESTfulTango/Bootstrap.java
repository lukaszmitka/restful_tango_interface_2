package pl.edu.uj.synchrotron.RESTfulTango;

import javax.servlet.http.HttpServlet;

import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.model.ApiInfo;

public class Bootstrap extends HttpServlet {
	static {
		// add a custom filter
		// FilterFactory.setFilter(new CustomFilter());
		ApiInfo info = new ApiInfo("RESTful Tango interface", /* title */
		"This server alows you to access Tango database through HTTP protocol."
				+ "You can find more about Tango Controls stystem at "
				+ "<a href=\"http://www.tango-controls.org/\">http://www.tango-controls.org/</a>",
				"http://helloreverb.com/terms/", /* TOS URL */
				"luk.mitka@gmail.com", /* Contact */
				"GNU GPL 3.0", /* license */
				"http://www.gnu.org/licenses/gpl-3.0.txt" /* license URL */
		);
		ConfigFactory.config().setApiInfo(info);
	}
}
