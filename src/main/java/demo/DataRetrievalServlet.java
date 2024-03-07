package demo;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/retrieveData")
public class DataRetrievalServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataRetrievalServlet() {
	    super();
	}

    // Simulated database containing user data
    public Map<String, UserData> userDataMap;

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize user data map with sample user IDs and data
        userDataMap = new HashMap<>();
        userDataMap.put("001", new UserData("John Doe", "Bachelor's in Computer Science", "Java Developer"));
        userDataMap.put("002", new UserData("Jane Smith", "Master's in Business Administration", "Business Analyst"));
        // Add more user IDs and data as needed
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Assume we are trying to retrieve user data based on some ID
        String userId = request.getParameter("userId");
        
        // Retrieve user data from the simulated database
        UserData userData = userDataMap.get(userId);
        
        if (userData == null) {
            // Data not found, set an attribute to indicate error
            request.setAttribute("error", "Data not found for user ID: " + userId);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        } else {
            // Data found, set attribute and forward to display page
            request.setAttribute("userData", userData);
            request.getRequestDispatcher("/displayData.jsp").forward(request, response);
        }
    }

   
}
