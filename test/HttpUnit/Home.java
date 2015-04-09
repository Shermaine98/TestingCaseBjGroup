
package HttpUnit;

import org.junit.Test;
import com.meterware.httpunit.*;
import junit.framework.*;
import static org.junit.Assert.assertEquals;


public class Home {
    @Test
    public void testSumbitForm() throws Exception
    {
        HttpUnitOptions.setScriptingEnabled(false);
        WebConversation conversation = new WebConversation();
        WebRequest request = new GetMethodWebRequest ("http://localhost:8080/INDENTRA/HOMEPAGE.jsp");
        
        WebResponse response = conversation.getResponse (request);
    //    WebForm SubmitForm = response.getForms()[0];
     //   request = SubmitForm.getRequest();
      //  request.setParameter("subject_id","2");
      //  response = conversation.getResponse(request);
        assertEquals("Page title","System", response.getTitle() );
    }
}
